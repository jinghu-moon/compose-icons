package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Eye2Fill: ImageVector
    get() {
        if (_eye2Fill != null) return _eye2Fill!!
        _eye2Fill = remixIcon(
            name = "Eye2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 7.000 C 11.487 7.000 10.993 7.077 10.527 7.220 C 11.395 7.612 12.000 8.485 12.000 9.500 C 12.000 10.881 10.881 12.000 9.500 12.000 C 8.485 12.000 7.612 11.395 7.221 10.527 C 7.077 10.993 7.000 11.487 7.000 12.000 C 7.000 14.761 9.239 17.000 12.000 17.000 C 14.761 17.000 17.000 14.761 17.000 12.000 C 17.000 9.239 14.761 7.000 12.000 7.000 Z"),
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
        return _eye2Fill!!
    }

private var _eye2Fill: ImageVector? = null
