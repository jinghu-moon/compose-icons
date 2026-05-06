package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = phosphorLightIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 50h-192C24.268 50 18 56.268 18 64v24c0 7.732 6.268 14 14 14h2v90c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-90h2c7.732 0 14-6.268 14-14v-24c0-7.732-6.268-14-14-14ZM210 192c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-90h164ZM226 88c0 1.105-.895 2-2 2h-192c-1.105 0-2-.895-2-2v-24c0-1.105 .895-2 2-2h192c1.105 0 2 .895 2 2ZM98 136c0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6Z"),
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
        return _archive!!
    }

private var _archive: ImageVector? = null
