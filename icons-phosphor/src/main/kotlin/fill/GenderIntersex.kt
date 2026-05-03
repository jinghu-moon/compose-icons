package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorFillIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 147.910 113.720 C 148.865 125.422 142.417 136.477 131.762 141.408 C 121.106 146.339 108.506 144.098 100.204 135.796 C 91.902 127.494 89.661 114.894 94.592 104.238 C 99.523 93.583 110.578 87.135 122.280 88.090 C 135.947 89.205 146.795 100.053 147.910 113.720 ZM 216.000 40.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 200.000 24.000 C 208.837 24.000 216.000 31.163 216.000 40.000 ZM 188.000 56.000 C 188.000 51.582 184.418 48.000 180.000 48.000 L 152.270 48.000 C 147.979 47.932 144.367 51.195 144.000 55.470 C 143.853 57.682 144.631 59.856 146.147 61.473 C 147.664 63.090 149.783 64.005 152.000 64.000 L 160.690 64.000 L 144.920 79.770 C 130.141 69.567 110.643 69.369 95.661 79.272 C 80.678 89.175 73.218 107.189 76.812 124.785 C 80.406 142.381 94.334 156.027 112.000 159.260 L 112.000 176.000 L 92.270 176.000 C 87.979 175.932 84.367 179.195 84.000 183.470 C 83.853 185.682 84.631 187.856 86.147 189.473 C 87.664 191.090 89.783 192.005 92.000 192.000 L 112.000 192.000 L 112.000 207.730 C 111.947 212.011 115.205 215.609 119.470 215.980 C 121.682 216.127 123.856 215.349 125.473 213.833 C 127.090 212.316 128.005 210.197 128.000 207.980 L 128.000 192.000 L 147.730 192.000 C 152.013 192.058 155.613 188.798 155.980 184.530 C 156.127 182.318 155.349 180.144 153.833 178.527 C 152.316 176.910 150.197 175.995 147.980 176.000 L 128.000 176.000 L 128.000 159.260 C 142.648 156.543 154.926 146.599 160.627 132.835 C 166.327 119.072 164.677 103.358 156.240 91.080 L 172.000 75.310 L 172.000 83.730 C 171.937 88.019 175.197 91.628 179.470 92.000 C 181.682 92.147 183.856 91.369 185.473 89.853 C 187.090 88.336 188.005 86.217 188.000 84.000 Z"),
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
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
