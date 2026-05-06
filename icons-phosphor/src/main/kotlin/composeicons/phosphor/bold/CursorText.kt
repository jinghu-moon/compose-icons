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
                pathData = parseSvgPathData("M188 208c0 6.627-5.373 12-12 12h-16c-12.122 .004-23.706-5.01-32-13.85-8.294 8.84-19.878 13.854-32 13.85h-16c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h16c11.046 0 20-8.954 20-20v-36h-12c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h12v-36C116 68.954 107.046 60 96 60h-16C73.373 60 68 54.627 68 48 68 41.373 73.373 36 80 36h16c12.122-.004 23.706 5.01 32 13.85C136.294 41.01 147.878 35.996 160 36h16c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-16c-11.046 0-20 8.954-20 20v36h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-12v36c0 11.046 8.954 20 20 20h16c6.627 0 12 5.373 12 12Z"),
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
