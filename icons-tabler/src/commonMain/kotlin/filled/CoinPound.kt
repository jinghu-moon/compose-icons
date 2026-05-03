package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinPound: ImageVector
    get() {
        if (_coinPound != null) return _coinPound!!
        _coinPound = tablerFilledIcon(
            name = "CoinPound",
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
                    PathNode.MoveTo(13.0f, 6.0f),
                    PathNode.CurveTo(11.343145f, 6.0f, 10.0f, 7.343146f, 10.0f, 9.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.CurveTo(8.493025f, 11.000067f, 8.066316f, 11.379507f, 8.007f, 11.883f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 12.552285f, 8.447715f, 13.0f, 9.0f, 13.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.CurveTo(10.000376f, 14.463985f, 9.681546f, 14.867284f, 9.23f, 14.974f),
                    PathNode.LineTo(9.117f, 14.994f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(7.713f, 15.0f, 7.668f, 16.864f, 8.867f, 16.993f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.CurveTo(15.552285f, 17.0f, 16.0f, 16.552284f, 16.0f, 16.0f),
                    PathNode.LineTo(15.993f, 15.883f),
                    PathNode.CurveTo(15.933684f, 15.379507f, 15.506975f, 15.000067f, 15.0f, 15.0f),
                    PathNode.LineTo(11.829f, 15.0f),
                    PathNode.LineTo(11.877f, 14.852f),
                    PathNode.CurveTo(11.958745f, 14.57539f, 12.000171f, 14.288436f, 12.0f, 14.0f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.CurveTo(13.506975f, 12.999933f, 13.933684f, 12.620493f, 13.993f, 12.117f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 11.447715f, 13.552285f, 11.0f, 13.0f, 11.0f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.CurveTo(12.000067f, 8.493025f, 12.379507f, 8.066316f, 12.883f, 8.007f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.CurveTo(13.506975f, 8.000067f, 13.933684f, 8.379507f, 13.993f, 8.883f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.CurveTo(14.0f, 9.552285f, 14.447715f, 10.0f, 15.0f, 10.0f),
                    PathNode.CurveTo(15.552285f, 10.0f, 16.0f, 9.552285f, 16.0f, 9.0f),
                    PathNode.CurveTo(16.0f, 7.343146f, 14.656855f, 6.0f, 13.0f, 6.0f),
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
        return _coinPound!!
    }

private var _coinPound: ImageVector? = null
