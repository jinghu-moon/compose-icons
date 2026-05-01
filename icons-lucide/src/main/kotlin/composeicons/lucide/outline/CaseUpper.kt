package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CaseUpper: ImageVector
    get() {
        if (_caseUpper != null) return _caseUpper!!
        _caseUpper = lucideOutlineIcon(
            name = "CaseUpper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(19.5f, 11.0f),
                    PathNode.CurveTo(20.880713f, 11.0f, 22.0f, 12.119288f, 22.0f, 13.5f),
                    PathNode.CurveTo(22.0f, 14.880712f, 20.880713f, 16.0f, 19.5f, 16.0f),
                    PathNode.LineTo(15.5f, 16.0f),
                    PathNode.CurveTo(15.223858f, 16.0f, 15.0f, 15.776142f, 15.0f, 15.5f),
                    PathNode.LineTo(15.0f, 6.5f),
                    PathNode.CurveTo(15.0f, 6.223858f, 15.223858f, 6.0f, 15.5f, 6.0f),
                    PathNode.LineTo(18.5f, 6.0f),
                    PathNode.CurveTo(19.880713f, 6.0f, 21.0f, 7.119288f, 21.0f, 8.5f),
                    PathNode.CurveTo(21.0f, 9.880712f, 19.880713f, 11.0f, 18.5f, 11.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 16.0f),
                    PathNode.LineTo(6.039f, 6.31f),
                    PathNode.CurveTo(6.116658f, 6.123726f, 6.298686f, 6.0024f, 6.5005f, 6.0024f),
                    PathNode.CurveTo(6.702314f, 6.0024f, 6.884342f, 6.123726f, 6.962f, 6.31f),
                    PathNode.LineTo(11.0f, 16.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.304f, 13.0f),
                    PathNode.LineTo(9.696f, 13.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _caseUpper!!
    }

private var _caseUpper: ImageVector? = null
