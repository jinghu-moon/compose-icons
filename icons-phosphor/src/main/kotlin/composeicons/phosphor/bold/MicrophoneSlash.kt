package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) return _microphoneSlash!!
        _microphoneSlash = phosphorBoldIcon(
            name = "MicrophoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 39.93C54.012 36.697 49.628 35.256 45.401 36.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L76 96.64v31.36c-.015 17.416 8.689 33.683 23.186 43.333 14.497 9.65 32.863 11.402 48.924 4.667l11.26 12.39c-9.685 5.042-20.451 7.654-31.37 7.61C90.461 195.961 60.039 165.539 60 128c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 .058 46.151 34.251 85.139 80 91.22v20.78c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20.77c12.738-1.627 24.983-5.95 35.92-12.68l23.2 25.52c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM128 156c-15.464 0-28-12.536-28-28v-5l29.9 32.89c-.63 .11-1.26 .11-1.9 .11ZM191 153.58c3.309-8.122 5.008-16.81 5-25.58 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 .019 11.865-2.27 23.62-6.74 34.61-2.645 5.883-9.469 8.622-15.448 6.201-5.979-2.421-8.975-9.135-6.782-15.201ZM85.7 33.75C98.846 15.364 122.362 7.576 143.884 14.479 165.405 21.383 180.003 41.398 180 64v56.54c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56.54c.006-12.176-7.858-22.96-19.453-26.677-11.595-3.717-24.263 .486-31.337 10.397-3.866 5.388-11.367 6.621-16.755 2.755C83.067 46.609 81.834 39.108 85.7 33.72Z"),
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
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
