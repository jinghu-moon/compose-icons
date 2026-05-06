package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorDuotoneIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 192h-208c-3.443 0-6.501-2.203-7.589-5.47-1.089-3.267 .035-6.864 2.789-8.93L128 96l108.79 81.6c2.753 2.065 3.877 5.659 2.791 8.925-1.086 3.266-4.139 5.471-7.581 5.475Z"),
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
                pathData = parseSvgPathData("M241.57 171.2 141.33 96 164.79 78.4C166.808 76.891 167.998 74.52 168 72 168 49.909 150.091 32 128 32 105.909 32 88 49.909 88 72c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 .034-12.495 9.648-22.873 22.104-23.861 12.456-.987 23.585 7.747 25.586 20.081L123.34 89.49l-.28 .22L14.43 171.2c-5.505 4.129-7.754 11.315-5.584 17.845C11.016 195.576 17.119 199.987 24 200h208c6.887 0 13.001-4.407 15.179-10.94 2.178-6.533-.069-13.728-5.579-17.86ZM232 184h-208L128 106l104 78Z"),
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
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
