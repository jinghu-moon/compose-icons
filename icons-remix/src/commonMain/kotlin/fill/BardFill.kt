package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BardFill: ImageVector
    get() {
        if (_bardFill != null) return _bardFill!!
        _bardFill = remixIcon(
            name = "BardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.614 17.796 L 11.492 15.785 C 12.273 13.997 13.679 12.573 15.432 11.794 L 17.848 10.722 C 18.616 10.381 18.616 9.264 17.848 8.923 L 15.508 7.884 C 13.709 7.086 12.278 5.609 11.510 3.759 L 10.622 1.617 C 10.292 0.822 9.193 0.822 8.863 1.617 L 7.974 3.759 C 7.207 5.609 5.776 7.086 3.977 7.884 L 1.637 8.923 C 0.869 9.264 0.869 10.381 1.637 10.722 L 4.052 11.794 C 5.806 12.573 7.212 13.997 7.993 15.785 L 8.870 17.796 C 9.208 18.568 10.277 18.568 10.614 17.796 ZM 19.401 22.690 L 19.648 22.124 C 20.088 21.116 20.881 20.312 21.869 19.873 L 22.630 19.535 C 23.041 19.353 23.041 18.755 22.630 18.572 L 21.912 18.253 C 20.898 17.803 20.091 16.970 19.659 15.927 L 19.405 15.316 C 19.229 14.890 18.639 14.890 18.463 15.316 L 18.209 15.927 C 17.777 16.970 16.970 17.803 15.956 18.253 L 15.238 18.572 C 14.827 18.755 14.827 19.353 15.238 19.535 L 15.998 19.873 C 16.987 20.312 17.780 21.116 18.220 22.124 L 18.467 22.690 C 18.647 23.104 19.221 23.104 19.401 22.690 Z"),
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
        return _bardFill!!
    }

private var _bardFill: ImageVector? = null
