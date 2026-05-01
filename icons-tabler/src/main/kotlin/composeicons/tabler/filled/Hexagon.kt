package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Hexagon: ImageVector
    get() {
        if (_hexagon != null) return _hexagon!!
        _hexagon = tablerFilledIcon(
            name = "Hexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.425f, 1.414f),
                    PathNode.LineTo(3.65f, 5.41f),
                    PathNode.CurveTo(2.631057f, 5.976596f, 1.999434f, 7.051121f, 2.0f, 8.217f),
                    PathNode.LineTo(2.0f, 15.502f),
                    PathNode.CurveTo(2.001581f, 16.679667f, 2.644772f, 17.762896f, 3.678f, 18.328f),
                    PathNode.LineTo(10.373f, 22.565f),
                    PathNode.CurveTo(11.407f, 23.135f, 12.593f, 23.135f, 13.573f, 22.597f),
                    PathNode.LineTo(20.377f, 18.295f),
                    PathNode.CurveTo(21.357f, 17.758f, 22.0f, 16.677f, 22.0f, 15.502f),
                    PathNode.LineTo(22.0f, 8.218001f),
                    PathNode.LineTo(21.995f, 8.014f),
                    PathNode.CurveTo(21.93949f, 7.06722f, 21.469797f, 6.192948f, 20.711f, 5.624f),
                    PathNode.LineTo(20.604f, 5.549f),
                    PathNode.LineTo(20.597f, 5.542f),
                    PathNode.CurveTo(20.541483f, 5.491462f, 20.480816f, 5.446885f, 20.416f, 5.409f),
                    PathNode.LineTo(13.64f, 1.414f),
                    PathNode.CurveTo(12.63905f, 0.862041f, 11.424951f, 0.862041f, 10.424f, 1.414f),
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
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
