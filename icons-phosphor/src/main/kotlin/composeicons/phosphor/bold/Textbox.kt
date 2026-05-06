package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Textbox: ImageVector
    get() {
        if (_textbox != null) return _textbox!!
        _textbox = phosphorBoldIcon(
            name = "Textbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 36c-6.627 0-12 5.373-12 12v12h-76C12.954 60 4 68.954 4 80v96c0 11.046 8.954 20 20 20h76v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM28 172v-88h72v88ZM252 80v96c0 11.046-8.954 20-20 20h-80c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h76v-88h-76c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h80c11.046 0 20 8.954 20 20ZM88 112c0 6.627-5.373 12-12 12v20c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-20c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h24c6.627 0 12 5.373 12 12Z"),
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
        return _textbox!!
    }

private var _textbox: ImageVector? = null
