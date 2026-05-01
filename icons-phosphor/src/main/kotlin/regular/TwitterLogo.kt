package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorRegularIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.39f, 68.94f),
                    PathNode.CurveTo(246.15236f, 65.95038f, 243.23566f, 64.00066f, 240.0f, 64.0f),
                    PathNode.LineTo(209.57f, 64.0f),
                    PathNode.CurveTo(200.91603f, 49.27703f, 185.17714f, 40.168434f, 168.1f, 40.0f),
                    PathNode.CurveTo(155.46391f, 39.83426f, 143.29543f, 44.77376f, 134.35f, 53.7f),
                    PathNode.CurveTo(125.1434f, 62.734764f, 119.969826f, 75.10087f, 120.0f, 88.0f),
                    PathNode.LineTo(120.0f, 94.09f),
                    PathNode.CurveTo(79.74f, 83.47f, 46.81f, 50.72f, 46.46f, 50.37f),
                    PathNode.CurveTo(44.26866f, 48.159256f, 40.99394f, 47.420322f, 38.065582f, 48.47582f),
                    PathNode.CurveTo(35.137222f, 49.531315f, 33.086983f, 52.189575f, 32.81f, 55.29f),
                    PathNode.CurveTo(28.5f, 103.08f, 42.38f, 135.06f, 54.81f, 153.47f),
                    PathNode.CurveTo(60.870777f, 162.57094f, 68.243835f, 170.72577f, 76.69f, 177.67f),
                    PathNode.CurveTo(61.46f, 195.2f, 37.48f, 204.41f, 37.22f, 204.51f),
                    PathNode.CurveTo(34.93307f, 205.36655f, 33.162617f, 207.22075f, 32.41261f, 209.5448f),
                    PathNode.CurveTo(31.662601f, 211.86887f, 32.015186f, 214.4082f, 33.37f, 216.44f),
                    PathNode.CurveTo(34.12f, 217.56f, 37.12f, 221.49f, 44.45f, 225.16f),
                    PathNode.CurveTo(53.51f, 229.7f, 65.48f, 232.0f, 80.0f, 232.0f),
                    PathNode.CurveTo(150.67f, 232.0f, 209.72f, 177.58f, 215.75f, 107.56f),
                    PathNode.LineTo(245.66f, 77.66f),
                    PathNode.CurveTo(247.94725f, 75.37076f, 248.63007f, 71.92904f, 247.39f, 68.94f),
                    PathNode.Close,
                    PathNode.MoveTo(202.39f, 98.35f),
                    PathNode.CurveTo(201.0184f, 99.72494f, 200.1938f, 101.55186f, 200.07f, 103.49f),
                    PathNode.CurveTo(196.0f, 166.58f, 143.28f, 216.0f, 80.0f, 216.0f),
                    PathNode.CurveTo(69.44f, 216.0f, 62.0f, 214.6f, 56.78f, 212.92f),
                    PathNode.CurveTo(68.29f, 206.67f, 84.34f, 195.92f, 94.66f, 180.44f),
                    PathNode.CurveTo(95.88427f, 178.60019f, 96.29295f, 176.3359f, 95.78911f, 174.18419f),
                    PathNode.CurveTo(95.28528f, 172.03247f, 93.91382f, 170.18501f, 92.0f, 169.08f),
                    PathNode.CurveTo(91.53f, 168.81f, 48.09f, 142.74f, 48.0f, 73.08f),
                    PathNode.CurveTo(64.0f, 86.08f, 93.25f, 106.25f, 126.67f, 111.87f),
                    PathNode.CurveTo(128.98827f, 112.26086f, 131.3611f, 111.612206f, 133.15816f, 110.096375f),
                    PathNode.CurveTo(134.9552f, 108.580536f, 135.99452f, 106.350975f, 136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.CurveTo(135.98186f, 79.37874f, 139.44316f, 71.114876f, 145.6f, 65.08f),
                    PathNode.CurveTo(151.50243f, 59.166508f, 159.54558f, 55.89154f, 167.9f, 56.0f),
                    PathNode.CurveTo(180.56f, 56.16f, 192.39f, 63.88f, 197.34f, 75.21f),
                    PathNode.CurveTo(198.61513f, 78.1208f, 201.49217f, 80.00089f, 204.67f, 80.0f),
                    PathNode.LineTo(220.67f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
