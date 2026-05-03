package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NetworkSlash: ImageVector
    get() {
        if (_networkSlash != null) return _networkSlash!!
        _networkSlash = phosphorThinIcon(
            name = "NetworkSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 54.0f),
                    PathNode.LineTo(100.0f, 40.0f),
                    PathNode.CurveTo(100.0f, 33.37258f, 105.37258f, 28.0f, 112.0f, 28.0f),
                    PathNode.LineTo(144.0f, 28.0f),
                    PathNode.CurveTo(150.62741f, 28.0f, 156.0f, 33.37258f, 156.0f, 40.0f),
                    PathNode.LineTo(156.0f, 72.0f),
                    PathNode.CurveTo(156.0f, 78.62742f, 150.62741f, 84.0f, 144.0f, 84.0f),
                    PathNode.LineTo(127.61f, 84.0f),
                    PathNode.CurveTo(125.40086f, 84.0f, 123.61f, 82.20914f, 123.61f, 80.0f),
                    PathNode.CurveTo(123.61f, 77.79086f, 125.40086f, 76.0f, 127.61f, 76.0f),
                    PathNode.LineTo(144.0f, 76.0f),
                    PathNode.CurveTo(146.20914f, 76.0f, 148.0f, 74.20914f, 148.0f, 72.0f),
                    PathNode.LineTo(148.0f, 40.0f),
                    PathNode.CurveTo(148.0f, 37.79086f, 146.20914f, 36.0f, 144.0f, 36.0f),
                    PathNode.LineTo(112.0f, 36.0f),
                    PathNode.CurveTo(109.79086f, 36.0f, 108.0f, 37.79086f, 108.0f, 40.0f),
                    PathNode.LineTo(108.0f, 54.0f),
                    PathNode.CurveTo(108.0f, 56.20914f, 106.20914f, 58.0f, 104.0f, 58.0f),
                    PathNode.CurveTo(101.79086f, 58.0f, 100.0f, 56.20914f, 100.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.0f, 213.31f),
                    PathNode.CurveTo(211.9815f, 214.36435f, 212.32031f, 215.865f, 211.88698f, 217.23878f),
                    PathNode.CurveTo(211.45364f, 218.61255f, 210.31512f, 219.64722f, 208.90628f, 219.94757f),
                    PathNode.CurveTo(207.49747f, 220.24792f, 206.03595f, 219.76758f, 205.08f, 218.69f),
                    PathNode.LineTo(119.0f, 124.0f),
                    PathNode.LineTo(68.0f, 124.0f),
                    PathNode.LineTo(68.0f, 164.0f),
                    PathNode.LineTo(80.0f, 164.0f),
                    PathNode.CurveTo(86.62742f, 164.0f, 92.0f, 169.37259f, 92.0f, 176.0f),
                    PathNode.LineTo(92.0f, 208.0f),
                    PathNode.CurveTo(92.0f, 214.62741f, 86.62742f, 220.0f, 80.0f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(41.37258f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 176.0f),
                    PathNode.CurveTo(36.0f, 169.37259f, 41.37258f, 164.0f, 48.0f, 164.0f),
                    PathNode.LineTo(60.0f, 164.0f),
                    PathNode.LineTo(60.0f, 124.0f),
                    PathNode.LineTo(24.0f, 124.0f),
                    PathNode.CurveTo(21.790861f, 124.0f, 20.0f, 122.20914f, 20.0f, 120.0f),
                    PathNode.CurveTo(20.0f, 117.79086f, 21.790861f, 116.0f, 24.0f, 116.0f),
                    PathNode.LineTo(111.68f, 116.0f),
                    PathNode.LineTo(45.0f, 42.69f),
                    PathNode.CurveTo(43.514355f, 41.033146f, 43.653145f, 38.485645f, 45.31f, 37.0f),
                    PathNode.CurveTo(46.966854f, 35.514355f, 49.514355f, 35.653145f, 51.0f, 37.31f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 172.0f),
                    PathNode.LineTo(48.0f, 172.0f),
                    PathNode.CurveTo(45.79086f, 172.0f, 44.0f, 173.79086f, 44.0f, 176.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 210.20914f, 45.79086f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(80.0f, 212.0f),
                    PathNode.CurveTo(82.20914f, 212.0f, 84.0f, 210.20914f, 84.0f, 208.0f),
                    PathNode.LineTo(84.0f, 176.0f),
                    PathNode.CurveTo(84.0f, 173.79086f, 82.20914f, 172.0f, 80.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 116.0f),
                    PathNode.LineTo(164.0f, 116.0f),
                    PathNode.CurveTo(161.79086f, 116.0f, 160.0f, 117.79086f, 160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 122.20914f, 161.79086f, 124.0f, 164.0f, 124.0f),
                    PathNode.LineTo(188.0f, 124.0f),
                    PathNode.LineTo(188.0f, 150.83f),
                    PathNode.CurveTo(188.0f, 153.03914f, 189.79086f, 154.83f, 192.0f, 154.83f),
                    PathNode.CurveTo(194.20914f, 154.83f, 196.0f, 153.03914f, 196.0f, 150.83f),
                    PathNode.LineTo(196.0f, 124.0f),
                    PathNode.LineTo(232.0f, 124.0f),
                    PathNode.CurveTo(234.20914f, 124.0f, 236.0f, 122.20914f, 236.0f, 120.0f),
                    PathNode.CurveTo(236.0f, 117.79086f, 234.20914f, 116.0f, 232.0f, 116.0f),
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
        return _networkSlash!!
    }

private var _networkSlash: ImageVector? = null
