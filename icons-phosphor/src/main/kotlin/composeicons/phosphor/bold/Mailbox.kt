package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = phosphorBoldIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 148c0 6.627-5.373 12-12 12h-24c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h24c6.627 0 12 5.373 12 12ZM244 116v60c0 11.046-8.954 20-20 20h-84v28c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-28h-84C20.954 196 12 187.046 12 176v-60C12.039 80.67 40.67 52.039 76 52h80v-28c0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-20v16c35.33 .039 63.961 28.67 64 64ZM116 172v-56C116 93.909 98.091 76 76 76 53.909 76 36 93.909 36 116v56ZM220 116C220 93.909 202.091 76 180 76v68c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-68h-30.07c9.12 11.335 14.086 25.451 14.07 40v56h80Z"),
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
