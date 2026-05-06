package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Unite: ImageVector
    get() {
        if (_unite != null) return _unite!!
        _unite = phosphorRegularIcon(
            name = "Unite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174.63 81.37C167.254 41.643 131.412 13.653 91.082 16.124 50.752 18.595 18.595 50.752 16.124 91.082c-2.471 40.33 25.519 76.172 65.246 83.548 7.376 39.727 43.218 67.717 83.548 65.246 40.33-2.471 72.487-34.628 74.958-74.958C242.347 124.588 214.357 88.746 174.63 81.37ZM224 160c0 1.52-.07 3-.18 4.51l-50-50C175.119 109.097 175.85 103.564 176 98c28.246 7.333 47.976 32.817 48 62ZM45.47 56.79l52.62 52.61c-3.888 4.751-7.22 9.932-9.93 15.44L36.3 73c2.25-5.822 5.339-11.283 9.17-16.21ZM73 36.3l51.86 51.86c-5.508 2.71-10.689 6.042-15.44 9.93L56.79 45.47C61.717 41.639 67.178 38.55 73 36.3ZM134.46 147.13 108.89 121.56c3.619-4.799 7.891-9.071 12.69-12.69l25.57 25.57c-3.626 4.801-7.904 9.072-12.71 12.69ZM155.31 120 136 100.69c7.62-3.104 15.772-4.697 24-4.69 .007 8.228-1.586 16.38-4.69 24ZM100.69 136 120 155.31c-7.62 3.104-15.772 4.697-24 4.69-.007-8.228 1.586-16.38 4.69-24ZM146.6 157.91l52.61 52.62c-4.927 3.831-10.388 6.92-16.21 9.17L131.14 167.84c5.515-2.709 10.703-6.041 15.46-9.93ZM157.91 146.6c3.888-4.751 7.22-9.932 9.93-15.44L219.7 183c-2.252 5.815-5.341 11.269-9.17 16.19ZM158 80.05c-5.556 .135-11.082 .849-16.49 2.13l-50-50C93 32.07 94.48 32 96 32c29.197 .03 54.686 19.784 62 48.05ZM32 96c0-1.52 .07-3 .18-4.51l50 50c-1.282 5.414-1.996 10.948-2.13 16.51C51.784 150.686 32.03 125.197 32 96ZM98 176c5.556-.135 11.082-.849 16.49-2.13l50 50c-1.49 .11-3 .18-4.51 .18C130.79 224.011 105.312 204.259 98 176Z"),
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
        return _unite!!
    }

private var _unite: ImageVector? = null
