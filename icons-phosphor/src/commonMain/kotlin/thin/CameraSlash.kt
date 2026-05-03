package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorThinIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(60.78f, 60.0f),
                    PathNode.LineTo(48.0f, 60.0f),
                    PathNode.CurveTo(36.954304f, 60.0f, 28.0f, 68.95431f, 28.0f, 80.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 203.0457f, 36.954304f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(199.0f, 212.0f),
                    PathNode.LineTo(205.08f, 218.69f),
                    PathNode.CurveTo(206.03595f, 219.76758f, 207.49747f, 220.24792f, 208.90628f, 219.94757f),
                    PathNode.CurveTo(210.31512f, 219.64722f, 211.45364f, 218.61255f, 211.88698f, 217.23878f),
                    PathNode.CurveTo(212.32031f, 215.865f, 211.9815f, 214.36435f, 211.0f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(148.58f, 156.54f),
                    PathNode.CurveTo(142.8239f, 161.39227f, 135.52834f, 164.03682f, 128.0f, 164.0f),
                    PathNode.CurveTo(115.01666f, 164.00252f, 103.318634f, 156.15996f, 98.38958f, 144.14865f),
                    PathNode.CurveTo(93.4605f, 132.13734f, 96.27749f, 118.33828f, 105.52f, 109.22f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 204.0f),
                    PathNode.CurveTo(41.37258f, 204.0f, 36.0f, 198.62741f, 36.0f, 192.0f),
                    PathNode.LineTo(36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 73.37258f, 41.37258f, 68.0f, 48.0f, 68.0f),
                    PathNode.LineTo(68.0f, 68.0f),
                    PathNode.LineTo(100.09f, 103.3f),
                    PathNode.CurveTo(84.59776f, 118.33211f, 83.82737f, 142.94498f, 98.349174f, 158.91653f),
                    PathNode.CurveTo(112.87098f, 174.88809f, 137.44592f, 176.45624f, 153.88f, 162.46f),
                    PathNode.LineTo(191.69f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 80.0f),
                    PathNode.LineTo(228.0f, 186.0f),
                    PathNode.CurveTo(228.0f, 188.20914f, 226.20914f, 190.0f, 224.0f, 190.0f),
                    PathNode.CurveTo(221.79086f, 190.0f, 220.0f, 188.20914f, 220.0f, 186.0f),
                    PathNode.LineTo(220.0f, 80.0f),
                    PathNode.CurveTo(220.0f, 73.37258f, 214.62741f, 68.0f, 208.0f, 68.0f),
                    PathNode.LineTo(176.0f, 68.0f),
                    PathNode.CurveTo(174.66573f, 67.99753f, 173.42052f, 67.329926f, 172.68f, 66.22f),
                    PathNode.LineTo(157.85f, 44.0f),
                    PathNode.LineTo(98.13f, 44.0f),
                    PathNode.LineTo(97.31f, 45.23f),
                    PathNode.CurveTo(96.53848f, 46.468575f, 95.15372f, 47.188744f, 93.69667f, 47.10916f),
                    PathNode.CurveTo(92.23963f, 47.029583f, 90.941536f, 46.162884f, 90.3095f, 44.847652f),
                    PathNode.CurveTo(89.67747f, 43.532417f, 89.81179f, 41.977367f, 90.66f, 40.79f),
                    PathNode.LineTo(92.66f, 37.79f),
                    PathNode.CurveTo(93.40215f, 36.67037f, 94.65674f, 35.998005f, 96.0f, 36.0f),
                    PathNode.LineTo(160.0f, 36.0f),
                    PathNode.CurveTo(161.33783f, 35.99913f, 162.58751f, 36.66713f, 163.33f, 37.78f),
                    PathNode.LineTo(178.13f, 60.0f),
                    PathNode.LineTo(208.0f, 60.0f),
                    PathNode.CurveTo(219.0457f, 60.0f, 228.0f, 68.95431f, 228.0f, 80.0f),
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
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
