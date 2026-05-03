package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CornerUpLeft: ImageVector
    get() {
        if (_cornerUpLeft != null) return _cornerUpLeft!!
        _cornerUpLeft = tablerOutlineIcon(
            name = "CornerUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 10.343145f, 16.656855f, 9.0f, 15.0f, 9.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.LineTo(9.0f, 5.0f),
                    PathNode.MoveTo(9.0f, 13.0f),
                    PathNode.LineTo(5.0f, 9.0f)
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
        return _cornerUpLeft!!
    }

private var _cornerUpLeft: ImageVector? = null
