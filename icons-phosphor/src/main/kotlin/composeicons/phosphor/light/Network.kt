package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Network: ImageVector
    get() {
        if (_network != null) return _network!!
        _network = phosphorLightIcon(
            name = "Network",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 114h-98v-28h10c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14h-32c-7.732 0-14 6.268-14 14v32c0 7.732 6.268 14 14 14h10v28h-98c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h34v36h-10c-7.732 0-14 6.268-14 14v32c0 7.732 6.268 14 14 14h32c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14h-10v-36h116v36h-10c-7.732 0-14 6.268-14 14v32c0 7.732 6.268 14 14 14h32c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14h-10v-36h34c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM110 72v-32c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2v32c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2ZM82 176v32c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2v-32c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2ZM210 176v32c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2v-32c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2Z"),
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
        return _network!!
    }

private var _network: ImageVector? = null
