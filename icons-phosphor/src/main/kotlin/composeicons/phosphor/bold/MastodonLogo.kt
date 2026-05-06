package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) return _mastodonLogo!!
        _mastodonLogo = phosphorBoldIcon(
            name = "MastodonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 28h-112C47.711 28.028 28.028 47.711 28 72v120c.028 24.289 19.711 43.972 44 44h88c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-88C60.954 212 52 203.046 52 192v-4h132c24.289-.028 43.972-19.711 44-44v-72C227.972 47.711 208.289 28.028 184 28ZM204 144c0 11.046-8.954 20-20 20h-132v-92C52 60.954 60.954 52 72 52h112c11.046 0 20 8.954 20 20ZM188 104v32c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-32c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v32c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-32c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v32c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-32C68.013 89.809 76.361 76.95 89.318 71.163c12.957-5.787 28.105-3.423 38.682 6.037 10.577-9.46 25.725-11.825 38.682-6.037C179.639 76.95 187.987 89.809 188 104Z"),
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
