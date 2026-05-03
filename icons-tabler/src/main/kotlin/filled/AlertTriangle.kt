package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertTriangle: ImageVector
    get() {
        if (_alertTriangle != null) return _alertTriangle!!
        _alertTriangle = tablerFilledIcon(
            name = "AlertTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 1.670 C 12.955 1.670 13.845 2.137 14.390 2.917 L 14.495 3.077 L 22.609 16.625 C 23.110 17.493 23.130 18.558 22.661 19.444 C 22.193 20.330 21.302 20.913 20.302 20.988 L 20.107 20.996 L 3.882 20.996 C 2.881 20.985 1.956 20.461 1.432 19.608 C 0.908 18.756 0.858 17.694 1.300 16.796 L 1.399 16.611 L 9.509 3.073 C 10.037 2.202 10.982 1.670 12.000 1.670 ZM 12.010 15.000 L 11.883 15.007 C 11.380 15.067 11.001 15.493 11.001 16.000 C 11.001 16.507 11.380 16.933 11.883 16.993 L 12.000 17.000 L 12.127 16.993 C 12.630 16.933 13.009 16.507 13.009 16.000 C 13.009 15.493 12.630 15.067 12.127 15.007 L 12.010 15.000 ZM 12.000 8.000 C 11.493 8.000 11.066 8.380 11.007 8.883 L 11.000 9.000 L 11.000 13.000 L 11.007 13.117 C 11.067 13.620 11.493 13.999 12.000 13.999 C 12.507 13.999 12.933 13.620 12.993 13.117 L 13.000 13.000 L 13.000 9.000 L 12.993 8.883 C 12.934 8.380 12.507 8.000 12.000 8.000 Z"),
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
        return _alertTriangle!!
    }

private var _alertTriangle: ImageVector? = null
