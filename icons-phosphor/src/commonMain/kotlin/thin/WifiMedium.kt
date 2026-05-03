package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) return _wifiMedium!!
        _wifiMedium = phosphorThinIcon(
            name = "WifiMedium",
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
                    PathNode.MoveTo(202.48f, 125.91f),
                    PathNode.CurveTo(158.82858f, 91.34081f, 97.131424f, 91.34081f, 53.48f, 125.91f),
                    PathNode.CurveTo(51.74859f, 127.29071f, 51.464287f, 129.81358f, 52.845f, 131.545f),
                    PathNode.CurveTo(54.22571f, 133.27641f, 56.74859f, 133.56071f, 58.48f, 132.18f),
                    PathNode.CurveTo(99.20866f, 99.95061f, 156.75134f, 99.95061f, 197.48f, 132.18f),
                    PathNode.CurveTo(199.21141f, 133.56071f, 201.73428f, 133.27641f, 203.115f, 131.545f),
                    PathNode.CurveTo(204.49571f, 129.81358f, 204.21141f, 127.29071f, 202.48f, 125.91f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
