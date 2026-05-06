package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = phosphorBoldIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 100h-11L190.83 65.86C187.089 62.096 181.997 59.986 176.69 60h-32.69v-16h20c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-64C93.373 20 88 25.373 88 32c0 6.627 5.373 12 12 12h20v16h-56C52.954 60 44 68.954 44 80v48h-16v-20C28 101.373 22.627 96 16 96 9.373 96 4 101.373 4 108v64c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20h16v16.69c-.014 5.307 2.096 10.399 5.86 14.14l39.31 39.31c3.741 3.764 8.833 5.874 14.14 5.86h73.38c5.307 .014 10.399-2.096 14.14-5.86L225 188h11c11.046 0 20-8.954 20-20v-48c0-11.046-8.954-20-20-20ZM232 164h-12c-3.184-.003-6.238 1.26-8.49 3.51L175 204h-70L68 167v-83h107l36.48 36.49c2.26 2.257 5.326 3.52 8.52 3.51h12Z"),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
