package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListDashes: ImageVector
    get() {
        if (_listDashes != null) return _listDashes!!
        _listDashes = phosphorLightIcon(
            name = "ListDashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M90 64c0-3.314 2.686-6 6-6h120c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-120c-3.314 0-6-2.686-6-6ZM216 122h-120c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h120c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM216 186h-120c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h120c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM56 58h-16c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM56 122h-16c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM56 186h-16c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _listDashes!!
    }

private var _listDashes: ImageVector? = null
