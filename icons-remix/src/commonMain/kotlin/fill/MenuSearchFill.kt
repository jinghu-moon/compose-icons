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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.618 13.032 C 17.732 13.642 16.657 14.000 15.500 14.000 C 12.462 14.000 10.000 11.538 10.000 8.500 C 10.000 5.462 12.462 3.000 15.500 3.000 C 18.538 3.000 21.000 5.462 21.000 8.500 C 21.000 9.658 20.642 10.731 20.032 11.618 L 22.707 14.293 L 21.293 15.707 L 18.618 13.032 ZM 3.000 4.000 L 8.000 4.000 L 8.000 6.000 L 3.000 6.000 L 3.000 4.000 ZM 3.000 11.000 L 8.000 11.000 L 8.000 13.000 L 3.000 13.000 L 3.000 11.000 ZM 3.000 18.000 L 21.000 18.000 L 21.000 20.000 L 3.000 20.000 L 3.000 18.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _menuSearchFill!!
    }

private var _menuSearchFill: ImageVector? = null
