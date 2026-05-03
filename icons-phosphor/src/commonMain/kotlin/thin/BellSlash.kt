package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) return _bellSlash!!
        _bellSlash = phosphorThinIcon(
            name = "BellSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(63.8f, 63.32f),
                    PathNode.CurveTo(56.066647f, 75.476746f, 51.97225f, 89.592f, 52.0f, 104.0f),
                    PathNode.CurveTo(52.0f, 140.13f, 43.42f, 168.0f, 37.64f, 177.95f),
                    PathNode.CurveTo(35.47363f, 181.66086f, 35.456745f, 186.24683f, 37.595734f, 189.97353f),
                    PathNode.CurveTo(39.73472f, 193.70024f, 43.703068f, 195.99883f, 48.0f, 196.0f),
                    PathNode.LineTo(92.23f, 196.0f),
                    PathNode.CurveTo(94.296455f, 214.19322f, 109.68981f, 227.9371f, 128.0f, 227.9371f),
                    PathNode.CurveTo(146.3102f, 227.9371f, 161.70355f, 214.19322f, 163.77f, 196.0f),
                    PathNode.LineTo(184.41f, 196.0f),
                    PathNode.LineTo(205.0f, 218.69f),
                    PathNode.CurveTo(205.95595f, 219.76758f, 207.41747f, 220.24792f, 208.8263f, 219.94757f),
                    PathNode.CurveTo(210.23512f, 219.64722f, 211.37364f, 218.61255f, 211.80698f, 217.23878f),
                    PathNode.CurveTo(212.24031f, 215.865f, 211.9015f, 214.36435f, 210.92f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(114.08228f, 219.9986f, 102.27825f, 209.77498f, 100.29f, 196.0f),
                    PathNode.LineTo(155.71f, 196.0f),
                    PathNode.CurveTo(153.72176f, 209.77498f, 141.91772f, 219.9986f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 188.0f),
                    PathNode.CurveTo(46.576897f, 188.01096f, 45.26141f, 187.2439f, 44.57f, 186.0f),
                    PathNode.CurveTo(43.85547f, 184.76239f, 43.85547f, 183.23761f, 44.57f, 182.0f),
                    PathNode.CurveTo(52.0f, 169.17f, 60.0f, 139.32f, 60.0f, 104.0f),
                    PathNode.CurveTo(59.977104f, 91.86121f, 63.224167f, 79.940346f, 69.4f, 69.49f),
                    PathNode.LineTo(177.14f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.55f, 175.52f),
                    PathNode.CurveTo(212.08551f, 175.70514f, 211.59003f, 175.80016f, 211.09f, 175.8f),
                    PathNode.CurveTo(209.44583f, 175.79834f, 207.97012f, 174.79074f, 207.37f, 173.26f),
                    PathNode.CurveTo(200.24f, 155.17f, 196.0f, 129.28f, 196.0f, 104.0f),
                    PathNode.CurveTo(196.00607f, 79.79754f, 183.1477f, 57.41588f, 162.2366f, 45.230434f),
                    PathNode.CurveTo(141.3255f, 33.04499f, 115.513626f, 32.89249f, 94.46f, 44.83f),
                    PathNode.CurveTo(92.54081f, 45.93457f, 90.08957f, 45.27419f, 88.985f, 43.355f),
                    PathNode.CurveTo(87.88043f, 41.435814f, 88.54081f, 38.98457f, 90.46f, 37.88f),
                    PathNode.CurveTo(113.99229f, 24.5116f, 142.85834f, 24.666273f, 166.246f, 38.28608f),
                    PathNode.CurveTo(189.63368f, 51.905888f, 204.01376f, 76.93559f, 204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 140.05f, 212.26f, 163.89f, 214.79f, 170.34f),
                    PathNode.CurveTo(215.5941f, 172.39445f, 214.58295f, 174.71205f, 212.53f, 175.52f),
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
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
