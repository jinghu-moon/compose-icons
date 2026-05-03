package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) return _numberSquareEight!!
        _numberSquareEight = phosphorBoldIcon(
            name = "NumberSquareEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 152.0f),
                    PathNode.CurveTo(87.9807f, 170.22806f, 100.28737f, 186.1638f, 117.92813f, 190.75357f),
                    PathNode.CurveTo(135.5689f, 195.34332f, 154.08159f, 187.42613f, 162.94849f, 171.50003f),
                    PathNode.CurveTo(171.81537f, 155.57396f, 168.79366f, 135.66737f, 155.6f, 123.09f),
                    PathNode.CurveTo(167.83752f, 108.47717f, 166.56436f, 86.858376f, 152.69624f, 73.78294f),
                    PathNode.CurveTo(138.82812f, 60.707508f, 117.171875f, 60.707508f, 103.30376f, 73.78294f),
                    PathNode.CurveTo(89.43564f, 86.858376f, 88.16248f, 108.47717f, 100.4f, 123.09f),
                    PathNode.CurveTo(92.479065f, 130.61987f, 87.99634f, 141.07112f, 88.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(119.163445f, 168.0f, 112.0f, 160.83656f, 112.0f, 152.0f),
                    PathNode.CurveTo(112.0f, 143.16344f, 119.163445f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(136.83656f, 136.0f, 144.0f, 143.16344f, 144.0f, 152.0f),
                    PathNode.CurveTo(144.0f, 160.83656f, 136.83656f, 168.0f, 128.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 100.0f),
                    PathNode.CurveTo(116.0f, 93.37258f, 121.37258f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(134.62741f, 88.0f, 140.0f, 93.37258f, 140.0f, 100.0f),
                    PathNode.CurveTo(140.0f, 106.62742f, 134.62741f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(121.37258f, 112.0f, 116.0f, 106.62742f, 116.0f, 100.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberSquareEight!!
    }

private var _numberSquareEight: ImageVector? = null
