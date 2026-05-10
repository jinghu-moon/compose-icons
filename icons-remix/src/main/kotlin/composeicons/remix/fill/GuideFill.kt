package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GuideFill: ImageVector
    get() {
        if (_guideFill != null) return _guideFill!!
        _guideFill = remixIcon(
            name = "GuideFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 8v8c0 1.657-1.343 3-3 3h-2.171C7.417 20.165 6.306 21 5 21 3.343 21 2 19.657 2 18 2 16.343 3.343 15 5 15c1.306 0 2.417 .835 2.829 2h2.171c.552 0 1-.448 1-1v-8C11 6.343 12.343 5 14 5h3v-3l5 4-5 4v-3h-3c-.552 0-1 .448-1 1Z"),
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
        return _guideFill!!
    }

private var _guideFill: ImageVector? = null
