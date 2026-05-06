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
                pathData = parseSvgPathData("M21 3h-7.5l3.043 3.043L13.293 9.293l1.414 1.414L17.957 7.457 21 10.5v-7.5ZM3 21h7.5L7.457 17.957l3.25-3.25L9.293 13.293 6.043 16.543 3 13.5v7.5Z"),
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
