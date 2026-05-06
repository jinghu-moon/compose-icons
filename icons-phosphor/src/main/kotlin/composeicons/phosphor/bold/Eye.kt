package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorBoldIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251 123.13c-.37-.81-9.13-20.26-28.48-39.61C196.63 57.67 164 44 128 44 92 44 59.37 57.67 33.51 83.52 14.16 102.87 5.4 122.32 5 123.13c-1.37 3.106-1.37 6.644 0 9.75 .37 .82 9.13 20.26 28.49 39.61C59.37 198.34 92 212 128 212c36 0 68.63-13.66 94.48-39.51 19.36-19.35 28.12-38.79 28.49-39.61 1.379-3.101 1.39-6.64 .03-9.75ZM204.94 156.13C183.47 177.27 157.59 188 128 188 98.41 188 72.53 177.27 51.09 156.12 42.653 147.772 35.396 138.312 29.52 128 35.398 117.693 42.655 108.235 51.09 99.89 72.54 78.73 98.41 68 128 68c29.59 0 55.46 10.73 76.91 31.89 8.436 8.345 15.693 17.802 21.57 28.11-5.877 10.311-13.134 19.772-21.57 28.12ZM128 84c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44C171.972 103.711 152.289 84.028 128 84ZM128 148c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
