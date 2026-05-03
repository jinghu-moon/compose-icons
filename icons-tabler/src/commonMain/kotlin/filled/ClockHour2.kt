package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour2: ImageVector
    get() {
        if (_clockHour2 != null) return _clockHour2!!
        _clockHour2 = tablerFilledIcon(
            name = "ClockHour2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.202793f, 5.766485f, 23.05675f, 10.86025f, 21.396896f, 15.420535f),
                    PathNode.CurveTo(19.737045f, 19.98082f, 15.042578f, 22.691092f, 10.263351f, 21.848303f),
                    PathNode.CurveTo(5.484125f, 21.005512f, 1.999877f, 16.852968f, 2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.118919f, 8.162982f, 4.068822f, 4.967704f, 7.140892f, 3.259883f),
                    PathNode.CurveTo(10.212963f, 1.552061f, 13.95609f, 1.582479f, 17.0f, 3.34f),
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 12.022f),
                    PathNode.LineTo(11.003f, 12.076f),
                    PathNode.LineTo(11.023f, 12.211f),
                    PathNode.LineTo(11.028f, 12.236f),
                    PathNode.CurveTo(11.04183f, 12.292524f, 11.060568f, 12.347734f, 11.084f, 12.401f),
                    PathNode.LineTo(11.124f, 12.483f),
                    PathNode.LineTo(11.186f, 12.582f),
                    PathNode.LineTo(11.256f, 12.669f),
                    PathNode.LineTo(11.331f, 12.743f),
                    PathNode.LineTo(11.425f, 12.818f),
                    PathNode.LineTo(11.505f, 12.87f),
                    PathNode.LineTo(11.575f, 12.905f),
                    PathNode.LineTo(11.707f, 12.956f),
                    PathNode.LineTo(11.842f, 12.987f),
                    PathNode.LineTo(11.924f, 12.997f),
                    PathNode.LineTo(12.048f, 12.999f),
                    PathNode.LineTo(12.161f, 12.987f),
                    PathNode.LineTo(12.269f, 12.963f),
                    PathNode.LineTo(12.375f, 12.927f),
                    PathNode.LineTo(12.483f, 12.876f),
                    PathNode.LineTo(12.548f, 12.836f),
                    PathNode.LineTo(15.555f, 10.832f),
                    PathNode.CurveTo(16.014502f, 10.525482f, 16.138517f, 9.904501f, 15.832f, 9.445f),
                    PathNode.CurveTo(15.525482f, 8.985499f, 14.904501f, 8.861482f, 14.445f, 9.168f),
                    PathNode.LineTo(13.0f, 10.13f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.CurveTo(12.999933f, 6.493026f, 12.620493f, 6.066316f, 12.117f, 6.007f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.CurveTo(11.447715f, 6.0f, 11.0f, 6.447716f, 11.0f, 7.0f)
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
        return _clockHour2!!
    }

private var _clockHour2: ImageVector? = null
