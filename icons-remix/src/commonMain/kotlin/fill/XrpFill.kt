package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.XrpFill: ImageVector
    get() {
        if (_xrpFill != null) return _xrpFill!!
        _xrpFill = remixIcon(
            name = "XrpFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.778 4.000 L 18.941 4.000 L 14.452 8.371 C 13.798 9.005 12.917 9.360 12.000 9.360 C 11.082 9.360 10.201 9.005 9.548 8.371 L 5.062 4.000 L 2.223 4.000 L 8.129 9.754 C 10.269 11.837 13.736 11.837 15.874 9.754 L 21.778 4.000 ZM 2.223 20.000 L 5.051 20.000 L 9.559 15.615 C 10.210 14.984 11.088 14.630 12.002 14.630 C 12.916 14.630 13.794 14.984 14.445 15.615 L 18.952 20.000 L 21.778 20.000 L 15.858 14.239 C 13.726 12.166 10.273 12.166 8.143 14.239 L 2.223 20.000 Z"),
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
        return _xrpFill!!
    }

private var _xrpFill: ImageVector? = null
