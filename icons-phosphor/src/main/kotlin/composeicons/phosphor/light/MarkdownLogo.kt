package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MarkdownLogo: ImageVector
    get() {
        if (_markdownLogo != null) return _markdownLogo!!
        _markdownLogo = phosphorLightIcon(
            name = "MarkdownLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 50h-208C16.268 50 10 56.268 10 64v128c0 7.732 6.268 14 14 14h208c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM234 192c0 1.105-.895 2-2 2h-208c-1.105 0-2-.895-2-2v-128c0-1.105 .895-2 2-2h208c1.105 0 2 .895 2 2ZM126 104v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-33.51L92.24 140.24c-2.343 2.34-6.137 2.34-8.48 0L62 118.49v33.51c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-48c.002-2.425 1.464-4.611 3.705-5.538 2.241-.928 4.819-.415 6.535 1.298L88 127.51 115.76 99.76c1.716-1.714 4.295-2.226 6.535-1.298 2.241 .928 3.702 3.113 3.705 5.538ZM204.24 123.76c2.34 2.343 2.34 6.137 0 8.48l-24 24c-2.343 2.34-6.137 2.34-8.48 0l-24-24c-1.605-1.496-2.266-3.748-1.723-5.874 .543-2.126 2.203-3.786 4.329-4.329 2.126-.543 4.379 .118 5.874 1.723L170 137.51v-33.51c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v33.51l13.76-13.75c2.343-2.34 6.137-2.34 8.48 0Z"),
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
        return _markdownLogo!!
    }

private var _markdownLogo: ImageVector? = null
