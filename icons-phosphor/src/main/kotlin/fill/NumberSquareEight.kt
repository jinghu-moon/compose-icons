package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) return _numberSquareEight!!
        _numberSquareEight = phosphorFillIcon(
            name = "NumberSquareEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 112.000 100.000 C 112.000 91.163 119.163 84.000 128.000 84.000 C 136.837 84.000 144.000 91.163 144.000 100.000 C 144.000 108.837 136.837 116.000 128.000 116.000 C 119.163 116.000 112.000 108.837 112.000 100.000 ZM 128.000 132.000 C 116.954 132.000 108.000 140.954 108.000 152.000 C 108.000 163.046 116.954 172.000 128.000 172.000 C 139.046 172.000 148.000 163.046 148.000 152.000 C 148.000 140.954 139.046 132.000 128.000 132.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 164.000 152.000 C 164.001 140.770 158.751 130.185 149.810 123.390 C 159.433 114.428 162.593 100.491 157.777 88.255 C 152.961 76.018 141.150 67.974 128.000 67.974 C 114.850 67.974 103.039 76.018 98.223 88.255 C 93.407 100.491 96.567 114.428 106.190 123.390 C 92.744 133.629 88.231 151.842 95.340 167.175 C 102.449 182.507 119.267 190.830 135.769 187.183 C 152.271 183.536 164.015 168.900 164.000 152.000 Z"),
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
        return _numberSquareEight!!
    }

private var _numberSquareEight: ImageVector? = null
