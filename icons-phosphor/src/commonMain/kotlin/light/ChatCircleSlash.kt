package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorLightIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.163273f, 33.886772f, 46.65007f, 33.860672f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(42.03432f, 38.019005f, 41.69497f, 41.515873f, 43.56f, 44.0f),
                    PathNode.LineTo(55.07f, 56.7f),
                    PathNode.CurveTo(23.77025f, 88.69836f, 16.989462f, 137.36432f, 38.35f, 176.7f),
                    PathNode.LineTo(26.73f, 211.56f),
                    PathNode.CurveTo(25.052174f, 216.59113f, 26.361296f, 222.1384f, 30.111448f, 225.88855f),
                    PathNode.CurveTo(33.861603f, 229.6387f, 39.40888f, 230.94783f, 44.44f, 229.27f),
                    PathNode.LineTo(79.31f, 217.65f),
                    PathNode.CurveTo(115.50485f, 237.28375f, 159.95515f, 233.22884f, 192.0f, 207.37f),
                    PathNode.LineTo(203.56f, 220.0f),
                    PathNode.CurveTo(205.79123f, 222.45215f, 209.58786f, 222.63123f, 212.04f, 220.4f),
                    PathNode.CurveTo(214.49214f, 218.16876f, 214.67123f, 214.37215f, 212.44f, 211.92f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(112.17933f, 218.00377f, 96.637184f, 213.83711f, 82.94f, 205.92f),
                    PathNode.CurveTo(81.45082f, 205.05675f, 79.66262f, 204.87465f, 78.03f, 205.42f),
                    PathNode.LineTo(40.65f, 217.88f),
                    PathNode.CurveTo(39.931267f, 218.11969f, 39.1388f, 217.93268f, 38.603065f, 217.39694f),
                    PathNode.CurveTo(38.06733f, 216.8612f, 37.880314f, 216.06873f, 38.12f, 215.35f),
                    PathNode.LineTo(50.58f, 178.0f),
                    PathNode.CurveTo(51.125343f, 176.36739f, 50.943245f, 174.57918f, 50.08f, 173.09f),
                    PathNode.CurveTo(29.987411f, 138.35106f, 35.322662f, 94.50655f, 63.16f, 65.6f),
                    PathNode.LineTo(184.0f, 198.47f),
                    PathNode.CurveTo(168.08612f, 211.13838f, 148.34058f, 218.02464f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 128.0f),
                    PathNode.CurveTo(229.99762f, 144.85786f, 225.82721f, 161.45364f, 217.86f, 176.31f),
                    PathNode.CurveTo(216.81087f, 178.25363f, 214.77872f, 179.46371f, 212.57f, 179.46f),
                    PathNode.CurveTo(210.46004f, 179.45813f, 208.50613f, 178.34813f, 207.42418f, 176.53668f),
                    PathNode.CurveTo(206.34224f, 174.72525f, 206.29129f, 172.47864f, 207.29f, 170.62f),
                    PathNode.CurveTo(225.3275f, 137.01279f, 220.23576f, 95.68723f, 194.58006f, 67.463486f),
                    PathNode.CurveTo(168.92435f, 39.239727f, 128.2704f, 30.240627f, 93.1f, 45.0f),
                    PathNode.CurveTo(90.15324f, 45.917946f, 86.990776f, 44.45056f, 85.789024f, 41.607708f),
                    PathNode.CurveTo(84.58727f, 38.76485f, 85.73831f, 35.474037f, 88.45f, 34.0f),
                    PathNode.CurveTo(119.93991f, 20.786394f, 155.95183f, 24.198004f, 184.4002f, 43.089897f),
                    PathNode.CurveTo(212.84859f, 61.981792f, 229.96304f, 93.85014f, 230.0f, 128.0f),
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
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
