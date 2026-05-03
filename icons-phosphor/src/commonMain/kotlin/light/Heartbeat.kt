package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorLightIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 142.0f),
                    PathNode.LineTo(32.0f, 142.0f),
                    PathNode.CurveTo(28.68629f, 142.0f, 26.0f, 139.3137f, 26.0f, 136.0f),
                    PathNode.CurveTo(26.0f, 132.6863f, 28.68629f, 130.0f, 32.0f, 130.0f),
                    PathNode.LineTo(68.79f, 130.0f),
                    PathNode.LineTo(83.0f, 108.67f),
                    PathNode.CurveTo(84.11165f, 106.994125f, 85.98895f, 105.986626f, 88.0f, 105.986626f),
                    PathNode.CurveTo(90.01105f, 105.986626f, 91.88835f, 106.994125f, 93.0f, 108.67f),
                    PathNode.LineTo(120.0f, 149.18f),
                    PathNode.LineTo(131.0f, 132.67f),
                    PathNode.CurveTo(132.11472f, 130.99922f, 133.9915f, 129.99702f, 136.0f, 130.0f),
                    PathNode.LineTo(160.0f, 130.0f),
                    PathNode.CurveTo(163.3137f, 130.0f, 166.0f, 132.6863f, 166.0f, 136.0f),
                    PathNode.CurveTo(166.0f, 139.3137f, 163.3137f, 142.0f, 160.0f, 142.0f),
                    PathNode.LineTo(139.21f, 142.0f),
                    PathNode.LineTo(125.0f, 163.33f),
                    PathNode.CurveTo(123.88835f, 165.00587f, 122.01105f, 166.01338f, 120.0f, 166.01338f),
                    PathNode.CurveTo(117.98895f, 166.01338f, 116.11165f, 165.00587f, 115.0f, 163.33f),
                    PathNode.LineTo(88.0f, 122.82f),
                    PathNode.LineTo(77.0f, 139.33f),
                    PathNode.CurveTo(75.885284f, 141.00078f, 74.00851f, 142.00298f, 72.0f, 142.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 42.0f),
                    PathNode.CurveTo(157.0f, 42.0f, 138.74f, 51.47f, 128.0f, 67.34f),
                    PathNode.CurveTo(117.26f, 51.47f, 99.0f, 42.0f, 78.0f, 42.0f),
                    PathNode.CurveTo(44.878906f, 42.038574f, 18.038574f, 68.87891f, 18.0f, 102.0f),
                    PathNode.QuadTo(18.0f, 103.09f, 18.0f, 104.19f),
                    PathNode.CurveTo(18.104935f, 107.5037f, 20.876291f, 110.104935f, 24.19f, 110.0f),
                    PathNode.CurveTo(27.503708f, 109.895065f, 30.104935f, 107.12371f, 30.0f, 103.81f),
                    PathNode.CurveTo(30.0f, 103.21f, 30.0f, 102.6f, 30.0f, 102.0f),
                    PathNode.CurveTo(30.02756f, 75.501755f, 51.501755f, 54.02756f, 78.0f, 54.0f),
                    PathNode.CurveTo(98.28f, 54.0f, 115.31f, 64.83f, 122.45f, 82.27f),
                    PathNode.CurveTo(123.374535f, 84.520706f, 125.56681f, 85.9902f, 128.0f, 85.9902f),
                    PathNode.CurveTo(130.4332f, 85.9902f, 132.62547f, 84.520706f, 133.55f, 82.27f),
                    PathNode.CurveTo(140.69f, 64.83f, 157.72f, 54.0f, 178.0f, 54.0f),
                    PathNode.CurveTo(204.49825f, 54.02756f, 225.97244f, 75.501755f, 226.0f, 102.0f),
                    PathNode.CurveTo(226.0f, 157.73f, 144.39f, 207.65f, 128.0f, 217.11f),
                    PathNode.CurveTo(118.16f, 211.45f, 84.91f, 191.29f, 59.84f, 163.95f),
                    PathNode.CurveTo(58.42015f, 162.26611f, 56.191826f, 161.49554f, 54.035088f, 161.94266f),
                    PathNode.CurveTo(51.87835f, 162.38976f, 50.139965f, 163.98262f, 49.506504f, 166.09216f),
                    PathNode.CurveTo(48.87304f, 168.20169f, 49.446346f, 170.48872f, 51.0f, 172.05f),
                    PathNode.CurveTo(81.94f, 205.82f, 123.41f, 228.34f, 125.16f, 229.28f),
                    PathNode.CurveTo(126.933426f, 230.23293f, 129.06657f, 230.23293f, 130.84f, 229.28f),
                    PathNode.CurveTo(149.67986f, 218.68884f, 167.44951f, 206.29764f, 183.9f, 192.28f),
                    PathNode.CurveTo(219.8f, 161.59f, 238.0f, 131.2f, 238.0f, 102.0f),
                    PathNode.CurveTo(237.96143f, 68.87891f, 211.1211f, 42.038574f, 178.0f, 42.0f),
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
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
