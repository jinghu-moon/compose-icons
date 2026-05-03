package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Settings5Fill: ImageVector
    get() {
        if (_settings5Fill != null) return _settings5Fill!!
        _settings5Fill = remixIcon(
            name = "Settings5Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.131 13.631 C 1.949 12.535 1.955 11.434 2.132 10.370 C 3.233 10.396 4.224 9.868 4.609 8.939 C 4.994 8.009 4.667 6.936 3.869 6.176 C 4.497 5.298 5.271 4.515 6.175 3.869 C 6.935 4.667 8.009 4.994 8.938 4.609 C 9.868 4.224 10.396 3.233 10.369 2.132 C 11.465 1.950 12.566 1.956 13.630 2.133 C 13.604 3.234 14.132 4.224 15.061 4.609 C 15.990 4.994 17.064 4.667 17.824 3.870 C 18.702 4.497 19.485 5.272 20.131 6.175 C 19.333 6.935 19.006 8.009 19.391 8.939 C 19.776 9.868 20.767 10.397 21.868 10.370 C 22.050 11.465 22.044 12.566 21.867 13.631 C 20.766 13.604 19.776 14.132 19.391 15.062 C 19.006 15.991 19.333 17.065 20.130 17.824 C 19.503 18.702 18.728 19.485 17.825 20.131 C 17.065 19.333 15.991 19.006 15.061 19.391 C 14.132 19.776 13.603 20.767 13.630 21.869 C 12.534 22.051 11.434 22.045 10.369 21.868 C 10.396 20.767 9.867 19.776 8.938 19.391 C 8.009 19.006 6.935 19.333 6.175 20.131 C 5.297 19.503 4.515 18.729 3.869 17.825 C 4.667 17.065 4.994 15.991 4.609 15.062 C 4.224 14.132 3.233 13.604 2.131 13.631 ZM 12.000 15.000 C 13.656 15.000 15.000 13.657 15.000 12.000 C 15.000 10.343 13.656 9.000 12.000 9.000 C 10.343 9.000 9.000 10.343 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 Z"),
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
        return _settings5Fill!!
    }

private var _settings5Fill: ImageVector? = null
