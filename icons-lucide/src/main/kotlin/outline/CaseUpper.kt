package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CaseUpper: ImageVector
    get() {
        if (_caseUpper != null) return _caseUpper!!
        _caseUpper = lucideOutlineIcon(
            name = "CaseUpper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 11.000 L 19.500 11.000 C 20.881 11.000 22.000 12.119 22.000 13.500 C 22.000 14.881 20.881 16.000 19.500 16.000 L 15.500 16.000 C 15.224 16.000 15.000 15.776 15.000 15.500 L 15.000 6.500 C 15.000 6.224 15.224 6.000 15.500 6.000 L 18.500 6.000 C 19.881 6.000 21.000 7.119 21.000 8.500 C 21.000 9.881 19.881 11.000 18.500 11.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 2.000 16.000 L 6.039 6.310 C 6.117 6.124 6.299 6.002 6.501 6.002 C 6.702 6.002 6.884 6.124 6.962 6.310 L 11.000 16.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.304 13.000 L 9.696 13.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _caseUpper!!
    }

private var _caseUpper: ImageVector? = null
