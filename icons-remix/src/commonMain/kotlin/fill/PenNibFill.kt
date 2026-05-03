package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PenNibFill: ImageVector
    get() {
        if (_penNibFill != null) return _penNibFill!!
        _penNibFill = remixIcon(
            name = "PenNibFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.929 21.482 L 10.775 15.636 C 11.442 15.814 12.184 15.641 12.707 15.118 C 13.488 14.337 13.488 13.071 12.707 12.290 C 11.926 11.509 10.660 11.509 9.879 12.290 C 9.355 12.813 9.183 13.554 9.361 14.222 L 3.515 20.068 L 2.454 19.007 C 5.283 15.707 6.343 12.054 7.757 5.926 L 14.121 5.218 L 19.778 10.875 L 19.071 17.239 C 12.943 18.653 9.289 19.714 5.990 22.543 L 4.929 21.482 ZM 16.596 2.037 L 22.943 8.383 C 23.138 8.578 23.138 8.895 22.943 9.090 C 22.868 9.165 22.771 9.214 22.667 9.231 L 21.192 9.461 L 15.536 3.804 L 15.748 2.319 C 15.787 2.046 16.040 1.856 16.313 1.895 C 16.420 1.910 16.520 1.960 16.596 2.037 Z"),
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
        return _penNibFill!!
    }

private var _penNibFill: ImageVector? = null
