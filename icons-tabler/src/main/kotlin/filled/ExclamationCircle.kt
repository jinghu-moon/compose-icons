package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ExclamationCircle: ImageVector
    get() {
        if (_exclamationCircle != null) return _exclamationCircle!!
        _exclamationCircle = tablerFilledIcon(
            name = "ExclamationCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 12.000 15.000 C 11.448 15.000 11.000 15.448 11.000 16.000 L 11.000 16.010 C 11.000 16.562 11.448 17.010 12.000 17.010 C 12.552 17.010 13.000 16.562 13.000 16.010 L 13.000 16.000 C 13.000 15.448 12.552 15.000 12.000 15.000M 12.000 8.000 C 11.448 8.000 11.000 8.448 11.000 9.000 L 11.000 13.000 C 11.000 13.552 11.448 14.000 12.000 14.000 C 12.552 14.000 13.000 13.552 13.000 13.000 L 13.000 9.000 C 13.000 8.448 12.552 8.000 12.000 8.000"),
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
        return _exclamationCircle!!
    }

private var _exclamationCircle: ImageVector? = null
