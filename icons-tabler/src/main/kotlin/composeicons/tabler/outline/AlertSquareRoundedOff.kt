package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlertSquareRoundedOff: ImageVector
    get() {
        if (_alertSquareRoundedOff != null) return _alertSquareRoundedOff!!
        _alertSquareRoundedOff = tablerOutlineIcon(
            name = "AlertSquareRoundedOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.201f, 19.199f),
                    PathNode.CurveTo(17.851f, 20.549f, 15.601f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(4.8f, 21.0f, 3.0f, 19.2f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 8.402f, 3.45f, 6.153f, 4.797f, 4.803f),
                    PathNode.MoveTo(7.423f, 3.427f),
                    PathNode.CurveTo(8.627f, 3.12f, 10.132f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(19.2f, 3.0f, 21.0f, 4.8f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 13.865f, 20.88f, 15.367f, 20.575f, 16.57f)
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 8.0f)
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
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(12.01f, 16.0f)
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
        return _alertSquareRoundedOff!!
    }

private var _alertSquareRoundedOff: ImageVector? = null
