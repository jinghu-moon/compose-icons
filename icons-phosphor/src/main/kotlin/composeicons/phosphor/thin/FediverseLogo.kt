package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FediverseLogo: ImageVector
    get() {
        if (_fediverseLogo != null) return _fediverseLogo!!
        _fediverseLogo = phosphorThinIcon(
            name = "FediverseLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 100c-4.076-.015-8.088 1.018-11.65 3L165.9 60c7.577-8.485 8.156-21.123 1.388-30.266C160.52 20.592 148.263 17.456 137.936 22.226c-10.327 4.769-15.888 16.133-13.316 27.214L72.29 71.21C66.349 61.762 54.68 57.656 44.132 61.302 33.583 64.948 26.941 75.384 28.103 86.484c1.162 11.1 9.822 19.934 20.897 21.316l2.11 52.71c-11.048 2.292-19.008 11.97-19.124 23.253-.116 11.283 7.643 21.123 18.642 23.641 10.999 2.518 22.267-2.965 27.072-13.174l54.43 15.24c-.08 .83-.13 1.68-.13 2.53-.007 11.019 7.489 20.627 18.179 23.299 10.69 2.672 21.826-2.277 27.005-12.003 5.179-9.726 3.07-21.728-5.114-29.106l30.6-48.08c2.951 1.252 6.124 1.895 9.33 1.89 13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24ZM188.18 121.13l-55.06 2.62L146.41 67.94Q147.2 68 148 68c4.076 .015 8.088-1.018 11.65-3l34.45 43c-3.276 3.664-5.343 8.249-5.92 13.13ZM72.18 166.32c-3.646-3.355-8.245-5.493-13.16-6.12L56.91 107.49c5.299-1.126 10.063-4.008 13.52-8.18l50.4 29.18ZM148 28c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM127.71 56.79c2.607 4.141 6.417 7.386 10.92 9.3l-13.28 55.76L74.48 92.39C75.487 89.707 76.002 86.865 76 84c-.002-1.821-.21-3.636-.62-5.41ZM36 84C36 75.163 43.163 68 52 68c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C43.163 100 36 92.837 36 84ZM56 200c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM79.87 186.53c.08-.83 .13-1.68 .13-2.53 .004-3.97-.982-7.878-2.87-11.37l48.86-38 18.73 56.19c-4.563 2.455-8.215 6.311-10.42 11ZM156 228c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM165.33 189.89C162.379 188.638 159.206 187.995 156 188c-1.235 .002-2.469 .095-3.69 .28L133.46 131.74l55.1-2.62c1.066 4.898 3.644 9.337 7.37 12.69ZM212 140c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _fediverseLogo!!
    }

private var _fediverseLogo: ImageVector? = null
