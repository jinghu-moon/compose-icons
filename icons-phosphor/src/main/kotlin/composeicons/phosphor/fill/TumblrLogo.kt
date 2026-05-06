package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorFillIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 120v48c0 4.418 3.582 8 8 8h32c4.418 0 8 3.582 8 8v48c0 4.418-3.582 8-8 8h-40C116.67 239.961 88.039 211.33 88 176v-56h-24c-4.418 0-8-3.582-8-8v-40c0-4.418 3.582-8 8-8 22.091 0 40-17.909 40-40 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8v40h40c4.418 0 8 3.582 8 8v40c0 4.418-3.582 8-8 8Z"),
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
