package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Garage: ImageVector
    get() {
        if (_garage != null) return _garage!!
        _garage = phosphorBoldIcon(
            name = "Garage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 188.000 L 236.000 188.000 L 236.000 98.670 C 236.009 91.972 232.664 85.714 227.090 82.000 L 139.090 23.340 C 132.379 18.849 123.621 18.849 116.910 23.340 L 28.910 82.000 C 23.336 85.714 19.991 91.972 20.000 98.670 L 20.000 188.000 L 16.000 188.000 C 9.373 188.000 4.000 193.373 4.000 200.000 C 4.000 206.627 9.373 212.000 16.000 212.000 L 240.000 212.000 C 246.627 212.000 252.000 206.627 252.000 200.000 C 252.000 193.373 246.627 188.000 240.000 188.000 ZM 44.000 100.810 L 128.000 44.810 L 212.000 100.810 L 212.000 188.000 L 196.000 188.000 L 196.000 120.000 C 196.000 113.373 190.627 108.000 184.000 108.000 L 72.000 108.000 C 65.373 108.000 60.000 113.373 60.000 120.000 L 60.000 188.000 L 44.000 188.000 ZM 172.000 132.000 L 172.000 148.000 L 140.000 148.000 L 140.000 132.000 ZM 116.000 148.000 L 84.000 148.000 L 84.000 132.000 L 116.000 132.000 ZM 84.000 172.000 L 116.000 172.000 L 116.000 188.000 L 84.000 188.000 ZM 140.000 172.000 L 172.000 172.000 L 172.000 188.000 L 140.000 188.000 Z"),
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
        return _garage!!
    }

private var _garage: ImageVector? = null
