package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertTriangle: ImageVector
    get() {
        if (_alertTriangle != null) return _alertTriangle!!
        _alertTriangle = tablerFilledIcon(
            name = "AlertTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.67f),
                    PathNode.CurveTo(12.955f, 1.67f, 13.845f, 2.137f, 14.39f, 2.917f),
                    PathNode.LineTo(14.495f, 3.077f),
                    PathNode.LineTo(22.609f, 16.625f),
                    PathNode.CurveTo(23.110249f, 17.493143f, 23.130072f, 18.557983f, 22.661482f, 19.444181f),
                    PathNode.CurveTo(22.192894f, 20.330378f, 21.301685f, 20.913498f, 20.302f, 20.988f),
                    PathNode.LineTo(20.107f, 20.996f),
                    PathNode.LineTo(3.882f, 20.996f),
                    PathNode.CurveTo(2.881341f, 20.98474f, 1.956459f, 20.460794f, 1.432368f, 19.608282f),
                    PathNode.CurveTo(0.908277f, 18.755772f, 0.8583f, 17.693968f, 1.3f, 16.796f),
                    PathNode.LineTo(1.399f, 16.611f),
                    PathNode.LineTo(9.509f, 3.073f),
                    PathNode.CurveTo(10.037102f, 2.202159f, 10.981543f, 1.670224f, 12.0f, 1.67f),
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
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(11.493025f, 8.000067f, 11.066316f, 8.379507f, 11.007f, 8.883f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(11.007f, 13.117f),
                    PathNode.CurveTo(11.066836f, 13.62005f, 11.493402f, 13.998886f, 12.0f, 13.998886f),
                    PathNode.CurveTo(12.506598f, 13.998886f, 12.933164f, 13.62005f, 12.993f, 13.117f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(12.993f, 8.883f),
                    PathNode.CurveTo(12.933684f, 8.379507f, 12.506975f, 8.000067f, 12.0f, 8.0f),
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
        return _alertTriangle!!
    }

private var _alertTriangle: ImageVector? = null
