package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorFillIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 176v-24h20v16c0 4.418-3.582 8-8 8ZM140 176v-24h-24v24ZM176 88c0-4.418-3.582-8-8-8h-80c-4.418 0-8 3.582-8 8v48h96ZM152 24h-48C64.235 24 32 56.235 32 96v112c0 4.418 3.582 8 8 8h36.58c1.516 .001 2.902-.855 3.58-2.21L91.06 192h-3.06C74.745 192 64 181.255 64 168v-80C64 74.745 74.745 64 88 64h80c13.255 0 24 10.745 24 24v80c0 13.255-10.745 24-24 24h-3.06l10.9 21.79c.678 1.355 2.064 2.211 3.58 2.21h36.58c4.418 0 8-3.582 8-8v-112C224 56.235 191.764 24 152 24ZM147.06 192h-38.12l-9.1 18.21c-.621 1.24-.554 2.714 .175 3.894 .729 1.18 2.018 1.897 3.405 1.896h49.16c1.387 .001 2.676-.717 3.405-1.896 .729-1.18 .796-2.653 .175-3.894ZM80 168c0 4.418 3.582 8 8 8h12v-24h-20Z"),
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
        return _subway!!
    }

private var _subway: ImageVector? = null
