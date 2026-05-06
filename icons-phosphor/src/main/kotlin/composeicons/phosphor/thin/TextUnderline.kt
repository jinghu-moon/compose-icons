package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorThinIcon(
            name = "TextUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 224c0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4ZM128 196c33.121-.039 59.961-26.879 60-60v-80c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v80c0 28.719-23.281 52-52 52C99.281 188 76 164.719 76 136v-80c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v80c.039 33.121 26.879 59.961 60 60Z"),
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
