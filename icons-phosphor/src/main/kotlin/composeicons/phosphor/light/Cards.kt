package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = phosphorLightIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 74h-144C32.268 74 26 80.268 26 88v112c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-112c0-7.732-6.268-14-14-14ZM186 200c0 1.105-.895 2-2 2h-144c-1.105 0-2-.895-2-2v-112c0-1.105 .895-2 2-2h144c1.105 0 2 .895 2 2ZM230 56v120c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-120c0-1.105-.895-2-2-2h-152c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h152c7.732 0 14 6.268 14 14Z"),
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
        return _cards!!
    }

private var _cards: ImageVector? = null
