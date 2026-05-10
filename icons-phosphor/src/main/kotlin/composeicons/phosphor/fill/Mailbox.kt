package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = phosphorFillIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 152c0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM168 32h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-32c-4.418 0-8 3.582-8 8v32h16ZM240 116v60c0 8.837-7.163 16-16 16h-88v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-88c-8.837 0-16-7.163-16-16v-60C16.039 82.879 42.879 56.039 76 56h76v88c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-88h12c33.121 .039 59.961 26.879 60 60ZM120 116C120 91.699 100.301 72 76 72 51.699 72 32 91.699 32 116v60h88Z"),
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
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
