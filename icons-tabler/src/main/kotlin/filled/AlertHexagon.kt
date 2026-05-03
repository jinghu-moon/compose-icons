package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertHexagon: ImageVector
    get() {
        if (_alertHexagon != null) return _alertHexagon!!
        _alertHexagon = tablerFilledIcon(
            name = "AlertHexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.425 1.414 C 11.360 0.899 12.485 0.862 13.451 1.317 L 13.641 1.414 L 20.416 5.409 L 20.512 5.472 L 20.604 5.549 L 20.711 5.624 C 21.413 6.151 21.870 6.941 21.977 7.812 L 21.995 8.014 L 22.000 8.218 L 22.000 15.502 C 22.000 16.608 21.430 17.631 20.546 18.195 L 20.376 18.295 L 13.573 22.597 C 12.655 23.101 11.554 23.132 10.569 22.665 L 10.373 22.565 L 3.678 18.328 C 2.710 17.798 2.079 16.810 2.007 15.709 L 2.000 15.502 L 2.000 8.217 C 2.000 7.111 2.570 6.089 3.476 5.512 L 10.426 1.414 ZM 12.010 15.000 L 11.883 15.007 C 11.380 15.067 11.001 15.493 11.001 16.000 C 11.001 16.507 11.380 16.933 11.883 16.993 L 12.000 17.000 L 12.127 16.993 C 12.630 16.933 13.009 16.507 13.009 16.000 C 13.009 15.493 12.630 15.067 12.127 15.007 L 12.010 15.000 ZM 12.000 7.000 C 11.493 7.000 11.066 7.380 11.007 7.883 L 11.000 8.000 L 11.000 12.000 L 11.007 12.117 C 11.067 12.620 11.493 12.999 12.000 12.999 C 12.507 12.999 12.933 12.620 12.993 12.117 L 13.000 12.000 L 13.000 8.000 L 12.993 7.883 C 12.934 7.380 12.507 7.000 12.000 7.000 Z"),
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
        return _alertHexagon!!
    }

private var _alertHexagon: ImageVector? = null
