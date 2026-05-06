package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RainyFill: ImageVector
    get() {
        if (_rainyFill != null) return _rainyFill!!
        _rainyFill = remixIcon(
            name = "RainyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.86 18 12.707 14.847c-.391-.391-1.024-.391-1.414 0L8.181 17.959C4.148 17.549 1 14.142 1 10 1 5.582 4.582 2 9 2c2.997 0 5.609 1.648 6.979 4.087C16.311 6.03 16.652 6 17 6c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-1.14ZM10.232 18.732 12 16.965l1.768 1.768c.976 .976 .976 2.559 0 3.536-.976 .976-2.559 .976-3.536 0-.976-.976-.976-2.559 0-3.536Z"),
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
        return _rainyFill!!
    }

private var _rainyFill: ImageVector? = null
