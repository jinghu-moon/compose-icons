package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceVisionPro: ImageVector
    get() {
        if (_deviceVisionPro != null) return _deviceVisionPro!!
        _deviceVisionPro = tablerOutlineIcon(
            name = "DeviceVisionPro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(13.143f, 7.0f, 14.235f, 7.035f, 15.275f, 7.104f),
                    PathNode.CurveTo(16.292f, 7.172f, 17.225f, 7.311f, 18.073f, 7.524f),
                    PathNode.CurveTo(18.886f, 7.727f, 19.593f, 8.029001f, 20.192f, 8.433f),
                    PathNode.CurveTo(20.761753f, 8.817493f, 21.219868f, 9.345634f, 21.52f, 9.964f),
                    PathNode.CurveTo(21.846f, 10.621f, 22.0f, 11.444f, 22.0f, 12.43f),
                    PathNode.CurveTo(22.0f, 13.436f, 21.811f, 14.34f, 21.426f, 15.137f),
                    PathNode.CurveTo(21.051f, 15.916f, 20.54f, 16.533f, 19.889f, 16.985f),
                    PathNode.CurveTo(19.255505f, 17.424992f, 18.500229f, 17.655771f, 17.729f, 17.645f),
                    PathNode.CurveTo(17.22f, 17.645f, 16.759f, 17.577f, 16.347f, 17.435f),
                    PathNode.CurveTo(15.937933f, 17.296167f, 15.545532f, 17.112377f, 15.177f, 16.887f),
                    PathNode.CurveTo(14.820886f, 16.667252f, 14.472351f, 16.43545f, 14.132f, 16.192f),
                    PathNode.CurveTo(13.812342f, 15.960525f, 13.477969f, 15.750081f, 13.131f, 15.562f),
                    PathNode.CurveTo(12.785292f, 15.369094f, 12.396861f, 15.265627f, 12.001f, 15.261f),
                    PathNode.CurveTo(11.628f, 15.261f, 11.251f, 15.358f, 10.869f, 15.561f),
                    PathNode.CurveTo(10.553f, 15.731f, 10.219f, 15.941f, 9.869f, 16.191f),
                    PathNode.CurveTo(9.547f, 16.421f, 9.199f, 16.653f, 8.822f, 16.886f),
                    PathNode.CurveTo(8.454337f, 17.111683f, 8.062564f, 17.295494f, 7.654f, 17.434f),
                    PathNode.CurveTo(7.241f, 17.576f, 6.782f, 17.644f, 6.276f, 17.644f),
                    PathNode.CurveTo(5.503275f, 17.65544f, 4.746304f, 17.425026f, 4.111f, 16.985f),
                    PathNode.CurveTo(3.46f, 16.533f, 2.949f, 15.915f, 2.574f, 15.137f),
                    PathNode.CurveTo(2.189f, 14.339f, 2.0f, 13.437f, 2.0f, 12.428f),
                    PathNode.CurveTo(1.996f, 11.448f, 2.15f, 10.626f, 2.477f, 9.968f),
                    PathNode.CurveTo(2.777447f, 9.349232f, 3.236319f, 8.821012f, 3.807f, 8.437f),
                    PathNode.CurveTo(4.407f, 8.034001f, 5.114f, 7.733f, 5.927f, 7.53f),
                    PathNode.CurveTo(6.846086f, 7.306973f, 7.783048f, 7.165425f, 8.727f, 7.107f),
                    PathNode.CurveTo(9.767f, 7.036f, 10.857f, 7.0f, 12.0f, 7.0f)
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
        return _deviceVisionPro!!
    }

private var _deviceVisionPro: ImageVector? = null
