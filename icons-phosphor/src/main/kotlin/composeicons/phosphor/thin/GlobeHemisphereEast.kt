package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) return _globeHemisphereEast!!
        _globeHemisphereEast = phosphorThinIcon(
            name = "GlobeHemisphereEast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 36c18.571-.02 36.708 5.613 52 16.15v21.85c-.009 .962-.364 1.889-1 2.61l-22.17 25.76c-.638 .739-1.523 1.219-2.49 1.35L122.9 108c-1.017 .145-2.051-.114-2.88-.72l-.16-.11L100.13 94.22C97.487 92.341 94.197 91.611 91.008 92.197c-3.189 .586-6.006 2.437-7.808 5.133L62.2 128.63c-1.302 1.955-1.998 4.251-2 6.6L60 171.46c-.004 1.342-.68 2.592-1.8 3.33l-6.65 4.36C32.674 150.93 30.874 114.608 46.868 84.66 62.862 54.713 94.049 36.007 128 36ZM56.32 185.6l6.29-4.13c3.368-2.213 5.4-5.97 5.41-10l.21-36.23c.003-.783 .236-1.548 .67-2.2L89.85 101.74c.607-.9 1.553-1.516 2.623-1.704 1.069-.189 2.169 .066 3.047 .704l.15 .11 19.74 12.91c2.482 1.764 5.542 2.518 8.56 2.11l31.47-4.26c2.909-.392 5.574-1.836 7.49-4.06L185.1 81.81C186.968 79.637 187.997 76.866 188 74v-15.69c29.765 25.575 40.008 67.227 25.5 103.69L192.93 143.18c-3.443-3.144-8.395-4.01-12.7-2.22l-30.45 12.66c-3.887 1.627-6.643 5.164-7.27 9.33l-2.38 16.19c-.868 6.051 2.952 11.787 8.87 13.32l21.45 5.63c.684 .167 1.312 .512 1.82 1l5.94 6C138.619 230.932 85.879 222.499 56.32 185.6ZM184.75 200.36l-6.86-6.88c-1.506-1.509-3.388-2.589-5.45-3.13L151 184.72c-1.994-.493-3.291-2.416-3-4.45l2.39-16.2c.205-1.39 1.123-2.57 2.42-3.11l30.45-12.65c1.437-.6 3.091-.311 4.24 .74L210 169.62c-6.086 11.958-14.702 22.447-25.25 30.74Z"),
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
        return _globeHemisphereEast!!
    }

private var _globeHemisphereEast: ImageVector? = null
