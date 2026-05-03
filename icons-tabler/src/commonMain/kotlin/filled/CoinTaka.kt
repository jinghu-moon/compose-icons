package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinTaka: ImageVector
    get() {
        if (_coinTaka != null) return _coinTaka!!
        _coinTaka = tablerFilledIcon(
            name = "CoinTaka",
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
                    PathNode.Close,
                    PathNode.MoveTo(10.789f, 7.724f),
                    PathNode.CurveTo(10.295234f, 6.73599f, 9.09404f, 6.335294f, 8.106f, 6.829f),
                    PathNode.LineTo(7.553f, 7.106f),
                    PathNode.CurveTo(7.077481f, 7.362426f, 6.891605f, 7.950177f, 7.133214f, 8.433393f),
                    PathNode.CurveTo(7.374822f, 8.91661f, 7.956548f, 9.12056f, 8.447f, 8.894f),
                    PathNode.LineTo(9.0f, 8.618f),
                    PathNode.LineTo(8.999f, 10.0f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.CurveTo(7.493026f, 10.000067f, 7.066316f, 10.379507f, 7.007f, 10.883f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.CurveTo(7.0f, 11.552285f, 7.447716f, 12.0f, 8.0f, 12.0f),
                    PathNode.LineTo(8.999f, 12.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(8.999911f, 16.588558f, 10.238178f, 17.901804f, 11.824f, 17.995f),
                    PathNode.LineTo(12.0f, 18.0f),
                    PathNode.LineTo(12.5f, 18.0f),
                    PathNode.CurveTo(14.432997f, 18.0f, 16.0f, 16.432997f, 16.0f, 14.5f),
                    PathNode.LineTo(16.0f, 14.0f),
                    PathNode.CurveTo(16.0f, 13.447715f, 15.552285f, 13.0f, 15.0f, 13.0f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.CurveTo(13.447715f, 13.0f, 13.0f, 13.447715f, 13.0f, 14.0f),
                    PathNode.LineTo(13.007f, 14.117f),
                    PathNode.CurveTo(13.061188f, 14.576491f, 13.423509f, 14.938812f, 13.883f, 14.993f),
                    PathNode.LineTo(13.915f, 14.995f),
                    PathNode.LineTo(13.895f, 15.052f),
                    PathNode.CurveTo(13.668515f, 15.62426f, 13.115449f, 16.000107f, 12.5f, 16.0f),
                    PathNode.LineTo(12.0f, 16.0f),
                    PathNode.CurveTo(11.447715f, 16.0f, 11.0f, 15.552285f, 11.0f, 15.0f),
                    PathNode.LineTo(10.999f, 12.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.CurveTo(15.506975f, 11.999933f, 15.933684f, 11.620493f, 15.993f, 11.117f),
                    PathNode.LineTo(16.0f, 11.0f),
                    PathNode.CurveTo(16.0f, 10.447715f, 15.552285f, 10.0f, 15.0f, 10.0f),
                    PathNode.LineTo(10.999f, 10.0f),
                    PathNode.LineTo(11.0f, 8.618f),
                    PathNode.CurveTo(11.00001f, 8.369992f, 10.953893f, 8.124144f, 10.864f, 7.893f),
                    PathNode.LineTo(10.789f, 7.723f),
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
        return _coinTaka!!
    }

private var _coinTaka: ImageVector? = null
