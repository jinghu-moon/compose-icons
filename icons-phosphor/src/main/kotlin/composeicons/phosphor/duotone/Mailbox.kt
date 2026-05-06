package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = phosphorDuotoneIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 116v60c0 4.418-3.582 8-8 8h-96v-68C128 87.281 104.719 64 76 64h104c28.719 0 52 23.281 52 52Z"),
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
                pathData = parseSvgPathData("M104 152c0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM240 116v60c0 8.837-7.163 16-16 16h-88v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-88c-8.837 0-16-7.163-16-16v-60C16.039 82.879 42.879 56.039 76 56h76v-32c0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24v24h12c33.121 .039 59.961 26.879 60 60ZM120 176v-60C120 91.699 100.301 72 76 72 51.699 72 32 91.699 32 116v60ZM224 116C223.972 91.711 204.289 72.028 180 72h-12v72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-72h-35.25c12.277 11.337 19.256 27.289 19.25 44v60h88Z"),
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
