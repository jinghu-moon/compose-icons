package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) return _alignCenterHorizontal!!
        _alignCenterHorizontal = phosphorLightIcon(
            name = "AlignCenterHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 138h-74v-20h50c7.732 0 14-6.268 14-14v-40c0-7.732-6.268-14-14-14h-50v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-50C64.268 50 58 56.268 58 64v40c0 7.732 6.268 14 14 14h50v20h-74c-7.732 0-14 6.268-14 14v40c0 7.732 6.268 14 14 14h74v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h74c7.732 0 14-6.268 14-14v-40c0-7.732-6.268-14-14-14ZM70 104v-40c0-1.105 .895-2 2-2h112c1.105 0 2 .895 2 2v40c0 1.105-.895 2-2 2h-112c-1.105 0-2-.895-2-2ZM210 192c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-40c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2Z"),
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
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
