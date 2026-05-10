package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TyphoonFill: ImageVector
    get() {
        if (_typhoonFill != null) return _typhoonFill!!
        _typhoonFill = remixIcon(
            name = "TyphoonFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.654 1.7 14.872 4.233c1.275 .39 2.474 1.048 3.49 1.973 3.513 3.2 3.513 8.388 0 11.588-2.592 2.36-6.597 3.862-12.016 4.506L9.128 19.767C7.853 19.377 6.655 18.719 5.639 17.794 2.126 14.594 2.105 9.425 5.639 6.206 8.23 3.846 12.236 2.344 17.654 1.7ZM12 8C9.515 8 7.5 9.791 7.5 12c0 2.209 2.015 4 4.5 4 2.485 0 4.5-1.791 4.5-4C16.5 9.791 14.485 8 12 8Z"),
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
        return _typhoonFill!!
    }

private var _typhoonFill: ImageVector? = null
