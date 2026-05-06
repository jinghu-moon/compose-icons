package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Church: ImageVector
    get() {
        if (_church != null) return _church!!
        _church = phosphorBoldIcon(
            name = "Church",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.17 141.71 196 121.21v-17.21c.01-4.297-2.279-8.271-6-10.42L140 65v-13h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-12C140 9.373 134.627 4 128 4c-6.627 0-12 5.373-12 12v12h-12C97.373 28 92 33.373 92 40c0 6.627 5.373 12 12 12h12v13L66.05 93.58C62.309 95.716 60 99.693 60 104v17.21L25.83 141.71C22.214 143.878 20.001 147.784 20 152v64c0 6.627 5.373 12 12 12h76c6.627 0 12-5.373 12-12v-44c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v44c0 6.627 5.373 12 12 12h76c6.627 0 12-5.373 12-12v-64c-.001-4.216-2.214-8.122-5.83-10.29ZM44 158.79l16-9.6v54.81h-16ZM128 140c-17.673 0-32 14.327-32 32v32h-12v-93L128 85.86 172 111v93h-12v-32c0-17.673-14.327-32-32-32ZM212 204h-16v-54.81l16 9.6Z"),
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
        return _church!!
    }

private var _church: ImageVector? = null
