package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpeedMiniFill: ImageVector
    get() {
        if (_speedMiniFill != null) return _speedMiniFill!!
        _speedMiniFill = remixIcon(
            name = "SpeedMiniFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.788 17.443 C 4.704 17.503 4.603 17.535 4.500 17.535 C 4.224 17.535 4.000 17.311 4.000 17.035 L 4.000 6.965 C 4.000 6.862 4.032 6.761 4.092 6.677 C 4.251 6.451 4.563 6.397 4.788 6.556 L 11.921 11.591 C 11.968 11.624 12.009 11.665 12.042 11.712 C 12.201 11.937 12.147 12.249 11.921 12.408 L 4.788 17.443 ZM 13.000 6.965 C 13.000 6.862 13.032 6.761 13.092 6.677 C 13.251 6.451 13.563 6.397 13.788 6.556 L 20.921 11.591 C 20.968 11.624 21.009 11.665 21.042 11.712 C 21.201 11.937 21.147 12.249 20.921 12.408 L 13.788 17.443 C 13.704 17.503 13.603 17.535 13.500 17.535 C 13.224 17.535 13.000 17.311 13.000 17.035 L 13.000 6.965 Z"),
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
        return _speedMiniFill!!
    }

private var _speedMiniFill: ImageVector? = null
