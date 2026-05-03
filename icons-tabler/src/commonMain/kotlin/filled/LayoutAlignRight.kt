package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutAlignRight: ImageVector
    get() {
        if (_layoutAlignRight != null) return _layoutAlignRight!!
        _layoutAlignRight = tablerFilledIcon(
            name = "LayoutAlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 3.0f),
                    PathNode.CurveTo(20.552284f, 3.0f, 21.0f, 3.447715f, 21.0f, 4.0f),
                    PathNode.LineTo(21.0f, 20.0f),
                    PathNode.CurveTo(21.0f, 20.552284f, 20.552284f, 21.0f, 20.0f, 21.0f),
                    PathNode.CurveTo(19.447716f, 21.0f, 19.0f, 20.552284f, 19.0f, 20.0f),
                    PathNode.LineTo(19.0f, 4.0f),
                    PathNode.CurveTo(19.0f, 3.447715f, 19.447716f, 3.0f, 20.0f, 3.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 8.0f),
                    PathNode.CurveTo(15.656855f, 8.0f, 17.0f, 9.343145f, 17.0f, 11.0f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.CurveTo(17.0f, 14.656855f, 15.656855f, 16.0f, 14.0f, 16.0f),
                    PathNode.LineTo(6.0f, 16.0f),
                    PathNode.CurveTo(4.343146f, 16.0f, 3.0f, 14.656855f, 3.0f, 13.0f),
                    PathNode.LineTo(3.0f, 11.0f),
                    PathNode.CurveTo(3.0f, 9.343145f, 4.343146f, 8.0f, 6.0f, 8.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _layoutAlignRight!!
    }

private var _layoutAlignRight: ImageVector? = null
