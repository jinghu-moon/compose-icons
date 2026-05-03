package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HangerOff: ImageVector
    get() {
        if (_hangerOff != null) return _hangerOff!!
        _hangerOff = tablerOutlineIcon(
            name = "HangerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 6.0f),
                    PathNode.CurveTo(14.0f, 4.895431f, 13.104569f, 4.0f, 12.0f, 4.0f),
                    PathNode.CurveTo(10.895431f, 4.0f, 10.0f, 4.895431f, 10.0f, 6.0f),
                    PathNode.MoveTo(16.506f, 12.506f),
                    PathNode.LineTo(19.967f, 14.428f),
                    PathNode.CurveTo(20.602255f, 14.780784f, 20.996193f, 15.45036f, 20.996f, 16.177f),
                    PathNode.LineTo(20.996f, 17.0f),
                    PathNode.MoveTo(18.996f, 19.0f),
                    PathNode.LineTo(4.996f, 19.0f),
                    PathNode.CurveTo(3.891431f, 19.0f, 2.996f, 18.10457f, 2.996f, 17.0f),
                    PathNode.LineTo(2.996f, 16.177f),
                    PathNode.CurveTo(2.995809f, 15.45036f, 3.389745f, 14.780784f, 4.025f, 14.428f),
                    PathNode.LineTo(10.698f, 10.721f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _hangerOff!!
    }

private var _hangerOff: ImageVector? = null
