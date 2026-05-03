package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DoorClosedLine: ImageVector
    get() {
        if (_doorClosedLine != null) return _doorClosedLine!!
        _doorClosedLine = remixIcon(
            name = "DoorClosedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.998 21.000 L 2.998 19.000 L 4.998 19.000 L 4.998 4.000 C 4.998 3.448 5.446 3.000 5.998 3.000 L 17.998 3.000 C 18.550 3.000 18.998 3.448 18.998 4.000 L 18.998 19.000 L 20.998 19.000 L 20.998 21.000 L 2.998 21.000 ZM 16.998 5.000 L 6.998 5.000 L 6.998 19.000 L 16.998 19.000 L 16.998 5.000 ZM 14.998 11.000 L 14.998 13.000 L 12.998 13.000 L 12.998 11.000 L 14.998 11.000 Z"),
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
        return _doorClosedLine!!
    }

private var _doorClosedLine: ImageVector? = null
