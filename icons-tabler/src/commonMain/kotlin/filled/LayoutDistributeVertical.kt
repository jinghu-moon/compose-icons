package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutDistributeVertical: ImageVector
    get() {
        if (_layoutDistributeVertical != null) return _layoutDistributeVertical!!
        _layoutDistributeVertical = tablerFilledIcon(
            name = "LayoutDistributeVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 3.0f),
                    PathNode.CurveTo(4.552285f, 3.0f, 5.0f, 3.447715f, 5.0f, 4.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(5.0f, 20.552284f, 4.552285f, 21.0f, 4.0f, 21.0f),
                    PathNode.CurveTo(3.447715f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f),
                    PathNode.LineTo(3.0f, 4.0f),
                    PathNode.CurveTo(3.0f, 3.447715f, 3.447715f, 3.0f, 4.0f, 3.0f)
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
                    PathNode.MoveTo(13.0f, 5.0f),
                    PathNode.CurveTo(14.656855f, 5.0f, 16.0f, 6.343146f, 16.0f, 8.0f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 17.656855f, 14.656855f, 19.0f, 13.0f, 19.0f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.CurveTo(9.343145f, 19.0f, 8.0f, 17.656855f, 8.0f, 16.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.CurveTo(8.0f, 6.343146f, 9.343145f, 5.0f, 11.0f, 5.0f),
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
        return _layoutDistributeVertical!!
    }

private var _layoutDistributeVertical: ImageVector? = null
