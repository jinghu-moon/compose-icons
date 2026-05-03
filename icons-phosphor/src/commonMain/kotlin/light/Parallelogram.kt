package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorLightIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.75f, 48.4f),
                    PathNode.CurveTo(241.1722f, 44.412006f, 236.7486f, 42.00256f, 232.0f, 42.0f),
                    PathNode.LineTo(88.81f, 42.0f),
                    PathNode.CurveTo(83.28639f, 41.98214f, 78.26861f, 45.21373f, 76.0f, 50.25f),
                    PathNode.LineTo(11.2f, 194.25f),
                    PathNode.CurveTo(9.245874f, 198.58801f, 9.628652f, 203.62155f, 12.216284f, 207.6142f),
                    PathNode.CurveTo(14.803917f, 211.60683f, 19.242182f, 214.01201f, 24.0f, 214.0f),
                    PathNode.LineTo(167.19f, 214.0f),
                    PathNode.CurveTo(172.7136f, 214.01787f, 177.7314f, 210.78627f, 180.0f, 205.75f),
                    PathNode.LineTo(244.8f, 61.75f),
                    PathNode.CurveTo(246.73894f, 57.410282f, 246.34355f, 52.383224f, 243.75f, 48.4f),
                    PathNode.Close,
                    PathNode.MoveTo(233.82f, 56.82f),
                    PathNode.LineTo(169.02f, 200.82f),
                    PathNode.CurveTo(168.69633f, 201.54001f, 167.9794f, 202.0023f, 167.19f, 202.0f),
                    PathNode.LineTo(24.0f, 202.0f),
                    PathNode.CurveTo(23.32045f, 202.00198f, 22.686386f, 201.65877f, 22.316465f, 201.08873f),
                    PathNode.CurveTo(21.946543f, 200.51869f, 21.89138f, 199.7998f, 22.17f, 199.18f),
                    PathNode.LineTo(87.0f, 55.18f),
                    PathNode.CurveTo(87.32068f, 54.466568f, 88.02783f, 54.00555f, 88.81f, 54.0f),
                    PathNode.LineTo(232.0f, 54.0f),
                    PathNode.CurveTo(232.67955f, 53.998016f, 233.31361f, 54.341225f, 233.68353f, 54.91127f),
                    PathNode.CurveTo(234.05345f, 55.48131f, 234.10861f, 56.20019f, 233.83f, 56.82f),
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
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
