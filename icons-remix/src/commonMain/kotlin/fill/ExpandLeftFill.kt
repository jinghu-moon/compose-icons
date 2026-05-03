package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandLeftFill: ImageVector
    get() {
        if (_expandLeftFill != null) return _expandLeftFill!!
        _expandLeftFill = remixIcon(
            name = "ExpandLeftFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 5.000 L 10.000 11.000 L 16.000 11.000 L 16.000 13.000 L 10.000 13.000 L 10.000 19.000 L 3.000 12.000 L 10.000 5.000 ZM 18.000 19.000 L 18.000 5.000 L 20.000 5.000 L 20.000 19.000 L 18.000 19.000 Z"),
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
        return _expandLeftFill!!
    }

private var _expandLeftFill: ImageVector? = null
