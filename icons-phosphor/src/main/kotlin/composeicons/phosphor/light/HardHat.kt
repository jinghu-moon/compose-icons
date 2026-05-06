package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorLightIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 154h-2v-18C221.893 95.677 196.178 59.877 158 46.9v-6.9c0-7.732-6.268-14-14-14h-32c-7.732 0-14 6.268-14 14v6.9C59.822 59.877 34.107 95.677 34 136v18h-2c-7.732 0-14 6.268-14 14v24c0 7.732 6.268 14 14 14h192c7.732 0 14-6.268 14-14v-24c0-7.732-6.268-14-14-14ZM210 136v18h-52v-94.32c31.313 12.408 51.91 42.638 52 76.32ZM112 38h32c1.105 0 2 .895 2 2v114h-36v-114c0-1.105 .895-2 2-2ZM46 136C46.09 102.318 66.687 72.088 98 59.68v94.32h-52ZM226 192c0 1.105-.895 2-2 2h-192c-1.105 0-2-.895-2-2v-24c0-1.105 .895-2 2-2h192c1.105 0 2 .895 2 2Z"),
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
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
