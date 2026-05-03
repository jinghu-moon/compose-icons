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
                pathData = parseSvgPathData("M 15.500 5.000 C 13.567 5.000 12.000 6.567 12.000 8.500 C 12.000 10.433 13.567 12.000 15.500 12.000 C 17.433 12.000 19.000 10.433 19.000 8.500 C 19.000 6.567 17.433 5.000 15.500 5.000 ZM 10.000 8.500 C 10.000 5.462 12.462 3.000 15.500 3.000 C 18.538 3.000 21.000 5.462 21.000 8.500 C 21.000 9.658 20.642 10.731 20.032 11.618 L 22.707 14.293 L 21.293 15.707 L 18.618 13.032 C 17.732 13.642 16.657 14.000 15.500 14.000 C 12.462 14.000 10.000 11.538 10.000 8.500 ZM 3.000 4.000 L 8.000 4.000 L 8.000 6.000 L 3.000 6.000 L 3.000 4.000 ZM 3.000 11.000 L 8.000 11.000 L 8.000 13.000 L 3.000 13.000 L 3.000 11.000 ZM 21.000 18.000 L 21.000 20.000 L 3.000 20.000 L 3.000 18.000 L 21.000 18.000 Z"),
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
