package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Battery4: ImageVector
    get() {
        if (_battery4 != null) return _battery4!!
        _battery4 = tablerFilledIcon(
            name = "Battery4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 6.000 C 18.589 6.000 19.902 7.238 19.995 8.824 L 20.000 9.000 L 20.000 9.086 L 20.052 9.105 C 20.575 9.312 20.939 9.795 20.993 10.355 L 21.000 10.500 L 21.000 13.500 C 21.000 14.115 20.624 14.669 20.052 14.895 L 20.000 14.913 L 20.000 15.000 C 20.000 16.589 18.762 17.902 17.176 17.995 L 17.000 18.000 L 6.000 18.000 C 4.411 18.000 3.098 16.762 3.005 15.176 L 3.000 15.000 L 3.000 9.000 C 3.000 7.411 4.238 6.098 5.824 6.005 L 6.000 6.000 L 17.000 6.000 ZM 7.000 9.000 C 6.448 9.000 6.000 9.448 6.000 10.000 L 6.000 14.000 L 6.007 14.117 C 6.069 14.642 6.530 15.028 7.059 14.997 C 7.587 14.966 7.999 14.529 8.000 14.000 L 8.000 10.000 L 7.993 9.883 C 7.934 9.380 7.507 9.000 7.000 9.000 ZM 10.000 9.000 C 9.448 9.000 9.000 9.448 9.000 10.000 L 9.000 14.000 L 9.007 14.117 C 9.069 14.642 9.530 15.028 10.059 14.997 C 10.587 14.966 10.999 14.529 11.000 14.000 L 11.000 10.000 L 10.993 9.883 C 10.934 9.380 10.507 9.000 10.000 9.000 ZM 13.000 9.000 C 12.448 9.000 12.000 9.448 12.000 10.000 L 12.000 14.000 L 12.007 14.117 C 12.069 14.642 12.530 15.028 13.059 14.997 C 13.587 14.966 13.999 14.529 14.000 14.000 L 14.000 10.000 L 13.993 9.883 C 13.934 9.380 13.507 9.000 13.000 9.000 ZM 16.000 9.000 C 15.448 9.000 15.000 9.448 15.000 10.000 L 15.000 14.000 L 15.007 14.117 C 15.069 14.642 15.530 15.028 16.059 14.997 C 16.587 14.966 16.999 14.529 17.000 14.000 L 17.000 10.000 L 16.993 9.883 C 16.934 9.380 16.507 9.000 16.000 9.000 Z"),
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
        return _battery4!!
    }

private var _battery4: ImageVector? = null
