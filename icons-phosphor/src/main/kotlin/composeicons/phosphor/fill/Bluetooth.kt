package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) return _bluetooth!!
        _bluetooth = phosphorFillIcon(
            name = "Bluetooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 176c0 2.518-1.186 4.889-3.2 6.4l-64 48C131.415 231.439 129.731 232 128 232c-4.418 0-8-3.582-8-8v-80L68.8 182.4c-3.535 2.651-8.549 1.935-11.2-1.6-2.651-3.535-1.935-8.549 1.6-11.2L114.67 128 59.2 86.4C55.665 83.749 54.949 78.735 57.6 75.2c2.651-3.535 7.665-4.251 11.2-1.6L120 112v-80c0-3.03 1.712-5.8 4.422-7.155 2.71-1.355 5.954-1.063 8.378 .755l64 48C198.814 75.111 200 77.482 200 80c0 2.518-1.186 4.889-3.2 6.4L141.33 128l55.47 41.6c2.014 1.511 3.2 3.882 3.2 6.4Z"),
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
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
