package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) return _numberSquareEight!!
        _numberSquareEight = phosphorRegularIcon(
            name = "NumberSquareEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 48.000 L 208.000 48.000 L 208.000 208.000 ZM 149.810 123.390 C 159.433 114.428 162.593 100.491 157.777 88.255 C 152.961 76.018 141.150 67.974 128.000 67.974 C 114.850 67.974 103.039 76.018 98.223 88.255 C 93.407 100.491 96.567 114.428 106.190 123.390 C 93.900 132.748 88.951 148.904 93.889 163.540 C 98.828 178.177 112.553 188.031 128.000 188.031 C 143.447 188.031 157.172 178.177 162.111 163.540 C 167.049 148.904 162.100 132.748 149.810 123.390 ZM 112.000 100.000 C 112.000 91.163 119.163 84.000 128.000 84.000 C 136.837 84.000 144.000 91.163 144.000 100.000 C 144.000 108.837 136.837 116.000 128.000 116.000 C 119.163 116.000 112.000 108.837 112.000 100.000 ZM 128.000 172.000 C 116.954 172.000 108.000 163.046 108.000 152.000 C 108.000 140.954 116.954 132.000 128.000 132.000 C 139.046 132.000 148.000 140.954 148.000 152.000 C 148.000 163.046 139.046 172.000 128.000 172.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _numberSquareEight!!
    }

private var _numberSquareEight: ImageVector? = null
