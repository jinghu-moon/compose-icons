package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorLightIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 50h-192C24.268 50 18 56.268 18 64v128c0 7.732 6.268 14 14 14h192c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM226 162h-10c-18.778 0-34-15.222-34-34 0-18.778 15.222-34 34-34h10ZM30 94h10c18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34h-10ZM30 192v-18h10c25.405 0 46-20.595 46-46C86 102.595 65.405 82 40 82h-10v-18c0-1.105 .895-2 2-2h90v132h-90c-1.105 0-2-.895-2-2ZM224 194h-90v-132h90c1.105 0 2 .895 2 2v18h-10c-25.405 0-46 20.595-46 46 0 25.405 20.595 46 46 46h10v18c0 1.105-.895 2-2 2Z"),
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
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
