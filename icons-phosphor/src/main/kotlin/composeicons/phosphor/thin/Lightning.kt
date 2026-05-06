package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorThinIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.89 119.09c-.303-1.304-1.237-2.369-2.49-2.84L148.59 93.45 163.92 16.78c.344-1.75-.512-3.516-2.099-4.33-1.586-.814-3.52-.48-4.741 .82l-112 120c-.921 .97-1.296 2.336-1 3.64 .303 1.304 1.237 2.369 2.49 2.84l60.81 22.8L92.08 239.22c-.344 1.75 .512 3.516 2.099 4.33 1.586 .814 3.52 .48 4.741-.82l112-120c.91-.976 1.274-2.341 .97-3.64ZM102.68 227l13.24-66.2c.384-1.924-.683-3.842-2.52-4.53L55 134.36 153.32 29 140.08 95.2c-.384 1.924 .683 3.842 2.52 4.53L201 121.64Z"),
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
        return _lightning!!
    }

private var _lightning: ImageVector? = null
