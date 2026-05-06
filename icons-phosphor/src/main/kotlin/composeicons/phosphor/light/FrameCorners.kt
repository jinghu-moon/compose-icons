package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FrameCorners: ImageVector
    get() {
        if (_frameCorners != null) return _frameCorners!!
        _frameCorners = phosphorLightIcon(
            name = "FrameCorners",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198 80v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-26h-26c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6ZM96 170h-26v-26c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM230 56v144c0 7.732-6.268 14-14 14h-176c-7.732 0-14-6.268-14-14v-144C26 48.268 32.268 42 40 42h176c7.732 0 14 6.268 14 14ZM218 56c0-1.105-.895-2-2-2h-176c-1.105 0-2 .895-2 2v144c0 1.105 .895 2 2 2h176c1.105 0 2-.895 2-2Z"),
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
        return _frameCorners!!
    }

private var _frameCorners: ImageVector? = null
