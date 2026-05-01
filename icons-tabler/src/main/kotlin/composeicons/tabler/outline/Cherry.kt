package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cherry: ImageVector
    get() {
        if (_cherry != null) return _cherry!!
        _cherry = tablerOutlineIcon(
            name = "Cherry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 16.5f),
                    PathNode.CurveTo(4.0f, 18.432997f, 5.567004f, 20.0f, 7.5f, 20.0f),
                    PathNode.CurveTo(9.432997f, 20.0f, 11.0f, 18.432997f, 11.0f, 16.5f),
                    PathNode.CurveTo(11.0f, 14.567003f, 9.432997f, 13.0f, 7.5f, 13.0f),
                    PathNode.CurveTo(5.567004f, 13.0f, 4.0f, 14.567003f, 4.0f, 16.5f)
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
                    PathNode.MoveTo(14.0f, 18.0f),
                    PathNode.CurveTo(14.0f, 19.656855f, 15.343145f, 21.0f, 17.0f, 21.0f),
                    PathNode.CurveTo(18.656855f, 21.0f, 20.0f, 19.656855f, 20.0f, 18.0f),
                    PathNode.CurveTo(20.0f, 16.343145f, 18.656855f, 15.0f, 17.0f, 15.0f),
                    PathNode.CurveTo(15.343145f, 15.0f, 14.0f, 16.343145f, 14.0f, 18.0f)
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
                    PathNode.MoveTo(9.0f, 13.0f),
                    PathNode.CurveTo(9.366f, 11.0f, 10.866f, 9.127f, 13.5f, 7.4f)
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
                    PathNode.MoveTo(17.0f, 15.0f),
                    PathNode.CurveTo(15.667f, 12.667f, 14.667f, 9.667f, 16.0f, 6.0f)
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
                    PathNode.MoveTo(5.0f, 6.0f),
                    PathNode.CurveTo(8.667f, 3.333f, 12.333f, 3.333f, 16.0f, 6.0f),
                    PathNode.CurveTo(12.333f, 8.667f, 8.667f, 8.667f, 5.0f, 6.0f)
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
        return _cherry!!
    }

private var _cherry: ImageVector? = null
