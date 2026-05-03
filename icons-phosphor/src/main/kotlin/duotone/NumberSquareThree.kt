package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) return _numberSquareThree!!
        _numberSquareThree = phosphorDuotoneIcon(
            name = "NumberSquareThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 48.000 L 216.000 208.000 C 216.000 212.418 212.418 216.000 208.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 48.000 L 208.000 48.000 L 208.000 208.000 ZM 160.000 148.000 C 159.996 162.625 151.145 175.794 137.605 181.321 C 124.065 186.848 108.527 183.635 98.290 173.190 C 96.161 171.176 95.304 168.159 96.055 165.327 C 96.807 162.495 99.047 160.300 101.894 159.606 C 104.741 158.912 107.740 159.831 109.710 162.000 C 116.063 168.482 125.984 169.873 133.875 165.388 C 141.766 160.903 145.647 151.668 143.330 142.893 C 141.012 134.118 133.076 128.003 124.000 128.000 C 121.017 127.999 118.282 126.339 116.905 123.692 C 115.528 121.046 115.738 117.853 117.450 115.410 L 136.630 88.000 L 104.000 88.000 C 99.582 88.000 96.000 84.418 96.000 80.000 C 96.000 75.582 99.582 72.000 104.000 72.000 L 152.000 72.000 C 154.983 72.001 157.718 73.661 159.095 76.308 C 160.472 78.954 160.262 82.147 158.550 84.590 L 137.550 114.590 C 151.129 120.127 160.004 133.335 160.000 148.000 Z"),
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
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
