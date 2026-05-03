package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorLightIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 90.0f),
                    PathNode.LineTo(173.0f, 90.0f),
                    PathNode.LineTo(181.89f, 41.07f),
                    PathNode.CurveTo(182.35773f, 38.926163f, 181.61787f, 36.697994f, 179.96072f, 35.259716f),
                    PathNode.CurveTo(178.30356f, 33.821438f, 175.99345f, 33.40249f, 173.93677f, 34.167236f),
                    PathNode.CurveTo(171.88008f, 34.931988f, 170.40489f, 36.758446f, 170.09f, 38.93f),
                    PathNode.LineTo(160.81f, 90.0f),
                    PathNode.LineTo(109.0f, 90.0f),
                    PathNode.LineTo(117.89f, 41.07f),
                    PathNode.CurveTo(118.35367f, 37.872387f, 116.20197f, 34.881824f, 113.02277f, 34.30526f),
                    PathNode.CurveTo(109.843575f, 33.728695f, 106.77873f, 35.7732f, 106.09f, 38.93f),
                    PathNode.LineTo(96.81f, 90.0f),
                    PathNode.LineTo(48.0f, 90.0f),
                    PathNode.CurveTo(44.68629f, 90.0f, 42.0f, 92.686295f, 42.0f, 96.0f),
                    PathNode.CurveTo(42.0f, 99.313705f, 44.68629f, 102.0f, 48.0f, 102.0f),
                    PathNode.LineTo(94.63f, 102.0f),
                    PathNode.LineTo(85.17f, 154.0f),
                    PathNode.LineTo(32.0f, 154.0f),
                    PathNode.CurveTo(28.68629f, 154.0f, 26.0f, 156.6863f, 26.0f, 160.0f),
                    PathNode.CurveTo(26.0f, 163.3137f, 28.68629f, 166.0f, 32.0f, 166.0f),
                    PathNode.LineTo(83.0f, 166.0f),
                    PathNode.LineTo(74.1f, 214.93f),
                    PathNode.CurveTo(73.80846f, 216.49919f, 74.15413f, 218.11989f, 75.06057f, 219.43356f),
                    PathNode.CurveTo(75.967f, 220.74724f, 77.35949f, 221.64563f, 78.93f, 221.93f),
                    PathNode.CurveTo(79.28363f, 221.98726f, 79.64192f, 222.0107f, 80.0f, 222.0f),
                    PathNode.CurveTo(82.895775f, 221.99333f, 85.3736f, 219.91936f, 85.89f, 217.07f),
                    PathNode.LineTo(95.19f, 166.0f),
                    PathNode.LineTo(147.0f, 166.0f),
                    PathNode.LineTo(138.11f, 214.93f),
                    PathNode.CurveTo(137.81845f, 216.49919f, 138.16414f, 218.11989f, 139.07057f, 219.43356f),
                    PathNode.CurveTo(139.977f, 220.74724f, 141.36949f, 221.64563f, 142.94f, 221.93f),
                    PathNode.CurveTo(143.29596f, 221.99796f, 143.65762f, 222.03143f, 144.02f, 222.03f),
                    PathNode.CurveTo(146.91577f, 222.02333f, 149.3936f, 219.94936f, 149.91f, 217.1f),
                    PathNode.LineTo(159.19f, 166.0f),
                    PathNode.LineTo(208.0f, 166.0f),
                    PathNode.CurveTo(211.3137f, 166.0f, 214.0f, 163.3137f, 214.0f, 160.0f),
                    PathNode.CurveTo(214.0f, 156.6863f, 211.3137f, 154.0f, 208.0f, 154.0f),
                    PathNode.LineTo(161.37f, 154.0f),
                    PathNode.LineTo(170.83f, 102.0f),
                    PathNode.LineTo(224.0f, 102.0f),
                    PathNode.CurveTo(227.3137f, 102.0f, 230.0f, 99.313705f, 230.0f, 96.0f),
                    PathNode.CurveTo(230.0f, 92.686295f, 227.3137f, 90.0f, 224.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(149.17f, 154.0f),
                    PathNode.LineTo(97.37f, 154.0f),
                    PathNode.LineTo(106.83f, 102.0f),
                    PathNode.LineTo(158.63f, 102.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hash!!
    }

private var _hash: ImageVector? = null
