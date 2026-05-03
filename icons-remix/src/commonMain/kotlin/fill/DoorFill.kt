package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DoorFill: ImageVector
    get() {
        if (_doorFill != null) return _doorFill!!
        _doorFill = remixIcon(
            name = "DoorFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.998 3.000 C 18.550 3.000 18.998 3.448 18.998 4.000 L 18.998 20.000 C 18.998 20.552 18.550 21.000 17.998 21.000 L 5.998 21.000 C 5.446 21.000 4.998 20.552 4.998 20.000 L 4.998 4.000 C 4.998 3.448 5.446 3.000 5.998 3.000 L 17.998 3.000 ZM 13.998 11.000 C 13.446 11.000 12.998 11.448 12.998 12.000 C 12.998 12.552 13.446 13.000 13.998 13.000 C 14.550 13.000 14.998 12.552 14.998 12.000 C 14.998 11.448 14.550 11.000 13.998 11.000 Z"),
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
        return _doorFill!!
    }

private var _doorFill: ImageVector? = null
