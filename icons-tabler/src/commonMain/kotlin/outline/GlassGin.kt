package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GlassGin: ImageVector
    get() {
        if (_glassGin != null) return _glassGin!!
        _glassGin = tablerOutlineIcon(
            name = "GlassGin",
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
                    PathNode.MoveTo(5.5f, 5.0f),
                    PathNode.CurveTo(5.5f, 6.10457f, 8.41015f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(15.58985f, 7.0f, 18.5f, 6.10457f, 18.5f, 5.0f),
                    PathNode.CurveTo(18.5f, 3.895431f, 15.58985f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(8.41015f, 3.0f, 5.5f, 3.895431f, 5.5f, 5.0f)
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
                    PathNode.MoveTo(5.75f, 4.5f),
                    PathNode.CurveTo(5.138f, 5.25f, 5.0f, 6.5f, 5.0f, 8.0f),
                    PathNode.CurveTo(5.0f, 11.865993f, 8.134007f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(15.865993f, 15.0f, 19.0f, 11.865993f, 19.0f, 8.0f),
                    PathNode.CurveTo(19.0f, 6.5f, 18.906f, 5.25f, 18.25f, 4.5f)
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
        return _glassGin!!
    }

private var _glassGin: ImageVector? = null
