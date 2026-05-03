package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DoorClosedFill: ImageVector
    get() {
        if (_doorClosedFill != null) return _doorClosedFill!!
        _doorClosedFill = remixIcon(
            name = "DoorClosedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.998 21.000 L 2.998 19.000 L 4.998 19.000 L 4.998 4.000 C 4.998 3.448 5.446 3.000 5.998 3.000 L 17.998 3.000 C 18.550 3.000 18.998 3.448 18.998 4.000 L 18.998 19.000 L 20.998 19.000 L 20.998 21.000 L 2.998 21.000 ZM 14.998 11.000 L 12.998 11.000 L 12.998 13.000 L 14.998 13.000 L 14.998 11.000 Z"),
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
        return _doorClosedFill!!
    }

private var _doorClosedFill: ImageVector? = null
