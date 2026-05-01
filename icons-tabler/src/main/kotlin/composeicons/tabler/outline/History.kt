package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.History: ImageVector
    get() {
        if (_history != null) return _history!!
        _history = tablerOutlineIcon(
            name = "History",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(14.0f, 14.0f)
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
                    PathNode.MoveTo(3.05f, 11.0f),
                    PathNode.CurveTo(3.513937f, 6.44545f, 7.323059f, 2.964916f, 11.900878f, 2.912629f),
                    PathNode.CurveTo(16.478697f, 2.860341f, 20.366323f, 6.252964f, 20.93417f, 10.795729f),
                    PathNode.CurveTo(21.502014f, 15.338494f, 18.569115f, 19.583685f, 14.119281f, 20.659851f),
                    PathNode.CurveTo(9.669447f, 21.736023f, 5.120783f, 19.30021f, 3.55f, 15.0f),
                    PathNode.MoveTo(3.05f, 20.0f),
                    PathNode.LineTo(3.05f, 15.0f),
                    PathNode.LineTo(8.05f, 15.0f)
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
        return _history!!
    }

private var _history: ImageVector? = null
