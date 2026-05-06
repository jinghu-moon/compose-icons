package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cpu: ImageVector
    get() {
        if (_cpu != null) return _cpu!!
        _cpu = phosphorLightIcon(
            name = "Cpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 98h-48c-3.314 0-6 2.686-6 6v48c0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6ZM146 146h-36v-36h36ZM232 146h-18v-36h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-42c0-7.732-6.268-14-14-14h-42v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-36v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-42C48.268 42 42 48.268 42 56v42h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v36h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v42c0 7.732 6.268 14 14 14h42v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h36v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h42c7.732 0 14-6.268 14-14v-42h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM202 200c0 1.105-.895 2-2 2h-144c-1.105 0-2-.895-2-2v-144c0-1.105 .895-2 2-2h144c1.105 0 2 .895 2 2Z"),
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
        return _cpu!!
    }

private var _cpu: ImageVector? = null
