package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Replace: ImageVector
    get() {
        if (_replace != null) return _replace!!
        _replace = tablerOutlineIcon(
            name = "Replace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 4.0f),
                    PathNode.CurveTo(3.0f, 3.447715f, 3.447715f, 3.0f, 4.0f, 3.0f),
                    PathNode.LineTo(8.0f, 3.0f),
                    PathNode.CurveTo(8.552285f, 3.0f, 9.0f, 3.447715f, 9.0f, 4.0f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.CurveTo(9.0f, 8.552285f, 8.552285f, 9.0f, 8.0f, 9.0f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.CurveTo(3.447715f, 9.0f, 3.0f, 8.552285f, 3.0f, 8.0f),
                    PathNode.LineTo(3.0f, 4.0f)
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
                    PathNode.MoveTo(15.0f, 16.0f),
                    PathNode.CurveTo(15.0f, 15.447715f, 15.447715f, 15.0f, 16.0f, 15.0f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.CurveTo(20.552284f, 15.0f, 21.0f, 15.447715f, 21.0f, 16.0f),
                    PathNode.LineTo(21.0f, 20.0f),
                    PathNode.CurveTo(21.0f, 20.552284f, 20.552284f, 21.0f, 20.0f, 21.0f),
                    PathNode.LineTo(16.0f, 21.0f),
                    PathNode.CurveTo(15.447715f, 21.0f, 15.0f, 20.552284f, 15.0f, 20.0f),
                    PathNode.LineTo(15.0f, 16.0f)
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
                    PathNode.MoveTo(21.0f, 11.0f),
                    PathNode.LineTo(21.0f, 8.0f),
                    PathNode.CurveTo(21.0f, 6.895431f, 20.10457f, 6.0f, 19.0f, 6.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.LineTo(16.0f, 9.0f),
                    PathNode.MoveTo(16.0f, 3.0f),
                    PathNode.LineTo(13.0f, 6.0f)
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
                    PathNode.MoveTo(3.0f, 13.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 17.10457f, 3.895431f, 18.0f, 5.0f, 18.0f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.LineTo(8.0f, 15.0f),
                    PathNode.MoveTo(8.0f, 21.0f),
                    PathNode.LineTo(11.0f, 18.0f)
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
        return _replace!!
    }

private var _replace: ImageVector? = null
