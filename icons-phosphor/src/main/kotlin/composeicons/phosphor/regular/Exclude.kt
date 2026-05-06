package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Exclude: ImageVector
    get() {
        if (_exclude != null) return _exclude!!
        _exclude = phosphorRegularIcon(
            name = "Exclude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174.63 81.37C167.254 41.643 131.412 13.653 91.082 16.124 50.752 18.595 18.595 50.752 16.124 91.082c-2.471 40.33 25.519 76.172 65.246 83.548 7.376 39.727 43.218 67.717 83.548 65.246 40.33-2.471 72.487-34.628 74.958-74.958C242.347 124.588 214.357 88.746 174.63 81.37ZM224 160c0 1.52-.07 3-.18 4.51l-50-50C175.119 109.097 175.85 103.564 176 98c28.246 7.333 47.976 32.817 48 62ZM210.53 199.21 157.91 146.6c3.888-4.751 7.22-9.932 9.93-15.44L219.7 183c-2.25 5.822-5.339 11.283-9.17 16.21ZM183 219.7 131.14 167.84c5.508-2.71 10.689-6.042 15.44-9.93l52.61 52.62c-4.921 3.829-10.375 6.918-16.19 9.17ZM45.47 56.79l52.62 52.61c-3.888 4.751-7.22 9.932-9.93 15.44L36.3 73c2.25-5.822 5.339-11.283 9.17-16.21ZM73 36.3l51.86 51.86c-5.508 2.71-10.689 6.042-15.44 9.93L56.79 45.47C61.717 41.639 67.178 38.55 73 36.3ZM160 96c-.039 35.33-28.67 63.961-64 64 .039-35.33 28.67-63.961 64-64ZM158 80c-5.556 .135-11.082 .849-16.49 2.13L91.51 32.13C93 32.07 94.48 32 96 32c29.197 .03 54.686 19.784 62 48.05ZM32 96c0-1.52 .07-3 .18-4.51l50 50c-1.282 5.414-1.996 10.948-2.13 16.51C51.784 150.686 32.03 125.197 32 96ZM98 176c5.556-.135 11.082-.849 16.49-2.13l50 50c-1.49 .11-3 .18-4.51 .18C130.79 224.011 105.312 204.259 98 176Z"),
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
        return _exclude!!
    }

private var _exclude: ImageVector? = null
