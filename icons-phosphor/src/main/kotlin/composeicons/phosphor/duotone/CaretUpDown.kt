package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorDuotoneIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 176h96l-48 48ZM128 32 80 80h96Z"),
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
                pathData = parseSvgPathData("M176 168h-96c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722l48 48c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l48-48c2.291-2.288 2.976-5.731 1.737-8.722C182.158 169.947 179.238 167.997 176 168ZM128 212.69 99.31 184h57.38ZM80 88h96c3.238 .003 6.158-1.947 7.397-4.938 1.239-2.991 .554-6.434-1.737-8.722l-48-48C132.159 24.838 130.123 23.994 128 23.994c-2.123 0-4.159 .844-5.66 2.346l-48 48c-2.291 2.288-2.976 5.731-1.737 8.722C73.842 86.053 76.762 88.003 80 88ZM128 43.31 156.69 72h-57.38Z"),
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
