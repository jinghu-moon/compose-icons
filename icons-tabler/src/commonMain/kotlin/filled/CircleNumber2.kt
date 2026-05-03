package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber2: ImageVector
    get() {
        if (_circleNumber2 != null) return _circleNumber2!!
        _circleNumber2 = tablerFilledIcon(
            name = "CircleNumber2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 7.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.LineTo(9.883f, 7.007f),
                    PathNode.CurveTo(9.37995f, 7.066837f, 9.001114f, 7.493403f, 9.001114f, 8.0f),
                    PathNode.CurveTo(9.001114f, 8.506598f, 9.37995f, 8.933164f, 9.883f, 8.993f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(10.85f, 11.005f),
                    PathNode.CurveTo(9.866108f, 11.078939f, 9.083146f, 11.859354f, 9.006f, 12.843f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(9.005f, 15.15f),
                    PathNode.CurveTo(9.078939f, 16.133892f, 9.859354f, 16.916855f, 10.843f, 16.994f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.LineTo(14.117f, 16.993f),
                    PathNode.CurveTo(14.62005f, 16.933163f, 14.998886f, 16.506598f, 14.998886f, 16.0f),
                    PathNode.CurveTo(14.998886f, 15.493402f, 14.62005f, 15.066836f, 14.117f, 15.007f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.15f, 12.995f),
                    PathNode.CurveTo(14.133892f, 12.921061f, 14.916854f, 12.140646f, 14.994f, 11.157f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(14.995f, 8.85f),
                    PathNode.CurveTo(14.921061f, 7.866108f, 14.140646f, 7.083146f, 13.157f, 7.006f),
                    PathNode.LineTo(13.0f, 7.0f),
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
        return _circleNumber2!!
    }

private var _circleNumber2: ImageVector? = null
