package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeLock: ImageVector
    get() {
        if (_homeLock != null) return _homeLock!!
        _homeLock = tablerOutlineIcon(
            name = "HomeLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(20.0f, 11.0f)
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
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 20.10457f, 5.895431f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(13.0f, 21.0f)
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
                    PathNode.MoveTo(9.0f, 21.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 13.895431f, 9.895431f, 13.0f, 11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.CurveTo(13.688f, 13.0f, 14.294f, 13.347f, 14.654f, 13.875f)
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
                    PathNode.MoveTo(17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 18.447716f, 17.447716f, 18.0f, 18.0f, 18.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.552284f, 18.0f, 22.0f, 18.447716f, 22.0f, 19.0f),
                    PathNode.LineTo(22.0f, 21.0f),
                    PathNode.CurveTo(22.0f, 21.552284f, 21.552284f, 22.0f, 21.0f, 22.0f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.CurveTo(17.447716f, 22.0f, 17.0f, 21.552284f, 17.0f, 21.0f),
                    PathNode.LineTo(17.0f, 19.0f)
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
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(18.0f, 16.5f),
                    PathNode.CurveTo(18.0f, 15.671573f, 18.671574f, 15.0f, 19.5f, 15.0f),
                    PathNode.CurveTo(20.328426f, 15.0f, 21.0f, 15.671573f, 21.0f, 16.5f),
                    PathNode.LineTo(21.0f, 18.0f)
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
        return _homeLock!!
    }

private var _homeLock: ImageVector? = null
