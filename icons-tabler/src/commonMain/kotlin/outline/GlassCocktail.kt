package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GlassCocktail: ImageVector
    get() {
        if (_glassCocktail != null) return _glassCocktail!!
        _glassCocktail = tablerOutlineIcon(
            name = "GlassCocktail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 21.0f),
                    PathNode.LineTo(16.0f, 21.0f)
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
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
                    PathNode.MoveTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 6.10457f, 8.134007f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(15.865993f, 7.0f, 19.0f, 6.10457f, 19.0f, 5.0f),
                    PathNode.CurveTo(19.0f, 3.895431f, 15.865993f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(8.134007f, 3.0f, 5.0f, 3.895431f, 5.0f, 5.0f)
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
                    PathNode.MoveTo(5.0f, 5.0f),
                    PathNode.LineTo(5.0f, 5.388f),
                    PathNode.CurveTo(5.0f, 5.82f, 5.126f, 6.241f, 5.362f, 6.594f),
                    PathNode.LineTo(10.362f, 14.103f),
                    PathNode.CurveTo(10.995f, 15.054f, 12.242f, 15.286f, 13.147f, 14.62f),
                    PathNode.CurveTo(13.338f, 14.479f, 13.505f, 14.304f, 13.638f, 14.103f),
                    PathNode.LineTo(18.638f, 6.594f),
                    PathNode.CurveTo(18.874f, 6.241f, 19.0f, 5.82f, 19.0f, 5.388f),
                    PathNode.LineTo(19.0f, 5.0f)
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
        return _glassCocktail!!
    }

private var _glassCocktail: ImageVector? = null
