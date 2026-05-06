package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Export: ImageVector
    get() {
        if (_export != null) return _export!!
        _export = phosphorLightIcon(
            name = "Export",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 112v96c0 7.732-6.268 14-14 14h-144c-7.732 0-14-6.268-14-14v-96c0-7.732 6.268-14 14-14h24c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-24c-1.105 0-2 .895-2 2v96c0 1.105 .895 2 2 2h144c1.105 0 2-.895 2-2v-96c0-1.105-.895-2-2-2h-24c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h24c7.732 0 14 6.268 14 14ZM92.24 68.24 122 38.49v97.51c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-97.51l29.76 29.75c1.496 1.605 3.748 2.266 5.874 1.723 2.126-.543 3.786-2.203 4.329-4.329 .543-2.126-.118-4.379-1.723-5.874l-40-40c-2.343-2.34-6.137-2.34-8.48 0l-40 40c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723Z"),
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
        return _export!!
    }

private var _export: ImageVector? = null
