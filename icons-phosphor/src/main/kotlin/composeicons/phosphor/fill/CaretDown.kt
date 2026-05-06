package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretDown: ImageVector
    get() {
        if (_caretDown != null) return _caretDown!!
        _caretDown = phosphorFillIcon(
            name = "CaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 101.66l-80 80c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-80-80C40.049 99.372 39.364 95.929 40.603 92.938 41.842 89.947 44.762 87.997 48 88h160c3.238-.003 6.158 1.947 7.397 4.938 1.239 2.991 .554 6.434-1.737 8.722Z"),
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
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
