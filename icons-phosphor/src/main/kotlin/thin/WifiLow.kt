package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) return _wifiLow!!
        _wifiLow = phosphorThinIcon(
            name = "WifiLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 204.0f),
                    PathNode.CurveTo(136.0f, 208.41827f, 132.41827f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(123.58172f, 212.0f, 120.0f, 208.41827f, 120.0f, 204.0f),
                    PathNode.CurveTo(120.0f, 199.58173f, 123.58172f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(132.41827f, 196.0f, 136.0f, 199.58173f, 136.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.35f, 161.77f),
                    PathNode.CurveTo(145.10248f, 143.40707f, 110.89753f, 143.40707f, 85.65f, 161.77f),
                    PathNode.CurveTo(84.43676f, 162.58884f, 83.767654f, 164.00494f, 83.905464f, 165.46214f),
                    PathNode.CurveTo(84.043274f, 166.91934f, 84.966f, 168.1849f, 86.31123f, 168.76176f),
                    PathNode.CurveTo(87.65646f, 169.33864f, 89.20936f, 169.13467f, 90.36f, 168.23f),
                    PathNode.CurveTo(112.80037f, 151.91171f, 143.19963f, 151.91171f, 165.64f, 168.23f),
                    PathNode.CurveTo(166.79065f, 169.13467f, 168.34354f, 169.33864f, 169.68877f, 168.76176f),
                    PathNode.CurveTo(171.034f, 168.1849f, 171.95673f, 166.91934f, 172.09453f, 165.46214f),
                    PathNode.CurveTo(172.23235f, 164.00494f, 171.56323f, 162.58884f, 170.35f, 161.77f),
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
        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null
