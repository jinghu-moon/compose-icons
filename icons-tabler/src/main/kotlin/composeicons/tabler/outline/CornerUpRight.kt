package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CornerUpRight: ImageVector
    get() {
        if (_cornerUpRight != null) return _cornerUpRight!!
        _cornerUpRight = tablerOutlineIcon(
            name = "CornerUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 18.0f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 10.343145f, 7.343146f, 9.0f, 9.0f, 9.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.MoveTo(15.0f, 13.0f),
                    PathNode.LineTo(19.0f, 9.0f)
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
        return _cornerUpRight!!
    }

private var _cornerUpRight: ImageVector? = null
