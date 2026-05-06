package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NoteBlank: ImageVector
    get() {
        if (_noteBlank != null) return _noteBlank!!
        _noteBlank = phosphorLightIcon(
            name = "NoteBlank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h108.69c3.714 .007 7.278-1.469 9.9-4.1l51.31-51.31c2.631-2.622 4.107-6.186 4.1-9.9v-108.69c0-7.732-6.268-14-14-14ZM46 208v-160c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2v106h-50c-3.314 0-6 2.686-6 6v50h-106c-1.105 0-2-.895-2-2ZM166 201.51v-35.51h35.52Z"),
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
        return _noteBlank!!
    }

private var _noteBlank: ImageVector? = null
