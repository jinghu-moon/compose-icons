package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) return _numberCircleEight!!
        _numberCircleEight = phosphorRegularIcon(
            name = "NumberCircleEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 149.810 123.390 C 159.433 114.428 162.593 100.491 157.777 88.255 C 152.961 76.018 141.150 67.974 128.000 67.974 C 114.850 67.974 103.039 76.018 98.223 88.255 C 93.407 100.491 96.567 114.428 106.190 123.390 C 93.900 132.748 88.951 148.904 93.889 163.540 C 98.828 178.177 112.553 188.031 128.000 188.031 C 143.447 188.031 157.172 178.177 162.111 163.540 C 167.049 148.904 162.100 132.748 149.810 123.390 ZM 112.000 100.000 C 112.000 91.163 119.163 84.000 128.000 84.000 C 136.837 84.000 144.000 91.163 144.000 100.000 C 144.000 108.837 136.837 116.000 128.000 116.000 C 119.163 116.000 112.000 108.837 112.000 100.000 ZM 128.000 172.000 C 116.954 172.000 108.000 163.046 108.000 152.000 C 108.000 140.954 116.954 132.000 128.000 132.000 C 139.046 132.000 148.000 140.954 148.000 152.000 C 148.000 163.046 139.046 172.000 128.000 172.000 Z"),
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
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
