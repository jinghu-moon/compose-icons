package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorBoldIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M71.76 148h-40.06c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h33.63L77.78 105.34c2.223-3.352 5.978-5.367 10-5.367 4.022 0 7.777 2.015 10 5.367l22 33 6-9c2.229-3.342 5.983-5.346 10-5.34h24c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-17.6l-12.46 18.66c-2.223 3.352-5.978 5.367-10 5.367-4.022 0-7.777-2.015-10-5.367l-22-33-6 9c-2.222 3.33-5.957 5.333-9.96 5.34ZM177.91 36c-20.12 0-38 7.93-50.07 21.56C115.74 43.93 97.89 36 77.76 36 44.105 35.95 15.803 61.232 12.07 94.68c-.729 6.608 4.037 12.556 10.645 13.285 6.608 .729 12.556-4.037 13.285-10.645C38.384 76.06 56.367 59.989 77.76 60c17.83 0 32.75 9.4 38.95 24.54 1.833 4.534 6.234 7.502 11.125 7.502 4.891 0 9.292-2.968 11.125-7.502C145.16 69.4 160.08 60 177.91 60c23.213-.006 42.046 18.787 42.09 42 0 29.42-25.86 57.77-47.56 76.36-13.95 11.824-28.862 22.464-44.58 31.81-10.87-6.45-35.37-22-56.51-42.73-4.728-4.65-12.33-4.588-16.98 .14-4.65 4.728-4.588 12.33 .14 16.98 30.39 29.81 66.15 49.2 67.66 50 3.558 1.906 7.833 1.906 11.39 0C138 232.14 244 174.34 244 102 243.934 65.542 214.369 36.016 177.91 36Z"),
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
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
