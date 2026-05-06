package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MenuSearchFill: ImageVector
    get() {
        if (_menuSearchFill != null) return _menuSearchFill!!
        _menuSearchFill = remixIcon(
            name = "MenuSearchFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.618 13.032c-.886 .611-1.96 .968-3.118 .968C12.462 14 10 11.538 10 8.5 10 5.462 12.462 3 15.5 3 18.538 3 21 5.462 21 8.5c0 1.158-.358 2.231-.968 3.118l2.675 2.675-1.414 1.414L18.618 13.032ZM3 4h5v2h-5v-2ZM3 11h5v2h-5v-2ZM3 18h18v2h-18v-2Z"),
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
        return _menuSearchFill!!
    }

private var _menuSearchFill: ImageVector? = null
