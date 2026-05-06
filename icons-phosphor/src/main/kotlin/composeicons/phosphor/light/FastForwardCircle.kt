package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorLightIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM191.6 123.2l-48-36c-1.818-1.364-4.251-1.583-6.283-.567C135.284 87.65 134 89.727 134 92v30L87.6 87.2c-1.818-1.364-4.251-1.583-6.283-.567C79.284 87.65 78 89.727 78 92v72c0 2.273 1.284 4.35 3.317 5.367 2.033 1.016 4.465 .797 6.283-.567L134 134v30c0 2.273 1.284 4.35 3.317 5.367 2.033 1.016 4.465 .797 6.283-.567l48-36C193.111 131.667 194 129.889 194 128c0-1.889-.889-3.667-2.4-4.8ZM90 152v-48l32 24ZM146 152v-48l32 24Z"),
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
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
