package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MenuSearchLine: ImageVector
    get() {
        if (_menuSearchLine != null) return _menuSearchLine!!
        _menuSearchLine = remixIcon(
            name = "MenuSearchLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.5 5C13.567 5 12 6.567 12 8.5 12 10.433 13.567 12 15.5 12 17.433 12 19 10.433 19 8.5 19 6.567 17.433 5 15.5 5ZM10 8.5C10 5.462 12.462 3 15.5 3 18.538 3 21 5.462 21 8.5c0 1.158-.358 2.231-.968 3.118l2.675 2.675-1.414 1.414L18.618 13.032c-.886 .611-1.96 .968-3.118 .968C12.462 14 10 11.538 10 8.5ZM3 4h5v2h-5v-2ZM3 11h5v2h-5v-2ZM21 18v2h-18v-2h18Z"),
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
        return _menuSearchLine!!
    }

private var _menuSearchLine: ImageVector? = null
