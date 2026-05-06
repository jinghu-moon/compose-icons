package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) return _bluetooth!!
        _bluetooth = phosphorLightIcon(
            name = "Bluetooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M195.6 171.2 138 128 195.6 84.8C197.111 83.667 198 81.889 198 80c0-1.889-.889-3.667-2.4-4.8l-64-48c-1.818-1.364-4.251-1.583-6.283-.567C123.284 27.65 122 29.727 122 32v84L67.6 75.2c-2.651-1.988-6.412-1.451-8.4 1.2-1.988 2.651-1.451 6.412 1.2 8.4L118 128 60.4 171.2c-2.651 1.988-3.188 5.749-1.2 8.4 1.988 2.651 5.749 3.188 8.4 1.2L122 140v84c0 2.273 1.284 4.35 3.317 5.367 2.033 1.016 4.465 .797 6.283-.567l64-48C197.111 179.667 198 177.889 198 176c0-1.889-.889-3.667-2.4-4.8ZM134 44l48 36-48 36ZM134 212v-72l48 36Z"),
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
