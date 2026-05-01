package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GuitarPick: ImageVector
    get() {
        if (_guitarPick != null) return _guitarPick!!
        _guitarPick = tablerOutlineIcon(
            name = "GuitarPick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 18.5f),
                    PathNode.CurveTo(18.0f, 16.0f, 20.0f, 12.0f, 20.0f, 8.0f),
                    PathNode.CurveTo(20.0f, 5.054f, 17.916f, 3.843f, 15.796f, 3.346f),
                    PathNode.CurveTo(14.932f, 3.116f, 13.666f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.333f, 3.0f, 9.068f, 3.115f, 8.204001f, 3.346f),
                    PathNode.CurveTo(6.084f, 3.843f, 4.0f, 5.054f, 4.0f, 8.0f),
                    PathNode.CurveTo(4.0f, 11.312f, 6.0f, 16.0f, 8.0f, 18.5f),
                    PathNode.CurveTo(8.297f, 18.87f, 8.618f, 19.231f, 8.963f, 19.581f),
                    PathNode.LineTo(9.317f, 19.928f),
                    PathNode.CurveTo(10.82116f, 21.352789f, 13.17684f, 21.352789f, 14.681f, 19.928f),
                    PathNode.CurveTo(15.153109f, 19.483023f, 15.59383f, 19.005882f, 16.0f, 18.5f)
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
        return _guitarPick!!
    }

private var _guitarPick: ImageVector? = null
