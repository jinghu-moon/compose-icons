package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = phosphorThinIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M199.05 57.48C170.482 28.734 127.396 20.057 89.928 35.504 52.46 50.951 28.008 87.472 28 128v56c0 11.046 8.954 20 20 20h16c11.046 0 20-8.954 20-20v-40C84 132.954 75.046 124 64 124h-27.92C38.222 74.789 78.743 35.996 128 36h.7c49.038 .242 89.216 39.003 91.22 88h-27.92c-11.046 0-20 8.954-20 20v40c0 11.046 8.954 20 20 20h16c11.046 0 20-8.954 20-20v-56c.102-26.419-10.314-51.793-28.95-70.52ZM64 132c6.627 0 12 5.373 12 12v40c0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12v-52ZM220 184c0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12v-40c0-6.627 5.373-12 12-12h28Z"),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
