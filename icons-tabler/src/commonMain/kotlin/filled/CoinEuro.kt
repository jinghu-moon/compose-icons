package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinEuro: ImageVector
    get() {
        if (_coinEuro != null) return _coinEuro!!
        _coinEuro = tablerFilledIcon(
            name = "CoinEuro",
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
                    PathNode.CurveTo(9.948f, 6.0f, 8.232001f, 7.449f, 7.451f, 9.5f),
                    PathNode.LineTo(7.0f, 9.5f),
                    PathNode.CurveTo(6.470907f, 9.500587f, 6.033836f, 9.913211f, 6.002828f, 10.441395f),
                    PathNode.CurveTo(5.971821f, 10.969579f, 6.35761f, 11.43051f, 6.883f, 11.493f),
                    PathNode.LineTo(7.017f, 11.5f),
                    PathNode.CurveTo(6.994136f, 11.832941f, 6.994136f, 12.167059f, 7.017f, 12.5f),
                    PathNode.LineTo(7.0f, 12.5f),
                    PathNode.CurveTo(6.447716f, 12.5f, 6.0f, 12.947715f, 6.0f, 13.5f),
                    PathNode.CurveTo(6.0f, 14.052285f, 6.447716f, 14.5f, 7.0f, 14.5f),
                    PathNode.LineTo(7.452f, 14.5f),
                    PathNode.CurveTo(8.232001f, 16.553f, 9.948f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(13.141f, 18.0f, 14.217f, 17.543f, 15.084f, 16.73f),
                    PathNode.CurveTo(15.487168f, 16.352238f, 15.507763f, 15.719168f, 15.13f, 15.316f),
                    PathNode.CurveTo(14.752237f, 14.912832f, 14.119168f, 14.892238f, 13.716f, 15.27f),
                    PathNode.CurveTo(13.207f, 15.748f, 12.614f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(11.078f, 16.0f, 10.224f, 15.422f, 9.665f, 14.501f),
                    PathNode.LineTo(11.0f, 14.5f),
                    PathNode.CurveTo(11.552285f, 14.5f, 12.0f, 14.052285f, 12.0f, 13.5f),
                    PathNode.CurveTo(12.0f, 12.947715f, 11.552285f, 12.5f, 11.0f, 12.5f),
                    PathNode.LineTo(9.023f, 12.5f),
                    PathNode.CurveTo(8.991732f, 12.1674f, 8.991732f, 11.8326f, 9.023f, 11.5f),
                    PathNode.LineTo(11.0f, 11.5f),
                    PathNode.CurveTo(11.552285f, 11.5f, 12.0f, 11.052285f, 12.0f, 10.5f),
                    PathNode.CurveTo(12.0f, 9.947715f, 11.552285f, 9.5f, 11.0f, 9.5f),
                    PathNode.LineTo(9.664f, 9.5f),
                    PathNode.CurveTo(10.224f, 8.579f, 11.078f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(12.615f, 8.0f, 13.208f, 8.252f, 13.717f, 8.73f),
                    PathNode.CurveTo(14.120168f, 9.107762f, 14.753237f, 9.087168f, 15.131f, 8.684f),
                    PathNode.CurveTo(15.508762f, 8.280833f, 15.488168f, 7.647763f, 15.085f, 7.27f),
                    PathNode.CurveTo(14.218f, 6.458f, 13.142f, 6.0f, 12.0f, 6.0f),
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
        return _coinEuro!!
    }

private var _coinEuro: ImageVector? = null
