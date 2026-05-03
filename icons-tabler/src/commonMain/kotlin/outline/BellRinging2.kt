package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellRinging2: ImageVector
    get() {
        if (_bellRinging2 != null) return _bellRinging2!!
        _bellRinging2 = tablerOutlineIcon(
            name = "BellRinging2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.364f, 4.636f),
                    PathNode.CurveTo(20.144764f, 5.417f, 20.144764f, 6.683f, 19.364f, 7.464f),
                    PathNode.CurveTo(20.23673f, 9.901434f, 19.692865f, 12.621537f, 17.95f, 14.536f),
                    PathNode.LineTo(15.828f, 16.656f),
                    PathNode.CurveTo(15.044284f, 17.655563f, 14.781884f, 18.967934f, 15.121f, 20.192f),
                    PathNode.LineTo(3.808f, 8.88f),
                    PathNode.CurveTo(5.031758f, 9.218778f, 6.343677f, 8.956394f, 7.343f, 8.173001f),
                    PathNode.LineTo(9.464f, 6.05f),
                    PathNode.CurveTo(11.378463f, 4.307136f, 14.098566f, 3.763269f, 16.536f, 4.636f),
                    PathNode.CurveTo(17.317f, 3.855236f, 18.583f, 3.855236f, 19.364f, 4.636f)
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
                    PathNode.MoveTo(7.343f, 12.414f),
                    PathNode.LineTo(6.636f, 13.121f),
                    PathNode.CurveTo(5.464328f, 14.292672f, 5.464328f, 16.192327f, 6.636f, 17.364f),
                    PathNode.CurveTo(7.807672f, 18.535671f, 9.707328f, 18.535671f, 10.879f, 17.364f),
                    PathNode.LineTo(11.586f, 16.657f)
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
        return _bellRinging2!!
    }

private var _bellRinging2: ImageVector? = null
