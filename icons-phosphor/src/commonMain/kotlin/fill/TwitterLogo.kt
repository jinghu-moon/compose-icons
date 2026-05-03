package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorFillIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.66f, 77.66f),
                    PathNode.LineTo(215.76f, 107.56f),
                    PathNode.CurveTo(209.72f, 177.58f, 150.67f, 232.0f, 80.0f, 232.0f),
                    PathNode.CurveTo(65.48f, 232.0f, 53.51f, 229.7f, 44.42f, 225.16f),
                    PathNode.CurveTo(37.09f, 221.49f, 34.09f, 217.56f, 33.34f, 216.44f),
                    PathNode.CurveTo(31.985186f, 214.4082f, 31.6326f, 211.86887f, 32.38261f, 209.5448f),
                    PathNode.CurveTo(33.132618f, 207.22075f, 34.90307f, 205.36655f, 37.19f, 204.51f),
                    PathNode.CurveTo(37.45f, 204.41f, 61.43f, 195.2f, 76.66f, 177.67f),
                    PathNode.CurveTo(68.21383f, 170.72577f, 60.84078f, 162.57094f, 54.78f, 153.47f),
                    PathNode.CurveTo(42.38f, 135.06f, 28.5f, 103.08f, 32.78f, 55.29f),
                    PathNode.CurveTo(33.056984f, 52.189575f, 35.107224f, 49.531315f, 38.03558f, 48.47582f),
                    PathNode.CurveTo(40.96394f, 47.420322f, 44.23866f, 48.159256f, 46.43f, 50.37f),
                    PathNode.CurveTo(46.78f, 50.72f, 79.71f, 83.47f, 119.97f, 94.09f),
                    PathNode.LineTo(119.97f, 88.0f),
                    PathNode.CurveTo(119.93906f, 75.098724f, 125.11685f, 62.731144f, 134.33f, 53.7f),
                    PathNode.CurveTo(143.27773f, 44.764893f, 155.45615f, 39.824284f, 168.1f, 40.0f),
                    PathNode.CurveTo(185.17714f, 40.168434f, 200.91603f, 49.27703f, 209.57f, 64.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(243.23764f, 63.99745f, 246.15764f, 65.94662f, 247.39697f, 68.937675f),
                    PathNode.CurveTo(248.63632f, 71.92874f, 247.95064f, 75.37191f, 245.66f, 77.66f),
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
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
