package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Paint: ImageVector
    get() {
        if (_paint != null) return _paint!!
        _paint = tablerFilledIcon(
            name = "Paint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 18.589 2.000 19.902 3.238 19.995 4.824 L 20.000 5.000 C 21.657 5.000 23.000 6.343 23.000 8.000 C 23.000 11.226 20.449 13.875 17.225 13.996 L 17.000 14.000 L 13.000 14.000 L 13.150 14.005 C 14.134 14.079 14.917 14.859 14.994 15.843 L 15.000 16.000 L 15.000 20.000 C 15.000 21.047 14.194 21.917 13.150 21.995 L 13.000 22.000 L 11.000 22.000 C 9.953 22.000 9.083 21.194 9.005 20.150 L 9.000 20.000 L 9.000 16.000 C 9.000 14.953 9.806 14.083 10.850 14.005 L 11.000 14.000 L 11.000 13.000 C 11.000 12.493 11.380 12.066 11.883 12.007 L 12.000 12.000 L 17.000 12.000 C 19.209 12.000 21.000 10.209 21.000 8.000 C 21.000 7.493 20.620 7.066 20.117 7.007 L 20.000 7.000 L 19.995 7.176 C 19.906 8.694 18.694 9.906 17.176 9.995 L 17.000 10.000 L 7.000 10.000 C 5.411 10.000 4.098 8.762 4.005 7.176 L 4.000 7.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 L 17.000 2.000 Z"),
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
        return _paint!!
    }

private var _paint: ImageVector? = null
