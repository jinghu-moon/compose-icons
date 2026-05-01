package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RewindForward5: ImageVector
    get() {
        if (_rewindForward5 != null) return _rewindForward5!!
        _rewindForward5 = tablerOutlineIcon(
            name = "RewindForward5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 18.0f),
                    PathNode.CurveTo(5.686292f, 18.0f, 3.0f, 15.313708f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 8.686292f, 5.686292f, 6.0f, 9.0f, 6.0f),
                    PathNode.LineTo(20.0f, 6.0f)
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
                    PathNode.MoveTo(13.0f, 20.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.CurveTo(15.552285f, 20.0f, 16.0f, 19.552284f, 16.0f, 19.0f),
                    PathNode.LineTo(16.0f, 18.0f),
                    PathNode.CurveTo(16.0f, 17.447716f, 15.552285f, 17.0f, 15.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(16.0f, 14.0f)
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
                    PathNode.MoveTo(17.0f, 9.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.LineTo(17.0f, 3.0f)
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
        return _rewindForward5!!
    }

private var _rewindForward5: ImageVector? = null
