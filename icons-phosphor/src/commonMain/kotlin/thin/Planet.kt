package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorThinIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.66f, 62.68f),
                    PathNode.CurveTo(234.93f, 51.1f, 215.08f, 48.88f, 185.66f, 56.38f),
                    PathNode.CurveTo(156.13354f, 32.619797f, 115.0579f, 29.397438f, 82.18751f, 48.262646f),
                    PathNode.CurveTo(49.31711f, 67.12785f, 31.378952f, 104.21983f, 37.0f, 141.7f),
                    PathNode.CurveTo(15.62f, 163.39f, 7.56f, 181.7f, 14.32f, 193.32f),
                    PathNode.CurveTo(18.45f, 200.43f, 27.32f, 204.03f, 40.32f, 204.03f),
                    PathNode.CurveTo(48.635506f, 203.88022f, 56.91037f, 202.83078f, 65.0f, 200.9f),
                    PathNode.CurveTo(66.74f, 200.51f, 68.52f, 200.08f, 70.32f, 199.62f),
                    PathNode.CurveTo(97.901535f, 221.81671f, 135.773f, 226.21713f, 167.70923f, 210.93605f),
                    PathNode.CurveTo(199.64545f, 195.65498f, 219.97961f, 163.40387f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.00691f, 123.404884f, 219.67265f, 118.81561f, 219.0f, 114.27f),
                    PathNode.CurveTo(231.77f, 101.27f, 240.31f, 88.99f, 243.0f, 78.8f),
                    PathNode.CurveTo(244.69f, 72.54f, 244.23f, 67.12f, 241.66f, 62.68f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(168.03767f, 44.04858f, 202.49432f, 72.30654f, 210.38f, 111.56f),
                    PathNode.CurveTo(194.21f, 127.25f, 171.58f, 144.04f, 145.89f, 158.8f),
                    PathNode.CurveTo(118.58f, 174.49f, 93.08f, 185.05f, 72.28f, 190.8f),
                    PathNode.CurveTo(46.21217f, 167.64334f, 37.160282f, 130.79015f, 49.533524f, 98.191605f),
                    PathNode.CurveTo(61.90676f, 65.59305f, 93.132225f, 44.02769f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(21.25f, 189.3f),
                    PathNode.CurveTo(17.0f, 182.0f, 23.75f, 167.7f, 39.0f, 151.24f),
                    PathNode.CurveTo(43.134872f, 167.07652f, 51.41973f, 181.52324f, 63.0f, 193.09f),
                    PathNode.CurveTo(40.86f, 198.0f, 25.47f, 196.58f, 21.25f, 189.3f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(110.82875f, 212.01689f, 94.069f, 206.74455f, 80.0f, 196.9f),
                    PathNode.CurveTo(101.58f, 190.32f, 125.83f, 179.53f, 149.85f, 165.74f),
                    PathNode.CurveTo(174.1f, 151.8f, 195.46f, 136.28f, 211.68f, 121.3f),
                    PathNode.CurveTo(211.86f, 123.51f, 211.98f, 125.74f, 211.98f, 128.0f),
                    PathNode.CurveTo(211.92493f, 174.36128f, 174.36127f, 211.93388f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(235.28f, 76.73f),
                    PathNode.CurveTo(233.15f, 84.73f, 226.7f, 94.38f, 217.03f, 104.79f),
                    PathNode.CurveTo(212.8693f, 88.91692f, 204.54198f, 74.44426f, 192.91f, 62.87f),
                    PathNode.CurveTo(214.76f, 58.05f, 230.5f, 59.41f, 234.74f, 66.7f),
                    PathNode.CurveTo(236.2f, 69.23f, 236.39f, 72.6f, 235.28f, 76.73f),
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
        return _planet!!
    }

private var _planet: ImageVector? = null
