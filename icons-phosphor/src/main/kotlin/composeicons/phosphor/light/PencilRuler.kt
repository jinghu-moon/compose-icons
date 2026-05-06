package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorLightIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-48c-7.732 0-14 6.268-14 14v160c0 7.732 6.268 14 14 14h48c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-48c-1.105 0-2-.895-2-2v-34h26c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-26v-28h26c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-26v-28h26c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-26v-34c0-1.105 .895-2 2-2h48c1.105 0 2 .895 2 2ZM76.24 27.76c-2.343-2.34-6.137-2.34-8.48 0L35.76 59.76C34.634 60.884 34.001 62.409 34 64v144c0 7.732 6.268 14 14 14h48c7.732 0 14-6.268 14-14v-144c-.001-1.591-.634-3.116-1.76-4.24ZM46 178v-100h20v100ZM78 78h20v100h-20ZM72 40.49 97.51 66h-51ZM96 210h-48c-1.105 0-2-.895-2-2v-18h52v18c0 1.105-.895 2-2 2Z"),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
