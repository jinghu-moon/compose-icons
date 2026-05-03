package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathSec: ImageVector
    get() {
        if (_mathSec != null) return _mathSec!!
        _mathSec = tablerOutlineIcon(
            name = "MathSec",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 15.0f),
                    PathNode.CurveTo(3.345f, 15.6f, 4.258f, 16.0f, 5.0f, 16.0f),
                    PathNode.CurveTo(6.10457f, 16.0f, 7.0f, 15.104569f, 7.0f, 14.0f),
                    PathNode.CurveTo(7.0f, 12.895431f, 6.10457f, 12.0f, 5.0f, 12.0f),
                    PathNode.CurveTo(3.895431f, 12.0f, 3.0f, 11.104569f, 3.0f, 10.0f),
                    PathNode.CurveTo(3.0f, 8.895431f, 3.895431f, 8.0f, 5.0f, 8.0f),
                    PathNode.CurveTo(5.746f, 8.0f, 6.656f, 8.394f, 7.0f, 9.0f)
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
                    PathNode.MoveTo(21.0f, 10.0f),
                    PathNode.CurveTo(21.0f, 8.895431f, 20.10457f, 8.0f, 19.0f, 8.0f),
                    PathNode.CurveTo(17.89543f, 8.0f, 17.0f, 8.895431f, 17.0f, 10.0f),
                    PathNode.LineTo(17.0f, 14.0f),
                    PathNode.CurveTo(17.0f, 15.104569f, 17.89543f, 16.0f, 19.0f, 16.0f),
                    PathNode.CurveTo(20.10457f, 16.0f, 21.0f, 15.104569f, 21.0f, 14.0f)
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
                    PathNode.MoveTo(14.0f, 8.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.LineTo(10.0f, 16.0f),
                    PathNode.LineTo(14.0f, 16.0f)
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
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.LineTo(12.5f, 12.0f)
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
        }
        return _mathSec!!
    }

private var _mathSec: ImageVector? = null
