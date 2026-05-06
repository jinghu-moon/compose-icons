package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pipe: ImageVector
    get() {
        if (_pipe != null) return _pipe!!
        _pipe = phosphorLightIcon(
            name = "Pipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 106h-26v-52h26c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-27.37C202.315 37.12 197.401 34.007 192 34h-16c-5.401 .007-10.315 3.12-12.63 8h-19.37C87.694 42.066 42.066 87.694 42 144v19.37c-4.88 2.315-7.993 7.229-8 12.63v16c.007 5.401 3.12 10.315 8 12.63v27.37c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-26h52v26c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-27.37c4.88-2.315 7.993-7.229 8-12.63v-16c-.007-5.401-3.12-10.315-8-12.63v-19.37c0-14.359 11.641-26 26-26h19.37c2.315 4.88 7.229 7.993 12.63 8h16c5.401-.007 10.315-3.12 12.63-8h27.37c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM112 174c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-64c-1.105 0-2-.895-2-2v-16c0-1.105 .895-2 2-2ZM106 144v18h-52v-18C54.055 94.317 94.317 54.055 144 54h18v52h-18c-20.987 0-38 17.013-38 38ZM192 114h-16c-1.105 0-2-.895-2-2v-64c0-1.105 .895-2 2-2h16c1.105 0 2 .895 2 2v64c0 1.105-.895 2-2 2Z"),
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
        return _pipe!!
    }

private var _pipe: ImageVector? = null
