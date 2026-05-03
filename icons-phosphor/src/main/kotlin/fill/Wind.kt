package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorFillIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 104.000 L 24.000 104.000 C 21.783 104.005 19.664 103.090 18.147 101.473 C 16.631 99.856 15.853 97.682 16.000 95.470 C 16.367 91.195 19.979 87.932 24.270 88.000 L 112.000 88.000 C 114.217 88.005 116.336 87.090 117.853 85.473 C 119.369 83.856 120.147 81.682 120.000 79.470 C 119.633 75.195 116.021 71.932 111.730 72.000 L 92.290 72.000 C 91.121 72.012 90.004 71.512 89.235 70.631 C 88.466 69.751 88.120 68.577 88.290 67.420 C 90.734 50.523 106.011 38.520 123.007 40.145 C 140.002 41.770 152.728 56.451 151.925 73.505 C 151.122 90.559 137.073 103.979 120.000 104.000 ZM 239.920 101.710 C 238.754 85.406 225.488 72.602 209.153 72.014 C 192.818 71.426 178.666 83.242 176.330 99.420 C 176.160 100.577 176.506 101.751 177.275 102.631 C 178.044 103.512 179.161 104.012 180.330 104.000 L 199.770 104.000 C 204.053 103.942 207.653 107.202 208.020 111.470 C 208.167 113.682 207.389 115.856 205.873 117.473 C 204.356 119.090 202.237 120.005 200.020 120.000 L 32.270 120.000 C 27.979 119.932 24.367 123.195 24.000 127.470 C 23.853 129.682 24.631 131.856 26.147 133.473 C 27.664 135.090 29.783 136.005 32.000 136.000 L 208.000 136.000 C 216.885 136.001 225.370 132.307 231.424 125.803 C 237.478 119.300 240.556 110.572 239.920 101.710 ZM 152.000 152.000 L 40.270 152.000 C 35.979 151.932 32.367 155.195 32.000 159.470 C 31.853 161.682 32.631 163.856 34.147 165.473 C 35.664 167.090 37.783 168.005 40.000 168.000 L 143.730 168.000 C 148.013 167.942 151.613 171.202 151.980 175.470 C 152.127 177.682 151.349 179.856 149.833 181.473 C 148.316 183.090 146.197 184.005 143.980 184.000 L 124.290 184.000 C 123.121 183.988 122.004 184.488 121.235 185.369 C 120.466 186.249 120.120 187.423 120.290 188.580 C 122.734 205.477 138.011 217.480 155.007 215.855 C 172.002 214.230 184.728 199.549 183.925 182.495 C 183.122 165.441 169.073 152.021 152.000 152.000 Z"),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
