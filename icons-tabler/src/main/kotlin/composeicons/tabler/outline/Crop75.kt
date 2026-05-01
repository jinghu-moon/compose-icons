package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Crop75: ImageVector
    get() {
        if (_crop75 != null) return _crop75!!
        _crop75 = tablerOutlineIcon(
            name = "Crop75",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 8.0f),
                    PathNode.CurveTo(4.0f, 6.895431f, 4.895431f, 6.0f, 6.0f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(19.10457f, 6.0f, 20.0f, 6.895431f, 20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.CurveTo(20.0f, 17.10457f, 19.10457f, 18.0f, 18.0f, 18.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.CurveTo(4.895431f, 18.0f, 4.0f, 17.10457f, 4.0f, 16.0f),
                    PathNode.LineTo(4.0f, 8.0f)
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
        return _crop75!!
    }

private var _crop75: ImageVector? = null
