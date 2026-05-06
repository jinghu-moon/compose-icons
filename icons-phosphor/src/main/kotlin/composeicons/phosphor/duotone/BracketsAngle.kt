package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorDuotoneIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 128l-56 88h-96L24 128 80 40h96Z"),
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
                pathData = parseSvgPathData("M86.75 44.3 33.48 128l53.27 83.7c1.14 1.791 1.522 3.962 1.06 6.035-.461 2.073-1.728 3.877-3.52 5.015-1.28 .82-2.77 1.254-4.29 1.25-2.74 .003-5.291-1.397-6.76-3.71l-56-88c-1.668-2.621-1.668-5.969 0-8.59L73.24 35.7c2.372-3.728 7.317-4.827 11.045-2.455 3.728 2.372 4.827 7.317 2.455 11.045ZM238.75 123.71l-56-88c-2.372-3.728-7.317-4.827-11.045-2.455-3.728 2.372-4.827 7.317-2.455 11.045L222.52 128l-53.27 83.7c-1.14 1.791-1.522 3.962-1.06 6.035 .461 2.073 1.728 3.877 3.52 5.015 1.28 .82 2.77 1.254 4.29 1.25 2.74 .003 5.291-1.397 6.76-3.71l56-88c1.66-2.62 1.656-5.964-.01-8.58Z"),
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
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
