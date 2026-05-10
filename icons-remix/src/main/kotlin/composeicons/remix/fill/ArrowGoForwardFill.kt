package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowGoForwardFill: ImageVector
    get() {
        if (_arrowGoForwardFill != null) return _arrowGoForwardFill!!
        _arrowGoForwardFill = remixIcon(
            name = "ArrowGoForwardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 7h-5C7.686 7 5 9.686 5 13c0 3.314 2.686 6 6 6h9v2h-9C6.582 21 3 17.418 3 13 3 8.582 6.582 5 11 5h5v-4l6 5-6 5v-4Z"),
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
        return _arrowGoForwardFill!!
    }

private var _arrowGoForwardFill: ImageVector? = null
