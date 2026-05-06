package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorLightIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 90h-50v-50c0-7.732-6.268-14-14-14h-48C96.268 26 90 32.268 90 40v50h-50c-7.732 0-14 6.268-14 14v48c0 7.732 6.268 14 14 14h50v50c0 7.732 6.268 14 14 14h48c7.732 0 14-6.268 14-14v-50h50c7.732 0 14-6.268 14-14v-48c0-7.732-6.268-14-14-14ZM218 152c0 1.105-.895 2-2 2h-56c-3.314 0-6 2.686-6 6v56c0 1.105-.895 2-2 2h-48c-1.105 0-2-.895-2-2v-56c0-3.314-2.686-6-6-6h-56c-1.105 0-2-.895-2-2v-48c0-1.105 .895-2 2-2h56c3.314 0 6-2.686 6-6v-56c0-1.105 .895-2 2-2h48c1.105 0 2 .895 2 2v56c0 3.314 2.686 6 6 6h56c1.105 0 2 .895 2 2Z"),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
