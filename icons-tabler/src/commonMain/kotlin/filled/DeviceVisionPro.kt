package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceVisionPro: ImageVector
    get() {
        if (_deviceVisionPro != null) return _deviceVisionPro!!
        _deviceVisionPro = tablerFilledIcon(
            name = "DeviceVisionPro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.QuadTo(13.74f, 6.0f, 15.342f, 6.106f),
                    PathNode.QuadTo(16.961f, 6.213f, 18.315f, 6.554f),
                    PathNode.QuadTo(19.703f, 6.899f, 20.751f, 7.604f),
                    PathNode.CurveTo(21.464663f, 8.08533f, 22.03893f, 8.746171f, 22.416f, 9.52f),
                    PathNode.CurveTo(22.813f, 10.321f, 23.0f, 11.289f, 23.0f, 12.43f),
                    PathNode.CurveTo(23.0f, 13.586f, 22.778f, 14.638f, 22.327f, 15.57f),
                    PathNode.CurveTo(21.877f, 16.504f, 21.254f, 17.255f, 20.459f, 17.806f),
                    PathNode.CurveTo(19.658058f, 18.362076f, 18.703999f, 18.655285f, 17.729f, 18.645f),
                    PathNode.QuadTo(16.797f, 18.646f, 16.026f, 18.382f),
                    PathNode.CurveTo(15.546017f, 18.217756f, 15.085311f, 18.001822f, 14.652f, 17.738f),
                    PathNode.CurveTo(14.274946f, 17.505001f, 13.905743f, 17.259533f, 13.545f, 17.002f),
                    PathNode.CurveTo(13.257589f, 16.793205f, 12.95659f, 16.603785f, 12.644f, 16.435f),
                    PathNode.CurveTo(12.446788f, 16.32611f, 12.226211f, 16.266422f, 12.001f, 16.261f),
                    PathNode.CurveTo(11.792f, 16.261f, 11.575f, 16.318f, 11.343f, 16.441f),
                    PathNode.QuadTo(10.923f, 16.667f, 10.45f, 17.005f),
                    PathNode.CurveTo(10.089869f, 17.26148f, 9.721334f, 17.505947f, 9.345f, 17.738f),
                    PathNode.CurveTo(8.914901f, 18.002028f, 8.456746f, 18.217354f, 7.979f, 18.38f),
                    PathNode.CurveTo(7.434737f, 18.560465f, 6.864374f, 18.64967f, 6.291f, 18.644f),
                    PathNode.CurveTo(5.309307f, 18.658752f, 4.34764f, 18.365707f, 3.541f, 17.806f),
                    PathNode.CurveTo(2.747f, 17.256f, 2.123f, 16.504f, 1.673f, 15.572f),
                    PathNode.QuadTo(0.998f, 14.165f, 1.0f, 12.432f),
                    PathNode.CurveTo(0.995f, 11.297f, 1.182f, 10.327f, 1.577f, 9.532f),
                    PathNode.CurveTo(1.954826f, 8.753542f, 2.532057f, 8.089019f, 3.25f, 7.606f),
                    PathNode.CurveTo(3.949f, 7.136f, 4.761f, 6.79f, 5.692f, 6.557f),
                    PathNode.CurveTo(6.666219f, 6.320784f, 7.659423f, 6.171201f, 8.66f, 6.11f),
                    PathNode.QuadTo(10.259f, 6.0f, 12.0f, 6.0f)
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
        return _deviceVisionPro!!
    }

private var _deviceVisionPro: ImageVector? = null
