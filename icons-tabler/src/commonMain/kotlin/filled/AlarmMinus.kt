package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlarmMinus: ImageVector
    get() {
        if (_alarmMinus != null) return _alarmMinus!!
        _alarmMinus = tablerFilledIcon(
            name = "AlarmMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 6.072f),
                    PathNode.CurveTo(19.331173f, 7.995299f, 20.822016f, 12.017038f, 19.5494f, 15.646945f),
                    PathNode.CurveTo(18.276781f, 19.276854f, 14.601013f, 21.487219f, 10.798136f, 20.909378f),
                    PathNode.CurveTo(6.995258f, 20.331537f, 4.141955f, 17.12909f, 4.005f, 13.285f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.LineTo(4.005f, 12.715f),
                    PathNode.CurveTo(4.105063f, 9.909531f, 5.668295f, 7.361783f, 8.124089f, 6.001729f),
                    PathNode.CurveTo(10.579884f, 4.641676f, 13.568864f, 4.668344f, 16.0f, 6.072f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.LineTo(9.883f, 12.007f),
                    PathNode.CurveTo(9.35761f, 12.06949f, 8.971821f, 12.530421f, 9.002828f, 13.058605f),
                    PathNode.CurveTo(9.033835f, 13.586789f, 9.470906f, 13.999413f, 10.0f, 14.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.LineTo(14.117f, 13.993f),
                    PathNode.CurveTo(14.64239f, 13.93051f, 15.028179f, 13.469579f, 14.997172f, 12.941395f),
                    PathNode.CurveTo(14.966165f, 12.413211f, 14.529094f, 12.000587f, 14.0f, 12.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.412f, 3.191f),
                    PathNode.CurveTo(6.839077f, 2.873859f, 7.439688f, 2.946577f, 7.778739f, 3.356475f),
                    PathNode.CurveTo(8.117791f, 3.766374f, 8.076597f, 4.369967f, 7.685f, 4.73f),
                    PathNode.LineTo(7.588f, 4.81f),
                    PathNode.LineTo(4.838f, 6.81f),
                    PathNode.CurveTo(4.410902f, 7.132257f, 3.805817f, 7.061247f, 3.464932f, 6.648865f),
                    PathNode.CurveTo(3.124047f, 6.236482f, 3.168145f, 5.628843f, 3.565f, 5.27f),
                    PathNode.LineTo(3.662f, 5.19f),
                    PathNode.LineTo(6.412f, 3.19f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.191f, 3.412f),
                    PathNode.CurveTo(16.487316f, 3.004455f, 17.040567f, 2.881035f, 17.482f, 3.124f),
                    PathNode.LineTo(17.588f, 3.191f),
                    PathNode.LineTo(20.338f, 5.191f),
                    PathNode.CurveTo(20.764866f, 5.501457f, 20.876944f, 6.090217f, 20.593996f, 6.535794f),
                    PathNode.CurveTo(20.311049f, 6.981371f, 19.730516f, 7.130316f, 19.268f, 6.876f),
                    PathNode.LineTo(19.162f, 6.809f),
                    PathNode.LineTo(16.412f, 4.809f),
                    PathNode.CurveTo(16.197573f, 4.65292f, 16.053928f, 4.418052f, 16.01267f, 4.156064f),
                    PathNode.CurveTo(15.971413f, 3.894075f, 16.03592f, 3.626428f, 16.192f, 3.412f),
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
        return _alarmMinus!!
    }

private var _alarmMinus: ImageVector? = null
