package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorBoldIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.15 78.54 177.46 17.86c-3.751-3.756-8.842-5.866-14.15-5.866-5.308 0-10.399 2.11-14.15 5.866L97.2 70C84.77 66.67 60.52 64.28 35.46 84.5c-4.426 3.561-7.129 8.836-7.434 14.508-.305 5.672 1.816 11.207 5.834 15.222l45.46 45.47L39.52 199.5c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L96.32 176.69l45.47 45.46c3.747 3.742 8.824 5.846 14.12 5.85 .46 0 .93 0 1.4-.05 5.775-.417 11.086-3.317 14.56-7.95 4.69-6.23 11-16.13 14.44-28 3.44-11.87 3.45-22.88 .16-33.4l51.7-51.87c7.742-7.805 7.733-20.396-.02-28.19ZM163.89 147.33c-3.641 3.654-4.539 9.227-2.23 13.84 3.43 6.86 6.9 21-6.28 40.65L54.08 100.53c21.09-14.59 39.53-6.64 41-6 4.601 2.389 10.226 1.456 13.81-2.29L163.32 37.63l55 55Z"),
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
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
