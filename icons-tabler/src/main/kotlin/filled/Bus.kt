package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = tablerFilledIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 4.000 C 20.400 4.000 23.000 7.640 23.000 12.000 L 23.000 17.000 C 23.000 17.552 22.552 18.000 22.000 18.000 L 20.829 18.000 C 20.405 19.198 19.271 20.000 18.000 20.000 C 16.729 20.000 15.595 19.198 15.171 18.000 L 8.829 18.000 C 8.405 19.198 7.271 20.000 6.000 20.000 C 4.729 20.000 3.595 19.198 3.171 18.000 L 2.000 18.000 C 1.448 18.000 1.000 17.552 1.000 17.000 L 1.000 6.000 C 1.000 4.895 1.895 4.000 3.000 4.000 ZM 6.000 16.000 C 5.448 16.000 5.000 16.448 5.000 17.000 C 5.000 17.552 5.448 18.000 6.000 18.000 C 6.552 18.000 7.000 17.552 7.000 17.000 C 7.000 16.448 6.552 16.000 6.000 16.000M 18.000 16.000 C 17.448 16.000 17.000 16.448 17.000 17.000 C 17.000 17.552 17.448 18.000 18.000 18.000 C 18.552 18.000 19.000 17.552 19.000 17.000 C 19.000 16.448 18.552 16.000 18.000 16.000M 17.240 6.011 L 18.308 11.000 L 20.944 11.000 C 20.631 8.244 19.049 6.180 17.240 6.011M 6.000 6.000 L 3.000 6.000 L 3.000 9.000 L 6.000 9.000 ZM 11.000 6.000 L 8.000 6.000 L 8.000 9.000 L 11.000 9.000 ZM 15.191 6.000 L 13.000 6.000 L 13.000 9.000 L 15.834 9.000 Z"),
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
        return _bus!!
    }

private var _bus: ImageVector? = null
