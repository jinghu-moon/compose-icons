package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShareOff: ImageVector
    get() {
        if (_shareOff != null) return _shareOff!!
        _shareOff = tablerOutlineIcon(
            name = "ShareOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 13.656855f, 4.343146f, 15.0f, 6.0f, 15.0f),
                    PathNode.CurveTo(7.656854f, 15.0f, 9.0f, 13.656855f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 10.343145f, 7.656854f, 9.0f, 6.0f, 9.0f),
                    PathNode.CurveTo(4.343146f, 9.0f, 3.0f, 10.343145f, 3.0f, 12.0f)
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
                    PathNode.MoveTo(15.0f, 6.0f),
                    PathNode.CurveTo(15.0f, 7.656854f, 16.343145f, 9.0f, 18.0f, 9.0f),
                    PathNode.CurveTo(19.656855f, 9.0f, 21.0f, 7.656854f, 21.0f, 6.0f),
                    PathNode.CurveTo(21.0f, 4.343146f, 19.656855f, 3.0f, 18.0f, 3.0f),
                    PathNode.CurveTo(16.343145f, 3.0f, 15.0f, 4.343146f, 15.0f, 6.0f)
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
                    PathNode.MoveTo(15.861f, 15.896f),
                    PathNode.CurveTo(14.708015f, 17.075775f, 14.723874f, 18.965105f, 15.8965f, 20.12536f),
                    PathNode.CurveTo(17.069126f, 21.285616f, 18.95852f, 21.281433f, 20.126f, 20.116f),
                    PathNode.MoveTo(20.704f, 16.699f),
                    PathNode.CurveTo(20.39097f, 16.051191f, 19.856392f, 15.536833f, 19.197f, 15.249f)
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
                    PathNode.MoveTo(8.7f, 10.7f),
                    PathNode.LineTo(10.036f, 10.012f),
                    PathNode.MoveTo(12.66f, 8.66f),
                    PathNode.LineTo(15.3f, 7.3f)
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
                    PathNode.MoveTo(8.7f, 13.3f),
                    PathNode.LineTo(15.3f, 16.7f)
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
        return _shareOff!!
    }

private var _shareOff: ImageVector? = null
