package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NotebookOff: ImageVector
    get() {
        if (_notebookOff != null) return _notebookOff!!
        _notebookOff = tablerOutlineIcon(
            name = "NotebookOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.CurveTo(18.10457f, 4.0f, 19.0f, 4.895431f, 19.0f, 6.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.MoveTo(18.821f, 18.828f),
                    PathNode.CurveTo(18.496304f, 19.541924f, 17.784292f, 20.000175f, 17.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(5.447716f, 20.0f, 5.0f, 19.552284f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.MoveTo(9.0f, 4.0f),
                    PathNode.LineTo(9.0f, 5.0f),
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 22.0f)
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
                    PathNode.MoveTo(13.0f, 8.0f),
                    PathNode.LineTo(15.0f, 8.0f)
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
        return _notebookOff!!
    }

private var _notebookOff: ImageVector? = null
