package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Crop54: ImageVector
    get() {
        if (_crop54 != null) return _crop54!!
        _crop54 = tablerOutlineIcon(
            name = "Crop54",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 7.0f),
                    PathNode.CurveTo(4.0f, 5.895431f, 4.895431f, 5.0f, 6.0f, 5.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.CurveTo(19.10457f, 5.0f, 20.0f, 5.895431f, 20.0f, 7.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.CurveTo(20.0f, 18.10457f, 19.10457f, 19.0f, 18.0f, 19.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(4.895431f, 19.0f, 4.0f, 18.10457f, 4.0f, 17.0f),
                    PathNode.LineTo(4.0f, 7.0f)
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
        return _crop54!!
    }

private var _crop54: ImageVector? = null
