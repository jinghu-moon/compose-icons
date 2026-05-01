package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour11: ImageVector
    get() {
        if (_clockHour11 != null) return _clockHour11!!
        _clockHour11 = tablerFilledIcon(
            name = "ClockHour11",
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
                    PathNode.MoveTo(12.048f, 12.999f),
                    PathNode.LineTo(12.117f, 12.993f),
                    PathNode.LineTo(12.213f, 12.977f),
                    PathNode.LineTo(12.302f, 12.954f),
                    PathNode.LineTo(12.401f, 12.916f),
                    PathNode.LineTo(12.483f, 12.876f),
                    PathNode.LineTo(12.596f, 12.803f),
                    PathNode.LineTo(12.669f, 12.743f),
                    PathNode.LineTo(12.743f, 12.669f),
                    PathNode.LineTo(12.818f, 12.575f),
                    PathNode.LineTo(12.87f, 12.495f),
                    PathNode.LineTo(12.905f, 12.425f),
                    PathNode.LineTo(12.956f, 12.293f),
                    PathNode.LineTo(12.987f, 12.158f),
                    PathNode.LineTo(12.997f, 12.076f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.CurveTo(13.0f, 6.447716f, 12.552285f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(11.447715f, 6.0f, 11.0f, 6.447716f, 11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 8.697f),
                    PathNode.LineTo(10.832f, 8.445f),
                    PathNode.CurveTo(10.550555f, 8.023102f, 9.997849f, 7.878693f, 9.546f, 8.109f),
                    PathNode.LineTo(9.446f, 8.168f),
                    PathNode.CurveTo(9.225151f, 8.315017f, 9.071775f, 8.543769f, 9.019636f, 8.803903f),
                    PathNode.CurveTo(8.967497f, 9.064036f, 9.020867f, 9.334229f, 9.168f, 9.555f),
                    PathNode.LineTo(11.186f, 12.582f),
                    PathNode.LineTo(11.256f, 12.669f),
                    PathNode.LineTo(11.331f, 12.743f),
                    PathNode.LineTo(11.425f, 12.818f),
                    PathNode.LineTo(11.505f, 12.87f),
                    PathNode.LineTo(11.575f, 12.905f),
                    PathNode.LineTo(11.707f, 12.956f),
                    PathNode.LineTo(11.842f, 12.987f),
                    PathNode.LineTo(11.924f, 12.997f),
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
        return _clockHour11!!
    }

private var _clockHour11: ImageVector? = null
