package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorThinIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 44.0f),
                    PathNode.LineTo(177.66f, 44.0f),
                    PathNode.LineTo(162.83f, 29.17f),
                    PathNode.LineTo(162.83f, 29.17f),
                    PathNode.CurveTo(162.07921f, 28.420046f, 161.06119f, 27.999166f, 160.0f, 28.0f),
                    PathNode.LineTo(96.0f, 28.0f),
                    PathNode.CurveTo(94.93881f, 27.999166f, 93.92079f, 28.420046f, 93.17f, 29.17f),
                    PathNode.LineTo(93.17f, 29.17f),
                    PathNode.LineTo(78.34f, 44.0f),
                    PathNode.LineTo(56.0f, 44.0f),
                    PathNode.CurveTo(49.37258f, 44.0f, 44.0f, 49.37258f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 214.62741f, 49.37258f, 220.0f, 56.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(206.62741f, 220.0f, 212.0f, 214.62741f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 49.37258f, 206.62741f, 44.0f, 200.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 72.79f),
                    PathNode.LineTo(103.47f, 36.0f),
                    PathNode.LineTo(152.53f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.62f, 38.28f),
                    PathNode.LineTo(172.0f, 49.66f),
                    PathNode.LineTo(172.0f, 104.0f),
                    PathNode.CurveTo(172.00359f, 105.554054f, 171.10672f, 106.96953f, 169.7f, 107.63f),
                    PathNode.CurveTo(168.31747f, 108.2967f, 166.67334f, 108.097534f, 165.49f, 107.12f),
                    PathNode.LineTo(133.29f, 79.3f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 49.66f),
                    PathNode.LineTo(95.38f, 38.28f),
                    PathNode.LineTo(122.71f, 79.28f),
                    PathNode.LineTo(90.54f, 107.08f),
                    PathNode.CurveTo(89.34617f, 108.06133f, 87.69384f, 108.26717f, 86.29573f, 107.608734f),
                    PathNode.CurveTo(84.89763f, 106.9503f, 84.003876f, 105.54539f, 84.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 208.0f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 53.79086f, 53.79086f, 52.0f, 56.0f, 52.0f),
                    PathNode.LineTo(76.0f, 52.0f),
                    PathNode.LineTo(76.0f, 104.0f),
                    PathNode.CurveTo(75.97134f, 108.66519f, 78.6736f, 112.916084f, 82.91f, 114.87f),
                    PathNode.CurveTo(84.50418f, 115.61269f, 86.2413f, 115.998344f, 88.0f, 116.0f),
                    PathNode.CurveTo(90.80031f, 115.99745f, 93.5097f, 115.005775f, 95.65f, 113.2f),
                    PathNode.LineTo(95.71f, 113.2f),
                    PathNode.LineTo(124.0f, 88.74f),
                    PathNode.LineTo(124.0f, 212.0f),
                    PathNode.LineTo(56.0f, 212.0f),
                    PathNode.CurveTo(53.79086f, 212.0f, 52.0f, 210.20914f, 52.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 208.0f),
                    PathNode.CurveTo(204.0f, 210.20914f, 202.20914f, 212.0f, 200.0f, 212.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.LineTo(132.0f, 88.74f),
                    PathNode.LineTo(160.32f, 113.2f),
                    PathNode.CurveTo(162.46907f, 115.01091f, 165.18968f, 116.00281f, 168.0f, 116.0f),
                    PathNode.CurveTo(169.77031f, 115.99647f, 171.51822f, 115.60387f, 173.12f, 114.85f),
                    PathNode.CurveTo(177.33807f, 112.89028f, 180.0262f, 108.65102f, 180.0f, 104.0f),
                    PathNode.LineTo(180.0f, 52.0f),
                    PathNode.LineTo(200.0f, 52.0f),
                    PathNode.CurveTo(202.20914f, 52.0f, 204.0f, 53.79086f, 204.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
