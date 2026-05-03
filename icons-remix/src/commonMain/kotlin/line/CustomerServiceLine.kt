package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CustomerServiceLine: ImageVector
    get() {
        if (_customerServiceLine != null) return _customerServiceLine!!
        _customerServiceLine = remixIcon(
            name = "CustomerServiceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 17.002 C 21.999 19.873 19.982 22.273 17.287 22.862 L 16.649 20.948 C 17.853 20.751 18.876 20.017 19.465 19.000 L 17.000 19.000 C 15.895 19.000 15.000 18.105 15.000 17.000 L 15.000 13.000 C 15.000 11.895 15.895 11.000 17.000 11.000 L 19.938 11.000 C 19.446 7.054 16.080 4.000 12.000 4.000 C 7.920 4.000 4.554 7.054 4.062 11.000 L 7.000 11.000 C 8.105 11.000 9.000 11.895 9.000 13.000 L 9.000 17.000 C 9.000 18.105 8.105 19.000 7.000 19.000 L 4.000 19.000 C 2.895 19.000 2.000 18.105 2.000 17.000 L 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 L 22.000 12.999 L 22.000 13.000 L 22.000 17.000 L 22.000 17.001 L 22.000 17.002 ZM 20.000 17.000 L 20.000 13.000 L 17.000 13.000 L 17.000 17.000 L 20.000 17.000 ZM 4.000 13.000 L 4.000 17.000 L 7.000 17.000 L 7.000 13.000 L 4.000 13.000 Z"),
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
        return _customerServiceLine!!
    }

private var _customerServiceLine: ImageVector? = null
