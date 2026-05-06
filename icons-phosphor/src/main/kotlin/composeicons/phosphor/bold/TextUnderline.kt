package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorBoldIcon(
            name = "TextUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 224c0 6.627-5.373 12-12 12h-128c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h128c6.627 0 12 5.373 12 12ZM128 196c37.539-.039 67.961-30.461 68-68v-72c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v72c0 24.301-19.699 44-44 44C103.699 172 84 152.301 84 128v-72C84 49.373 78.627 44 72 44 65.373 44 60 49.373 60 56v72c.039 37.539 30.461 67.961 68 68Z"),
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
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
