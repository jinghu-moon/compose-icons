package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Memory: ImageVector
    get() {
        if (_memory != null) return _memory!!
        _memory = phosphorLightIcon(
            name = "Memory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 58h-208C16.268 58 10 64.268 10 72v128c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h20v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h20v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h20v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h20v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h20v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h20v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h20v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-128c0-7.732-6.268-14-14-14ZM22 72c0-1.105 .895-2 2-2h208c1.105 0 2 .895 2 2v98h-212ZM112 150c3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6h-64c-3.314 0-6 2.686-6 6v48c0 3.314 2.686 6 6 6ZM54 102h52v36h-52ZM144 150h64c3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6h-64c-3.314 0-6 2.686-6 6v48c0 3.314 2.686 6 6 6ZM150 102h52v36h-52Z"),
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
        return _memory!!
    }

private var _memory: ImageVector? = null
