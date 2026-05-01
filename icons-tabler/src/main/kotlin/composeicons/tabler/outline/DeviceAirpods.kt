package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceAirpods: ImageVector
    get() {
        if (_deviceAirpods != null) return _deviceAirpods!!
        _deviceAirpods = tablerOutlineIcon(
            name = "DeviceAirpods",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 4.0f),
                    PathNode.CurveTo(8.133334f, 3.997332f, 9.893335f, 5.669333f, 10.0f, 7.8f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.LineTo(10.0f, 18.5f),
                    PathNode.CurveTo(10.0f, 19.328426f, 9.328427f, 20.0f, 8.5f, 20.0f),
                    PathNode.CurveTo(7.671573f, 20.0f, 7.0f, 19.328426f, 7.0f, 18.5f),
                    PathNode.LineTo(7.0f, 12.0f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.CurveTo(3.866666f, 12.002668f, 2.106665f, 10.330667f, 2.0f, 8.2f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 5.790861f, 3.790861f, 4.0f, 6.0f, 4.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 4.0f),
                    PathNode.CurveTo(15.866666f, 3.997332f, 14.106665f, 5.669333f, 14.0f, 7.8f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.LineTo(14.0f, 18.5f),
                    PathNode.CurveTo(14.0f, 19.328426f, 14.671573f, 20.0f, 15.5f, 20.0f),
                    PathNode.CurveTo(16.328426f, 20.0f, 17.0f, 19.328426f, 17.0f, 18.5f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.CurveTo(20.133333f, 12.002668f, 21.893335f, 10.330667f, 22.0f, 8.2f),
                    PathNode.LineTo(22.0f, 8.0f),
                    PathNode.CurveTo(22.0f, 5.790861f, 20.209139f, 4.0f, 18.0f, 4.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _deviceAirpods!!
    }

private var _deviceAirpods: ImageVector? = null
