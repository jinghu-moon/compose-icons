package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lighter: ImageVector
    get() {
        if (_lighter != null) return _lighter!!
        _lighter = tablerOutlineIcon(
            name = "Lighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 3.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.CurveTo(10.0f, 20.10457f, 10.895431f, 21.0f, 12.0f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.CurveTo(18.10457f, 21.0f, 19.0f, 20.10457f, 19.0f, 19.0f),
                    PathNode.LineTo(19.0f, 12.0f),
                    PathNode.LineTo(7.0f, 12.0f),
                    PathNode.CurveTo(5.895431f, 12.0f, 5.0f, 11.104569f, 5.0f, 10.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 3.895431f, 5.895431f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(10.0f, 3.0f)
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
                    PathNode.MoveTo(16.0f, 4.0f),
                    PathNode.LineTo(17.465f, 5.638f),
                    PathNode.CurveTo(18.192968f, 6.420593f, 18.17696f, 7.637252f, 17.428656f, 8.40042f),
                    PathNode.CurveTo(16.68035f, 9.16359f, 15.464241f, 9.203522f, 14.667483f, 8.491086f),
                    PathNode.CurveTo(13.870726f, 7.778651f, 13.77494f, 6.565662f, 14.45f, 5.737f),
                    PathNode.LineTo(16.0f, 4.0f)
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
        return _lighter!!
    }

private var _lighter: ImageVector? = null
