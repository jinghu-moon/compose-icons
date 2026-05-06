package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) return _alignCenterVertical!!
        _alignCenterVertical = phosphorLightIcon(
            name = "AlignCenterVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 122h-18v-50c0-7.732-6.268-14-14-14h-40c-7.732 0-14 6.268-14 14v50h-20v-74c0-7.732-6.268-14-14-14h-40C56.268 34 50 40.268 50 48v74h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v74c0 7.732 6.268 14 14 14h40c7.732 0 14-6.268 14-14v-74h20v50c0 7.732 6.268 14 14 14h40c7.732 0 14-6.268 14-14v-50h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM106 208c0 1.105-.895 2-2 2h-40c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h40c1.105 0 2 .895 2 2ZM194 184c0 1.105-.895 2-2 2h-40c-1.105 0-2-.895-2-2v-112c0-1.105 .895-2 2-2h40c1.105 0 2 .895 2 2Z"),
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
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null
