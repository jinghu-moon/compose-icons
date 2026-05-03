package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = tablerFilledIcon(
            name = "Coin",
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
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(11.447715f, 6.0f, 11.0f, 6.447716f, 11.0f, 7.0f),
                    PathNode.CurveTo(9.343145f, 7.0f, 8.0f, 8.343146f, 8.0f, 10.0f),
                    PathNode.CurveTo(8.0f, 11.656855f, 9.343145f, 13.0f, 11.0f, 13.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.CurveTo(10.663424f, 15.017942f, 10.339573f, 14.869105f, 10.134f, 14.602f),
                    PathNode.LineTo(10.066f, 14.501f),
                    PathNode.CurveTo(9.781581f, 14.042312f, 9.184498f, 13.892074f, 8.716864f, 14.16153f),
                    PathNode.CurveTo(8.249229f, 14.430987f, 8.079787f, 15.022907f, 8.334f, 15.499f),
                    PathNode.CurveTo(8.852945f, 16.399015f, 9.8006f, 16.966475f, 10.839f, 16.999f),
                    PathNode.LineTo(11.0f, 16.999f),
                    PathNode.CurveTo(10.999559f, 17.506357f, 11.379128f, 17.93364f, 11.883f, 17.993f),
                    PathNode.LineTo(12.0f, 18.0f),
                    PathNode.CurveTo(12.552285f, 18.0f, 13.0f, 17.552284f, 13.0f, 17.0f),
                    PathNode.LineTo(13.176f, 16.995f),
                    PathNode.CurveTo(14.79699f, 16.901308f, 16.049248f, 15.534959f, 16.001598f, 13.911963f),
                    PathNode.CurveTo(15.953952f, 12.288967f, 14.623694f, 10.998435f, 13.0f, 11.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.CurveTo(13.358f, 8.988f, 13.671f, 9.14f, 13.866f, 9.398f),
                    PathNode.LineTo(13.934f, 9.499f),
                    PathNode.CurveTo(14.218419f, 9.957688f, 14.815502f, 10.107926f, 15.283136f, 9.83847f),
                    PathNode.CurveTo(15.750772f, 9.569013f, 15.920214f, 8.977093f, 15.666f, 8.501f),
                    PathNode.CurveTo(15.147303f, 7.6006f, 14.199602f, 7.032737f, 13.161f, 7.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.CurveTo(13.0f, 6.447716f, 12.552285f, 6.0f, 12.0f, 6.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 13.0f),
                    PathNode.CurveTo(13.552285f, 13.0f, 14.0f, 13.447715f, 14.0f, 14.0f),
                    PathNode.CurveTo(14.0f, 14.552285f, 13.552285f, 15.0f, 13.0f, 15.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.Close,
                    PathNode.MoveTo(11.0f, 9.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.CurveTo(10.447715f, 11.0f, 10.0f, 10.552285f, 10.0f, 10.0f),
                    PathNode.CurveTo(10.0f, 9.447715f, 10.447715f, 9.0f, 11.0f, 9.0f),
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
        return _coin!!
    }

private var _coin: ImageVector? = null
