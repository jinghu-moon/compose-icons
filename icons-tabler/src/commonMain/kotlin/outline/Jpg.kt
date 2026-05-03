package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Jpg: ImageVector
    get() {
        if (_jpg != null) return _jpg!!
        _jpg = tablerOutlineIcon(
            name = "Jpg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 8.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.CurveTo(17.89543f, 8.0f, 17.0f, 8.895431f, 17.0f, 10.0f),
                    PathNode.LineTo(17.0f, 14.0f),
                    PathNode.CurveTo(17.0f, 15.104569f, 17.89543f, 16.0f, 19.0f, 16.0f),
                    PathNode.LineTo(21.0f, 16.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(20.0f, 12.0f)
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
                    PathNode.MoveTo(10.0f, 16.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.CurveTo(13.104569f, 8.0f, 14.0f, 8.895431f, 14.0f, 10.0f),
                    PathNode.CurveTo(14.0f, 11.104569f, 13.104569f, 12.0f, 12.0f, 12.0f),
                    PathNode.LineTo(10.0f, 12.0f)
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
                    PathNode.MoveTo(3.0f, 8.0f),
                    PathNode.LineTo(7.0f, 8.0f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.CurveTo(7.0f, 15.104569f, 6.10457f, 16.0f, 5.0f, 16.0f),
                    PathNode.LineTo(3.5f, 16.0f),
                    PathNode.CurveTo(3.223858f, 16.0f, 3.0f, 15.776142f, 3.0f, 15.5f),
                    PathNode.LineTo(3.0f, 15.0f)
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
        return _jpg!!
    }

private var _jpg: ImageVector? = null
