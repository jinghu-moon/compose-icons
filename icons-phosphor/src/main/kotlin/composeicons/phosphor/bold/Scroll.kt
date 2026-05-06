package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = phosphorBoldIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 92c0-6.627 5.373-12 12-12h60c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-60C97.373 104 92 98.627 92 92ZM104 144h60c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-60c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM236 192c0 19.882-16.118 36-36 36h-112C68.118 228 52 211.882 52 192v-128C52 57.373 46.627 52 40 52 33.373 52 28 57.373 28 64c0 3.73 3.35 6.51 3.38 6.54l-.18-.14h0c3.596 2.509 5.537 6.78 5.062 11.14-.475 4.359-3.289 8.112-7.341 9.789-4.052 1.677-8.695 1.01-12.112-1.739h0C15.49 88.62 4 79.55 4 64 4 44.118 20.118 28 40 28h136c19.882 0 36 16.118 36 36v100h4c2.596 0 5.123 .842 7.2 2.4C224.51 167.38 236 176.45 236 192ZM92.62 172.2C94.255 167.303 98.838 164.001 104 164h84v-100c0-6.627-5.373-12-12-12h-102.06c1.365 3.853 2.062 7.912 2.06 12v128c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-3.58-3.17-6.38-3.2-6.4-4.133-3.101-5.817-8.499-4.18-13.4ZM212 192c-.035-1.422-.465-2.807-1.24-4h-87c.175 1.326 .262 2.662 .26 4 .003 4.088-.694 8.147-2.06 12h78.04c6.627 0 12-5.373 12-12Z"),
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
        return _scroll!!
    }

private var _scroll: ImageVector? = null
