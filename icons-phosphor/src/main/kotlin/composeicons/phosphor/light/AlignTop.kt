package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignTop: ImageVector
    get() {
        if (_alignTop != null) return _alignTop!!
        _alignTop = phosphorLightIcon(
            name = "AlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 40c0 3.314-2.686 6-6 6h-176c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6ZM206 80v96c0 7.732-6.268 14-14 14h-40c-7.732 0-14-6.268-14-14v-96c0-7.732 6.268-14 14-14h40c7.732 0 14 6.268 14 14ZM194 80c0-1.105-.895-2-2-2h-40c-1.105 0-2 .895-2 2v96c0 1.105 .895 2 2 2h40c1.105 0 2-.895 2-2ZM118 80v136c0 7.732-6.268 14-14 14h-40c-7.732 0-14-6.268-14-14v-136C50 72.268 56.268 66 64 66h40c7.732 0 14 6.268 14 14ZM106 80c0-1.105-.895-2-2-2h-40c-1.105 0-2 .895-2 2v136c0 1.105 .895 2 2 2h40c1.105 0 2-.895 2-2Z"),
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
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
