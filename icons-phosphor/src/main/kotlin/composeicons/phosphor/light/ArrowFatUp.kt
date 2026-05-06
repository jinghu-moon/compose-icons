package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatUp: ImageVector
    get() {
        if (_arrowFatUp != null) return _arrowFatUp!!
        _arrowFatUp = phosphorLightIcon(
            name = "ArrowFatUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.24 115.76l-96-96c-2.343-2.34-6.137-2.34-8.48 0L27.76 115.76c-1.714 1.716-2.226 4.295-1.298 6.535 .928 2.241 3.113 3.702 5.538 3.705h42v82c0 7.732 6.268 14 14 14h80c7.732 0 14-6.268 14-14v-82h42c2.425-.002 4.611-1.464 5.538-3.705 .928-2.241 .415-4.819-1.298-6.535ZM176 114c-3.314 0-6 2.686-6 6v88c0 1.105-.895 2-2 2h-80c-1.105 0-2-.895-2-2v-88c0-3.314-2.686-6-6-6h-33.51L128 32.49 209.51 114Z"),
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
        return _arrowFatUp!!
    }

private var _arrowFatUp: ImageVector? = null
