package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorRegularIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 120c4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8h-40v-40c0-4.418-3.582-8-8-8h-32c-4.418 0-8 3.582-8 8C104 46.091 86.091 64 64 64c-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8h24v56c.039 35.33 28.67 63.961 64 64h40c4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8h-32c-4.418 0-8-3.582-8-8v-48ZM160 192h24v32h-32c-26.498-.028-47.972-21.502-48-48v-64c0-4.418-3.582-8-8-8h-24v-24.57C96.557 75.844 115.844 56.557 119.43 32h16.57v40c0 4.418 3.582 8 8 8h40v24h-40c-4.418 0-8 3.582-8 8v56c0 13.255 10.745 24 24 24Z"),
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
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null
