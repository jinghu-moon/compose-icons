package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Send2: ImageVector
    get() {
        if (_send2 != null) return _send2!!
        _send2 = tablerOutlineIcon(
            name = "Send2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.698f, 4.034f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(4.698f, 19.966f),
                    PathNode.CurveTo(4.507689f, 20.039143f, 4.29205f, 19.99017f, 4.152f, 19.842f),
                    PathNode.CurveTo(4.008272f, 19.69035f, 3.961894f, 19.470827f, 4.032f, 19.274f),
                    PathNode.LineTo(6.5f, 12.0f),
                    PathNode.LineTo(4.032f, 4.726f),
                    PathNode.CurveTo(3.961894f, 4.529173f, 4.008272f, 4.309652f, 4.152f, 4.158f),
                    PathNode.CurveTo(4.29205f, 4.009831f, 4.507689f, 3.960858f, 4.698f, 4.034f)
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
                    PathNode.MoveTo(6.5f, 12.0f),
                    PathNode.LineTo(21.0f, 12.0f)
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
        return _send2!!
    }

private var _send2: ImageVector? = null
