package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CollapseDiagonalFill: ImageVector
    get() {
        if (_collapseDiagonalFill != null) return _collapseDiagonalFill!!
        _collapseDiagonalFill = remixIcon(
            name = "CollapseDiagonalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.500 11.000 L 13.000 11.000 L 13.000 3.500 L 16.043 6.543 L 19.293 3.293 L 20.707 4.707 L 17.457 7.957 L 20.500 11.000 ZM 3.500 13.000 L 11.000 13.000 L 11.000 20.500 L 7.957 17.457 L 4.707 20.707 L 3.293 19.293 L 6.543 16.043 L 3.500 13.000 Z"),
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
        return _collapseDiagonalFill!!
    }

private var _collapseDiagonalFill: ImageVector? = null
