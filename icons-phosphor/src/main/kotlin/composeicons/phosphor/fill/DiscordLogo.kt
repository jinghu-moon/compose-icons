package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DiscordLogo: ImageVector
    get() {
        if (_discordLogo != null) return _discordLogo!!
        _discordLogo = phosphorFillIcon(
            name = "DiscordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.51 174.39 218 58C216.413 51.808 211.309 47.144 205 46.12L168.94 40.2c-8.236-1.325-16.134 3.814-18.26 11.88l-.21 .85c-.275 1.092-.077 2.249 .546 3.188 .622 .938 1.612 1.571 2.724 1.742 8.274 1.214 16.438 3.094 24.41 5.62 4.136 1.248 6.594 5.491 5.62 9.7-.545 2.136-1.948 3.953-3.877 5.02-1.929 1.068-4.213 1.292-6.313 .62C143.998 69.748 112.382 69.713 82.78 78.72c-4.161 1.399-8.688-.719-10.28-4.81-.736-2.042-.611-4.296 .347-6.243 .958-1.948 2.666-3.423 4.733-4.087 8.072-2.571 16.339-4.484 24.72-5.72 1.113-.171 2.102-.804 2.724-1.742 .622-.938 .82-2.096 .546-3.188l-.21-.85C103.233 44.006 95.321 38.868 87.08 40.21L51 46.13C44.693 47.153 39.59 51.812 38 58L8.49 174.39c-1.911 7.555 1.921 15.384 9.06 18.51l67 29.71c4.072 1.81 8.71 1.86 12.82 .137 4.11-1.723 7.326-5.065 8.89-9.237l3.49-9.45c.421-1.147 .295-2.423-.342-3.466-.637-1.042-1.716-1.736-2.928-1.884-9.715-1.176-19.299-3.252-28.63-6.2-4.118-1.252-6.568-5.474-5.61-9.67 .541-2.142 1.943-3.965 3.875-5.037 1.932-1.072 4.221-1.297 6.325-.623 29.693 9.093 61.427 9.093 91.12 0 2.101-.672 4.386-.446 6.316 .624 1.929 1.07 3.331 2.889 3.874 5.027 .969 4.2-1.484 8.432-5.61 9.68-9.327 2.949-18.908 5.025-28.62 6.2-1.213 .148-2.291 .842-2.928 1.884-.637 1.042-.763 2.319-.342 3.466l3.49 9.45c1.566 4.171 4.783 7.511 8.892 9.233 4.109 1.722 8.746 1.674 12.818-.133l67-29.71c7.139-3.126 10.971-10.955 9.06-18.51ZM92 152c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM164 152c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _discordLogo!!
    }

private var _discordLogo: ImageVector? = null
