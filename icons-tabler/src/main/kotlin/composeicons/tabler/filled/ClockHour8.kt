package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour8: ImageVector
    get() {
        if (_clockHour8 != null) return _clockHour8!!
        _clockHour8 = tablerFilledIcon(
            name = "ClockHour8",
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
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(11.447715f, 6.0f, 11.0f, 6.447716f, 11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 11.464f),
                    PathNode.LineTo(8.445f, 13.168f),
                    PathNode.CurveTo(8.023102f, 13.449445f, 7.878693f, 14.002151f, 8.109f, 14.454f),
                    PathNode.LineTo(8.168f, 14.554f),
                    PathNode.CurveTo(8.315017f, 14.774849f, 8.543769f, 14.928225f, 8.803903f, 14.980364f),
                    PathNode.CurveTo(9.064036f, 15.032503f, 9.334229f, 14.979133f, 9.555f, 14.832f),
                    PathNode.LineTo(12.582f, 12.814f),
                    PathNode.LineTo(12.669f, 12.744f),
                    PathNode.LineTo(12.743f, 12.669f),
                    PathNode.LineTo(12.818f, 12.575f),
                    PathNode.LineTo(12.87f, 12.495f),
                    PathNode.LineTo(12.905f, 12.425f),
                    PathNode.LineTo(12.956f, 12.293f),
                    PathNode.LineTo(12.987f, 12.158f),
                    PathNode.LineTo(12.997f, 12.076f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.CurveTo(13.0f, 6.447716f, 12.552285f, 6.0f, 12.0f, 6.0f)
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
        return _clockHour8!!
    }

private var _clockHour8: ImageVector? = null
