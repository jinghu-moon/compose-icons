package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BracketsSquare: ImageVector
    get() {
        if (_bracketsSquare != null) return _bracketsSquare!!
        _bracketsSquare = phosphorLightIcon(
            name = "BracketsSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M46 46v164h34c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-40c-3.314 0-6-2.686-6-6v-176c0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM216 34h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h34v164h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6v-176c0-3.314-2.686-6-6-6Z"),
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
        return _bracketsSquare!!
    }

private var _bracketsSquare: ImageVector? = null
