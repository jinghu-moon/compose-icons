package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) return _webcamSlash!!
        _webcamSlash = phosphorBoldIcon(
            name = "WebcamSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.88 207.93 56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L53.93 64.36c-12.923 24.151-13.259 53.086-.9 77.531 12.359 24.445 35.86 41.328 62.97 45.239v8.87h-84c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h163.42l3.7 4.07c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM68 104c-.008-6.916 1.183-13.781 3.52-20.29L84.43 97.91c-1.762 12.608 2.023 25.362 10.378 34.967 8.355 9.605 20.461 15.121 33.192 15.123 .64 0 1.28 0 1.92-.05l12.9 14.19c-17.951 4.576-37.008 .603-51.635-10.763C76.557 140.01 68 122.524 68 104ZM140 196v-8.87c7.016-1.012 13.877-2.903 20.42-5.63L173.6 196ZM88.89 42.35c-1.241-2.931-1.267-6.234-.073-9.184 1.195-2.95 3.512-5.305 6.443-6.546 32.857-13.923 70.925-5.566 94.929 20.84 24.004 26.406 28.704 65.095 11.721 96.48-2.098 3.877-6.152 6.292-10.56 6.29-1.992 .004-3.952-.495-5.7-1.45-5.825-3.155-7.991-10.433-4.84-16.26 12.136-22.42 8.778-50.061-8.372-68.924C155.288 44.733 128.091 38.767 104.62 48.72c-2.931 1.241-6.234 1.267-9.184 .073C92.486 47.598 90.131 45.281 88.89 42.35ZM172 103.64c.027 3.183-1.212 6.245-3.444 8.515-2.232 2.269-5.273 3.559-8.456 3.585h-.1c-6.592 0-11.951-5.318-12-11.91C147.917 93.645 140.192 85.149 130.06 84.1c-4.347-.33-8.173-2.992-9.994-6.952-1.821-3.961-1.351-8.598 1.228-12.112 2.579-3.515 6.861-5.354 11.186-4.805 22.329 2.248 39.372 20.968 39.52 43.41Z"),
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
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
