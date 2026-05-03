package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterB: ImageVector
    get() {
        if (_circleLetterB != null) return _circleLetterB!!
        _circleLetterB = tablerFilledIcon(
            name = "CircleLetterB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 12.000 7.000 L 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 L 9.000 16.000 C 9.000 16.552 9.448 17.000 10.000 17.000 L 12.000 17.000 C 13.657 17.000 15.000 15.657 15.000 14.000 L 14.995 13.824 C 14.958 13.203 14.730 12.609 14.341 12.124 L 14.235 12.000 L 14.341 11.876 C 15.062 10.976 15.204 9.742 14.704 8.702 C 14.205 7.662 13.154 7.000 12.000 7.000M 12.000 13.000 C 12.552 13.000 13.000 13.448 13.000 14.000 C 13.000 14.552 12.552 15.000 12.000 15.000 L 11.000 15.000 L 11.000 13.000 ZM 12.000 9.000 C 12.552 9.000 13.000 9.448 13.000 10.000 C 13.000 10.552 12.552 11.000 12.000 11.000 L 11.000 11.000 L 11.000 9.000 Z"),
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
        return _circleLetterB!!
    }

private var _circleLetterB: ImageVector? = null
