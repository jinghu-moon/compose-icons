package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorLightIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.94 197.23c-2.888 1.624-6.546 .598-8.17-2.29L156.49 70h-22.49v10c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-10h-22.49L29.23 194.94c-1.039 1.891-3.013 3.079-5.17 3.111-2.157 .032-4.166-1.097-5.26-2.957-1.094-1.86-1.105-4.164-.03-6.034L85.74 70h-61.74c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h208c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-61.74l67 119.06c.777 1.391 .969 3.034 .534 4.566-.435 1.533-1.462 2.829-2.854 3.604ZM128 114c-3.314 0-6 2.686-6 6v16c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-16c0-3.314-2.686-6-6-6ZM128 170c-3.314 0-6 2.686-6 6v16c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-16c0-3.314-2.686-6-6-6Z"),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
