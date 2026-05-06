package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorLightIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 66h-50v-10C174 43.85 164.15 34 152 34h-48C91.85 34 82 43.85 82 56v10h-50C24.268 66 18 72.268 18 80v112c0 7.732 6.268 14 14 14h192c7.732 0 14-6.268 14-14v-112c0-7.732-6.268-14-14-14ZM94 56c0-5.523 4.477-10 10-10h48c5.523 0 10 4.477 10 10v10h-68ZM32 78h192c1.105 0 2 .895 2 2v34h-36v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-100v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-36v-34c0-1.105 .895-2 2-2ZM224 194h-192c-1.105 0-2-.895-2-2v-66h36v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h100v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h36v66c0 1.105-.895 2-2 2Z"),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
