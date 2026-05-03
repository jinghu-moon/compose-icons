package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DoorOpenLine: ImageVector
    get() {
        if (_doorOpenLine != null) return _doorOpenLine!!
        _doorOpenLine = remixIcon(
            name = "DoorOpenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 1.998 21.000 L 1.998 19.000 L 3.998 19.000 L 3.998 4.835 C 3.998 4.351 4.344 3.937 4.819 3.851 L 14.291 2.129 C 14.617 2.069 14.929 2.286 14.988 2.612 C 14.995 2.647 14.998 2.683 14.998 2.719 L 14.998 4.000 L 18.998 4.000 C 19.550 4.000 19.998 4.448 19.998 5.000 L 19.998 19.000 L 21.998 19.000 L 21.998 21.000 L 17.998 21.000 L 17.998 6.000 L 14.998 6.000 L 14.998 21.000 L 1.998 21.000 ZM 12.998 4.397 L 5.998 5.669 L 5.998 19.000 L 12.998 19.000 L 12.998 4.397 ZM 11.998 11.000 L 11.998 13.000 L 9.998 13.000 L 9.998 11.000 L 11.998 11.000 Z"),
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
        return _doorOpenLine!!
    }

private var _doorOpenLine: ImageVector? = null
