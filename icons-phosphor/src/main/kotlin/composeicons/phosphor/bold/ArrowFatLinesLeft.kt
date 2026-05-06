package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLinesLeft: ImageVector
    get() {
        if (_arrowFatLinesLeft != null) return _arrowFatLinesLeft!!
        _arrowFatLinesLeft = phosphorBoldIcon(
            name = "ArrowFatLinesLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 68h-4v-36c.004-4.856-2.92-9.236-7.407-11.095-4.487-1.859-9.651-.83-13.083 2.605L15.51 119.51c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l96 96c3.435 3.439 8.604 4.466 13.093 2.602 4.488-1.864 7.409-6.252 7.397-11.112v-36h4c6.627 0 12-5.373 12-12v-96c0-6.627-5.373-12-12-12ZM124 164h-4c-6.627 0-12 5.373-12 12v19L41 128 108 61v19c0 6.627 5.373 12 12 12h4ZM228 80v96c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-96c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM188 80v96c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-96c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _arrowFatLinesLeft!!
    }

private var _arrowFatLinesLeft: ImageVector? = null
