package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BardLine: ImageVector
    get() {
        if (_bardLine != null) return _bardLine!!
        _bardLine = remixIcon(
            name = "BardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.614 17.796 C 10.277 18.568 9.208 18.568 8.870 17.796 L 7.993 15.785 C 7.212 13.997 5.806 12.573 4.052 11.794 L 1.637 10.722 C 0.869 10.381 0.869 9.264 1.637 8.923 L 3.977 7.884 C 5.776 7.086 7.207 5.609 7.974 3.759 L 8.863 1.617 C 9.193 0.822 10.292 0.822 10.622 1.617 L 11.510 3.759 C 12.278 5.609 13.709 7.086 15.508 7.884 L 17.848 8.923 C 18.616 9.264 18.616 10.381 17.848 10.722 L 15.432 11.794 C 13.679 12.573 12.273 13.997 11.492 15.785 L 10.614 17.796 ZM 4.540 9.822 C 6.825 10.837 8.684 12.505 9.742 14.800 C 10.801 12.505 12.659 10.837 14.945 9.822 C 12.632 8.796 10.768 7.046 9.742 4.711 C 8.717 7.046 6.853 8.796 4.540 9.822 ZM 19.401 22.690 L 19.648 22.124 C 20.088 21.116 20.881 20.312 21.869 19.873 L 22.630 19.535 C 23.041 19.353 23.041 18.755 22.630 18.572 L 21.912 18.253 C 20.898 17.803 20.091 16.970 19.659 15.927 L 19.405 15.316 C 19.229 14.890 18.639 14.890 18.463 15.316 L 18.209 15.927 C 17.777 16.970 16.970 17.803 15.956 18.253 L 15.238 18.572 C 14.827 18.755 14.827 19.353 15.238 19.535 L 15.998 19.873 C 16.987 20.312 17.780 21.116 18.220 22.124 L 18.467 22.690 C 18.647 23.104 19.221 23.104 19.401 22.690 ZM 18.375 19.047 L 18.937 18.488 L 19.488 19.047 L 18.937 19.590 L 18.375 19.047 Z"),
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
        return _bardLine!!
    }

private var _bardLine: ImageVector? = null
