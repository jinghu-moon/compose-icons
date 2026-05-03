package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GlobalFill: ImageVector
    get() {
        if (_globalFill != null) return _globalFill!!
        _globalFill = remixIcon(
            name = "GlobalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.049 13.000 L 7.527 13.000 C 7.706 16.269 8.757 19.305 10.452 21.881 C 5.988 21.187 2.500 17.540 2.049 13.000 ZM 2.049 11.000 C 2.500 6.460 5.988 2.813 10.452 2.119 C 8.757 4.695 7.706 7.731 7.527 11.000 L 2.049 11.000 ZM 21.951 11.000 L 16.473 11.000 C 16.294 7.731 15.243 4.695 13.548 2.119 C 18.012 2.813 21.500 6.460 21.951 11.000 ZM 21.951 13.000 C 21.500 17.540 18.012 21.187 13.548 21.881 C 15.243 19.305 16.294 16.269 16.473 13.000 L 21.951 13.000 ZM 9.531 13.000 L 14.469 13.000 C 14.298 15.783 13.415 18.373 12.000 20.591 C 10.585 18.373 9.702 15.783 9.531 13.000 ZM 9.531 11.000 C 9.702 8.217 10.585 5.627 12.000 3.408 C 13.415 5.627 14.298 8.217 14.469 11.000 L 9.531 11.000 Z"),
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
        return _globalFill!!
    }

private var _globalFill: ImageVector? = null
