package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NetworkSlash: ImageVector
    get() {
        if (_networkSlash != null) return _networkSlash!!
        _networkSlash = phosphorLightIcon(
            name = "NetworkSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M98 54v-14c0-7.732 6.268-14 14-14h32c7.732 0 14 6.268 14 14v32c0 7.732-6.268 14-14 14h-16.39c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h16.39c1.105 0 2-.895 2-2v-32c0-1.105-.895-2-2-2h-32c-1.105 0-2 .895-2 2v14c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM212.44 212c2.231 2.452 2.052 6.249-.4 8.48-2.452 2.231-6.249 2.052-8.48-.4l-85.49-94h-48.07v36h10c7.732 0 14 6.268 14 14v32c0 7.732-6.268 14-14 14h-32c-7.732 0-14-6.268-14-14v-32.08c0-7.732 6.268-14 14-14h10v-36h-34c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h83.16L43.56 44c-1.865-2.484-1.526-5.981 .782-8.06 2.308-2.079 5.821-2.053 8.098 .06ZM80 174h-32c-1.105 0-2 .895-2 2v32c0 1.105 .895 2 2 2h32c1.105 0 2-.895 2-2v-32c0-1.105-.895-2-2-2ZM232 114h-68c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h22v24.83c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24.83h34c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _networkSlash!!
    }

private var _networkSlash: ImageVector? = null
