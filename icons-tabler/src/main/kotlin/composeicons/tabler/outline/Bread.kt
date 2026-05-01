package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = tablerOutlineIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 4.0f),
                    PathNode.CurveTo(19.243338f, 4.000495f, 20.357521f, 4.767882f, 20.80125f, 5.929343f),
                    PathNode.CurveTo(21.24498f, 7.090804f, 20.926287f, 8.405614f, 20.0f, 9.235f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.0f, 19.10457f, 19.10457f, 20.0f, 18.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.895431f, 20.0f, 4.0f, 19.10457f, 4.0f, 18.0f),
                    PathNode.LineTo(4.0f, 9.236f),
                    PathNode.CurveTo(3.096757f, 8.428191f, 2.768191f, 7.156306f, 3.167166f, 6.012093f),
                    PathNode.CurveTo(3.566142f, 4.867881f, 4.614308f, 4.076049f, 5.824f, 4.005f),
                    PathNode.LineTo(18.0f, 4.005f),
                    PathNode.LineTo(18.0f, 4.0f)
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
        return _bread!!
    }

private var _bread: ImageVector? = null
