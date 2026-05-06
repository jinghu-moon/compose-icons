package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NetworkX: ImageVector
    get() {
        if (_networkX != null) return _networkX!!
        _networkX = phosphorLightIcon(
            name = "NetworkX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 114h-98v-28h10c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14h-32c-7.732 0-14 6.268-14 14v32c0 7.732 6.268 14 14 14h10v28h-98c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h34v36h-10c-7.732 0-14 6.268-14 14v32c0 7.732 6.268 14 14 14h32c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14h-10v-36h116v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h34c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM110 72v-32c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2v32c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2ZM82 176v32c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2v-32c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2ZM220.24 172.24 200.48 192l19.76 19.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L192 200.48l-19.76 19.76c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L183.52 192 163.76 172.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L192 183.52l19.76-19.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333Z"),
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
        return _networkX!!
    }

private var _networkX: ImageVector? = null
