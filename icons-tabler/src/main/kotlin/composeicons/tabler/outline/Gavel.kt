package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = tablerOutlineIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 10.0f),
                    PathNode.LineTo(20.383f, 17.418f),
                    PathNode.CurveTo(21.206f, 18.238f, 21.206f, 19.566f, 20.383f, 20.385f),
                    PathNode.CurveTo(19.559916f, 21.203693f, 18.230083f, 21.203693f, 17.407f, 20.385f),
                    PathNode.LineTo(10.0f, 13.0f)
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
                    PathNode.MoveTo(6.0f, 9.0f),
                    PathNode.LineTo(10.0f, 13.0f)
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
                    PathNode.MoveTo(13.0f, 10.0f),
                    PathNode.LineTo(9.0f, 6.0f)
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
                    PathNode.MoveTo(3.0f, 21.0f),
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
                    PathNode.MoveTo(6.793f, 15.793f),
                    PathNode.LineTo(3.207f, 12.207f),
                    PathNode.CurveTo(2.816618f, 11.8165f, 2.816618f, 11.1835f, 3.207f, 10.793f),
                    PathNode.LineTo(5.5f, 8.5f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.LineTo(9.0f, 6.0f),
                    PathNode.LineTo(8.5f, 5.5f),
                    PathNode.LineTo(10.793f, 3.207f),
                    PathNode.CurveTo(11.1835f, 2.816618f, 11.8165f, 2.816618f, 12.207f, 3.207f),
                    PathNode.LineTo(15.793f, 6.793f),
                    PathNode.CurveTo(16.183382f, 7.1835f, 16.183382f, 7.8165f, 15.793f, 8.207f),
                    PathNode.LineTo(13.5f, 10.5f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(10.5f, 13.5f),
                    PathNode.LineTo(8.207f, 15.793f),
                    PathNode.CurveTo(7.8165f, 16.183382f, 7.1835f, 16.183382f, 6.793f, 15.793f)
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
        return _gavel!!
    }

private var _gavel: ImageVector? = null
