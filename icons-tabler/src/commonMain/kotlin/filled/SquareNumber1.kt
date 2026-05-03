package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareNumber1: ImageVector
    get() {
        if (_squareNumber1 != null) return _squareNumber1!!
        _squareNumber1 = tablerFilledIcon(
            name = "SquareNumber1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.333f, 2.0f),
                    PathNode.CurveTo(20.293f, 2.0f, 21.893f, 3.537f, 21.995f, 5.472f),
                    PathNode.LineTo(22.0f, 5.667f),
                    PathNode.LineTo(22.0f, 18.333f),
                    PathNode.CurveTo(22.0f, 20.293f, 20.463f, 21.893f, 18.528f, 21.995f),
                    PathNode.LineTo(18.333f, 22.0f),
                    PathNode.LineTo(5.667f, 22.0f),
                    PathNode.CurveTo(3.717474f, 22.000101f, 2.10867f, 20.474768f, 2.005f, 18.528f),
                    PathNode.LineTo(2.0f, 18.333f),
                    PathNode.LineTo(2.0f, 5.667f),
                    PathNode.CurveTo(2.0f, 3.707f, 3.537f, 2.107f, 5.472f, 2.005f),
                    PathNode.LineTo(5.667f, 2.0f),
                    PathNode.LineTo(18.333f, 2.0f),
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
        return _squareNumber1!!
    }

private var _squareNumber1: ImageVector? = null
