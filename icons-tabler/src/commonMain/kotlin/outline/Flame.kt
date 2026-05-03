package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = tablerOutlineIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 10.941f),
                    PathNode.CurveTo(14.333f, 7.633f, 12.167f, 3.118f, 11.0f, 2.0f),
                    PathNode.CurveTo(11.0f, 5.395f, 8.765f, 7.299f, 7.333f, 8.706f),
                    PathNode.CurveTo(5.903f, 10.114f, 5.0f, 12.0f, 5.0f, 14.294f),
                    PathNode.CurveTo(5.0f, 17.998f, 8.134f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(15.866f, 21.0f, 19.0f, 17.998f, 19.0f, 14.294f),
                    PathNode.CurveTo(19.0f, 12.582f, 17.768f, 9.891f, 16.667f, 8.706f),
                    PathNode.CurveTo(14.583f, 12.059f, 13.41f, 12.059f, 12.0f, 10.941f)
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
        return _flame!!
    }

private var _flame: ImageVector? = null
