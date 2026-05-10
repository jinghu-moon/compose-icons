package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FullscreenFill: ImageVector
    get() {
        if (_fullscreenFill != null) return _fullscreenFill!!
        _fullscreenFill = remixIcon(
            name = "FullscreenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 3h6v6h-2v-4h-4v-2ZM2 3h6v2h-4v4h-2v-6ZM20 19v-4h2v6h-6v-2h4ZM4 19h4v2h-6v-6h2v4Z"),
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
        return _fullscreenFill!!
    }

private var _fullscreenFill: ImageVector? = null
