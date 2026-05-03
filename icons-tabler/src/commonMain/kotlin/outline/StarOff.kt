package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StarOff: ImageVector
    get() {
        if (_starOff != null) return _starOff!!
        _starOff = tablerOutlineIcon(
            name = "StarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.012f, 6.016f),
                    PathNode.LineTo(11.993f, 2.002f),
                    PathNode.LineTo(15.079f, 8.255f),
                    PathNode.LineTo(21.979f, 9.255f),
                    PathNode.LineTo(17.558f, 13.559f),
                    PathNode.MoveTo(17.57f, 17.569f),
                    PathNode.LineTo(18.158f, 20.995f),
                    PathNode.LineTo(12.0f, 17.75f),
                    PathNode.LineTo(5.828f, 20.995f),
                    PathNode.LineTo(7.007f, 14.122f),
                    PathNode.LineTo(2.007f, 9.255f),
                    PathNode.LineTo(8.334f, 8.338001f)
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
        return _starOff!!
    }

private var _starOff: ImageVector? = null
