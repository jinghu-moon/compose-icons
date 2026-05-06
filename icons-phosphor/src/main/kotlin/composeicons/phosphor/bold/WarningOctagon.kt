package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorBoldIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 132v-52c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v52c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM236 91.55v72.9c.014 5.307-2.096 10.399-5.86 14.14l-51.55 51.55c-3.74 3.765-8.833 5.875-14.14 5.86h-72.9c-5.307 .015-10.4-2.095-14.14-5.86L25.86 178.59C22.096 174.849 19.986 169.757 20 164.45v-72.9c-.014-5.307 2.096-10.399 5.86-14.14L77.41 25.86C81.15 22.095 86.243 19.985 91.55 20h72.9c5.307-.015 10.4 2.095 14.14 5.86l51.55 51.55c3.764 3.741 5.874 8.833 5.86 14.14ZM212 93.21 162.79 44h-69.58L44 93.21v69.58L93.21 212h69.58L212 162.79ZM128 156c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16Z"),
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
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
