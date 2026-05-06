package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorRegularIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 16C128.251 16.039 96.039 48.251 96 88c.007 3.15 .218 6.297 .63 9.42L27.12 192.22c-4.703 6.361-4.026 15.209 1.59 20.78L43 227.29c5.571 5.616 14.419 6.293 20.78 1.59l94.81-69.53c3.119 .418 6.263 .636 9.41 .65 39.764 0 72-32.235 72-72C240 48.235 207.764 16 168 16ZM224 88c.014 12.088-3.903 23.853-11.16 33.52L134.49 43.16c16.974-12.678 39.65-14.691 58.592-5.202C212.024 47.448 223.99 66.814 224 88ZM54.32 216 40 201.68 102.14 117c7.281 16.439 20.421 29.579 36.86 36.86ZM112 88c-.016-12.085 3.901-23.847 11.16-33.51l78.34 78.34c-16.973 12.671-39.642 14.681-58.58 5.195C123.982 128.539 112.017 109.181 112 88ZM109.65 146.34c3.122 3.124 3.122 8.186 0 11.31l-8 8c-2.002 2.107-4.99 2.963-7.804 2.235-2.814-.728-5.012-2.926-5.74-5.74-.728-2.814 .127-5.802 2.235-7.804l8-8c1.5-1.507 3.537-2.354 5.663-2.356 2.126-.002 4.165 .842 5.667 2.346Z"),
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
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
