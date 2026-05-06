package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorThinIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226 171.47c-.607 .353-1.298 .536-2 .53-1.431 .002-2.754-.761-3.47-2L199.38 133c-12.572 9.165-26.806 15.798-41.91 19.53L164 191.34c.361 2.179-1.112 4.238-3.29 4.6-.221 .04-.445 .06-.67 .06-1.952-.003-3.618-1.414-3.94-3.34l-6.41-38.5c-14.322 2.453-28.958 2.453-43.28 0L100 192.66c-.326 1.948-2.025 3.367-4 3.34-.225-.001-.449-.021-.67-.06-2.178-.362-3.651-2.421-3.29-4.6l6.48-38.83C83.421 148.783 69.19 142.157 56.62 133L35.47 170c-.716 1.239-2.039 2.002-3.47 2-.702 .006-1.393-.177-2-.53-.921-.529-1.594-1.404-1.87-2.43-.276-1.026-.132-2.12 .4-3.04L50.21 128.06C42.385 121.621 35.241 114.396 28.89 106.5c-1.016-1.098-1.335-2.67-.827-4.077 .508-1.407 1.759-2.412 3.242-2.606 1.483-.194 2.951 .455 3.804 1.684C52.25 122.71 82.29 148 128 148c45.71 0 75.75-25.29 92.89-46.51 .854-1.228 2.321-1.878 3.804-1.684 1.483 .194 2.734 1.2 3.242 2.606 .508 1.407 .19 2.98-.827 4.077-6.351 7.896-13.495 15.121-21.32 21.56L227.47 166c.532 .92 .676 2.014 .4 3.04-.276 1.026-.949 1.901-1.87 2.43Z"),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
