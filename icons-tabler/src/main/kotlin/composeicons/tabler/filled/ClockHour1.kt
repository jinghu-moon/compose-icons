package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour1: ImageVector
    get() {
        if (_clockHour1 != null) return _clockHour1!!
        _clockHour1 = tablerFilledIcon(
            name = "ClockHour1",
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
                    PathNode.MoveTo(11.599f, 12.916f),
                    PathNode.LineTo(11.651f, 12.937f),
                    PathNode.LineTo(11.731f, 12.963f),
                    PathNode.LineTo(11.811f, 12.982f),
                    PathNode.LineTo(11.883f, 12.993f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.LineTo(12.076f, 12.997f),
                    PathNode.LineTo(12.211f, 12.977f),
                    PathNode.LineTo(12.293f, 12.957f),
                    PathNode.LineTo(12.396f, 12.918f),
                    PathNode.LineTo(12.469f, 12.883f),
                    PathNode.LineTo(12.547f, 12.837f),
                    PathNode.LineTo(12.607f, 12.795f),
                    PathNode.LineTo(12.687f, 12.726f),
                    PathNode.LineTo(12.77f, 12.638f),
                    PathNode.LineTo(12.832f, 12.555f),
                    PathNode.LineTo(14.832f, 9.555f),
                    PathNode.CurveTo(15.138518f, 9.095499f, 15.014501f, 8.474518f, 14.555f, 8.168f),
                    PathNode.CurveTo(14.095499f, 7.861482f, 13.474518f, 7.985499f, 13.168f, 8.445f),
                    PathNode.LineTo(13.0f, 8.696f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.CurveTo(12.999933f, 6.493026f, 12.620493f, 6.066316f, 12.117f, 6.007f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.CurveTo(11.447715f, 6.0f, 11.0f, 6.447716f, 11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 12.026f),
                    PathNode.LineTo(11.009f, 12.131f),
                    PathNode.LineTo(11.029f, 12.238f),
                    PathNode.LineTo(11.069f, 12.367f),
                    PathNode.LineTo(11.117f, 12.469f),
                    PathNode.LineTo(11.163f, 12.547f),
                    PathNode.LineTo(11.205f, 12.607f),
                    PathNode.LineTo(11.274f, 12.687f),
                    PathNode.LineTo(11.362f, 12.77f),
                    PathNode.LineTo(11.445f, 12.832f),
                    PathNode.LineTo(11.535f, 12.885f),
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
        return _clockHour1!!
    }

private var _clockHour1: ImageVector? = null
