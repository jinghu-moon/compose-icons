package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GardenCart: ImageVector
    get() {
        if (_gardenCart != null) return _gardenCart!!
        _gardenCart = tablerFilledIcon(
            name = "GardenCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.324 3.000 C 4.141 3.001 4.876 3.499 5.179 4.258 L 6.276 7.000 L 21.000 7.000 C 21.326 7.000 21.632 7.159 21.819 7.426 C 22.006 7.693 22.051 8.034 21.940 8.341 L 21.894 8.447 L 18.960 14.318 C 20.541 15.044 21.349 16.820 20.857 18.489 C 20.365 20.157 18.722 21.211 17.000 20.963 C 15.279 20.715 14.001 19.240 14.000 17.500 L 14.005 17.308 C 14.036 16.736 14.208 16.180 14.504 15.690 L 12.058 15.432 L 8.612 20.182 C 8.135 20.832 7.316 21.132 6.532 20.944 L 6.378 20.900 C 5.556 20.631 5.000 19.865 5.000 19.000 L 5.000 9.196 L 3.321 5.000 L 2.000 5.000 C 1.493 5.000 1.066 4.620 1.007 4.117 L 1.000 4.000 C 1.000 3.448 1.448 3.000 2.000 3.000 ZM 17.500 16.000 C 16.672 16.000 16.000 16.672 16.000 17.500 C 16.000 18.328 16.672 19.000 17.500 19.000 C 18.328 19.000 19.000 18.328 19.000 17.500 C 19.000 16.672 18.328 16.000 17.500 16.000M 7.000 13.502 L 6.998 19.000 L 9.781 15.167 C 8.779 14.955 7.867 14.440 7.167 13.693 Z"),
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
        return _gardenCart!!
    }

private var _gardenCart: ImageVector? = null
