package math

func Average( xs []float64) float64{
	var sum float64
	sum = 0
	count := 0
	for _, n := range xs{
		sum += n
		count ++
	}

	return sum/float64(len(xs))
}
