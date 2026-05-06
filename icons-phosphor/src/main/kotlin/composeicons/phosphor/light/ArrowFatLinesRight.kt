package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatLinesRight: ImageVector
    get() {
        if (_arrowFatLinesRight != null) return _arrowFatLinesRight!!
        _arrowFatLinesRight = phosphorLightIcon(
            name = "ArrowFatLinesRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.24 123.76l-96-96c-1.716-1.714-4.295-2.226-6.535-1.298-2.241 .928-3.702 3.113-3.705 5.538v42h-26c-3.314 0-6 2.686-6 6v96c0 3.314 2.686 6 6 6h26v42c.002 2.425 1.464 4.611 3.705 5.538 2.241 .928 4.82 .415 6.535-1.298l96-96c2.34-2.343 2.34-6.137 0-8.48ZM142 209.51v-33.51c0-3.314-2.686-6-6-6h-26v-84h26c3.314 0 6-2.686 6-6v-33.51L223.51 128ZM46 80v96c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-96c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM78 80v96c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-96c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _arrowFatLinesRight!!
    }

private var _arrowFatLinesRight: ImageVector? = null
