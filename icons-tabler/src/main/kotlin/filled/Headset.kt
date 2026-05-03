package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = tablerFilledIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 16.971 2.000 21.000 6.029 21.000 11.000 L 21.000 17.000 C 21.001 18.331 20.124 19.503 18.848 19.879 C 18.170 21.780 15.310 23.000 12.000 23.000 C 11.448 23.000 11.000 22.552 11.000 22.000 C 11.000 21.448 11.448 21.000 12.000 21.000 C 13.889 21.000 15.482 20.518 16.334 19.925 C 14.969 19.614 14.000 18.400 14.000 17.000 L 14.001 13.949 L 14.005 13.898 C 14.057 12.282 15.383 10.999 17.000 11.000 L 18.000 11.000 C 18.351 11.000 18.688 11.060 19.000 11.171 L 19.000 11.000 C 19.002 7.179 15.940 4.063 12.120 3.998 C 8.300 3.932 5.133 6.942 5.004 10.760 L 5.000 11.170 C 5.313 11.060 5.650 11.000 6.000 11.000 L 7.000 11.000 C 8.657 11.000 10.000 12.343 10.000 14.000 L 10.000 17.000 C 10.000 18.657 8.657 20.000 7.000 20.000 L 6.000 20.000 C 4.343 20.000 3.000 18.657 3.000 17.000 L 3.000 11.000 C 3.000 6.029 7.029 2.000 12.000 2.000"),
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
        return _headset!!
    }

private var _headset: ImageVector? = null
