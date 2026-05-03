package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber1: ImageVector
    get() {
        if (_circleNumber1 != null) return _circleNumber1!!
        _circleNumber1 = tablerFilledIcon(
            name = "CircleNumber1",
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
                    PathNode.MoveTo(12.994f, 7.886f),
                    PathNode.CurveTo(12.911f, 7.109f, 11.986f, 6.726f, 11.377f, 7.216f),
                    PathNode.LineTo(11.293f, 7.293f),
                    PathNode.LineTo(9.293f, 9.293f),
                    PathNode.LineTo(9.21f, 9.387f),
                    PathNode.CurveTo(8.930111f, 9.747744f, 8.930111f, 10.252256f, 9.21f, 10.613f),
                    PathNode.LineTo(9.293f, 10.707f),
                    PathNode.LineTo(9.387f, 10.79f),
                    PathNode.CurveTo(9.747744f, 11.069889f, 10.252256f, 11.069889f, 10.613f, 10.79f),
                    PathNode.LineTo(10.707f, 10.707f),
                    PathNode.LineTo(11.0f, 10.414f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.LineTo(11.007f, 16.117f),
                    PathNode.CurveTo(11.066836f, 16.62005f, 11.493402f, 16.998886f, 12.0f, 16.998886f),
                    PathNode.CurveTo(12.506598f, 16.998886f, 12.933164f, 16.62005f, 12.993f, 16.117f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(12.994f, 7.886f),
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
        return _circleNumber1!!
    }

private var _circleNumber1: ImageVector? = null
