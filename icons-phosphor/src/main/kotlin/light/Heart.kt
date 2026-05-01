package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorLightIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.0f, 42.0f),
                    PathNode.CurveTo(157.0f, 42.0f, 138.74f, 51.47f, 128.0f, 67.34f),
                    PathNode.CurveTo(117.26f, 51.47f, 99.0f, 42.0f, 78.0f, 42.0f),
                    PathNode.CurveTo(44.878906f, 42.038574f, 18.038574f, 68.87891f, 18.0f, 102.0f),
                    PathNode.CurveTo(18.0f, 131.2f, 36.2f, 161.59f, 72.1f, 192.31f),
                    PathNode.CurveTo(88.55049f, 206.32764f, 106.32014f, 218.71884f, 125.16f, 229.31f),
                    PathNode.CurveTo(126.933426f, 230.26294f, 129.06657f, 230.26294f, 130.84f, 229.31f),
                    PathNode.CurveTo(149.67986f, 218.71884f, 167.44951f, 206.32764f, 183.9f, 192.31f),
                    PathNode.CurveTo(219.8f, 161.59f, 238.0f, 131.2f, 238.0f, 102.0f),
                    PathNode.CurveTo(237.96143f, 68.87891f, 211.1211f, 42.038574f, 178.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 217.11f),
                    PathNode.CurveTo(111.59f, 207.64f, 30.0f, 157.72f, 30.0f, 102.0f),
                    PathNode.CurveTo(30.02756f, 75.501755f, 51.501755f, 54.02756f, 78.0f, 54.0f),
                    PathNode.CurveTo(98.28f, 54.0f, 115.31f, 64.83f, 122.45f, 82.27f),
                    PathNode.CurveTo(123.374535f, 84.520706f, 125.56681f, 85.9902f, 128.0f, 85.9902f),
                    PathNode.CurveTo(130.4332f, 85.9902f, 132.62547f, 84.520706f, 133.55f, 82.27f),
                    PathNode.CurveTo(140.69f, 64.83f, 157.72f, 54.0f, 178.0f, 54.0f),
                    PathNode.CurveTo(204.49825f, 54.02756f, 225.97244f, 75.501755f, 226.0f, 102.0f),
                    PathNode.CurveTo(226.0f, 157.72f, 144.41f, 207.64f, 128.0f, 217.11f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _heart!!
    }

private var _heart: ImageVector? = null
