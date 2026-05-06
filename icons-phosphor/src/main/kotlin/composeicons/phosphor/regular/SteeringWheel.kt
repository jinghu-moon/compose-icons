package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorRegularIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 152c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.412 .061 103.939 46.588 104 104ZM40 128v.33c50.748-43.107 125.252-43.107 176 0v-.33C216 79.399 176.601 40 128 40 79.399 40 40 79.399 40 128ZM107.5 213.58 90.45 168h-40.82c11.734 22.894 32.864 39.537 57.87 45.58ZM128 216c.83 0 1.66 0 2.49 0l20.07-53.57c2.358-6.241 8.328-10.376 15-10.39h47.12c.38-1.31 .72-2.64 1-4C191.11 125.013 160.223 112.037 127.98 112.037c-32.243 0-63.13 12.976-85.7 36.003 .31 1.34 .65 2.67 1 4h47.17c6.674 .018 12.643 4.156 15 10.4l20 53.56c.86 0 1.7 0 2.55 0ZM206.37 168h-40.82l-17.09 45.59c25.023-6.034 46.171-22.682 57.91-45.59Z"),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
