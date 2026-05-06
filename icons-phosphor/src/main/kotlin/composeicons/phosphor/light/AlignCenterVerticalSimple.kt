package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignCenterVerticalSimple: ImageVector
    get() {
        if (_alignCenterVerticalSimple != null) return _alignCenterVerticalSimple!!
        _alignCenterVerticalSimple = phosphorLightIcon(
            name = "AlignCenterVerticalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 122h-34v-74c0-7.732-6.268-14-14-14h-64C88.268 34 82 40.268 82 48v74h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h34v74c0 7.732 6.268 14 14 14h64c7.732 0 14-6.268 14-14v-74h34c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM162 208c0 1.105-.895 2-2 2h-64c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h64c1.105 0 2 .895 2 2Z"),
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
        return _alignCenterVerticalSimple!!
    }

private var _alignCenterVerticalSimple: ImageVector? = null
