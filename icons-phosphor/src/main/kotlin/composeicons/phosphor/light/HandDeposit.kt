package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandDeposit: ImageVector
    get() {
        if (_handDeposit != null) return _handDeposit!!
        _handDeposit = phosphorLightIcon(
            name = "HandDeposit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M126 30.49v97.51c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-97.51L92.24 52.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l32-32c2.343-2.34 6.137-2.34 8.48 0l32 32c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723ZM190 124.69v-28.69c0-7.732-6.268-14-14-14h-16c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h16c1.105 0 2 .895 2 2v86.14c-7.573-11.928-23.286-15.624-35.383-8.324-12.097 7.3-16.15 22.924-9.127 35.184 0 .1 .11 .19 .17 .29l22.26 34c1.912 2.505 5.435 3.104 8.068 1.372 2.632-1.732 3.476-5.205 1.932-7.952L143.8 202.87c-3.83-6.719-1.489-15.27 5.23-19.1 6.719-3.83 15.27-1.489 19.1 5.23 .051 .1 .107 .197 .17 .29L179 205.59c1.459 2.2 4.185 3.188 6.715 2.433 2.53-.754 4.269-3.074 4.285-5.713v-62.74c17.665 14.542 27.929 36.2 28 59.08v41.35c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-41.35c-.091-29.8-15.111-57.571-40-73.96ZM80 82h-16C56.268 82 50 88.268 50 96v104c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-104c0-1.105 .895-2 2-2h16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _handDeposit!!
    }

private var _handDeposit: ImageVector? = null
