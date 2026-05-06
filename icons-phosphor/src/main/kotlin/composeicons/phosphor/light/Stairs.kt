package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stairs: ImageVector
    get() {
        if (_stairs != null) return _stairs!!
        _stairs = phosphorLightIcon(
            name = "Stairs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 26h-144C48.268 26 42 32.268 42 40v176c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-176c0-7.732-6.268-14-14-14ZM152 142h50v28h-92v-28ZM158 130v-28h44v28ZM56 38h144c1.105 0 2 .895 2 2v50h-50c-3.314 0-6 2.686-6 6v34h-42c-3.314 0-6 2.686-6 6v34h-44v-130c0-1.105 .895-2 2-2ZM200 218h-144c-1.105 0-2-.895-2-2v-34h148v34c0 1.105-.895 2-2 2Z"),
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
        return _stairs!!
    }

private var _stairs: ImageVector? = null
