package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceTablet: ImageVector
    get() {
        if (_deviceTablet != null) return _deviceTablet!!
        _deviceTablet = tablerFilledIcon(
            name = "DeviceTablet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.CurveTo(19.046625f, 1.999669f, 19.916504f, 2.806323f, 19.995f, 3.85f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.CurveTo(20.000332f, 21.046625f, 19.193678f, 21.916504f, 18.15f, 21.995f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(4.953376f, 22.000332f, 4.083497f, 21.193678f, 4.005f, 20.15f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(3.999669f, 2.953375f, 4.806323f, 2.083497f, 5.85f, 2.005f),
                    PathNode.LineTo(6.0f, 2.0f),
                    PathNode.LineTo(18.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.CurveTo(11.012398f, 14.999958f, 10.172622f, 15.720798f, 10.023f, 16.697f),
                    PathNode.LineTo(10.005f, 16.851f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.LineTo(10.005f, 17.15f),
                    PathNode.CurveTo(10.086374f, 18.231937f, 11.015568f, 19.05167f, 12.099209f, 18.997507f),
                    PathNode.CurveTo(13.182849f, 18.943342f, 14.02567f, 18.03504f, 13.998752f, 16.95038f),
                    PathNode.CurveTo(13.971833f, 15.865721f, 13.084993f, 15.000343f, 12.0f, 15.0f),
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
        return _deviceTablet!!
    }

private var _deviceTablet: ImageVector? = null
