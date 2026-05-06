package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorLightIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 216c0 3.314-2.686 6-6 6h-176c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6ZM80 174c1.591-.001 3.116-.634 4.24-1.76L186 70.49v81.51c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-96c0-3.314-2.686-6-6-6h-96c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h81.51L75.76 163.76c-1.714 1.716-2.226 4.295-1.298 6.535 .928 2.241 3.113 3.702 5.538 3.705Z"),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
