package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InfoOctagon: ImageVector
    get() {
        if (_infoOctagon != null) return _infoOctagon!!
        _infoOctagon = tablerFilledIcon(
            name = "InfoOctagon",
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
                    PathNode.MoveTo(12.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(10.883f, 11.007f),
                    PathNode.CurveTo(10.37995f, 11.066836f, 10.001114f, 11.493402f, 10.001114f, 12.0f),
                    PathNode.CurveTo(10.001114f, 12.506598f, 10.37995f, 12.933164f, 10.883f, 12.993f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.LineTo(11.007f, 16.117f),
                    PathNode.CurveTo(11.061188f, 16.57649f, 11.423509f, 16.938812f, 11.883f, 16.993f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(13.117f, 16.993f),
                    PathNode.CurveTo(13.576491f, 16.938812f, 13.938812f, 16.57649f, 13.993f, 16.117f),
                    PathNode.LineTo(14.0f, 16.0f),
                    PathNode.LineTo(13.993f, 15.883f),
                    PathNode.CurveTo(13.944025f, 15.465035f, 13.638621f, 15.122455f, 13.229f, 15.026f),
                    PathNode.LineTo(13.117f, 15.006f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(12.993f, 11.883f),
                    PathNode.CurveTo(12.938812f, 11.423509f, 12.576491f, 11.061188f, 12.117f, 11.007f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.01f, 8.0f),
                    PathNode.LineTo(11.883f, 8.007f),
                    PathNode.CurveTo(11.37995f, 8.066837f, 11.001114f, 8.493402f, 11.001114f, 9.0f),
                    PathNode.CurveTo(11.001114f, 9.506598f, 11.37995f, 9.933164f, 11.883f, 9.993f),
                    PathNode.LineTo(12.0f, 10.0f),
                    PathNode.LineTo(12.127f, 9.993f),
                    PathNode.CurveTo(12.630051f, 9.933164f, 13.008885f, 9.506598f, 13.008885f, 9.0f),
                    PathNode.CurveTo(13.008885f, 8.493402f, 12.630051f, 8.066837f, 12.127f, 8.007f),
                    PathNode.LineTo(12.01f, 8.0f),
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
        return _infoOctagon!!
    }

private var _infoOctagon: ImageVector? = null
