package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ReservedFill: ImageVector
    get() {
        if (_reservedFill != null) return _reservedFill!!
        _reservedFill = remixIcon(
            name = "ReservedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 15.000 L 13.000 19.000 L 16.000 19.000 L 16.000 21.000 L 8.000 21.000 L 8.000 19.000 L 11.000 19.000 L 11.000 15.000 L 4.000 15.000 C 3.448 15.000 3.000 14.552 3.000 14.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 14.000 C 21.000 14.552 20.552 15.000 20.000 15.000 L 13.000 15.000 ZM 8.000 8.000 L 8.000 10.000 L 16.000 10.000 L 16.000 8.000 L 8.000 8.000 Z"),
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
        return _reservedFill!!
    }

private var _reservedFill: ImageVector? = null
