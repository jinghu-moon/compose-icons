package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MusicCancel: ImageVector
    get() {
        if (_musicCancel != null) return _musicCancel!!
        _musicCancel = tablerOutlineIcon(
            name = "MusicCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 17.0f),
                    PathNode.CurveTo(3.0f, 18.656855f, 4.343146f, 20.0f, 6.0f, 20.0f),
                    PathNode.CurveTo(7.656854f, 20.0f, 9.0f, 18.656855f, 9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 15.343145f, 7.656854f, 14.0f, 6.0f, 14.0f),
                    PathNode.CurveTo(4.343146f, 14.0f, 3.0f, 15.343145f, 3.0f, 17.0f)
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
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.LineTo(19.0f, 4.0f),
                    PathNode.LineTo(19.0f, 12.0f)
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
                    PathNode.MoveTo(9.0f, 8.0f),
                    PathNode.LineTo(19.0f, 8.0f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.CurveTo(16.0f, 20.656855f, 17.343145f, 22.0f, 19.0f, 22.0f),
                    PathNode.CurveTo(20.656855f, 22.0f, 22.0f, 20.656855f, 22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 17.343145f, 20.656855f, 16.0f, 19.0f, 16.0f),
                    PathNode.CurveTo(17.343145f, 16.0f, 16.0f, 17.343145f, 16.0f, 19.0f)
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
                    PathNode.MoveTo(17.0f, 21.0f),
                    PathNode.LineTo(21.0f, 17.0f)
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
        return _musicCancel!!
    }

private var _musicCancel: ImageVector? = null
