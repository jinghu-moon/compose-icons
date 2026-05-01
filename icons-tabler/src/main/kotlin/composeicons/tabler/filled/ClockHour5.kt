package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour5: ImageVector
    get() {
        if (_clockHour5 != null) return _clockHour5!!
        _clockHour5 = tablerFilledIcon(
            name = "ClockHour5",
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
                    PathNode.LineTo(11.164f, 12.548f),
                    PathNode.LineTo(13.168f, 15.555f),
                    PathNode.CurveTo(13.474518f, 16.014502f, 14.095499f, 16.138517f, 14.555f, 15.832f),
                    PathNode.CurveTo(15.014501f, 15.525482f, 15.138518f, 14.904501f, 14.832f, 14.445f),
                    PathNode.LineTo(13.0f, 11.697f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.CurveTo(12.999933f, 6.493026f, 12.620493f, 6.066316f, 12.117f, 6.007f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.CurveTo(11.447715f, 6.0f, 11.0f, 6.447716f, 11.0f, 7.0f)
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
        return _clockHour5!!
    }

private var _clockHour5: ImageVector? = null
