package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandDiagonalFill: ImageVector
    get() {
        if (_expandDiagonalFill != null) return _expandDiagonalFill!!
        _expandDiagonalFill = remixIcon(
            name = "ExpandDiagonalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 3.000 L 13.500 3.000 L 16.543 6.043 L 13.293 9.293 L 14.707 10.707 L 17.957 7.457 L 21.000 10.500 L 21.000 3.000 ZM 3.000 21.000 L 10.500 21.000 L 7.457 17.957 L 10.707 14.707 L 9.293 13.293 L 6.043 16.543 L 3.000 13.500 L 3.000 21.000 Z"),
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
        return _expandDiagonalFill!!
    }

private var _expandDiagonalFill: ImageVector? = null
