package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EditCircleLine: ImageVector
    get() {
        if (_editCircleLine != null) return _editCircleLine!!
        _editCircleLine = remixIcon(
            name = "EditCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.684 4.025 C 12.459 4.006 12.231 3.997 12.000 3.997 C 7.582 3.997 4.000 7.578 4.000 11.997 C 4.000 16.415 7.582 19.997 12.000 19.997 C 16.418 19.997 20.000 16.415 20.000 11.997 C 20.000 11.766 19.990 11.538 19.971 11.312 C 19.900 10.465 19.695 9.644 19.368 8.873 L 20.868 7.371 C 21.203 8.012 21.471 8.693 21.661 9.406 C 21.821 10.006 21.926 10.622 21.972 11.248 C 21.991 11.495 22.000 11.745 22.000 11.997 C 22.000 17.520 17.523 21.997 12.000 21.997 C 6.477 21.997 2.000 17.520 2.000 11.997 C 2.000 6.474 6.477 1.997 12.000 1.997 C 12.252 1.997 12.502 2.006 12.749 2.024 C 13.375 2.071 13.990 2.175 14.590 2.336 C 15.303 2.526 15.985 2.794 16.626 3.128 L 15.125 4.629 C 14.352 4.301 13.532 4.097 12.684 4.025 ZM 20.485 2.097 L 21.899 3.511 L 12.707 12.704 L 11.295 12.706 L 11.293 11.290 L 20.485 2.097 Z"),
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
        return _editCircleLine!!
    }

private var _editCircleLine: ImageVector? = null
