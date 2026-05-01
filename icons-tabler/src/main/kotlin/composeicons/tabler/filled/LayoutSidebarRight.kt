package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutSidebarRight: ImageVector
    get() {
        if (_layoutSidebarRight != null) return _layoutSidebarRight!!
        _layoutSidebarRight = tablerFilledIcon(
            name = "LayoutSidebarRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.343146f, 21.0f, 3.0f, 19.656855f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 4.343146f, 4.343146f, 3.0f, 6.0f, 3.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.CurveTo(19.656855f, 3.0f, 21.0f, 4.343146f, 21.0f, 6.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 19.656855f, 19.656855f, 21.0f, 18.0f, 21.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 5.0f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(5.447716f, 5.0f, 5.0f, 5.447716f, 5.0f, 6.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(5.0f, 18.552284f, 5.447716f, 19.0f, 6.0f, 19.0f),
                    PathNode.LineTo(14.0f, 19.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _layoutSidebarRight!!
    }

private var _layoutSidebarRight: ImageVector? = null
