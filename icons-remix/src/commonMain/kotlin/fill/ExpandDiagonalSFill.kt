package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandDiagonalSFill: ImageVector
    get() {
        if (_expandDiagonalSFill != null) return _expandDiagonalSFill!!
        _expandDiagonalSFill = remixIcon(
            name = "ExpandDiagonalSFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 5.000 L 11.500 5.000 L 14.543 8.043 L 8.043 14.543 L 5.000 11.500 L 5.000 19.000 L 12.500 19.000 L 9.457 15.957 L 15.957 9.457 L 19.000 12.500 L 19.000 5.000 Z"),
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
        return _expandDiagonalSFill!!
    }

private var _expandDiagonalSFill: ImageVector? = null
