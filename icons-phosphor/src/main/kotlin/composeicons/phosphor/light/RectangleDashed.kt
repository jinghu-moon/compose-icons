package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RectangleDashed: ImageVector
    get() {
        if (_rectangleDashed != null) return _rectangleDashed!!
        _rectangleDashed = phosphorLightIcon(
            name = "RectangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M78 48c0 3.314-2.686 6-6 6h-32c-1.105 0-2 .895-2 2v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16C26 48.268 32.268 42 40 42h32c3.314 0 6 2.686 6 6ZM32 150c3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6ZM72 202h-32c-1.105 0-2-.895-2-2v-16c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v16c0 7.732 6.268 14 14 14h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM144 202h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM224 178c-3.314 0-6 2.686-6 6v16c0 1.105-.895 2-2 2h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c7.732 0 14-6.268 14-14v-16c0-3.314-2.686-6-6-6ZM224 106c-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6ZM216 42h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c1.105 0 2 .895 2 2v16c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-16c0-7.732-6.268-14-14-14ZM144 42h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _rectangleDashed!!
    }

private var _rectangleDashed: ImageVector? = null
