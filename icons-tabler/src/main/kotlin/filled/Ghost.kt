package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = tablerFilledIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 16.321 3.000 19.861 6.431 19.996 10.750 L 20.000 11.000 L 19.999 17.954 L 20.009 18.057 C 20.073 19.142 19.500 20.164 18.541 20.675 L 18.378 20.755 C 17.325 21.230 16.095 21.003 15.249 20.162 L 15.112 20.016 C 14.989 19.858 14.800 19.766 14.600 19.766 C 14.400 19.766 14.211 19.858 14.088 20.016 C 13.586 20.659 12.816 21.034 12.000 21.034 C 11.184 21.034 10.414 20.659 9.912 20.016 C 9.789 19.858 9.600 19.766 9.400 19.766 C 9.200 19.766 9.011 19.858 8.850 20.062 C 8.065 20.951 6.802 21.244 5.706 20.792 C 4.609 20.339 3.921 19.241 3.991 18.057 L 3.999 17.966 L 4.000 11.000 L 4.004 10.750 C 4.139 6.431 7.679 3.000 12.000 3.000 ZM 14.820 13.429 C 14.505 12.976 13.882 12.864 13.429 13.179 C 12.570 13.777 11.430 13.777 10.571 13.179 C 10.118 12.864 9.494 12.976 9.179 13.429 C 8.864 13.882 8.976 14.506 9.429 14.821 C 10.974 15.897 13.026 15.897 14.571 14.821 C 14.789 14.670 14.937 14.438 14.984 14.177 C 15.031 13.916 14.972 13.647 14.821 13.429 ZM 10.010 9.000 L 9.883 9.007 C 9.358 9.069 8.972 9.530 9.003 10.059 C 9.034 10.587 9.471 10.999 10.000 11.000 L 10.127 10.993 C 10.652 10.931 11.038 10.470 11.007 9.941 C 10.976 9.413 10.539 9.001 10.010 9.000 ZM 14.010 9.000 L 13.883 9.007 C 13.358 9.069 12.972 9.530 13.003 10.059 C 13.034 10.587 13.471 10.999 14.000 11.000 L 14.127 10.993 C 14.652 10.931 15.038 10.470 15.007 9.941 C 14.976 9.413 14.539 9.001 14.010 9.000 Z"),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
