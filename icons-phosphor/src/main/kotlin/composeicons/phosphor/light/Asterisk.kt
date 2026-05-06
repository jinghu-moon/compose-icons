package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorLightIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.14 179.09c-1.704 2.841-5.388 3.763-8.23 2.06L134 138.6v77.4c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-77.4L51.09 181.15c-.935 .555-2.002 .849-3.09 .85-2.703 .01-5.078-1.789-5.802-4.393-.724-2.604 .382-5.371 2.702-6.757L116.34 128 44.91 85.15C42.066 83.443 41.143 79.754 42.85 76.91c1.707-2.844 5.396-3.767 8.24-2.06L122 117.4v-77.4c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v77.4L204.91 74.85c2.844-1.707 6.533-.784 8.24 2.06 1.707 2.844 .784 6.533-2.06 8.24L139.66 128l71.43 42.85c1.365 .82 2.349 2.149 2.733 3.695 .385 1.546 .139 3.181-.683 4.545Z"),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
