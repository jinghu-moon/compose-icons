package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Numbers: ImageVector
    get() {
        if (_numbers != null) return _numbers!!
        _numbers = tablerOutlineIcon(
            name = "Numbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 10.0f),
                    PathNode.LineTo(8.0f, 3.0f),
                    PathNode.LineTo(6.0f, 5.0f)
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
                    PathNode.MoveTo(6.0f, 16.0f),
                    PathNode.CurveTo(6.0f, 14.895431f, 6.895431f, 14.0f, 8.0f, 14.0f),
                    PathNode.CurveTo(9.104569f, 14.0f, 10.0f, 14.895431f, 10.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 16.591f, 9.399f, 17.46f, 9.0f, 18.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.LineTo(10.0f, 21.0f)
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
                    PathNode.MoveTo(15.0f, 14.0f),
                    PathNode.CurveTo(15.0f, 15.104569f, 15.895431f, 16.0f, 17.0f, 16.0f),
                    PathNode.CurveTo(18.10457f, 16.0f, 19.0f, 15.104569f, 19.0f, 14.0f),
                    PathNode.CurveTo(19.0f, 12.895431f, 18.10457f, 12.0f, 17.0f, 12.0f),
                    PathNode.CurveTo(18.10457f, 12.0f, 19.0f, 11.104569f, 19.0f, 10.0f),
                    PathNode.CurveTo(19.0f, 8.895431f, 18.10457f, 8.0f, 17.0f, 8.0f),
                    PathNode.CurveTo(15.895431f, 8.0f, 15.0f, 8.895431f, 15.0f, 10.0f)
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
                    PathNode.MoveTo(6.5f, 10.0f),
                    PathNode.LineTo(9.5f, 10.0f)
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
        return _numbers!!
    }

private var _numbers: ImageVector? = null
