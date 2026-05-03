package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CakeRoll: ImageVector
    get() {
        if (_cakeRoll != null) return _cakeRoll!!
        _cakeRoll = tablerOutlineIcon(
            name = "CakeRoll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.CurveTo(7.03f, 15.0f, 3.0f, 12.538f, 3.0f, 9.5f),
                    PathNode.CurveTo(3.0f, 6.462f, 7.03f, 4.0f, 12.0f, 4.0f),
                    PathNode.CurveTo(16.97f, 4.0f, 21.0f, 6.462f, 21.0f, 9.5f),
                    PathNode.CurveTo(21.0f, 12.538f, 16.97f, 15.0f, 12.0f, 15.0f)
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
                    PathNode.MoveTo(12.0f, 6.97f),
                    PathNode.CurveTo(15.0f, 6.97f, 16.0f, 8.006f, 16.0f, 8.949f),
                    PathNode.CurveTo(16.0f, 11.754f, 8.0f, 11.918f, 8.0f, 7.959f),
                    PathNode.CurveTo(8.0f, 5.849f, 9.5f, 4.0f, 12.0f, 4.0f)
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
                    PathNode.MoveTo(21.0f, 9.333f),
                    PathNode.LineTo(21.0f, 14.667f),
                    PathNode.CurveTo(21.0f, 17.612f, 16.97f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(7.03f, 20.0f, 3.0f, 17.612f, 3.0f, 14.667f),
                    PathNode.LineTo(3.0f, 9.333f)
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
        return _cakeRoll!!
    }

private var _cakeRoll: ImageVector? = null
