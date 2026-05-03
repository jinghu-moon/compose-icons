package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClockHour10: ImageVector
    get() {
        if (_clockHour10 != null) return _clockHour10!!
        _clockHour10 = tablerFilledIcon(
            name = "ClockHour10",
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
                    PathNode.LineTo(12.885f, 12.465f),
                    PathNode.LineTo(12.916f, 12.401f),
                    PathNode.LineTo(12.948f, 12.32f),
                    PathNode.LineTo(12.978f, 12.211f),
                    PathNode.LineTo(12.993f, 12.117f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.CurveTo(13.0f, 6.447716f, 12.552285f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(11.447715f, 6.0f, 11.0f, 6.447716f, 11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 10.131f),
                    PathNode.LineTo(9.555f, 9.168f),
                    PathNode.CurveTo(9.132906f, 8.886276f, 8.566718f, 8.965379f, 8.238f, 9.352f),
                    PathNode.LineTo(8.168f, 9.445f),
                    PathNode.CurveTo(8.020772f, 9.66565f, 7.967243f, 9.935756f, 8.019193f, 10.195879f),
                    PathNode.CurveTo(8.071142f, 10.456001f, 8.224313f, 10.684827f, 8.445f, 10.832f),
                    PathNode.LineTo(11.483f, 12.856f),
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
        return _clockHour10!!
    }

private var _clockHour10: ImageVector? = null
