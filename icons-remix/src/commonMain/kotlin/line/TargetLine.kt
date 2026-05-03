package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TargetLine: ImageVector
    get() {
        if (_targetLine != null) return _targetLine!!
        _targetLine = remixIcon(
            name = "TargetLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 12.552 2.000 13.000 2.448 13.000 3.000 C 13.000 3.552 12.552 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 11.448 20.448 11.000 21.000 11.000 C 21.552 11.000 22.000 11.448 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 6.000 C 12.552 6.000 13.000 6.448 13.000 7.000 C 13.000 7.552 12.552 8.000 12.000 8.000 C 9.791 8.000 8.000 9.791 8.000 12.000 C 8.000 14.209 9.791 16.000 12.000 16.000 C 14.209 16.000 16.000 14.209 16.000 12.000 C 16.000 11.448 16.448 11.000 17.000 11.000 C 17.552 11.000 18.000 11.448 18.000 12.000 C 18.000 15.314 15.314 18.000 12.000 18.000 C 8.686 18.000 6.000 15.314 6.000 12.000 C 6.000 8.686 8.686 6.000 12.000 6.000 ZM 17.656 2.101 C 18.047 1.710 18.681 1.710 19.071 2.101 C 19.461 2.491 19.462 3.124 19.071 3.515 L 18.363 4.221 L 18.364 4.222 C 17.974 4.612 17.974 5.245 18.364 5.636 C 18.755 6.026 19.388 6.026 19.778 5.636 L 20.485 4.929 C 20.876 4.538 21.509 4.538 21.899 4.929 C 22.290 5.319 22.290 5.952 21.899 6.343 L 19.778 8.465 C 19.591 8.652 19.336 8.757 19.071 8.757 L 16.657 8.757 L 12.707 12.707 C 12.316 13.097 11.683 13.097 11.293 12.707 C 10.903 12.316 10.903 11.684 11.293 11.293 L 15.242 7.344 L 15.242 4.929 C 15.242 4.664 15.348 4.409 15.535 4.222 L 17.656 2.101 Z"),
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
        return _targetLine!!
    }

private var _targetLine: ImageVector? = null
