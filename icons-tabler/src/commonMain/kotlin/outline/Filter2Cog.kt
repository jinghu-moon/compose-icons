package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Cog: ImageVector
    get() {
        if (_filter2Cog != null) return _filter2Cog!!
        _filter2Cog = tablerOutlineIcon(
            name = "Filter2Cog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.LineTo(20.0f, 6.0f)
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.LineTo(18.0f, 12.0f)
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
                    PathNode.MoveTo(9.0f, 18.0f),
                    PathNode.LineTo(12.0f, 18.0f)
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
                    PathNode.MoveTo(19.001f, 21.0f),
                    PathNode.CurveTo(18.471f, 21.0f, 17.962f, 20.789f, 17.587f, 20.414f),
                    PathNode.CurveTo(17.212f, 20.039f, 17.001f, 19.53f, 17.001f, 19.0f),
                    PathNode.CurveTo(17.001f, 18.47f, 17.212f, 17.961f, 17.587f, 17.586f),
                    PathNode.CurveTo(17.962f, 17.211f, 18.471f, 17.0f, 19.001f, 17.0f),
                    PathNode.MoveTo(19.001f, 21.0f),
                    PathNode.CurveTo(19.531f, 21.0f, 20.04f, 20.789f, 20.415f, 20.414f),
                    PathNode.CurveTo(20.79f, 20.039f, 21.001f, 19.53f, 21.001f, 19.0f),
                    PathNode.CurveTo(21.001f, 18.47f, 20.79f, 17.961f, 20.415f, 17.586f),
                    PathNode.CurveTo(20.04f, 17.211f, 19.531f, 17.0f, 19.001f, 17.0f),
                    PathNode.MoveTo(19.001f, 21.0f),
                    PathNode.LineTo(19.001f, 22.5f),
                    PathNode.MoveTo(19.001f, 17.0f),
                    PathNode.LineTo(19.001f, 15.5f),
                    PathNode.MoveTo(22.032f, 17.25f),
                    PathNode.LineTo(20.733f, 18.0f),
                    PathNode.MoveTo(17.27f, 20.0f),
                    PathNode.LineTo(15.97f, 20.75f),
                    PathNode.MoveTo(15.97f, 17.25f),
                    PathNode.LineTo(17.27f, 18.0f),
                    PathNode.MoveTo(20.733f, 20.0f),
                    PathNode.LineTo(22.033f, 20.75f)
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
        return _filter2Cog!!
    }

private var _filter2Cog: ImageVector? = null
