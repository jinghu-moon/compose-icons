package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorBoldIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.000 208.000 C 188.000 214.627 182.627 220.000 176.000 220.000 L 160.000 220.000 C 147.878 220.004 136.294 214.990 128.000 206.150 C 119.706 214.990 108.122 220.004 96.000 220.000 L 80.000 220.000 C 73.373 220.000 68.000 214.627 68.000 208.000 C 68.000 201.373 73.373 196.000 80.000 196.000 L 96.000 196.000 C 107.046 196.000 116.000 187.046 116.000 176.000 L 116.000 140.000 L 104.000 140.000 C 97.373 140.000 92.000 134.627 92.000 128.000 C 92.000 121.373 97.373 116.000 104.000 116.000 L 116.000 116.000 L 116.000 80.000 C 116.000 68.954 107.046 60.000 96.000 60.000 L 80.000 60.000 C 73.373 60.000 68.000 54.627 68.000 48.000 C 68.000 41.373 73.373 36.000 80.000 36.000 L 96.000 36.000 C 108.122 35.996 119.706 41.010 128.000 49.850 C 136.294 41.010 147.878 35.996 160.000 36.000 L 176.000 36.000 C 182.627 36.000 188.000 41.373 188.000 48.000 C 188.000 54.627 182.627 60.000 176.000 60.000 L 160.000 60.000 C 148.954 60.000 140.000 68.954 140.000 80.000 L 140.000 116.000 L 152.000 116.000 C 158.627 116.000 164.000 121.373 164.000 128.000 C 164.000 134.627 158.627 140.000 152.000 140.000 L 140.000 140.000 L 140.000 176.000 C 140.000 187.046 148.954 196.000 160.000 196.000 L 176.000 196.000 C 182.627 196.000 188.000 201.373 188.000 208.000 Z"),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
