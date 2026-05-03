package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorBoldIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 84.000 L 212.000 84.000 L 212.000 64.000 C 212.000 52.954 203.046 44.000 192.000 44.000 L 52.000 44.000 C 40.954 44.000 32.000 52.954 32.000 64.000 L 32.000 84.000 L 16.000 84.000 C 9.373 84.000 4.000 89.373 4.000 96.000 C 4.000 102.627 9.373 108.000 16.000 108.000 L 32.000 108.000 L 32.000 128.000 C 32.000 139.046 40.954 148.000 52.000 148.000 L 192.000 148.000 C 203.046 148.000 212.000 139.046 212.000 128.000 L 212.000 108.000 L 228.000 108.000 L 228.000 155.000 L 130.500 182.800 C 121.945 185.278 116.043 193.093 116.000 202.000 L 116.000 232.000 C 116.000 238.627 121.373 244.000 128.000 244.000 C 134.627 244.000 140.000 238.627 140.000 232.000 L 140.000 205.050 L 237.500 177.200 C 246.055 174.722 251.957 166.907 252.000 158.000 L 252.000 104.000 C 252.000 92.954 243.046 84.000 232.000 84.000 ZM 188.000 124.000 L 56.000 124.000 L 56.000 68.000 L 188.000 68.000 Z"),
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
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
