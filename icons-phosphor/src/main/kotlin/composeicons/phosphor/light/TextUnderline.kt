package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorLightIcon(
            name = "TextUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198 224c0 3.314-2.686 6-6 6h-128c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h128c3.314 0 6 2.686 6 6ZM128 198c34.226-.039 61.961-27.774 62-62v-80c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v80c0 27.614-22.386 50-50 50C100.386 186 78 163.614 78 136v-80c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v80c.039 34.226 27.774 61.961 62 62Z"),
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
