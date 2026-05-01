package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ghost2: ImageVector
    get() {
        if (_ghost2 != null) return _ghost2!!
        _ghost2 = tablerOutlineIcon(
            name = "Ghost2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 9.0f),
                    PathNode.LineTo(10.01f, 9.0f)
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
                    PathNode.MoveTo(14.0f, 9.0f),
                    PathNode.LineTo(14.01f, 9.0f)
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
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(15.865993f, 3.0f, 19.0f, 6.134007f, 19.0f, 10.0f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.LineTo(20.0f, 11.0f),
                    PathNode.CurveTo(21.10457f, 11.0f, 22.0f, 11.895431f, 22.0f, 13.0f),
                    PathNode.CurveTo(22.0f, 14.104569f, 21.10457f, 15.0f, 20.0f, 15.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.LineTo(21.0f, 21.0f),
                    PathNode.LineTo(11.0f, 21.0f),
                    PathNode.CurveTo(7.772208f, 21.00227f, 5.121042f, 18.450523f, 5.0f, 15.225f),
                    PathNode.LineTo(5.0f, 14.999f),
                    PathNode.LineTo(4.0f, 14.999f),
                    PathNode.CurveTo(2.895431f, 14.999f, 2.0f, 14.103569f, 2.0f, 12.999f),
                    PathNode.CurveTo(2.0f, 11.89443f, 2.895431f, 10.999f, 4.0f, 10.999f),
                    PathNode.LineTo(5.0f, 10.999f),
                    PathNode.LineTo(5.0f, 9.999f),
                    PathNode.CurveTo(5.0f, 6.133007f, 8.134007f, 2.999f, 12.0f, 2.999f),
                    PathNode.LineTo(12.0f, 3.0f)
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
                    PathNode.MoveTo(11.0f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.CurveTo(13.0f, 13.447715f, 12.552285f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(11.447715f, 13.0f, 11.0f, 13.447715f, 11.0f, 14.0f)
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
        return _ghost2!!
    }

private var _ghost2: ImageVector? = null
