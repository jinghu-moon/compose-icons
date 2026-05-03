package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PenNibLine: ImageVector
    get() {
        if (_penNibLine != null) return _penNibLine!!
        _penNibLine = remixIcon(
            name = "PenNibLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.596 1.037 L 22.943 7.383 C 23.138 7.578 23.138 7.895 22.943 8.090 C 22.868 8.165 22.771 8.214 22.667 8.231 L 21.192 8.461 L 15.536 2.804 L 15.748 1.319 C 15.787 1.046 16.040 0.856 16.313 0.895 C 16.420 0.910 16.520 0.960 16.596 1.037 ZM 4.595 20.148 C 8.317 16.816 12.590 15.820 17.238 14.627 L 17.684 10.610 L 13.387 6.312 L 9.369 6.759 C 8.177 11.407 7.180 15.679 3.849 19.402 L 2.454 18.007 C 5.283 14.707 6.343 11.054 7.757 4.926 L 14.121 4.218 L 19.778 9.875 L 19.071 16.239 C 12.943 17.653 9.289 18.714 5.990 21.543 L 4.595 20.148 ZM 9.879 14.118 C 9.098 13.337 9.098 12.071 9.879 11.290 C 10.660 10.509 11.926 10.509 12.707 11.290 C 13.488 12.071 13.488 13.337 12.707 14.118 C 11.926 14.899 10.660 14.899 9.879 14.118 Z"),
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
        return _penNibLine!!
    }

private var _penNibLine: ImageVector? = null
