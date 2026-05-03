package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Helicopter: ImageVector
    get() {
        if (_helicopter != null) return _helicopter!!
        _helicopter = tablerFilledIcon(
            name = "Helicopter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 5.000 C 20.552 5.000 21.000 5.448 21.000 6.000 C 21.000 6.552 20.552 7.000 20.000 7.000 L 14.000 7.000 L 14.000 8.000 C 18.642 8.000 22.000 10.218 22.000 14.000 C 22.000 15.657 20.657 17.000 19.000 17.000 L 16.000 17.000 L 16.000 18.000 L 19.000 18.000 C 19.552 18.000 20.000 18.448 20.000 19.000 C 20.000 19.552 19.552 20.000 19.000 20.000 L 11.000 20.000 C 10.448 20.000 10.000 19.552 10.000 19.000 C 10.000 18.448 10.448 18.000 11.000 18.000 L 14.000 18.000 L 14.000 17.000 L 12.000 17.000 C 10.348 17.000 9.000 15.652 9.000 14.000 L 9.000 12.999 L 3.000 13.000 C 2.621 13.000 2.275 12.786 2.106 12.447 L 1.106 10.447 C 0.879 9.957 1.083 9.375 1.567 9.133 C 2.050 8.892 2.638 9.077 2.894 9.553 L 3.618 11.000 L 9.000 10.999 L 9.005 10.824 C 9.098 9.238 10.411 8.000 12.000 8.000 L 12.000 7.000 L 5.000 7.000 C 4.448 7.000 4.000 6.552 4.000 6.000 C 4.000 5.448 4.448 5.000 5.000 5.000 ZM 16.001 10.174 L 16.000 12.000 L 19.360 12.000 C 18.695 11.094 17.535 10.461 16.001 10.174"),
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
        return _helicopter!!
    }

private var _helicopter: ImageVector? = null
