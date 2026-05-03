package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorThinIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.76f, 62.72f),
                    PathNode.LineTo(210.96f, 42.72f),
                    PathNode.CurveTo(212.45393f, 41.074192f, 212.33081f, 38.52893f, 210.685f, 37.035f),
                    PathNode.CurveTo(209.03918f, 35.54107f, 206.49393f, 35.664192f, 205.0f, 37.31f),
                    PathNode.LineTo(186.8f, 57.31f),
                    PathNode.CurveTo(148.92026f, 26.165817f, 93.27026f, 30.207651f, 60.2883f, 66.49849f),
                    PathNode.CurveTo(27.306337f, 102.78932f, 28.587135f, 158.5712f, 63.2f, 193.31f),
                    PathNode.LineTo(45.0f, 213.31f),
                    PathNode.CurveTo(43.514355f, 214.96686f, 43.653145f, 217.51436f, 45.31f, 219.0f),
                    PathNode.CurveTo(46.966854f, 220.48564f, 49.514355f, 220.34685f, 51.0f, 218.69f),
                    PathNode.LineTo(69.2f, 198.69f),
                    PathNode.CurveTo(107.099106f, 229.52278f, 162.48872f, 225.35432f, 195.34633f, 189.19661f),
                    PathNode.CurveTo(228.20393f, 153.03888f, 227.0683f, 97.50424f, 192.76f, 62.72f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 128.0f),
                    PathNode.CurveTo(44.016327f, 95.48822f, 62.792473f, 65.90527f, 92.20455f, 52.050827f),
                    PathNode.CurveTo(121.61664f, 38.196377f, 156.3825f, 42.558567f, 181.46f, 63.25f),
                    PathNode.LineTo(68.63f, 187.36f),
                    PathNode.CurveTo(52.849968f, 171.63792f, 43.986103f, 150.27539f, 44.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(108.479645f, 212.01833f, 89.56768f, 205.20847f, 74.54f, 192.75f),
                    PathNode.LineTo(187.37f, 68.64f),
                    PathNode.CurveTo(211.36395f, 92.66381f, 218.53555f, 128.77002f, 205.54422f, 160.14005f),
                    PathNode.CurveTo(192.55289f, 191.51007f, 161.95369f, 211.97417f, 128.0f, 212.0f),
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
        return _empty!!
    }

private var _empty: ImageVector? = null
