package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CustomerService2Line: ImageVector
    get() {
        if (_customerService2Line != null) return _customerService2Line!!
        _customerService2Line = remixIcon(
            name = "CustomerService2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.938 8.000 L 21.000 8.000 C 22.105 8.000 23.000 8.895 23.000 10.000 L 23.000 14.000 C 23.000 15.105 22.105 16.000 21.000 16.000 L 19.938 16.000 C 19.446 19.946 16.080 23.000 12.000 23.000 L 12.000 21.000 C 15.314 21.000 18.000 18.314 18.000 15.000 L 18.000 9.000 C 18.000 5.686 15.314 3.000 12.000 3.000 C 8.686 3.000 6.000 5.686 6.000 9.000 L 6.000 16.000 L 3.000 16.000 C 1.895 16.000 1.000 15.105 1.000 14.000 L 1.000 10.000 C 1.000 8.895 1.895 8.000 3.000 8.000 L 4.062 8.000 C 4.554 4.054 7.920 1.000 12.000 1.000 C 16.080 1.000 19.446 4.054 19.938 8.000 ZM 3.000 10.000 L 3.000 14.000 L 4.000 14.000 L 4.000 10.000 L 3.000 10.000 ZM 20.000 10.000 L 20.000 14.000 L 21.000 14.000 L 21.000 10.000 L 20.000 10.000 ZM 7.759 15.785 L 8.820 14.089 C 9.742 14.666 10.832 15.000 12.000 15.000 C 13.168 15.000 14.258 14.666 15.180 14.089 L 16.241 15.785 C 15.011 16.555 13.558 17.000 12.000 17.000 C 10.442 17.000 8.989 16.555 7.759 15.785 Z"),
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
        return _customerService2Line!!
    }

private var _customerService2Line: ImageVector? = null
