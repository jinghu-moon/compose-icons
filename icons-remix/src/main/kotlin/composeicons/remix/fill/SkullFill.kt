package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SkullFill: ImageVector
    get() {
        if (_skullFill != null) return _skullFill!!
        _skullFill = remixIcon(
            name = "SkullFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 18v3c0 .552-.448 1-1 1h-10C6.448 22 6 21.552 6 21v-3h-3C2.448 18 2 17.552 2 17v-5C2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10v5c0 .552-.448 1-1 1h-3ZM7.5 14C8.328 14 9 13.328 9 12.5 9 11.672 8.328 11 7.5 11 6.672 11 6 11.672 6 12.5 6 13.328 6.672 14 7.5 14ZM16.5 14C17.328 14 18 13.328 18 12.5 18 11.672 17.328 11 16.5 11 15.672 11 15 11.672 15 12.5c0 .828 .672 1.5 1.5 1.5Z"),
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
        return _skullFill!!
    }

private var _skullFill: ImageVector? = null
