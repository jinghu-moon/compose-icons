package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodHappy: ImageVector
    get() {
        if (_moodHappy != null) return _moodHappy!!
        _moodHappy = tablerFilledIcon(
            name = "MoodHappy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.1674f, 5.746208f, 23.030024f, 10.779379f, 21.433f, 15.318825f),
                    PathNode.CurveTo(19.835976f, 19.858273f, 15.232252f, 22.616514f, 10.476249f, 21.883377f),
                    PathNode.CurveTo(5.720245f, 21.15024f, 2.160861f, 17.133654f, 2.005f, 12.324f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.118919f, 8.162982f, 4.068822f, 4.967704f, 7.140892f, 3.259883f),
                    PathNode.CurveTo(10.212963f, 1.552061f, 13.95609f, 1.582479f, 17.0f, 3.34f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 13.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.CurveTo(8.447715f, 13.0f, 8.0f, 13.447715f, 8.0f, 14.0f),
                    PathNode.LineTo(8.0f, 14.05f),
                    PathNode.CurveTo(8.000036f, 16.168344f, 9.661285f, 17.914482f, 11.777f, 18.02f),
                    PathNode.LineTo(12.004f, 18.025f),
                    PathNode.CurveTo(14.124601f, 18.00968f, 15.869744f, 16.352015f, 15.994f, 14.235f),
                    PathNode.LineTo(16.0f, 14.029f),
                    PathNode.CurveTo(16.00784f, 13.758796f, 15.905953f, 13.496927f, 15.717561f, 13.303071f),
                    PathNode.CurveTo(15.529168f, 13.109215f, 15.270318f, 12.999887f, 15.0f, 13.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.01f, 8.0f),
                    PathNode.LineTo(8.883f, 8.007f),
                    PathNode.CurveTo(8.35761f, 8.069491f, 7.971821f, 8.530421f, 8.002828f, 9.058605f),
                    PathNode.CurveTo(8.033836f, 9.586789f, 8.470906f, 9.999413f, 9.0f, 10.0f),
                    PathNode.LineTo(9.127f, 9.993f),
                    PathNode.CurveTo(9.65239f, 9.93051f, 10.038179f, 9.469579f, 10.007172f, 8.941395f),
                    PathNode.CurveTo(9.976165f, 8.413211f, 9.539093f, 8.000587f, 9.01f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.01f, 8.0f),
                    PathNode.LineTo(14.883f, 8.007f),
                    PathNode.CurveTo(14.35761f, 8.069491f, 13.971821f, 8.530421f, 14.002828f, 9.058605f),
                    PathNode.CurveTo(14.033835f, 9.586789f, 14.470906f, 9.999413f, 15.0f, 10.0f),
                    PathNode.LineTo(15.127f, 9.993f),
                    PathNode.CurveTo(15.65239f, 9.93051f, 16.03818f, 9.469579f, 16.007172f, 8.941395f),
                    PathNode.CurveTo(15.976165f, 8.413211f, 15.539093f, 8.000587f, 15.01f, 8.0f),
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
        return _moodHappy!!
    }

private var _moodHappy: ImageVector? = null
