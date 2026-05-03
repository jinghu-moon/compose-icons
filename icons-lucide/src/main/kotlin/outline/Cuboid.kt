package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cuboid: ImageVector
    get() {
        if (_cuboid != null) return _cuboid!!
        _cuboid = lucideOutlineIcon(
            name = "Cuboid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 22.000 L 10.000 14.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 2.336 8.890 L 10.000 14.000 L 21.715 6.971"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 22.000 14.000 C 22.000 14.703 21.631 15.354 21.029 15.715 L 11.029 21.715 C 10.367 22.113 9.534 22.093 8.891 21.665 L 2.891 17.665 C 2.334 17.294 2.000 16.669 2.000 16.000 L 2.000 10.000 C 2.000 9.297 2.369 8.646 2.971 8.285 L 12.971 2.285 C 13.633 1.887 14.466 1.907 15.109 2.335 L 21.109 6.335 C 21.666 6.706 22.000 7.331 22.000 8.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _cuboid!!
    }

private var _cuboid: ImageVector? = null
