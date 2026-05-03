package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CloseFill: ImageVector
    get() {
        if (_closeFill != null) return _closeFill!!
        _closeFill = remixIcon(
            name = "CloseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 10.587 L 16.949 5.637 L 18.364 7.051 L 13.414 12.001 L 18.364 16.950 L 16.949 18.365 L 12.000 13.415 L 7.050 18.365 L 5.636 16.950 L 10.585 12.001 L 5.636 7.051 L 7.050 5.637 L 12.000 10.587 Z"),
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
        return _closeFill!!
    }

private var _closeFill: ImageVector? = null
