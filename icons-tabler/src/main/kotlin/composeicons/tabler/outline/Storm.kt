package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Storm: ImageVector
    get() {
        if (_storm != null) return _storm!!
        _storm = tablerOutlineIcon(
            name = "Storm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 13.656855f, 10.343145f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.656855f, 15.0f, 15.0f, 13.656855f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 10.343145f, 13.656855f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(10.343145f, 9.0f, 9.0f, 10.343145f, 9.0f, 12.0f)
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
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.CurveTo(5.0f, 15.865993f, 8.134007f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(15.865993f, 19.0f, 19.0f, 15.865993f, 19.0f, 12.0f),
                    PathNode.CurveTo(19.0f, 8.134007f, 15.865993f, 5.0f, 12.0f, 5.0f),
                    PathNode.CurveTo(8.134007f, 5.0f, 5.0f, 8.134007f, 5.0f, 12.0f)
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
                    PathNode.MoveTo(5.369f, 14.236f),
                    PathNode.CurveTo(3.53f, 10.307f, 3.808f, 6.62f, 4.665f, 3.0f)
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
                    PathNode.MoveTo(18.63f, 9.76f),
                    PathNode.CurveTo(20.467f, 13.688f, 20.191f, 17.375f, 19.333f, 20.996f)
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
        return _storm!!
    }

private var _storm: ImageVector? = null
