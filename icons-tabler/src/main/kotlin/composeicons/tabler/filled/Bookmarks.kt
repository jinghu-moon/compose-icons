package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = tablerFilledIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(14.209139f, 6.0f, 16.0f, 7.790861f, 16.0f, 10.0f),
                    PathNode.LineTo(16.0f, 21.0f),
                    PathNode.CurveTo(15.999716f, 21.360027f, 15.805922f, 21.69211f, 15.492607f, 21.869461f),
                    PathNode.CurveTo(15.179292f, 22.046814f, 14.794828f, 22.042055f, 14.486f, 21.857f),
                    PathNode.LineTo(10.0f, 19.166f),
                    PathNode.LineTo(5.514f, 21.857f),
                    PathNode.CurveTo(5.222594f, 22.031878f, 4.862316f, 22.046787f, 4.557458f, 21.896582f),
                    PathNode.CurveTo(4.2526f, 21.746376f, 4.044896f, 21.45162f, 4.006f, 21.114f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.CurveTo(4.0f, 7.790861f, 5.790861f, 6.0f, 8.0f, 6.0f),
                    PathNode.LineTo(12.0f, 6.0f),
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
                    PathNode.MoveTo(16.0f, 2.0f),
                    PathNode.CurveTo(18.209139f, 2.0f, 20.0f, 3.790861f, 20.0f, 6.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.CurveTo(20.0f, 17.552284f, 19.552284f, 18.0f, 19.0f, 18.0f),
                    PathNode.CurveTo(18.447716f, 18.0f, 18.0f, 17.552284f, 18.0f, 17.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(18.0f, 4.895431f, 17.10457f, 4.0f, 16.0f, 4.0f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.CurveTo(10.447715f, 4.0f, 10.0f, 3.552285f, 10.0f, 3.0f),
                    PathNode.CurveTo(10.0f, 2.447715f, 10.447715f, 2.0f, 11.0f, 2.0f),
                    PathNode.LineTo(16.0f, 2.0f),
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
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
