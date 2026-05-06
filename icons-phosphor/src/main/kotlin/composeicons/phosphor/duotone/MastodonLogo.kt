package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) return _mastodonLogo!!
        _mastodonLogo = phosphorDuotoneIcon(
            name = "MastodonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 72v72c0 17.673-14.327 32-32 32h-144v-104C40 54.327 54.327 40 72 40h112c17.673 0 32 14.327 32 32Z"),
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
                pathData = parseSvgPathData("M184 32h-112C49.909 32 32 49.909 32 72v120c0 22.091 17.909 40 40 40h88c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-88C58.745 216 48 205.255 48 192v-8h136c22.091 0 40-17.909 40-40v-72C224 49.909 206.091 32 184 32ZM208 144c0 13.255-10.745 24-24 24h-136v-96C48 58.745 58.745 48 72 48h112c13.255 0 24 10.745 24 24ZM184 104v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32C72.015 90.698 80.258 78.792 92.703 74.096c12.446-4.696 26.498-1.203 35.297 8.774 8.798-9.977 22.851-13.47 35.297-8.774C175.742 78.792 183.985 90.698 184 104Z"),
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
