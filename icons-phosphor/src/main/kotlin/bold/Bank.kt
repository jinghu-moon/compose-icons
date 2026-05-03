package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorBoldIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 24.000 108.000 L 44.000 108.000 L 44.000 156.000 L 32.000 156.000 C 25.373 156.000 20.000 161.373 20.000 168.000 C 20.000 174.627 25.373 180.000 32.000 180.000 L 224.000 180.000 C 230.627 180.000 236.000 174.627 236.000 168.000 C 236.000 161.373 230.627 156.000 224.000 156.000 L 212.000 156.000 L 212.000 108.000 L 232.000 108.000 C 237.369 108.000 242.085 104.434 243.547 99.269 C 245.010 94.103 242.863 88.594 238.290 85.780 L 134.290 21.780 C 130.433 19.406 125.567 19.406 121.710 21.780 L 17.710 85.780 C 13.137 88.594 10.990 94.103 12.453 99.269 C 13.915 104.434 18.631 108.000 24.000 108.000 ZM 68.000 108.000 L 92.000 108.000 L 92.000 156.000 L 68.000 156.000 ZM 140.000 108.000 L 140.000 156.000 L 116.000 156.000 L 116.000 108.000 ZM 188.000 156.000 L 164.000 156.000 L 164.000 108.000 L 188.000 108.000 ZM 128.000 46.090 L 189.600 84.000 L 66.400 84.000 ZM 252.000 208.000 C 252.000 214.627 246.627 220.000 240.000 220.000 L 16.000 220.000 C 9.373 220.000 4.000 214.627 4.000 208.000 C 4.000 201.373 9.373 196.000 16.000 196.000 L 240.000 196.000 C 246.627 196.000 252.000 201.373 252.000 208.000 Z"),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
