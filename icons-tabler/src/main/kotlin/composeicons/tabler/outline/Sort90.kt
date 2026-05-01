package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sort90: ImageVector
    get() {
        if (_sort90 != null) return _sort90!!
        _sort90 = tablerOutlineIcon(
            name = "Sort90",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 15.0f),
                    PathNode.CurveTo(4.0f, 15.552285f, 4.447716f, 16.0f, 5.0f, 16.0f),
                    PathNode.LineTo(7.0f, 16.0f),
                    PathNode.CurveTo(7.552285f, 16.0f, 8.0f, 15.552285f, 8.0f, 15.0f),
                    PathNode.LineTo(8.0f, 9.0f),
                    PathNode.CurveTo(8.0f, 8.447715f, 7.552285f, 8.0f, 7.0f, 8.0f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.CurveTo(4.447716f, 8.0f, 4.0f, 8.447715f, 4.0f, 9.0f),
                    PathNode.LineTo(4.0f, 11.0f),
                    PathNode.CurveTo(4.0f, 11.552285f, 4.447716f, 12.0f, 5.0f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f)
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
                    PathNode.MoveTo(16.0f, 10.0f),
                    PathNode.LineTo(16.0f, 14.0f),
                    PathNode.CurveTo(16.0f, 15.104569f, 16.89543f, 16.0f, 18.0f, 16.0f),
                    PathNode.CurveTo(19.10457f, 16.0f, 20.0f, 15.104569f, 20.0f, 14.0f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.CurveTo(20.0f, 8.895431f, 19.10457f, 8.0f, 18.0f, 8.0f),
                    PathNode.CurveTo(16.89543f, 8.0f, 16.0f, 8.895431f, 16.0f, 10.0f)
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
                    PathNode.MoveTo(11.0f, 12.0f),
                    PathNode.LineTo(13.0f, 12.0f)
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
        return _sort90!!
    }

private var _sort90: ImageVector? = null
