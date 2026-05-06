package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorLightIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M34 64c0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-176c-3.314 0-6-2.686-6-6ZM136 122h-96c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h96c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM136 186h-96c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h96c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM246 160c.001 2.069-1.065 3.993-2.82 5.09l-64 40c-1.85 1.156-4.182 1.217-6.089 .159C171.183 204.192 169.999 202.182 170 200v-80c-.001-2.182 1.183-4.192 3.091-5.249 1.908-1.058 4.24-.997 6.089 .159l64 40c1.755 1.097 2.821 3.021 2.82 5.09ZM228.68 160 182 130.83v58.34Z"),
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
        return _queue!!
    }

private var _queue: ImageVector? = null
