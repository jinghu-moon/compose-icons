package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinRupee: ImageVector
    get() {
        if (_coinRupee != null) return _coinRupee!!
        _coinRupee = tablerFilledIcon(
            name = "CoinRupee",
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
                    PathNode.MoveTo(15.0f, 7.0f),
                    PathNode.LineTo(9.0f, 7.0f),
                    PathNode.CurveTo(7.713f, 7.0f, 7.668f, 8.864f, 8.867f, 8.993f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.CurveTo(10.714513f, 9.000018f, 11.374743f, 9.381213f, 11.732f, 10.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.CurveTo(8.447715f, 10.0f, 8.0f, 10.447715f, 8.0f, 11.0f),
                    PathNode.CurveTo(8.0f, 11.552285f, 8.447715f, 12.0f, 9.0f, 12.0f),
                    PathNode.LineTo(11.732f, 12.001f),
                    PathNode.CurveTo(11.37449f, 12.619402f, 10.714307f, 13.000188f, 10.0f, 13.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.CurveTo(8.11f, 13.0f, 7.663f, 14.077f, 8.293f, 14.707f),
                    PathNode.LineTo(11.293f, 17.707f),
                    PathNode.CurveTo(11.6835f, 18.097382f, 12.3165f, 18.097382f, 12.707f, 17.707f),
                    PathNode.LineTo(12.79f, 17.613f),
                    PathNode.CurveTo(13.098803f, 17.214914f, 13.063235f, 16.64927f, 12.707f, 16.293f),
                    PathNode.LineTo(11.223f, 14.808f),
                    PathNode.LineTo(11.336f, 14.771f),
                    PathNode.CurveTo(12.589052f, 14.325747f, 13.539772f, 13.288122f, 13.874f, 12.001f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.CurveTo(15.552285f, 12.0f, 16.0f, 11.552285f, 16.0f, 11.0f),
                    PathNode.CurveTo(16.0f, 10.447715f, 15.552285f, 10.0f, 15.0f, 10.0f),
                    PathNode.LineTo(13.874f, 10.0f),
                    PathNode.CurveTo(13.79735f, 9.703224f, 13.686613f, 9.416316f, 13.544f, 9.145f),
                    PathNode.LineTo(13.465f, 9.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.CurveTo(15.552285f, 9.0f, 16.0f, 8.552285f, 16.0f, 8.0f),
                    PathNode.LineTo(15.993f, 7.883f),
                    PathNode.CurveTo(15.933684f, 7.379507f, 15.506975f, 7.000067f, 15.0f, 7.0f),
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
        return _coinRupee!!
    }

private var _coinRupee: ImageVector? = null
