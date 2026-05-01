package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxCenterMiddle: ImageVector
    get() {
        if (_alignBoxCenterMiddle != null) return _alignBoxCenterMiddle!!
        _alignBoxCenterMiddle = tablerFilledIcon(
            name = "AlignBoxCenterMiddle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.CurveTo(20.588558f, 1.999912f, 21.901804f, 3.238179f, 21.995f, 4.824f),
                    PathNode.LineTo(22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.000088f, 20.588558f, 20.761822f, 21.901804f, 19.176f, 21.995f),
                    PathNode.LineTo(19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.420184f, 21.999758f, 2.111268f, 20.774372f, 2.007f, 19.198f),
                    PathNode.LineTo(2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(1.999912f, 3.411442f, 3.238179f, 2.098195f, 4.824f, 2.005f),
                    PathNode.LineTo(5.0f, 2.0f),
                    PathNode.LineTo(19.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 14.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(10.883f, 14.007f),
                    PathNode.CurveTo(10.37995f, 14.066836f, 10.001114f, 14.493402f, 10.001114f, 15.0f),
                    PathNode.CurveTo(10.001114f, 15.506598f, 10.37995f, 15.933164f, 10.883f, 15.993f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.LineTo(13.117f, 15.993f),
                    PathNode.CurveTo(13.62005f, 15.933164f, 13.998886f, 15.506598f, 13.998886f, 15.0f),
                    PathNode.CurveTo(13.998886f, 14.493402f, 13.62005f, 14.066836f, 13.117f, 14.007f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(8.883f, 11.007f),
                    PathNode.CurveTo(8.37995f, 11.066836f, 8.001114f, 11.493402f, 8.001114f, 12.0f),
                    PathNode.CurveTo(8.001114f, 12.506598f, 8.37995f, 12.933164f, 8.883f, 12.993f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.LineTo(15.117f, 12.993f),
                    PathNode.CurveTo(15.62005f, 12.933164f, 15.998886f, 12.506598f, 15.998886f, 12.0f),
                    PathNode.CurveTo(15.998886f, 11.493402f, 15.62005f, 11.066836f, 15.117f, 11.007f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 8.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.LineTo(9.883f, 8.007f),
                    PathNode.CurveTo(9.37995f, 8.066837f, 9.001114f, 8.493402f, 9.001114f, 9.0f),
                    PathNode.CurveTo(9.001114f, 9.506598f, 9.37995f, 9.933164f, 9.883f, 9.993f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.LineTo(14.117f, 9.993f),
                    PathNode.CurveTo(14.62005f, 9.933164f, 14.998886f, 9.506598f, 14.998886f, 9.0f),
                    PathNode.CurveTo(14.998886f, 8.493402f, 14.62005f, 8.066837f, 14.117f, 8.007f),
                    PathNode.LineTo(14.0f, 8.0f),
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
        return _alignBoxCenterMiddle!!
    }

private var _alignBoxCenterMiddle: ImageVector? = null
