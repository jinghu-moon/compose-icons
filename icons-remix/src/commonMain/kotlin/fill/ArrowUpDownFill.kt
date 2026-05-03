package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowUpDownFill: ImageVector
    get() {
        if (_arrowUpDownFill != null) return _arrowUpDownFill!!
        _arrowUpDownFill = remixIcon(
            name = "ArrowUpDownFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 8.000 L 8.001 8.000 L 8.000 20.000 L 6.000 20.000 L 6.000 8.000 L 2.000 8.000 L 7.000 3.000 L 12.000 8.000 ZM 22.000 16.000 L 17.000 21.000 L 12.000 16.000 L 16.000 16.000 L 16.000 4.000 L 18.000 4.000 L 18.000 16.000 L 22.000 16.000 Z"),
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
        return _arrowUpDownFill!!
    }

private var _arrowUpDownFill: ImageVector? = null
