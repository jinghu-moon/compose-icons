package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GooglePodcastsLogo: ImageVector
    get() {
        if (_googlePodcastsLogo != null) return _googlePodcastsLogo!!
        _googlePodcastsLogo = phosphorThinIcon(
            name = "GooglePodcastsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 16v32c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-32c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM176 60c-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4ZM128 204c-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4ZM128 84c-2.209 0-4 1.791-4 4v80c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-80c0-2.209-1.791-4-4-4ZM80 60c-2.209 0-4 1.791-4 4v56c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-56c0-2.209-1.791-4-4-4ZM176 132c-2.209 0-4 1.791-4 4v56c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-56c0-2.209-1.791-4-4-4ZM32 108c-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4ZM80 156c-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4ZM224 108c-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4Z"),
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
