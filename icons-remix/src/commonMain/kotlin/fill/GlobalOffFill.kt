package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GlobalOffFill: ImageVector
    get() {
        if (_globalOffFill != null) return _globalOffFill!!
        _globalOffFill = remixIcon(
            name = "GlobalOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.035 16.379 L 19.914 18.500 L 22.035 20.621 L 20.621 22.036 L 18.500 19.914 L 16.379 22.036 L 14.965 20.621 L 17.086 18.500 L 14.965 16.379 L 16.379 14.965 L 18.500 17.086 L 20.621 14.965 L 22.035 16.379 ZM 7.527 13.000 C 7.706 16.269 8.758 19.305 10.452 21.881 C 5.988 21.187 2.500 17.540 2.049 13.000 L 7.527 13.000 ZM 14.469 13.000 C 14.444 13.393 14.405 13.781 14.352 14.166 C 13.212 15.258 12.500 16.796 12.500 18.500 C 12.500 18.865 12.534 19.222 12.597 19.569 C 12.409 19.918 12.212 20.260 12.000 20.592 C 10.585 18.374 9.702 15.783 9.530 13.000 L 14.469 13.000 ZM 10.452 2.119 C 8.758 4.695 7.706 7.731 7.527 11.000 L 2.049 11.000 C 2.500 6.460 5.988 2.813 10.452 2.119 ZM 12.000 3.408 C 13.415 5.626 14.297 8.217 14.469 11.000 L 9.530 11.000 C 9.702 8.217 10.585 5.627 12.000 3.408 ZM 13.548 2.119 C 18.012 2.813 21.499 6.460 21.950 11.000 L 16.473 11.000 C 16.294 7.731 15.242 4.695 13.548 2.119 Z"),
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
        return _globalOffFill!!
    }

private var _globalOffFill: ImageVector? = null
