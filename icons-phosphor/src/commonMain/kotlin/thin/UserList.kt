package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorThinIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 80.0f),
                    PathNode.CurveTo(156.0f, 77.79086f, 157.79086f, 76.0f, 160.0f, 76.0f),
                    PathNode.LineTo(248.0f, 76.0f),
                    PathNode.CurveTo(250.20914f, 76.0f, 252.0f, 77.79086f, 252.0f, 80.0f),
                    PathNode.CurveTo(252.0f, 82.20914f, 250.20914f, 84.0f, 248.0f, 84.0f),
                    PathNode.LineTo(160.0f, 84.0f),
                    PathNode.CurveTo(157.79086f, 84.0f, 156.0f, 82.20914f, 156.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 124.0f),
                    PathNode.LineTo(160.0f, 124.0f),
                    PathNode.CurveTo(157.79086f, 124.0f, 156.0f, 125.79086f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 130.20914f, 157.79086f, 132.0f, 160.0f, 132.0f),
                    PathNode.LineTo(248.0f, 132.0f),
                    PathNode.CurveTo(250.20914f, 132.0f, 252.0f, 130.20914f, 252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 125.79086f, 250.20914f, 124.0f, 248.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 172.0f),
                    PathNode.LineTo(184.0f, 172.0f),
                    PathNode.CurveTo(181.79086f, 172.0f, 180.0f, 173.79086f, 180.0f, 176.0f),
                    PathNode.CurveTo(180.0f, 178.20914f, 181.79086f, 180.0f, 184.0f, 180.0f),
                    PathNode.LineTo(248.0f, 180.0f),
                    PathNode.CurveTo(250.20914f, 180.0f, 252.0f, 178.20914f, 252.0f, 176.0f),
                    PathNode.CurveTo(252.0f, 173.79086f, 250.20914f, 172.0f, 248.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(147.87f, 191.0f),
                    PathNode.CurveTo(148.42058f, 193.1371f, 147.1363f, 195.31635f, 145.0f, 195.87f),
                    PathNode.CurveTo(144.67377f, 195.95676f, 144.33757f, 196.00047f, 144.0f, 196.0f),
                    PathNode.CurveTo(142.17712f, 195.99864f, 140.58572f, 194.765f, 140.13f, 193.0f),
                    PathNode.CurveTo(133.42f, 166.92f, 108.13f, 148.0f, 80.0f, 148.0f),
                    PathNode.CurveTo(51.87f, 148.0f, 26.59f, 166.92f, 19.87f, 193.0f),
                    PathNode.CurveTo(19.557573f, 194.43164f, 18.487345f, 195.57785f, 17.080465f, 195.9876f),
                    PathNode.CurveTo(15.673584f, 196.39734f, 14.15527f, 196.005f, 13.123001f, 194.965f),
                    PathNode.CurveTo(12.090733f, 193.92499f, 11.70976f, 192.40378f, 12.13f, 191.0f),
                    PathNode.CurveTo(18.05f, 168.0f, 36.7f, 149.86f, 59.65f, 143.0f),
                    PathNode.CurveTo(41.682476f, 133.62733f, 32.440292f, 113.19488f, 37.265385f, 93.51247f),
                    PathNode.CurveTo(42.090477f, 73.83006f, 59.73479f, 59.98875f, 80.0f, 59.98875f),
                    PathNode.CurveTo(100.265205f, 59.98875f, 117.90952f, 73.83006f, 122.73462f, 93.51247f),
                    PathNode.CurveTo(127.55971f, 113.19488f, 118.31753f, 133.62733f, 100.35f, 143.0f),
                    PathNode.CurveTo(123.3f, 149.86f, 142.0f, 168.0f, 147.87f, 191.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 140.0f),
                    PathNode.CurveTo(99.88225f, 140.0f, 116.0f, 123.88225f, 116.0f, 104.0f),
                    PathNode.CurveTo(116.0f, 84.11775f, 99.88225f, 68.0f, 80.0f, 68.0f),
                    PathNode.CurveTo(60.11775f, 68.0f, 44.0f, 84.11775f, 44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 123.88225f, 60.11775f, 140.0f, 80.0f, 140.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userList!!
    }

private var _userList: ImageVector? = null
