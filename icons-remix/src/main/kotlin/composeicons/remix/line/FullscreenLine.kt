package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FullscreenLine: ImageVector
    get() {
        if (_fullscreenLine != null) return _fullscreenLine!!
        _fullscreenLine = remixIcon(
            name = "FullscreenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 3v2h-4v4h-2v-6h6ZM2 21v-6h2v4h4v2h-6ZM22 21h-6v-2h4v-4h2v6ZM22 9h-2v-4h-4v-2h6v6Z"),
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
        return _fullscreenLine!!
    }

private var _fullscreenLine: ImageVector? = null
