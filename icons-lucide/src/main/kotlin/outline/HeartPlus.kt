package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartPlus: ImageVector
    get() {
        if (_heartPlus != null) return _heartPlus!!
        _heartPlus = lucideOutlineIcon(
            name = "HeartPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.479 19.374 L 13.508 20.313 C 13.131 20.746 12.586 20.996 12.012 21.000 C 11.438 21.003 10.890 20.760 10.508 20.332 L 5.000 15.000 C 3.500 13.500 2.000 11.800 2.000 9.500 C 2.000 7.222 3.404 5.180 5.532 4.364 C 7.659 3.549 10.068 4.130 11.591 5.824 C 11.697 5.937 11.845 6.001 12.000 6.001 C 12.155 6.001 12.303 5.937 12.409 5.824 C 13.927 4.118 16.343 3.530 18.475 4.347 C 20.607 5.165 22.011 7.217 22.000 9.500 C 22.000 10.005 21.926 10.507 21.781 10.990"),
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
        pathData = parseSvgPathData("M 15.000 15.000 L 21.000 15.000"),
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
        pathData = parseSvgPathData("M 18.000 12.000 L 18.000 18.000"),
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
        return _heartPlus!!
    }

private var _heartPlus: ImageVector? = null
