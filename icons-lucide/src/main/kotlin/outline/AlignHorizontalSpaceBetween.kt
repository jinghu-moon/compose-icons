package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignHorizontalSpaceBetween: ImageVector
    get() {
        if (_alignHorizontalSpaceBetween != null) return _alignHorizontalSpaceBetween!!
        _alignHorizontalSpaceBetween = lucideOutlineIcon(
            name = "AlignHorizontalSpaceBetween",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 5.000 L 7.000 5.000 C 8.105 5.000 9.000 5.895 9.000 7.000 L 9.000 17.000 C 9.000 18.105 8.105 19.000 7.000 19.000 L 5.000 19.000 C 3.895 19.000 3.000 18.105 3.000 17.000 L 3.000 7.000 C 3.000 5.895 3.895 5.000 5.000 5.000 Z"),
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
        pathData = parseSvgPathData("M 17.000 7.000 L 19.000 7.000 C 20.105 7.000 21.000 7.895 21.000 9.000 L 21.000 15.000 C 21.000 16.105 20.105 17.000 19.000 17.000 L 17.000 17.000 C 15.895 17.000 15.000 16.105 15.000 15.000 L 15.000 9.000 C 15.000 7.895 15.895 7.000 17.000 7.000 Z"),
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
        pathData = parseSvgPathData("M 3.000 2.000 L 3.000 22.000"),
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
        pathData = parseSvgPathData("M 21.000 2.000 L 21.000 22.000"),
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
        return _alignHorizontalSpaceBetween!!
    }

private var _alignHorizontalSpaceBetween: ImageVector? = null
