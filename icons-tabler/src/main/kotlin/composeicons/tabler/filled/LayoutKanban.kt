package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutKanban: ImageVector
    get() {
        if (_layoutKanban != null) return _layoutKanban!!
        _layoutKanban = tablerFilledIcon(
            name = "LayoutKanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 3.0f),
                    PathNode.CurveTo(10.552285f, 3.0f, 11.0f, 3.447715f, 11.0f, 4.0f),
                    PathNode.CurveTo(11.0f, 4.552285f, 10.552285f, 5.0f, 10.0f, 5.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(3.447715f, 5.0f, 3.0f, 4.552285f, 3.0f, 4.0f),
                    PathNode.CurveTo(3.0f, 3.447715f, 3.447715f, 3.0f, 4.0f, 3.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 3.0f),
                    PathNode.CurveTo(20.552284f, 3.0f, 21.0f, 3.447715f, 21.0f, 4.0f),
                    PathNode.CurveTo(21.0f, 4.552285f, 20.552284f, 5.0f, 20.0f, 5.0f),
                    PathNode.LineTo(14.0f, 5.0f),
                    PathNode.CurveTo(13.447715f, 5.0f, 13.0f, 4.552285f, 13.0f, 4.0f),
                    PathNode.CurveTo(13.0f, 3.447715f, 13.447715f, 3.0f, 14.0f, 3.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 7.0f),
                    PathNode.CurveTo(9.656855f, 7.0f, 11.0f, 8.343146f, 11.0f, 10.0f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.CurveTo(11.0f, 19.656855f, 9.656855f, 21.0f, 8.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.343146f, 21.0f, 3.0f, 19.656855f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 10.0f),
                    PathNode.CurveTo(3.0f, 8.343146f, 4.343146f, 7.0f, 6.0f, 7.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 7.0f),
                    PathNode.CurveTo(19.656855f, 7.0f, 21.0f, 8.343146f, 21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 13.656855f, 19.656855f, 15.0f, 18.0f, 15.0f),
                    PathNode.LineTo(16.0f, 15.0f),
                    PathNode.CurveTo(14.343145f, 15.0f, 13.0f, 13.656855f, 13.0f, 12.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.CurveTo(13.0f, 8.343146f, 14.343145f, 7.0f, 16.0f, 7.0f),
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
        return _layoutKanban!!
    }

private var _layoutKanban: ImageVector? = null
