package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationTop: ImageVector
    get() {
        if (_navigationTop != null) return _navigationTop!!
        _navigationTop = tablerOutlineIcon(
            name = "NavigationTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.54f, 19.977f),
                    PathNode.CurveTo(16.662525f, 20.024647f, 16.80154f, 19.997389f, 16.897f, 19.907f),
                    PathNode.CurveTo(16.991762f, 19.817217f, 17.02469f, 19.680012f, 16.981f, 19.557f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.LineTo(7.018f, 19.557f),
                    PathNode.CurveTo(6.97431f, 19.680012f, 7.007239f, 19.817217f, 7.102f, 19.907f),
                    PathNode.CurveTo(7.197459f, 19.997389f, 7.336475f, 20.024647f, 7.459f, 19.977f),
                    PathNode.LineTo(12.0f, 18.5f),
                    PathNode.LineTo(16.54f, 19.977f)
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
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 5.0f)
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
        return _navigationTop!!
    }

private var _navigationTop: ImageVector? = null
