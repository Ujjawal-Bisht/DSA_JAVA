# 1. My first approach was wrong

## I tried this idea:
Count how many negatives are there among the top‑3 absolute values, then decide the sign of the product.

This approach does not work for this problem.

## Failed test cases examples:

[-10, -9, -1, 2]

[-100, -98, -1, 2, 3, 4]

and many more

## Reason:

```I was picking the three largest absolute values, then trying to adjust the sign based on how many of them were negative.```

## But for the maximum product:
1) The third number must be the largest positive, not just the third largest absolute value.
2) Two large negatives and one large positive can give a bigger product than three large positives.

Therefore, counting negatives among absolute values does NOT give the correct sign combination and can miss the optimal triplet.

# 2. Correct approach
To solve this problem, I only need to track five numbers:

* Three largest numbers: l1, l2, l3
* Two smallest numbers (most negative): s1, s2

Then the answer is:

```max(𝑙1⋅𝑙2⋅𝑙3,𝑙1⋅𝑠1⋅𝑠2)```

l1 * l2 * l3 → product of the three largest numbers
l1 * s1 * s2 → product of the largest number and the two smallest (most negative) numbers

This covers both cases:

1) Three large positives
2) Two large negatives + one large positive

This logic works for:

* All positive arrays
* All negative arrays
* Mixed arrays with both positives and negatives.
