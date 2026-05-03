package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorFillIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.41f, 159.07f),
                    PathNode.CurveTo(195.81915f, 164.90002f, 184.80373f, 167.9662f, 173.58f, 167.93f),
                    PathNode.CurveTo(164.17711f, 167.85541f, 154.8807f, 165.93225f, 146.22f, 162.27f),
                    PathNode.CurveTo(139.54512f, 171.69319f, 135.97284f, 182.9623f, 136.0f, 194.51f),
                    PathNode.LineTo(136.0f, 224.0f),
                    PathNode.CurveTo(136.00487f, 226.21684f, 135.08966f, 228.3363f, 133.47269f, 229.85281f),
                    PathNode.CurveTo(131.85571f, 231.36931f, 129.68198f, 232.14687f, 127.47f, 232.0f),
                    PathNode.CurveTo(123.20465f, 231.62871f, 119.947235f, 228.03116f, 120.0f, 223.75f),
                    PathNode.LineTo(120.0f, 211.31f),
                    PathNode.LineTo(81.38f, 172.69f),
                    PathNode.CurveTo(75.638985f, 174.83182f, 69.567345f, 175.95206f, 63.44f, 176.0f),
                    PathNode.CurveTo(55.004707f, 176.02084f, 46.727367f, 173.71275f, 39.52f, 169.33f),
                    PathNode.CurveTo(17.73f, 156.09f, 6.0f, 125.62f, 8.270001f, 87.79f),
                    PathNode.CurveTo(8.50658f, 83.73885f, 11.738856f, 80.506584f, 15.79f, 80.27f),
                    PathNode.CurveTo(53.62f, 78.04f, 84.09f, 89.73f, 97.29f, 111.52f),
                    PathNode.CurveTo(102.47614f, 120.06084f, 104.740265f, 130.0581f, 103.74f, 140.0f),
                    PathNode.CurveTo(103.61297f, 141.57361f, 102.57224f, 142.92531f, 101.08339f, 143.4504f),
                    PathNode.CurveTo(99.59454f, 143.9755f, 97.93612f, 143.57576f, 96.85f, 142.43f),
                    PathNode.LineTo(77.65f, 122.33f),
                    PathNode.CurveTo(74.504684f, 119.34177f, 69.55075f, 119.4052f, 66.48297f, 122.47298f),
                    PathNode.CurveTo(63.415195f, 125.54075f, 63.35177f, 130.49469f, 66.34f, 133.64f),
                    PathNode.LineTo(120.22f, 188.89f),
                    PathNode.CurveTo(120.28f, 188.11f, 120.35f, 187.33f, 120.43f, 186.56f),
                    PathNode.CurveTo(122.179436f, 171.72748f, 128.72447f, 157.87192f, 139.07f, 147.1f),
                    PathNode.LineTo(189.66f, 93.64f),
                    PathNode.CurveTo(192.78593f, 90.51683f, 192.78818f, 85.450935f, 189.665f, 82.325f),
                    PathNode.CurveTo(186.54182f, 79.199066f, 181.47594f, 79.19683f, 178.35f, 82.32f),
                    PathNode.LineTo(129.35f, 134.14f),
                    PathNode.CurveTo(128.35112f, 135.19803f, 126.85649f, 135.63019f, 125.44711f, 135.2685f),
                    PathNode.CurveTo(124.037735f, 134.90678f, 122.93593f, 133.80829f, 122.57f, 132.4f),
                    PathNode.CurveTo(117.83f, 114.92f, 119.92f, 97.52f, 128.97f, 82.58f),
                    PathNode.CurveTo(146.83f, 53.1f, 188.39f, 37.32f, 240.15f, 40.36f),
                    PathNode.CurveTo(244.20114f, 40.59658f, 247.43343f, 43.828857f, 247.67f, 47.88f),
                    PathNode.CurveTo(250.67f, 99.65f, 234.89f, 141.21f, 205.41f, 159.07f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _plant!!
    }

private var _plant: ImageVector? = null
