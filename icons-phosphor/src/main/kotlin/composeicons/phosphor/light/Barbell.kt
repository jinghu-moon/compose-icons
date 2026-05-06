package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorLightIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 122h-10v-34c0-7.732-6.268-14-14-14h-18v-10c0-7.732-6.268-14-14-14h-24c-7.732 0-14 6.268-14 14v58h-52v-58C102 56.268 95.732 50 88 50h-24C56.268 50 50 56.268 50 64v10h-18C24.268 74 18 80.268 18 88v34h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v34c0 7.732 6.268 14 14 14h18v10c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-58h52v58c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-10h18c7.732 0 14-6.268 14-14v-34h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM32 170c-1.105 0-2-.895-2-2v-80c0-1.105 .895-2 2-2h18v84ZM90 192c0 1.105-.895 2-2 2h-24c-1.105 0-2-.895-2-2v-128c0-1.105 .895-2 2-2h24c1.105 0 2 .895 2 2ZM194 192c0 1.105-.895 2-2 2h-24c-1.105 0-2-.895-2-2v-128c0-1.105 .895-2 2-2h24c1.105 0 2 .895 2 2ZM226 168c0 1.105-.895 2-2 2h-18v-84h18c1.105 0 2 .895 2 2Z"),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
