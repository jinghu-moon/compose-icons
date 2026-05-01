package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Registered: ImageVector
    get() {
        if (_registered != null) return _registered!!
        _registered = tablerFilledIcon(
            name = "Registered",
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
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.CurveTo(9.447715f, 8.0f, 9.0f, 8.447715f, 9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 15.552285f, 9.447715f, 16.0f, 10.0f, 16.0f),
                    PathNode.LineTo(10.117f, 15.993f),
                    PathNode.CurveTo(10.620493f, 15.933684f, 10.999933f, 15.506975f, 11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(11.585f, 14.0f),
                    PathNode.LineTo(13.293f, 15.707f),
                    PathNode.CurveTo(13.685379f, 16.085972f, 14.309085f, 16.080553f, 14.694818f, 15.694818f),
                    PathNode.CurveTo(15.080552f, 15.309085f, 15.085972f, 14.685379f, 14.707f, 14.293f),
                    PathNode.LineTo(13.807f, 13.394f),
                    PathNode.CurveTo(14.835843f, 12.617008f, 15.253191f, 11.269547f, 14.843651f, 10.047046f),
                    PathNode.CurveTo(14.434111f, 8.824544f, 13.289276f, 8.000418f, 12.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(12.552285f, 10.0f, 13.0f, 10.447715f, 13.0f, 11.0f),
                    PathNode.CurveTo(13.0f, 11.552285f, 12.552285f, 12.0f, 12.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(11.0f, 10.0f),
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
        return _registered!!
    }

private var _registered: ImageVector? = null
