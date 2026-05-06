package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorDuotoneIcon(
            name = "TextUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 56v80c0 30.928-25.072 56-56 56C97.072 192 72 166.928 72 136v-80Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M200 224c0 4.418-3.582 8-8 8h-128c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h128c4.418 0 8 3.582 8 8ZM128 200c35.33-.039 63.961-28.67 64-64v-80c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v80c0 26.51-21.49 48-48 48C101.49 184 80 162.51 80 136v-80c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v80c.039 35.33 28.67 63.961 64 64Z"),
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
