package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StackshareFill: ImageVector
    get() {
        if (_stackshareFill != null) return _stackshareFill!!
        _stackshareFill = remixIcon(
            name = "StackshareFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.001 3.000 C 21.553 3.000 22.001 3.448 22.001 4.000 L 22.001 20.000 C 22.001 20.552 21.553 21.000 21.001 21.000 L 3.001 21.000 C 2.449 21.000 2.001 20.552 2.001 20.000 L 2.001 4.000 C 2.001 3.448 2.449 3.000 3.001 3.000 L 21.001 3.000 ZM 16.793 5.621 C 15.782 5.621 14.929 6.297 14.660 7.222 L 12.662 7.222 L 10.202 11.406 L 8.764 11.406 C 8.495 10.481 7.643 9.805 6.631 9.805 C 5.405 9.805 4.410 10.800 4.410 12.027 C 4.410 13.254 5.405 14.248 6.631 14.248 C 7.643 14.248 8.495 13.572 8.764 12.648 L 10.235 12.648 L 12.652 16.781 L 14.670 16.781 C 14.938 17.706 15.791 18.381 16.802 18.381 C 18.029 18.381 19.024 17.387 19.024 16.160 C 19.024 14.933 18.029 13.938 16.802 13.938 C 15.791 13.938 14.938 14.614 14.670 15.539 L 13.353 15.539 L 11.297 12.002 L 13.349 8.464 L 14.660 8.464 C 14.929 9.389 15.782 10.064 16.793 10.064 C 18.020 10.064 19.015 9.070 19.015 7.843 C 19.015 6.616 18.020 5.621 16.793 5.621 ZM 16.804 15.048 C 17.448 15.048 17.972 15.572 17.972 16.216 C 17.972 16.860 17.448 17.383 16.804 17.383 C 16.238 17.383 15.766 16.978 15.660 16.443 C 15.660 16.443 15.629 16.216 15.660 15.989 C 15.766 15.454 16.238 15.048 16.804 15.048 ZM 6.652 10.839 C 7.296 10.839 7.819 11.362 7.819 12.006 C 7.819 12.649 7.296 13.173 6.652 13.173 C 6.008 13.173 5.485 12.649 5.485 12.006 C 5.485 11.362 6.008 10.839 6.652 10.839 ZM 16.802 6.629 C 17.446 6.629 17.970 7.152 17.970 7.796 C 17.970 8.440 17.446 8.964 16.802 8.964 C 16.236 8.964 15.764 8.558 15.658 8.023 C 15.632 7.817 15.658 7.577 15.658 7.577 C 15.764 7.034 16.236 6.629 16.802 6.629 Z"),
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
        return _stackshareFill!!
    }

private var _stackshareFill: ImageVector? = null
