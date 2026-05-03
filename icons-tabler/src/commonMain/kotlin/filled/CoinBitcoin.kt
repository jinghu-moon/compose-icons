package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinBitcoin: ImageVector
    get() {
        if (_coinBitcoin != null) return _coinBitcoin!!
        _coinBitcoin = tablerFilledIcon(
            name = "CoinBitcoin",
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
                    PathNode.CurveTo(12.447715f, 6.0f, 12.0f, 6.447716f, 12.0f, 7.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.CurveTo(11.0f, 6.447716f, 10.552285f, 6.0f, 10.0f, 6.0f),
                    PathNode.CurveTo(9.447715f, 6.0f, 9.0f, 6.447716f, 9.0f, 7.0f),
                    PathNode.CurveTo(8.447715f, 7.0f, 8.0f, 7.447716f, 8.0f, 8.0f),
                    PathNode.CurveTo(8.0f, 8.552285f, 8.447715f, 9.0f, 9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(8.447715f, 15.0f, 8.0f, 15.447715f, 8.0f, 16.0f),
                    PathNode.CurveTo(8.0f, 16.552284f, 8.447715f, 17.0f, 9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 18.333f, 11.0f, 18.333f, 11.0f, 17.0f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.CurveTo(12.0f, 17.552284f, 12.447715f, 18.0f, 13.0f, 18.0f),
                    PathNode.CurveTo(13.552285f, 18.0f, 14.0f, 17.552284f, 14.0f, 17.0f),
                    PathNode.LineTo(14.0f, 16.85f),
                    PathNode.CurveTo(15.167f, 16.456f, 16.0f, 15.323f, 16.0f, 14.0f),
                    PathNode.LineTo(15.995f, 13.825f),
                    PathNode.CurveTo(15.958071f, 13.151816f, 15.700069f, 12.509624f, 15.261f, 11.998f),
                    PathNode.CurveTo(15.721f, 11.466f, 16.0f, 10.765f, 16.0f, 10.0f),
                    PathNode.CurveTo(16.0f, 8.677f, 15.167f, 7.544f, 14.0f, 7.15f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 6.447716f, 13.552285f, 6.0f, 13.0f, 6.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.09f, 13.0f),
                    PathNode.CurveTo(13.582f, 13.0f, 14.0f, 13.437f, 14.0f, 14.0f),
                    PathNode.CurveTo(14.0f, 14.563f, 13.582f, 15.0f, 13.09f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(13.09f, 13.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.09f, 9.0f),
                    PathNode.CurveTo(13.582f, 9.0f, 14.0f, 9.437f, 14.0f, 10.0f),
                    PathNode.CurveTo(14.0f, 10.522f, 13.64f, 10.937f, 13.194f, 10.993f),
                    PathNode.LineTo(13.09f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(13.09f, 9.0f),
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
        return _coinBitcoin!!
    }

private var _coinBitcoin: ImageVector? = null
