package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleAnalytics: ImageVector
    get() {
        if (_brandGoogleAnalytics != null) return _brandGoogleAnalytics!!
        _brandGoogleAnalytics = tablerOutlineIcon(
            name = "BrandGoogleAnalytics",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 10.105f),
                    PathNode.CurveTo(10.0f, 9.494725f, 10.494725f, 9.0f, 11.105f, 9.0f),
                    PathNode.LineTo(12.895f, 9.0f),
                    PathNode.CurveTo(13.505275f, 9.0f, 14.0f, 9.494725f, 14.0f, 10.105f),
                    PathNode.LineTo(14.0f, 19.895f),
                    PathNode.CurveTo(14.0f, 20.505274f, 13.505275f, 21.0f, 12.895f, 21.0f),
                    PathNode.LineTo(11.105f, 21.0f),
                    PathNode.CurveTo(10.494725f, 21.0f, 10.0f, 20.505274f, 10.0f, 19.895f),
                    PathNode.LineTo(10.0f, 10.105f)
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
                    PathNode.MoveTo(17.0f, 4.105f),
                    PathNode.CurveTo(17.0f, 3.494726f, 17.494726f, 3.0f, 18.105f, 3.0f),
                    PathNode.LineTo(19.895f, 3.0f),
                    PathNode.CurveTo(20.505274f, 3.0f, 21.0f, 3.494726f, 21.0f, 4.105f),
                    PathNode.LineTo(21.0f, 19.895f),
                    PathNode.CurveTo(21.0f, 20.505274f, 20.505274f, 21.0f, 19.895f, 21.0f),
                    PathNode.LineTo(18.105f, 21.0f),
                    PathNode.CurveTo(17.494726f, 21.0f, 17.0f, 20.505274f, 17.0f, 19.895f),
                    PathNode.LineTo(17.0f, 4.105f)
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
                    PathNode.MoveTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.10457f, 3.895431f, 21.0f, 5.0f, 21.0f),
                    PathNode.CurveTo(6.10457f, 21.0f, 7.0f, 20.10457f, 7.0f, 19.0f),
                    PathNode.CurveTo(7.0f, 17.89543f, 6.10457f, 17.0f, 5.0f, 17.0f),
                    PathNode.CurveTo(3.895431f, 17.0f, 3.0f, 17.89543f, 3.0f, 19.0f)
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
        return _brandGoogleAnalytics!!
    }

private var _brandGoogleAnalytics: ImageVector? = null
