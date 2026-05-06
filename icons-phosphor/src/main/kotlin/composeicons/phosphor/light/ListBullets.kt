package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorLightIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M82 64c0-3.314 2.686-6 6-6h128c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-128c-3.314 0-6-2.686-6-6ZM216 122h-128c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h128c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM216 186h-128c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h128c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM44 54C38.477 54 34 58.477 34 64c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10C54 58.477 49.523 54 44 54ZM44 182c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM44 118c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10Z"),
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
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null
