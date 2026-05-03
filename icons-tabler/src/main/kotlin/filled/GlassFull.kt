package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GlassFull: ImageVector
    get() {
        if (_glassFull != null) return _glassFull!!
        _glassFull = tablerFilledIcon(
            name = "GlassFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.004 10.229 L 5.001 10.043 L 5.002 9.930 L 5.010 9.859 L 6.010 2.859 C 6.074 2.408 6.435 2.057 6.887 2.006 L 7.000 2.000 L 17.000 2.000 C 17.455 2.000 17.853 2.307 17.968 2.747 L 17.990 2.859 L 18.996 9.909 L 19.000 10.000 C 19.000 13.226 16.440 15.564 13.000 15.945 L 13.000 20.000 L 16.000 20.000 C 16.529 20.001 16.966 20.413 16.997 20.941 C 17.028 21.470 16.642 21.931 16.117 21.993 L 16.000 22.000 L 8.000 22.000 C 7.471 21.999 7.034 21.587 7.003 21.059 C 6.972 20.530 7.358 20.069 7.883 20.007 L 8.000 20.000 L 11.000 20.000 L 11.000 15.945 C 7.642 15.574 5.122 13.336 5.004 10.229 ZM 16.133 4.000 L 7.866 4.000 L 7.259 8.258 C 8.998 7.731 10.883 8.020 12.384 9.045 L 12.600 9.200 C 13.855 10.141 15.544 10.263 16.920 9.510 L 16.133 4.000 Z"),
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
        return _glassFull!!
    }

private var _glassFull: ImageVector? = null
