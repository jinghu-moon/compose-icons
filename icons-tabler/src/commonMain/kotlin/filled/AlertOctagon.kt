package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertOctagon: ImageVector
    get() {
        if (_alertOctagon != null) return _alertOctagon!!
        _alertOctagon = tablerFilledIcon(
            name = "AlertOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.897f, 1.0f),
                    PathNode.CurveTo(15.879652f, 0.999947f, 16.827942f, 1.361607f, 17.561f, 2.016f),
                    PathNode.LineTo(17.726f, 2.172f),
                    PathNode.LineTo(21.826f, 6.272f),
                    PathNode.CurveTo(22.5225f, 6.967108f, 22.938341f, 7.89456f, 22.994f, 8.877f),
                    PathNode.LineTo(23.0f, 9.104f),
                    PathNode.LineTo(23.0f, 14.898f),
                    PathNode.CurveTo(23.000053f, 15.880651f, 22.638393f, 16.828941f, 21.984f, 17.562f),
                    PathNode.LineTo(21.828f, 17.727f),
                    PathNode.LineTo(17.728f, 21.827f),
                    PathNode.CurveTo(17.033398f, 22.523052f, 16.106739f, 22.938856f, 15.125f, 22.995f),
                    PathNode.LineTo(14.898f, 23.001f),
                    PathNode.LineTo(9.103f, 23.001f),
                    PathNode.CurveTo(8.120199f, 23.000872f, 7.171861f, 22.638838f, 6.439f, 21.984f),
                    PathNode.LineTo(6.274f, 21.828f),
                    PathNode.LineTo(2.174f, 17.728f),
                    PathNode.CurveTo(1.477724f, 17.033144f, 1.061902f, 16.106089f, 1.006f, 15.124f),
                    PathNode.LineTo(1.0f, 14.897f),
                    PathNode.LineTo(1.0f, 9.103f),
                    PathNode.CurveTo(0.999947f, 8.120348f, 1.361607f, 7.172058f, 2.016f, 6.439f),
                    PathNode.LineTo(2.172f, 6.274f),
                    PathNode.LineTo(6.272f, 2.174f),
                    PathNode.CurveTo(6.967108f, 1.4775f, 7.89456f, 1.06166f, 8.877f, 1.006f),
                    PathNode.LineTo(9.104f, 1.0f),
                    PathNode.LineTo(14.897f, 1.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.01f, 15.0f),
                    PathNode.LineTo(11.883f, 15.007f),
                    PathNode.CurveTo(11.37995f, 15.066836f, 11.001114f, 15.493402f, 11.001114f, 16.0f),
                    PathNode.CurveTo(11.001114f, 16.506598f, 11.37995f, 16.933163f, 11.883f, 16.993f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.LineTo(12.127f, 16.993f),
                    PathNode.CurveTo(12.630051f, 16.933163f, 13.008885f, 16.506598f, 13.008885f, 16.0f),
                    PathNode.CurveTo(13.008885f, 15.493402f, 12.630051f, 15.066836f, 12.127f, 15.007f),
                    PathNode.LineTo(12.01f, 15.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(11.493025f, 7.000067f, 11.066316f, 7.379507f, 11.007f, 7.883f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(11.007f, 12.117f),
                    PathNode.CurveTo(11.066836f, 12.62005f, 11.493402f, 12.998886f, 12.0f, 12.998886f),
                    PathNode.CurveTo(12.506598f, 12.998886f, 12.933164f, 12.62005f, 12.993f, 12.117f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(12.993f, 7.883f),
                    PathNode.CurveTo(12.933684f, 7.379507f, 12.506975f, 7.000067f, 12.0f, 7.0f),
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
        return _alertOctagon!!
    }

private var _alertOctagon: ImageVector? = null
