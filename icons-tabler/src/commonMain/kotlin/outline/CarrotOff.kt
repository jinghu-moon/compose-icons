package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarrotOff: ImageVector
    get() {
        if (_carrotOff != null) return _carrotOff!!
        _carrotOff = tablerOutlineIcon(
            name = "CarrotOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.868f, 8.846f),
                    PathNode.CurveTo(6.112f, 12.228f, 3.0f, 21.0f, 3.0f, 21.0f),
                    PathNode.CurveTo(3.0f, 21.0f, 11.75f, 17.896f, 15.134f, 15.15f),
                    PathNode.MoveTo(16.801f, 12.808f),
                    PathNode.CurveTo(17.28997f, 11.22268f, 16.864082f, 9.496926f, 15.693707f, 8.321106f),
                    PathNode.CurveTo(14.523331f, 7.145286f, 12.799572f, 6.711393f, 11.212f, 7.193f)
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
                    PathNode.MoveTo(9.0f, 13.0f),
                    PathNode.LineTo(7.5f, 11.5f)
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
                    PathNode.MoveTo(22.0f, 8.0f),
                    PathNode.CurveTo(22.0f, 8.0f, 20.86f, 6.0f, 19.0f, 6.0f),
                    PathNode.CurveTo(17.594f, 6.0f, 16.0f, 8.0f, 16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 8.0f, 17.14f, 10.0f, 19.0f, 10.0f),
                    PathNode.CurveTo(20.86f, 10.0f, 22.0f, 8.0f, 22.0f, 8.0f)
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
                    PathNode.MoveTo(16.0f, 2.0f),
                    PathNode.CurveTo(16.0f, 2.0f, 14.0f, 3.14f, 14.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 6.86f, 16.0f, 8.0f, 16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 8.0f, 18.0f, 6.423f, 18.0f, 5.0f),
                    PathNode.CurveTo(18.0f, 3.14f, 16.0f, 2.0f, 16.0f, 2.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _carrotOff!!
    }

private var _carrotOff: ImageVector? = null
