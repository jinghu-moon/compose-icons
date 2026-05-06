package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BellSimpleRinging: ImageVector
    get() {
        if (_bellSimpleRinging != null) return _bellSimpleRinging!!
        _bellSimpleRinging = phosphorBoldIcon(
            name = "BellSimpleRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 228c0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12ZM230.94 58.48C221.625 40.273 207.633 24.873 190.4 13.86c-3.627-2.437-8.292-2.709-12.178-.712-3.886 1.998-6.379 5.95-6.509 10.317-.129 4.368 2.125 8.46 5.886 10.684 13.652 8.704 24.706 20.926 32 35.38 2.072 3.991 6.203 6.489 10.7 6.47 1.919 .002 3.81-.461 5.51-1.35 5.88-3.05 8.176-10.288 5.13-16.17ZM46.37 69.53C53.664 55.076 64.718 42.854 78.37 34.15c3.846-2.178 6.184-6.295 6.084-10.714C84.354 19.017 81.832 15.011 77.891 13.009c-3.941-2.002-8.663-1.675-12.291 .851C48.367 24.873 34.375 40.273 25.06 58.48c-3.046 5.882-.75 13.12 5.13 16.17 1.7 .889 3.591 1.352 5.51 1.35 4.486 .008 8.602-2.488 10.67-6.47ZM219.88 167.88c4.604 6.043 5.386 14.173 2.019 20.984C218.532 195.674 211.597 199.989 204 200h-152c-7.603 0-14.548-4.31-17.923-11.123-3.375-6.813-2.595-14.95 2.013-20.997 7.17-9.33 15.73-26.62 15.88-55.94C51.987 69.958 86.033 35.938 128.015 35.955 169.997 35.972 204.017 70.018 204 112c.15 29.26 8.71 46.55 15.88 55.88ZM196.34 176C188.18 163 180.15 142.43 180 112.06 180.017 83.341 156.749 60.047 128.03 60.03 99.311 60.013 76.017 83.281 76 112c-.15 30.42-8.18 51-16.34 64Z"),
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
        return _bellSimpleRinging!!
    }

private var _bellSimpleRinging: ImageVector? = null
