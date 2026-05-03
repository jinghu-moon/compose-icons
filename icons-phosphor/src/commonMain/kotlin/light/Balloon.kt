package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = phosphorLightIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 18.0f),
                    PathNode.CurveTo(80.52636f, 18.055105f, 42.055107f, 56.526356f, 42.0f, 104.0f),
                    PathNode.CurveTo(42.0f, 127.0f, 51.24f, 152.52f, 66.71f, 172.27f),
                    PathNode.CurveTo(79.08f, 188.06f, 93.94f, 198.69f, 109.76f, 203.34f),
                    PathNode.LineTo(98.49f, 229.64f),
                    PathNode.CurveTo(97.69741f, 231.49263f, 97.88772f, 233.61942f, 98.99663f, 235.30186f),
                    PathNode.CurveTo(100.10554f, 236.98434f, 101.98495f, 237.99785f, 104.0f, 238.0f),
                    PathNode.LineTo(152.0f, 238.0f),
                    PathNode.CurveTo(154.01505f, 237.99785f, 155.89447f, 236.98434f, 157.00337f, 235.30186f),
                    PathNode.CurveTo(158.11229f, 233.61942f, 158.30258f, 231.49263f, 157.51f, 229.64f),
                    PathNode.LineTo(146.24f, 203.34f),
                    PathNode.CurveTo(162.06f, 198.69f, 176.92f, 188.06f, 189.24f, 172.27f),
                    PathNode.CurveTo(204.76f, 152.52f, 214.0f, 127.0f, 214.0f, 104.0f),
                    PathNode.CurveTo(213.9449f, 56.526356f, 175.47365f, 18.055105f, 128.0f, 18.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.17f, 204.0f),
                    PathNode.LineTo(112.75f, 204.14f),
                    PathNode.CurveTo(112.55087f, 204.12187f, 112.35547f, 204.0747f, 112.17f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.9f, 226.0f),
                    PathNode.LineTo(113.1f, 226.0f),
                    PathNode.LineTo(121.8f, 205.69f),
                    PathNode.CurveTo(125.923f, 206.10336f, 130.077f, 206.10336f, 134.2f, 205.69f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 194.0f),
                    PathNode.CurveTo(94.48f, 194.0f, 54.0f, 153.85f, 54.0f, 104.0f),
                    PathNode.CurveTo(54.0f, 63.130928f, 87.13093f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(168.86908f, 30.0f, 202.0f, 63.130928f, 202.0f, 104.0f),
                    PathNode.CurveTo(202.0f, 153.85f, 161.52f, 194.0f, 128.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.0f, 101.92f),
                    PathNode.CurveTo(176.66911f, 101.97147f, 176.33485f, 101.998215f, 176.0f, 102.0f),
                    PathNode.CurveTo(173.07448f, 101.99703f, 170.57759f, 99.884605f, 170.09f, 97.0f),
                    PathNode.CurveTo(166.91978f, 79.09853f, 152.90237f, 65.08511f, 135.0f, 61.92f),
                    PathNode.CurveTo(131.73047f, 61.36771f, 129.52771f, 58.269527f, 130.08f, 55.0f),
                    PathNode.CurveTo(130.63228f, 51.730473f, 133.73047f, 49.527714f, 137.0f, 50.08f),
                    PathNode.CurveTo(159.91235f, 54.150616f, 177.84938f, 72.08765f, 181.92f, 95.0f),
                    PathNode.CurveTo(182.18628f, 96.57022f, 181.81737f, 98.181885f, 180.89449f, 99.4799f),
                    PathNode.CurveTo(179.97162f, 100.7779f, 178.57056f, 101.65575f, 177.0f, 101.92f),
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
        return _balloon!!
    }

private var _balloon: ImageVector? = null
