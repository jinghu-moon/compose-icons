package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) return _mastodonLogo!!
        _mastodonLogo = phosphorFillIcon(
            name = "MastodonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 32h-112C49.909 32 32 49.909 32 72v120c0 22.091 17.909 40 40 40h88c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-88C58.745 216 48 205.255 48 192v-8h136c22.091 0 40-17.909 40-40v-72C224 49.909 206.091 32 184 32ZM184 136c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32C72.015 90.698 80.258 78.792 92.703 74.096c12.446-4.696 26.498-1.203 35.297 8.774 8.798-9.977 22.851-13.47 35.297-8.774C175.742 78.792 183.985 90.698 184 104Z"),
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
        return _mastodonLogo!!
    }

private var _mastodonLogo: ImageVector? = null
