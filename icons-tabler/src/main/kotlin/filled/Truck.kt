package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Truck: ImageVector
    get() {
        if (_truck != null) return _truck!!
        _truck = tablerFilledIcon(
            name = "Truck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 4.000 C 13.552 4.000 14.000 4.448 14.000 5.000 L 18.000 5.000 C 18.305 5.000 18.593 5.139 18.783 5.378 L 18.857 5.486 L 21.857 10.486 L 21.912 10.589 L 21.952 10.696 L 21.981 10.805 L 21.997 10.915 L 22.000 11.000 L 22.000 17.000 C 22.000 17.552 21.552 18.000 21.000 18.000 L 19.829 18.000 C 19.405 19.198 18.271 20.000 17.000 20.000 C 15.729 20.000 14.595 19.198 14.171 18.000 L 9.829 18.000 C 9.405 19.198 8.271 20.000 7.000 20.000 C 5.729 20.000 4.595 19.198 4.171 18.000 L 3.000 18.000 C 2.448 18.000 2.000 17.552 2.000 17.000 L 2.000 6.000 C 2.000 4.895 2.895 4.000 4.000 4.000 ZM 7.000 16.000 C 6.448 16.000 6.000 16.448 6.000 17.000 C 6.000 17.552 6.448 18.000 7.000 18.000 C 7.552 18.000 8.000 17.552 8.000 17.000 C 8.000 16.448 7.552 16.000 7.000 16.000M 17.000 16.000 C 16.448 16.000 16.000 16.448 16.000 17.000 C 16.000 17.552 16.448 18.000 17.000 18.000 C 17.552 18.000 18.000 17.552 18.000 17.000 C 18.000 16.448 17.552 16.000 17.000 16.000M 17.434 7.000 L 14.000 7.000 L 14.000 10.000 L 19.234 10.000 Z"),
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
        return _truck!!
    }

private var _truck: ImageVector? = null
