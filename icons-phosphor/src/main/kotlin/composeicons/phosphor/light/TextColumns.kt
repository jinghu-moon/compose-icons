package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextColumns: ImageVector
    get() {
        if (_textColumns != null) return _textColumns!!
        _textColumns = phosphorLightIcon(
            name = "TextColumns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M118 64c0 3.314-2.686 6-6 6h-72c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h72c3.314 0 6 2.686 6 6ZM112 98h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM112 138h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM112 178h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM144 70h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM216 98h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM216 138h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM216 178h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _textColumns!!
    }

private var _textColumns: ImageVector? = null
