package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SignLeft: ImageVector
    get() {
        if (_signLeft != null) return _signLeft!!
        _signLeft = tablerFilledIcon(
            name = "SignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 2.000 C 14.507 2.000 14.934 2.380 14.993 2.883 L 15.000 3.000 L 15.000 5.000 L 18.000 5.000 C 18.507 5.000 18.934 5.380 18.993 5.883 L 19.000 6.000 L 19.000 11.000 C 19.000 11.507 18.620 11.934 18.117 11.993 L 18.000 12.000 L 15.000 12.000 L 15.000 20.000 L 16.000 20.000 C 16.529 20.001 16.966 20.413 16.997 20.941 C 17.028 21.470 16.642 21.931 16.117 21.993 L 16.000 22.000 L 12.000 22.000 C 11.471 21.999 11.034 21.587 11.003 21.059 C 10.972 20.530 11.358 20.069 11.883 20.007 L 12.000 20.000 L 13.000 20.000 L 13.000 12.000 L 8.000 12.000 C 7.741 12.000 7.492 11.900 7.306 11.720 L 7.219 11.625 L 5.219 9.125 C 4.956 8.796 4.927 8.337 5.147 7.978 L 5.219 7.875 L 7.219 5.375 C 7.381 5.173 7.614 5.041 7.871 5.008 L 8.000 5.000 L 13.000 5.000 L 13.000 3.000 C 13.000 2.448 13.448 2.000 14.000 2.000 Z"),
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
        return _signLeft!!
    }

private var _signLeft: ImageVector? = null
