package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Calendar: ImageVector
    get() {
        if (_calendar != null) return _calendar!!
        _calendar = tablerFilledIcon(
            name = "Calendar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 2.0f),
                    PathNode.CurveTo(16.506975f, 2.000067f, 16.933683f, 2.379507f, 16.993f, 2.883f),
                    PathNode.LineTo(17.0f, 3.0f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(19.588558f, 3.999912f, 20.901804f, 5.238179f, 20.995f, 6.824f),
                    PathNode.LineTo(21.0f, 7.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.000088f, 20.588558f, 19.761822f, 21.901804f, 18.176f, 21.995f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(4.411443f, 22.000088f, 3.098195f, 20.761822f, 3.005f, 19.176f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 7.0f),
                    PathNode.CurveTo(2.999912f, 5.411443f, 4.238179f, 4.098196f, 5.824f, 4.005f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.LineTo(7.0f, 4.0f),
                    PathNode.LineTo(7.0f, 3.0f),
                    PathNode.CurveTo(7.000587f, 2.470907f, 7.413211f, 2.033835f, 7.941395f, 2.002828f),
                    PathNode.CurveTo(8.469579f, 1.971821f, 8.93051f, 2.35761f, 8.993f, 2.883f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.CurveTo(15.0f, 2.447715f, 15.447715f, 2.0f, 16.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(19.0f, 9.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.LineTo(5.0f, 18.625f),
                    PathNode.CurveTo(5.0f, 19.33f, 5.386f, 19.911f, 5.883f, 19.991f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.CurveTo(18.513f, 20.0f, 18.936f, 19.47f, 18.993f, 18.785f),
                    PathNode.LineTo(19.0f, 18.625f),
                    PathNode.LineTo(19.0f, 9.0f),
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.CurveTo(12.506975f, 12.000067f, 12.933684f, 12.379507f, 12.993f, 12.883f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.CurveTo(12.999413f, 16.529093f, 12.586789f, 16.966166f, 12.058605f, 16.997171f),
                    PathNode.CurveTo(11.530421f, 17.02818f, 11.06949f, 16.642391f, 11.007f, 16.117f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.CurveTo(10.470906f, 13.999413f, 10.033835f, 13.586789f, 10.002828f, 13.058605f),
                    PathNode.CurveTo(9.971821f, 12.530421f, 10.35761f, 12.06949f, 10.883f, 12.007f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(12.0f, 12.0f),
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
        return _calendar!!
    }

private var _calendar: ImageVector? = null
