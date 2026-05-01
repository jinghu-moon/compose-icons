package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sparkles: ImageVector
    get() {
        if (_sparkles != null) return _sparkles!!
        _sparkles = tablerOutlineIcon(
            name = "Sparkles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 18.0f),
                    PathNode.CurveTo(17.10457f, 18.0f, 18.0f, 18.89543f, 18.0f, 20.0f),
                    PathNode.CurveTo(18.0f, 18.89543f, 18.89543f, 18.0f, 20.0f, 18.0f),
                    PathNode.CurveTo(18.89543f, 18.0f, 18.0f, 17.10457f, 18.0f, 16.0f),
                    PathNode.CurveTo(18.0f, 17.10457f, 17.10457f, 18.0f, 16.0f, 18.0f),
                    PathNode.MoveTo(16.0f, 6.0f),
                    PathNode.CurveTo(17.10457f, 6.0f, 18.0f, 6.895431f, 18.0f, 8.0f),
                    PathNode.CurveTo(18.0f, 6.895431f, 18.89543f, 6.0f, 20.0f, 6.0f),
                    PathNode.CurveTo(18.89543f, 6.0f, 18.0f, 5.10457f, 18.0f, 4.0f),
                    PathNode.CurveTo(18.0f, 5.10457f, 17.10457f, 6.0f, 16.0f, 6.0f),
                    PathNode.MoveTo(9.0f, 18.0f),
                    PathNode.CurveTo(9.0f, 14.686292f, 11.686292f, 12.0f, 15.0f, 12.0f),
                    PathNode.CurveTo(11.686292f, 12.0f, 9.0f, 9.313708f, 9.0f, 6.0f),
                    PathNode.CurveTo(9.0f, 9.313708f, 6.313709f, 12.0f, 3.0f, 12.0f),
                    PathNode.CurveTo(6.313709f, 12.0f, 9.0f, 14.686292f, 9.0f, 18.0f)
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
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
