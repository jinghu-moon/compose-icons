package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Note: ImageVector
    get() {
        if (_note != null) return _note!!
        _note = phosphorLightIcon(
            name = "Note",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M90 96c0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6ZM96 134h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM128 154h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM222 48v108.69c.007 3.714-1.469 7.278-4.1 9.9l-51.31 51.31c-2.622 2.631-6.186 4.107-9.9 4.1h-108.69c-7.732 0-14-6.268-14-14v-160C34 40.268 40.268 34 48 34h160c7.732 0 14 6.268 14 14ZM48 210h106v-50c0-3.314 2.686-6 6-6h50v-106c0-1.105-.895-2-2-2h-160c-1.105 0-2 .895-2 2v160c0 1.105 .895 2 2 2ZM201.52 166h-35.52v35.52Z"),
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
        return _note!!
    }

private var _note: ImageVector? = null
