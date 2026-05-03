package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dice3: ImageVector
    get() {
        if (_dice3 != null) return _dice3!!
        _dice3 = tablerOutlineIcon(
            name = "Dice3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.895431f, 3.895431f, 3.0f, 5.0f, 3.0f),
                    PathNode.LineTo(19.0f, 3.0f),
                    PathNode.CurveTo(20.10457f, 3.0f, 21.0f, 3.895431f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.10457f, 20.10457f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.895431f, 21.0f, 3.0f, 20.10457f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 5.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 8.5f),
                    PathNode.CurveTo(8.0f, 8.776142f, 8.223858f, 9.0f, 8.5f, 9.0f),
                    PathNode.CurveTo(8.776142f, 9.0f, 9.0f, 8.776142f, 9.0f, 8.5f),
                    PathNode.CurveTo(9.0f, 8.223858f, 8.776142f, 8.0f, 8.5f, 8.0f),
                    PathNode.CurveTo(8.223858f, 8.0f, 8.0f, 8.223858f, 8.0f, 8.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 15.5f),
                    PathNode.CurveTo(15.0f, 15.776142f, 15.223858f, 16.0f, 15.5f, 16.0f),
                    PathNode.CurveTo(15.776142f, 16.0f, 16.0f, 15.776142f, 16.0f, 15.5f),
                    PathNode.CurveTo(16.0f, 15.223858f, 15.776142f, 15.0f, 15.5f, 15.0f),
                    PathNode.CurveTo(15.223858f, 15.0f, 15.0f, 15.223858f, 15.0f, 15.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.5f, 12.0f),
                    PathNode.CurveTo(11.5f, 12.276142f, 11.723858f, 12.5f, 12.0f, 12.5f),
                    PathNode.CurveTo(12.276142f, 12.5f, 12.5f, 12.276142f, 12.5f, 12.0f),
                    PathNode.CurveTo(12.5f, 11.723858f, 12.276142f, 11.5f, 12.0f, 11.5f),
                    PathNode.CurveTo(11.723858f, 11.5f, 11.5f, 11.723858f, 11.5f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _dice3!!
    }

private var _dice3: ImageVector? = null
