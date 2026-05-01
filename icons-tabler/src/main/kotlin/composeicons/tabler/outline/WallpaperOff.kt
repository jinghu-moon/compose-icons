package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WallpaperOff: ImageVector
    get() {
        if (_wallpaperOff != null) return _wallpaperOff!!
        _wallpaperOff = tablerOutlineIcon(
            name = "WallpaperOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(19.10457f, 6.0f, 20.0f, 6.895431f, 20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.MoveTo(19.42f, 19.409f),
                    PathNode.CurveTo(19.044369f, 19.787407f, 18.53319f, 20.000158f, 18.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f)
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
                    PathNode.MoveTo(4.0f, 18.0f),
                    PathNode.CurveTo(4.0f, 19.10457f, 4.895431f, 20.0f, 6.0f, 20.0f),
                    PathNode.CurveTo(7.10457f, 20.0f, 8.0f, 19.10457f, 8.0f, 18.0f),
                    PathNode.CurveTo(8.0f, 16.89543f, 7.10457f, 16.0f, 6.0f, 16.0f),
                    PathNode.CurveTo(4.895431f, 16.0f, 4.0f, 16.89543f, 4.0f, 18.0f)
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
                    PathNode.MoveTo(8.0f, 18.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.MoveTo(4.573f, 4.598f),
                    PathNode.CurveTo(4.22f, 4.96f, 4.0f, 5.454f, 4.0f, 6.0f),
                    PathNode.LineTo(4.0f, 18.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _wallpaperOff!!
    }

private var _wallpaperOff: ImageVector? = null
