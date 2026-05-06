package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandWithdraw: ImageVector
    get() {
        if (_handWithdraw != null) return _handWithdraw!!
        _handWithdraw = phosphorLightIcon(
            name = "HandWithdraw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 198.65v41.35c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-41.35c-.071-22.88-10.335-44.538-28-59.08v62.74c-.016 2.64-1.756 4.959-4.285 5.713-2.53 .754-5.255-.233-6.715-2.433L168.32 189.29c-.063-.093-.119-.19-.17-.29-3.83-6.719-12.381-9.06-19.1-5.23-6.719 3.83-9.06 12.381-5.23 19.1L166 236.71c1.544 2.747 .7 6.22-1.932 7.952-2.632 1.732-6.156 1.133-8.068-1.372l-22.26-34c-.06-.1-.12-.19-.17-.29-6.462-12.185-2.285-27.296 9.519-34.431 11.803-7.136 27.125-3.813 34.911 7.571v-118.14c0-1.105-.895-2-2-2h-16c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h16c7.732 0 14 6.268 14 14v60.69c24.889 16.389 39.909 44.16 40 73.96ZM86 56c0-3.314-2.686-6-6-6h-16C56.268 50 50 56.268 50 64v136c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-136c0-1.105 .895-2 2-2h16c3.314 0 6-2.686 6-6ZM156.24 99.76c-2.343-2.34-6.137-2.34-8.48 0L126 121.51v-105.51c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v105.51L92.24 99.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333l32 32c2.343 2.34 6.137 2.34 8.48 0l32-32c2.34-2.343 2.34-6.137 0-8.48Z"),
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
        return _handWithdraw!!
    }

private var _handWithdraw: ImageVector? = null
