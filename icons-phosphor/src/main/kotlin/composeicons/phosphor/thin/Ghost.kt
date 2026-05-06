package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorThinIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108 116c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM156 108c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM220 120v96c.001 1.545-.889 2.953-2.285 3.615-1.396 .663-3.049 .462-4.245-.515L186.67 197.17l-26.8 21.93c-1.474 1.208-3.596 1.208-5.07 0L128 197.17l-26.8 21.93c-1.474 1.208-3.596 1.208-5.07 0L69.33 197.17 42.53 219.1c-1.197 .977-2.85 1.178-4.245 .515C36.889 218.953 35.999 217.545 36 216v-96C36 69.19 77.19 28 128 28c50.81 0 92 41.19 92 92ZM212 120C212 73.608 174.392 36 128 36 81.608 36 44 73.608 44 120v87.56L66.8 188.9c1.474-1.208 3.596-1.208 5.07 0l26.8 21.93 26.8-21.93c1.472-1.202 3.588-1.202 5.06 0l26.8 21.93 26.8-21.93c1.474-1.208 3.596-1.208 5.07 0L212 207.56Z"),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
