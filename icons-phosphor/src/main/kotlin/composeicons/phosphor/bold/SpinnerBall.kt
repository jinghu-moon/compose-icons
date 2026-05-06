package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorBoldIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM211.65 120.47C188.51 136 170.71 133.74 151.92 126c7.87-6 15.29-12.73 21.35-21.16C181.006 94.074 185.744 81.447 187 68.25c14.149 13.933 22.886 32.441 24.65 52.22ZM163.3 51.8c1.9 27.81-9 42.09-25.09 54.48-1.24-9.82-3.38-19.61-7.64-29.08C125.095 65.109 116.509 54.688 105.69 47c19.164-5.29 39.586-3.589 57.61 4.8ZM79.69 59.35c25 12.25 31.93 28.8 34.6 48.94-9.12-3.82-18.66-6.87-29-7.91-13.208-1.299-26.525 .93-38.59 6.46C51.746 87.612 63.432 70.789 79.69 59.35ZM44.35 135.53C67.49 120 85.29 122.26 104.08 130c-7.87 6-15.29 12.73-21.35 21.16C74.994 161.926 70.256 174.553 69 187.75 54.851 173.817 46.114 155.309 44.35 135.53ZM92.7 204.2c-1.9-27.81 9-42.09 25.09-54.48 1.24 9.82 3.38 19.61 7.64 29.08 5.475 12.091 14.061 22.512 24.88 30.2-19.164 5.29-39.586 3.589-57.61-4.8ZM176.31 196.65c-25-12.25-31.93-28.8-34.6-48.94 9.12 3.82 18.66 6.87 29 7.91q3.75 .38 7.47 .38c10.741-.059 21.347-2.393 31.12-6.85-5.043 19.232-16.73 36.059-32.99 47.5Z"),
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
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null
