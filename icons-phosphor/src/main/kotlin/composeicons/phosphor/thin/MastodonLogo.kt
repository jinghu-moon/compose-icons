package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) return _mastodonLogo!!
        _mastodonLogo = phosphorThinIcon(
            name = "MastodonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 36h-112C52.118 36 36 52.118 36 72v120c0 19.882 16.118 36 36 36h88c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-88C56.536 220 44 207.464 44 192v-12h140c19.882 0 36-16.118 36-36v-72C220 52.118 203.882 36 184 36ZM212 144c0 15.464-12.536 28-28 28h-140v-100C44 56.536 56.536 44 72 44h112c15.464 0 28 12.536 28 28ZM180 104v32c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-32C172 92.954 163.046 84 152 84c-11.046 0-20 8.954-20 20v32c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-32C124 92.954 115.046 84 104 84 92.954 84 84 92.954 84 104v32c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-32C76.005 91.42 84.4 80.389 96.523 77.029c12.123-3.359 24.998 1.778 31.477 12.561 6.48-10.783 19.355-15.92 31.477-12.561C171.6 80.389 179.995 91.42 180 104Z"),
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
