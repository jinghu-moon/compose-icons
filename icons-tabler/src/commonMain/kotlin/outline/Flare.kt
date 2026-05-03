package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Flare: ImageVector
    get() {
        if (_flare != null) return _flare!!
        _flare = tablerOutlineIcon(
            name = "Flare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(12.0f, 3.0f)
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
        return _flare!!
    }

private var _flare: ImageVector? = null
