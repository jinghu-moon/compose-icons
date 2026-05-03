package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowRightUpFill: ImageVector
    get() {
        if (_arrowRightUpFill != null) return _arrowRightUpFill!!
        _arrowRightUpFill = remixIcon(
            name = "ArrowRightUpFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.051 12.361 L 7.394 18.018 L 5.980 16.604 L 11.637 10.947 L 6.687 5.997 L 18.001 5.997 L 18.001 17.311 L 13.051 12.361 Z"),
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
        return _arrowRightUpFill!!
    }

private var _arrowRightUpFill: ImageVector? = null
