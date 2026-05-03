package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BookOpenText: ImageVector
    get() {
        if (_bookOpenText != null) return _bookOpenText!!
        _bookOpenText = phosphorFillIcon(
            name = "BookOpenText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 48.000 L 168.000 48.000 C 150.327 48.000 136.000 62.327 136.000 80.000 L 136.000 167.730 C 136.058 172.013 132.798 175.613 128.530 175.980 C 126.318 176.127 124.144 175.349 122.527 173.833 C 120.910 172.316 119.995 170.197 120.000 167.980 L 120.000 80.000 C 120.000 62.327 105.673 48.000 88.000 48.000 L 24.000 48.000 C 19.582 48.000 16.000 51.582 16.000 56.000 L 16.000 200.000 C 16.000 204.418 19.582 208.000 24.000 208.000 L 96.000 208.000 C 109.231 208.000 119.967 218.709 120.000 231.940 C 119.934 235.287 121.986 238.312 125.120 239.490 C 127.585 240.441 130.360 240.114 132.536 238.616 C 134.713 237.118 136.009 234.642 136.000 232.000 C 136.000 218.745 146.745 208.000 160.000 208.000 L 232.000 208.000 C 236.418 208.000 240.000 204.418 240.000 200.000 L 240.000 56.000 C 240.000 51.582 236.418 48.000 232.000 48.000 ZM 208.000 168.000 L 168.270 168.000 C 163.987 168.058 160.387 164.798 160.020 160.530 C 159.873 158.318 160.651 156.144 162.167 154.527 C 163.684 152.910 165.803 151.995 168.020 152.000 L 207.750 152.000 C 212.033 151.942 215.633 155.202 216.000 159.470 C 216.147 161.682 215.369 163.856 213.853 165.473 C 212.336 167.090 210.217 168.005 208.000 168.000 ZM 208.000 136.000 L 168.270 136.000 C 163.987 136.058 160.387 132.798 160.020 128.530 C 159.873 126.318 160.651 124.144 162.167 122.527 C 163.684 120.910 165.803 119.995 168.020 120.000 L 207.750 120.000 C 212.033 119.942 215.633 123.202 216.000 127.470 C 216.147 129.682 215.369 131.856 213.853 133.473 C 212.336 135.090 210.217 136.005 208.000 136.000 ZM 208.000 104.000 L 168.270 104.000 C 163.979 104.068 160.367 100.805 160.000 96.530 C 159.853 94.318 160.631 92.144 162.147 90.527 C 163.664 88.910 165.783 87.995 168.000 88.000 L 207.730 88.000 C 212.021 87.932 215.633 91.195 216.000 95.470 C 216.147 97.682 215.369 99.856 213.853 101.473 C 212.336 103.090 210.217 104.005 208.000 104.000 Z"),
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
        return _bookOpenText!!
    }

private var _bookOpenText: ImageVector? = null
