package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hoodie: ImageVector
    get() {
        if (_hoodie != null) return _hoodie!!
        _hoodie = phosphorLightIcon(
            name = "Hoodie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.65 121.64 181.38 40.23C178.782 36.336 174.411 33.999 169.73 34h-83.46c-4.681-.001-9.052 2.336-11.65 6.23L20.35 121.64c-2.246 3.368-2.925 7.544-1.86 11.45l21.44 78.59c1.659 6.09 7.188 10.317 13.5 10.32h26.57c7.732 0 14-6.268 14-14v-18h68v18c0 7.732 6.268 14 14 14h26.57c6.312-.003 11.841-4.23 13.5-10.32l21.44-78.59c1.065-3.906 .386-8.082-1.86-11.45ZM80 178c-1.105 0-2-.895-2-2v-110.51L106 82v54c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-46.93l7 4.1c1.882 1.111 4.218 1.111 6.1 0l6.95-4.1v38.93c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-46l28-16.51v110.51c0 1.105-.895 2-2 2ZM86.27 46h83.46c.667 .001 1.29 .335 1.66 .89l4.1 6.15L128 81 80.51 53l4.1-6.15c.379-.54 1-.858 1.66-.85ZM82 208c0 1.105-.895 2-2 2h-26.57c-.897-.004-1.682-.605-1.92-1.47L30.07 129.93c-.149-.557-.051-1.151 .27-1.63L66 74.8v101.2c0 7.732 6.268 14 14 14h2ZM225.93 129.93l-21.44 78.6c-.238 .865-1.023 1.466-1.92 1.47h-26.57c-1.105 0-2-.895-2-2v-18h2c7.732 0 14-6.268 14-14v-101.2l35.66 53.5c.321 .479 .419 1.073 .27 1.63Z"),
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
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
