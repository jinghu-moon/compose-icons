package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LockCancel: ImageVector
    get() {
        if (_lockCancel != null) return _lockCancel!!
        _lockCancel = tablerOutlineIcon(
            name = "LockCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.5f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(5.895431f, 21.0f, 5.0f, 20.10457f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 13.0f),
                    PathNode.CurveTo(5.0f, 11.895431f, 5.895431f, 11.0f, 7.0f, 11.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.CurveTo(17.726427f, 10.999607f, 18.395956f, 11.39313f, 18.749f, 12.028f)
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
                    PathNode.MoveTo(11.0f, 16.0f),
                    PathNode.CurveTo(11.0f, 16.552284f, 11.447715f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(12.552285f, 17.0f, 13.0f, 16.552284f, 13.0f, 16.0f),
                    PathNode.CurveTo(13.0f, 15.447715f, 12.552285f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(11.447715f, 15.0f, 11.0f, 15.447715f, 11.0f, 16.0f)
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
                    PathNode.MoveTo(8.0f, 11.0f),
                    PathNode.LineTo(8.0f, 7.0f),
                    PathNode.CurveTo(8.0f, 4.790861f, 9.790861f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(14.209139f, 3.0f, 16.0f, 4.790861f, 16.0f, 7.0f),
                    PathNode.LineTo(16.0f, 11.0f)
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
        return _lockCancel!!
    }

private var _lockCancel: ImageVector? = null
