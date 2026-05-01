package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabaseSearch: ImageVector
    get() {
        if (_databaseSearch != null) return _databaseSearch!!
        _databaseSearch = tablerOutlineIcon(
            name = "DatabaseSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 7.657f, 7.582f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(16.418f, 9.0f, 20.0f, 7.657f, 20.0f, 6.0f),
                    PathNode.CurveTo(20.0f, 4.343f, 16.418f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.582f, 3.0f, 4.0f, 4.343f, 4.0f, 6.0f)
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
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 13.657f, 7.582f, 15.0f, 12.0f, 15.0f),
                    PathNode.MoveTo(20.0f, 11.5f),
                    PathNode.LineTo(20.0f, 6.0f)
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
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(4.0f, 19.657f, 7.582f, 21.0f, 12.0f, 21.0f)
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
                    PathNode.MoveTo(15.0f, 18.0f),
                    PathNode.CurveTo(15.0f, 19.656855f, 16.343145f, 21.0f, 18.0f, 21.0f),
                    PathNode.CurveTo(19.656855f, 21.0f, 21.0f, 19.656855f, 21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 16.343145f, 19.656855f, 15.0f, 18.0f, 15.0f),
                    PathNode.CurveTo(16.343145f, 15.0f, 15.0f, 16.343145f, 15.0f, 18.0f)
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
                    PathNode.MoveTo(20.2f, 20.2f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _databaseSearch!!
    }

private var _databaseSearch: ImageVector? = null
