package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorDuotoneIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.61 102.83l-32 107.62c-1.063 3.305-4.138 5.548-7.61 5.55h-112c-3.476 .002-6.555-2.241-7.62-5.55L32.38 102.83c-1.055-3.277 .105-6.862 2.88-8.9L123.26 25.55c2.816-2.064 6.644-2.064 9.46 0l88 68.38c2.779 2.035 3.943 5.621 2.89 8.9Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M225.56 87.56 137.64 19.25l-.18-.14c-5.624-4.151-13.296-4.151-18.92 0l-.18 .14L30.44 87.56c-5.456 4.067-7.742 11.139-5.7 17.63L56.74 212.73l.06 .17C58.908 219.516 65.057 224.005 72 224h112c6.955 .019 13.118-4.474 15.23-11.1l.06-.17 32-107.54c2.036-6.497-.263-13.571-5.73-17.63ZM215.94 100.56 184 208h-112L40 100.56l-.06-.17h0l.18-.14L128 32l87.82 68.23 .18 .14Z"),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
