package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinYen: ImageVector
    get() {
        if (_coinYen != null) return _coinYen!!
        _coinYen = tablerFilledIcon(
            name = "CoinYen",
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
                    PathNode.MoveTo(15.555f, 7.168f),
                    PathNode.CurveTo(15.33435f, 7.020772f, 15.064244f, 6.967243f, 14.804121f, 7.019192f),
                    PathNode.CurveTo(14.543999f, 7.071142f, 14.315173f, 7.224314f, 14.168f, 7.445f),
                    PathNode.LineTo(12.0f, 10.696f),
                    PathNode.LineTo(9.832f, 7.446f),
                    PathNode.CurveTo(9.550862f, 7.023742f, 8.998094f, 6.878887f, 8.546f, 7.109f),
                    PathNode.LineTo(8.446f, 7.168f),
                    PathNode.CurveTo(8.225151f, 7.315017f, 8.071776f, 7.543769f, 8.019636f, 7.803903f),
                    PathNode.CurveTo(7.967497f, 8.064037f, 8.020868f, 8.334229f, 8.168f, 8.555f),
                    PathNode.LineTo(9.798f, 11.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.CurveTo(8.493025f, 11.000067f, 8.066316f, 11.379507f, 8.007f, 11.883f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 12.552285f, 8.447715f, 13.0f, 9.0f, 13.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.CurveTo(8.493025f, 14.000067f, 8.066316f, 14.379507f, 8.007f, 14.883f),
                    PathNode.LineTo(8.0f, 15.0f),
                    PathNode.CurveTo(8.0f, 15.552285f, 8.447715f, 16.0f, 9.0f, 16.0f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.CurveTo(11.000067f, 17.506975f, 11.379507f, 17.933683f, 11.883f, 17.993f),
                    PathNode.LineTo(12.0f, 18.0f),
                    PathNode.LineTo(12.117f, 17.993f),
                    PathNode.CurveTo(12.620493f, 17.933683f, 12.999933f, 17.506975f, 13.0f, 17.0f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.CurveTo(15.506975f, 15.999933f, 15.933684f, 15.620493f, 15.993f, 15.117f),
                    PathNode.LineTo(16.0f, 15.0f),
                    PathNode.CurveTo(16.0f, 14.447715f, 15.552285f, 14.0f, 15.0f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.CurveTo(15.506975f, 12.999933f, 15.933684f, 12.620493f, 15.993f, 12.117f),
                    PathNode.LineTo(16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 11.447715f, 15.552285f, 11.0f, 15.0f, 11.0f),
                    PathNode.LineTo(14.201f, 11.0f),
                    PathNode.LineTo(15.832f, 8.555f),
                    PathNode.CurveTo(16.113724f, 8.132906f, 16.03462f, 7.566718f, 15.648f, 7.238f),
                    PathNode.LineTo(15.555f, 7.168f),
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
        return _coinYen!!
    }

private var _coinYen: ImageVector? = null
