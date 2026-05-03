package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber0: ImageVector
    get() {
        if (_circleNumber0 != null) return _circleNumber0!!
        _circleNumber0 = tablerFilledIcon(
            name = "CircleNumber0",
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(10.411443f, 6.999912f, 9.098195f, 8.238179f, 9.005f, 9.824f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.LineTo(9.005f, 14.176f),
                    PathNode.CurveTo(9.096738f, 15.762952f, 10.410398f, 17.002867f, 12.0f, 17.002867f),
                    PathNode.CurveTo(13.589602f, 17.002867f, 14.903262f, 15.762952f, 14.995f, 14.176f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.LineTo(14.995f, 9.824f),
                    PathNode.CurveTo(14.901805f, 8.238179f, 13.588557f, 6.999912f, 12.0f, 7.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.CurveTo(12.506975f, 9.000067f, 12.933684f, 9.379507f, 12.993f, 9.883f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(12.993f, 14.117f),
                    PathNode.CurveTo(12.933164f, 14.62005f, 12.506598f, 14.998886f, 12.0f, 14.998886f),
                    PathNode.CurveTo(11.493402f, 14.998886f, 11.066836f, 14.62005f, 11.007f, 14.117f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.LineTo(11.007f, 9.883f),
                    PathNode.CurveTo(11.066316f, 9.379507f, 11.493025f, 9.000067f, 12.0f, 9.0f),
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
        return _circleNumber0!!
    }

private var _circleNumber0: ImageVector? = null
