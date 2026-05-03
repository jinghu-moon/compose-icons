package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) return _beerBottle!!
        _beerBottle = phosphorBoldIcon(
            name = "BeerBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.490 39.510 L 216.490 7.510 C 212.145 3.201 205.254 2.852 200.495 6.700 C 195.737 10.548 194.636 17.359 197.940 22.510 L 147.000 60.770 L 109.670 68.230 C 107.346 68.698 105.211 69.838 103.530 71.510 L 20.200 154.830 C 14.948 160.081 11.998 167.203 11.998 174.630 C 11.998 182.057 14.948 189.179 20.200 194.430 L 61.570 235.800 C 66.821 241.052 73.943 244.002 81.370 244.002 C 88.797 244.002 95.919 241.052 101.170 235.800 L 184.490 152.490 C 186.162 150.809 187.302 148.674 187.770 146.350 L 195.230 109.000 L 233.460 58.000 C 238.611 61.304 245.422 60.203 249.270 55.445 C 253.118 50.686 252.769 43.795 248.460 39.450 ZM 112.000 191.000 L 65.000 144.000 L 96.000 113.000 L 143.000 160.000 ZM 81.370 220.000 C 80.309 220.001 79.291 219.580 78.540 218.830 L 37.170 177.460 C 36.419 176.710 35.997 175.692 35.997 174.630 C 35.997 173.568 36.419 172.550 37.170 171.800 L 48.000 161.000 L 95.000 208.000 L 84.200 218.830 C 83.449 219.580 82.431 220.001 81.370 220.000 ZM 174.370 96.800 C 173.293 98.234 172.552 99.891 172.200 101.650 L 165.000 138.080 L 160.000 143.000 L 113.000 96.000 L 118.000 91.000 L 154.430 83.720 C 156.189 83.368 157.846 82.627 159.280 81.550 L 214.950 39.790 L 216.240 41.080 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
