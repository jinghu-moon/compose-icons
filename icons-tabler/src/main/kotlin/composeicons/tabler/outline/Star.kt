package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = tablerOutlineIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 17.75f),
                    PathNode.LineTo(5.828f, 20.995f),
                    PathNode.LineTo(7.007f, 14.122f),
                    PathNode.LineTo(2.007f, 9.255f),
                    PathNode.LineTo(8.907f, 8.255f),
                    PathNode.LineTo(11.993f, 2.002f),
                    PathNode.LineTo(15.079f, 8.255f),
                    PathNode.LineTo(21.979f, 9.255f),
                    PathNode.LineTo(16.979f, 14.122f),
                    PathNode.LineTo(18.158f, 20.995f),
                    PathNode.LineTo(12.0f, 17.75f)
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
        return _star!!
    }

private var _star: ImageVector? = null
