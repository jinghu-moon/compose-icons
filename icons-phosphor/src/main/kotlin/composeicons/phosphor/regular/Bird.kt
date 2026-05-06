package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorRegularIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 68c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM240 80c.002 2.676-1.334 5.175-3.56 6.66L216 100.28v19.72c-.061 57.412-46.588 103.939-104 104h-88c-6.152 0-11.758-3.527-14.422-9.072C6.914 209.383 7.665 202.802 11.51 198l.1-.12L96 96.63v-19.74C96 43.47 122.79 16.16 155.71 16h.29c26.155-.008 49.302 16.929 57.21 41.86l23.23 15.48c2.226 1.485 3.562 3.984 3.56 6.66ZM217.58 80 201.9 69.54c-1.636-1.088-2.814-2.739-3.31-4.64C193.537 45.518 176.03 31.994 156 32h-.22C131.64 32.12 112 52.25 112 76.89v22.63c.003 1.874-.652 3.689-1.85 5.13L24 208h26.9l70.94-85.12c1.81-2.26 4.699-3.367 7.556-2.892 2.856 .474 5.234 2.455 6.216 5.179 .982 2.724 .415 5.766-1.481 7.954L71.75 208h40.25c48.578-.055 87.945-39.422 88-88v-24c-.002-2.676 1.334-5.175 3.56-6.66Z"),
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
        return _bird!!
    }

private var _bird: ImageVector? = null
