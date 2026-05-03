package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutBoard: ImageVector
    get() {
        if (_layoutBoard != null) return _layoutBoard!!
        _layoutBoard = tablerFilledIcon(
            name = "LayoutBoard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 3.0f),
                    PathNode.LineTo(10.0f, 3.0f),
                    PathNode.CurveTo(10.552285f, 3.0f, 11.0f, 3.447715f, 11.0f, 4.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.CurveTo(11.0f, 7.552285f, 10.552285f, 8.0f, 10.0f, 8.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.CurveTo(3.447715f, 8.0f, 3.0f, 7.552285f, 3.0f, 7.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.895431f, 3.895431f, 3.0f, 5.0f, 3.0f)
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
                    PathNode.MoveTo(14.0f, 3.0f),
                    PathNode.LineTo(19.0f, 3.0f),
                    PathNode.CurveTo(20.10457f, 3.0f, 21.0f, 3.895431f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 13.0f),
                    PathNode.CurveTo(21.0f, 13.552285f, 20.552284f, 14.0f, 20.0f, 14.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.CurveTo(13.447715f, 14.0f, 13.0f, 13.552285f, 13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 4.0f),
                    PathNode.CurveTo(13.0f, 3.447715f, 13.447715f, 3.0f, 14.0f, 3.0f)
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
                    PathNode.MoveTo(14.0f, 16.0f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.CurveTo(20.552284f, 16.0f, 21.0f, 16.447716f, 21.0f, 17.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.10457f, 20.10457f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(14.0f, 21.0f),
                    PathNode.CurveTo(13.447715f, 21.0f, 13.0f, 20.552284f, 13.0f, 20.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.CurveTo(13.0f, 16.447716f, 13.447715f, 16.0f, 14.0f, 16.0f)
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
                    PathNode.MoveTo(4.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.CurveTo(10.552285f, 10.0f, 11.0f, 10.447715f, 11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.CurveTo(11.0f, 20.552284f, 10.552285f, 21.0f, 10.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.895431f, 21.0f, 3.0f, 20.10457f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 11.0f),
                    PathNode.CurveTo(3.0f, 10.447715f, 3.447715f, 10.0f, 4.0f, 10.0f)
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
        return _layoutBoard!!
    }

private var _layoutBoard: ImageVector? = null
