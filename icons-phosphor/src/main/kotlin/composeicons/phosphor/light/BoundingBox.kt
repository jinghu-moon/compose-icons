package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BoundingBox: ImageVector
    get() {
        if (_boundingBox != null) return _boundingBox!!
        _boundingBox = phosphorLightIcon(
            name = "BoundingBox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 94c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14h-32c-7.732 0-14 6.268-14 14v10h-68v-10C94 40.268 87.732 34 80 34h-32C40.268 34 34 40.268 34 48v32c0 7.732 6.268 14 14 14h10v68h-10c-7.732 0-14 6.268-14 14v32c0 7.732 6.268 14 14 14h32c7.732 0 14-6.268 14-14v-10h68v10c0 7.732 6.268 14 14 14h32c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14h-10v-68ZM174 48c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2v32c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2ZM46 80v-32c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2v32c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2ZM82 208c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2v-32c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2ZM210 176v32c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2v-32c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2ZM186 162h-10c-7.732 0-14 6.268-14 14v10h-68v-10c0-7.732-6.268-14-14-14h-10v-68h10c7.732 0 14-6.268 14-14v-10h68v10c0 7.732 6.268 14 14 14h10Z"),
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
        return _boundingBox!!
    }

private var _boundingBox: ImageVector? = null
