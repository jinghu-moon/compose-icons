package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GooglePodcastsLogo: ImageVector
    get() {
        if (_googlePodcastsLogo != null) return _googlePodcastsLogo!!
        _googlePodcastsLogo = phosphorBoldIcon(
            name = "GooglePodcastsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 16v32c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-32C116 9.373 121.373 4 128 4c6.627 0 12 5.373 12 12ZM176 52c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12ZM128 196c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12ZM128 76c-6.627 0-12 5.373-12 12v80c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-80c0-6.627-5.373-12-12-12ZM80 52C73.373 52 68 57.373 68 64v56c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-56C92 57.373 86.627 52 80 52ZM176 124c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-56c0-6.627-5.373-12-12-12ZM32 100c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12ZM80 148c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12ZM224 100c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12Z"),
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
        return _googlePodcastsLogo!!
    }

private var _googlePodcastsLogo: ImageVector? = null
