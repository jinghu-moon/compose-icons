package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignRight: ImageVector
    get() {
        if (_alignRight != null) return _alignRight!!
        _alignRight = phosphorLightIcon(
            name = "AlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 40v176c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-176c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM190 64v40c0 7.732-6.268 14-14 14h-96c-7.732 0-14-6.268-14-14v-40C66 56.268 72.268 50 80 50h96c7.732 0 14 6.268 14 14ZM178 64c0-1.105-.895-2-2-2h-96c-1.105 0-2 .895-2 2v40c0 1.105 .895 2 2 2h96c1.105 0 2-.895 2-2ZM190 152v40c0 7.732-6.268 14-14 14h-136c-7.732 0-14-6.268-14-14v-40c0-7.732 6.268-14 14-14h136c7.732 0 14 6.268 14 14ZM178 152c0-1.105-.895-2-2-2h-136c-1.105 0-2 .895-2 2v40c0 1.105 .895 2 2 2h136c1.105 0 2-.895 2-2Z"),
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
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
