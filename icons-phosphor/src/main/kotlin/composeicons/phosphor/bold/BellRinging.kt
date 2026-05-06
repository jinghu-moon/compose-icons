package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) return _bellRinging!!
        _bellRinging = phosphorBoldIcon(
            name = "BellRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.81 74.65c-1.7 .889-3.591 1.352-5.51 1.35-4.487 .008-8.602-2.488-10.67-6.47-7.294-14.454-18.348-26.676-32-35.38-3.761-2.224-6.016-6.317-5.886-10.684 .129-4.368 2.623-8.32 6.509-10.317 3.886-1.998 8.551-1.725 12.178 .712 17.233 11.013 31.225 26.413 40.54 44.62 1.461 2.828 1.737 6.121 .77 9.154-.968 3.033-3.101 5.556-5.93 7.016ZM46.37 69.53C53.664 55.076 64.718 42.854 78.37 34.15c3.846-2.178 6.184-6.295 6.084-10.714C84.354 19.017 81.832 15.011 77.891 13.009c-3.941-2.002-8.663-1.675-12.291 .851C48.367 24.873 34.375 40.273 25.06 58.48c-3.046 5.882-.75 13.12 5.13 16.17 1.7 .889 3.591 1.352 5.51 1.35 4.486 .008 8.602-2.488 10.67-6.47ZM219.88 167.88c4.604 6.043 5.386 14.173 2.019 20.984C218.532 195.674 211.597 199.989 204 200h-32.19c-2.109 22.62-21.092 39.915-43.81 39.915C105.282 239.915 86.299 222.62 84.19 200h-32.19c-7.603 0-14.548-4.31-17.923-11.123-3.375-6.813-2.595-14.95 2.013-20.997 7.17-9.33 15.73-26.62 15.88-55.94C51.987 69.958 86.033 35.938 128.015 35.955 169.997 35.972 204.017 70.018 204 112c.15 29.26 8.71 46.55 15.88 55.88ZM147.6 200h-39.2c1.893 9.321 10.088 16.02 19.6 16.02 9.512 0 17.707-6.699 19.6-16.02ZM196.34 176C188.18 163 180.15 142.43 180 112.06 180.017 83.341 156.749 60.047 128.03 60.03 99.311 60.013 76.017 83.281 76 112c-.15 30.42-8.18 51-16.34 64Z"),
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
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
