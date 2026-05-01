package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Crop169: ImageVector
    get() {
        if (_crop169 != null) return _crop169!!
        _crop169 = tablerOutlineIcon(
            name = "Crop169",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 10.0f),
                    PathNode.CurveTo(4.0f, 8.895431f, 4.895431f, 8.0f, 6.0f, 8.0f),
                    PathNode.LineTo(18.0f, 8.0f),
                    PathNode.CurveTo(19.10457f, 8.0f, 20.0f, 8.895431f, 20.0f, 10.0f),
                    PathNode.LineTo(20.0f, 14.0f),
                    PathNode.CurveTo(20.0f, 15.104569f, 19.10457f, 16.0f, 18.0f, 16.0f),
                    PathNode.LineTo(6.0f, 16.0f),
                    PathNode.CurveTo(4.895431f, 16.0f, 4.0f, 15.104569f, 4.0f, 14.0f),
                    PathNode.LineTo(4.0f, 10.0f)
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
        return _crop169!!
    }

private var _crop169: ImageVector? = null
