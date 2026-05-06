package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GooglePodcastsLogo: ImageVector
    get() {
        if (_googlePodcastsLogo != null) return _googlePodcastsLogo!!
        _googlePodcastsLogo = phosphorLightIcon(
            name = "GooglePodcastsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134 16v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-32c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM176 58c-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6ZM128 202c-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6ZM128 82c-3.314 0-6 2.686-6 6v80c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-80c0-3.314-2.686-6-6-6ZM80 58c-3.314 0-6 2.686-6 6v56c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-56c0-3.314-2.686-6-6-6ZM176 130c-3.314 0-6 2.686-6 6v56c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-56c0-3.314-2.686-6-6-6ZM32 106c-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6ZM80 154c-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6ZM224 106c-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6Z"),
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
