package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorBoldIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 100.000 C 180.000 108.837 172.837 116.000 164.000 116.000 C 155.163 116.000 148.000 108.837 148.000 100.000 C 148.000 91.163 155.163 84.000 164.000 84.000 C 172.837 84.000 180.000 91.163 180.000 100.000 ZM 132.000 116.000 C 123.163 116.000 116.000 123.163 116.000 132.000 C 116.000 140.837 123.163 148.000 132.000 148.000 C 140.837 148.000 148.000 140.837 148.000 132.000 C 148.000 123.163 140.837 116.000 132.000 116.000 ZM 220.000 96.000 C 220.000 146.810 178.810 188.000 128.000 188.000 C 77.190 188.000 36.000 146.810 36.000 96.000 C 36.000 45.190 77.190 4.000 128.000 4.000 C 178.787 4.055 219.945 45.213 220.000 96.000 ZM 196.000 96.000 C 196.000 58.445 165.555 28.000 128.000 28.000 C 90.445 28.000 60.000 58.445 60.000 96.000 C 60.000 133.555 90.445 164.000 128.000 164.000 C 165.539 163.961 195.961 133.539 196.000 96.000 ZM 164.000 197.860 C 140.698 206.046 115.302 206.046 92.000 197.860 C 85.751 195.651 78.894 198.926 76.685 205.175 C 74.476 211.424 77.751 218.281 84.000 220.490 C 94.334 224.145 105.084 226.496 116.000 227.490 L 116.000 244.000 C 116.000 250.627 121.373 256.000 128.000 256.000 C 134.627 256.000 140.000 250.627 140.000 244.000 L 140.000 227.460 C 150.916 226.466 161.666 224.115 172.000 220.460 C 178.249 218.251 181.524 211.394 179.315 205.145 C 177.106 198.896 170.249 195.621 164.000 197.830 Z"),
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
        return _golf!!
    }

private var _golf: ImageVector? = null
