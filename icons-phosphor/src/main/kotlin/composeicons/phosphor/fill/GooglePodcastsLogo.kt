package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GooglePodcastsLogo: ImageVector
    get() {
        if (_googlePodcastsLogo != null) return _googlePodcastsLogo!!
        _googlePodcastsLogo = phosphorFillIcon(
            name = "GooglePodcastsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.32 116.68l-104-104C136.319 9.676 132.247 7.987 128 7.987c-4.247 0-8.319 1.688-11.32 4.693l-104 104C9.676 119.681 7.987 123.753 7.987 128c0 4.247 1.688 8.319 4.693 11.32l104 104c3.001 3.004 7.073 4.693 11.32 4.693 4.247 0 8.319-1.688 11.32-4.693l104-104c3.004-3.001 4.693-7.073 4.693-11.32 0-4.247-1.688-8.319-4.693-11.32ZM56 136c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM96 176c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM96 128c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM136 216c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM136 168c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM136 56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM176 176c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM176 96c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM216 136c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
