package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = phosphorThinIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 116.0f),
                    PathNode.CurveTo(103.69947f, 116.0f, 84.0f, 135.69948f, 84.0f, 160.0f),
                    PathNode.CurveTo(84.0f, 184.30052f, 103.69947f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(152.30052f, 204.0f, 172.0f, 184.30052f, 172.0f, 160.0f),
                    PathNode.CurveTo(171.97244f, 135.71089f, 152.28911f, 116.02756f, 128.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 196.0f),
                    PathNode.CurveTo(108.11775f, 196.0f, 92.0f, 179.88223f, 92.0f, 160.0f),
                    PathNode.CurveTo(92.0f, 140.11777f, 108.11775f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(147.88223f, 124.0f, 164.0f, 140.11777f, 164.0f, 160.0f),
                    PathNode.CurveTo(164.0f, 179.88223f, 147.88223f, 196.0f, 128.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(207.22f, 132.0f),
                    PathNode.LineTo(177.43f, 47.8f),
                    PathNode.CurveTo(170.49397f, 26.656616f, 150.87338f, 12.26978f, 128.6229f, 12.012078f),
                    PathNode.CurveTo(106.37239f, 11.754376f, 86.42386f, 25.68293f, 79.0f, 46.66f),
                    PathNode.LineTo(79.0f, 46.66f),
                    PathNode.LineTo(49.45f, 130.17f),
                    PathNode.CurveTo(36.288963f, 164.90454f, 47.50342f, 204.15901f, 77.02704f, 226.69914f),
                    PathNode.CurveTo(106.55065f, 249.23927f, 147.37288f, 249.71278f, 177.41136f, 227.86353f),
                    PathNode.CurveTo(207.44986f, 206.01427f, 219.57182f, 167.03046f, 207.22f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 236.0f),
                    PathNode.CurveTo(103.012115f, 235.96754f, 79.63411f, 223.66364f, 65.459785f, 203.0849f),
                    PathNode.CurveTo(51.28546f, 182.50618f, 48.12313f, 156.27802f, 57.0f, 132.92f),
                    PathNode.LineTo(86.5f, 49.33f),
                    PathNode.CurveTo(92.77173f, 31.537773f, 109.687836f, 19.723593f, 128.55159f, 19.961227f),
                    PathNode.CurveTo(147.41534f, 20.198864f, 164.02847f, 32.43543f, 169.85f, 50.38f),
                    PathNode.LineTo(199.67f, 134.66f),
                    PathNode.CurveTo(207.89777f, 157.92477f, 204.31795f, 183.736f, 190.0692f, 203.88344f),
                    PathNode.CurveTo(175.82047f, 224.03087f, 152.67682f, 236.00613f, 128.0f, 236.0f),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
