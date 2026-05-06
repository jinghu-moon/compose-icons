package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorLightIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M114.31 101.9c-1.049-3.142 .648-6.54 3.79-7.59l12-4c1.83-.611 3.841-.305 5.407 .823 1.565 1.127 2.493 2.938 2.493 4.867v40c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-31.68l-4.1 1.37c-3.142 1.049-6.54-.648-7.59-3.79ZM246 208c0 3.314-2.686 6-6 6h-224c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h10v-98C26 96.268 32.268 90 40 90h42v-34C82 48.268 88.268 42 96 42h64c7.732 0 14 6.268 14 14v74h42c7.732 0 14 6.268 14 14v58h10c3.314 0 6 2.686 6 6ZM174 142v60h44v-58c0-1.105-.895-2-2-2ZM94 202h68v-146c0-1.105-.895-2-2-2h-64c-1.105 0-2 .895-2 2ZM38 202h44v-100h-42c-1.105 0-2 .895-2 2Z"),
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
        return _ranking!!
    }

private var _ranking: ImageVector? = null
