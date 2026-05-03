package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SunLow: ImageVector
    get() {
        if (_sunLow != null) return _sunLow!!
        _sunLow = tablerFilledIcon(
            name = "SunLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.407 16.993 L 18.417 17.003 C 18.789 17.376 18.807 17.975 18.459 18.370 C 18.110 18.766 17.514 18.823 17.097 18.500 L 16.993 18.407 C 16.614 18.015 16.619 17.391 17.005 17.005 C 17.391 16.619 18.015 16.614 18.407 16.993M 7.007 16.993 L 7.017 17.003 C 7.389 17.376 7.407 17.975 7.059 18.370 C 6.710 18.766 6.114 18.823 5.697 18.500 L 5.593 18.407 C 5.214 18.015 5.219 17.391 5.605 17.005 C 5.991 16.619 6.615 16.614 7.007 16.993M 12.000 7.000 C 14.761 7.000 17.000 9.239 17.000 12.000 C 17.000 14.761 14.761 17.000 12.000 17.000 C 9.239 17.000 7.000 14.761 7.000 12.000 L 7.005 11.783 C 7.121 9.109 9.323 7.000 12.000 7.000M 7.007 5.593 L 7.017 5.603 C 7.389 5.976 7.407 6.575 7.059 6.970 C 6.710 7.366 6.114 7.423 5.697 7.100 L 5.593 7.007 C 5.214 6.615 5.219 5.991 5.605 5.605 C 5.991 5.219 6.615 5.214 7.007 5.593M 18.407 5.593 L 18.417 5.603 C 18.789 5.976 18.807 6.575 18.459 6.970 C 18.110 7.366 17.514 7.423 17.097 7.100 L 16.993 7.007 C 16.733 6.756 16.629 6.384 16.720 6.034 C 16.812 5.685 17.085 5.412 17.434 5.320 C 17.784 5.229 18.156 5.333 18.407 5.593M 4.010 11.000 C 4.539 11.001 4.976 11.413 5.007 11.941 C 5.038 12.470 4.652 12.931 4.127 12.993 L 4.000 13.000 C 3.471 12.999 3.034 12.587 3.003 12.059 C 2.972 11.530 3.358 11.069 3.883 11.007 ZM 12.000 3.000 C 12.507 3.000 12.934 3.380 12.993 3.883 L 13.000 4.010 C 12.999 4.539 12.587 4.976 12.059 5.007 C 11.530 5.038 11.069 4.652 11.007 4.127 L 11.000 4.000 C 11.000 3.448 11.448 3.000 12.000 3.000M 20.010 11.000 C 20.539 11.001 20.976 11.413 21.007 11.941 C 21.038 12.470 20.652 12.931 20.127 12.993 L 20.000 13.000 C 19.471 12.999 19.034 12.587 19.003 12.059 C 18.972 11.530 19.358 11.069 19.883 11.007 ZM 12.000 19.000 C 12.507 19.000 12.934 19.380 12.993 19.883 L 13.000 20.010 C 12.999 20.539 12.587 20.976 12.059 21.007 C 11.530 21.038 11.069 20.652 11.007 20.127 L 11.000 20.000 C 11.000 19.448 11.448 19.000 12.000 19.000"),
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
        return _sunLow!!
    }

private var _sunLow: ImageVector? = null
