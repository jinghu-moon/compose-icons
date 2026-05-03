package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BlazeFill: ImageVector
    get() {
        if (_blazeFill != null) return _blazeFill!!
        _blazeFill = remixIcon(
            name = "BlazeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.500 9.000 C 19.500 10.061 20.000 11.394 20.000 13.000 C 20.000 16.466 16.300 17.276 14.500 22.000 C 13.833 21.425 13.500 20.592 13.500 19.500 C 13.500 16.018 18.500 14.210 18.500 9.000 ZM 14.500 5.000 C 15.700 6.238 16.300 7.572 16.300 9.000 C 16.300 13.951 10.255 14.692 11.500 22.000 C 9.833 20.839 9.000 19.173 9.000 17.000 C 9.000 13.675 14.500 11.000 14.500 5.000 ZM 10.000 1.000 C 11.333 2.667 12.000 4.167 12.000 5.500 C 12.000 11.750 3.500 13.722 8.000 22.000 C 5.384 21.420 3.500 19.000 3.500 16.000 C 3.500 9.500 10.000 8.500 10.000 1.000 Z"),
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
        return _blazeFill!!
    }

private var _blazeFill: ImageVector? = null
