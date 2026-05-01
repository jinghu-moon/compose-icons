package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorBoldIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 80.0f),
                    PathNode.LineTo(140.0f, 121.21f),
                    PathNode.LineTo(174.17f, 141.71f),
                    PathNode.CurveTo(177.9309f, 143.87367f, 180.23088f, 147.899f, 180.18529f, 152.23764f),
                    PathNode.CurveTo(180.13966f, 156.57626f, 177.75555f, 160.55235f, 173.95f, 162.63647f),
                    PathNode.CurveTo(170.14445f, 164.72061f, 165.51027f, 164.58813f, 161.83f, 162.29f),
                    PathNode.LineTo(121.83f, 138.29f),
                    PathNode.CurveTo(118.214f, 136.12228f, 116.0008f, 132.21599f, 116.0f, 128.0f),
                    PathNode.LineTo(116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 73.37258f, 121.37258f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(134.62741f, 68.0f, 140.0f, 73.37258f, 140.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(101.44034f, 27.931612f, 75.95842f, 38.497463f, 57.24f, 57.34f),
                    PathNode.CurveTo(52.55f, 62.08f, 48.24f, 66.71f, 44.0f, 71.34f),
                    PathNode.LineTo(44.0f, 64.0f),
                    PathNode.CurveTo(44.0f, 57.37258f, 38.62742f, 52.0f, 32.0f, 52.0f),
                    PathNode.CurveTo(25.372583f, 52.0f, 20.0f, 57.37258f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 104.0f),
                    PathNode.CurveTo(20.0f, 110.62742f, 25.372583f, 116.0f, 32.0f, 116.0f),
                    PathNode.LineTo(72.0f, 116.0f),
                    PathNode.CurveTo(78.62742f, 116.0f, 84.0f, 110.62742f, 84.0f, 104.0f),
                    PathNode.CurveTo(84.0f, 97.37258f, 78.62742f, 92.0f, 72.0f, 92.0f),
                    PathNode.LineTo(57.77f, 92.0f),
                    PathNode.CurveTo(63.0f, 86.0f, 68.37f, 80.22f, 74.26f, 74.26f),
                    PathNode.CurveTo(103.735016f, 44.77647f, 151.45944f, 44.541294f, 181.22359f, 73.73291f),
                    PathNode.CurveTo(210.98775f, 102.924515f, 211.67946f, 150.64452f, 182.77393f, 180.68655f),
                    PathNode.CurveTo(153.8684f, 210.7286f, 106.1572f, 211.87682f, 75.84f, 183.26f),
                    PathNode.CurveTo(71.018555f, 178.70917f, 63.420822f, 178.92856f, 58.87f, 183.75f),
                    PathNode.CurveTo(54.31917f, 188.57144f, 54.538555f, 196.16917f, 59.36f, 200.72f),
                    PathNode.CurveTo(92.01408f, 231.54317f, 141.20988f, 236.8206f, 179.6588f, 213.62497f),
                    PathNode.CurveTo(218.1077f, 190.42932f, 236.38052f, 144.4491f, 224.34146f, 101.18922f),
                    PathNode.CurveTo(212.30238f, 57.929337f, 172.90385f, 27.998848f, 128.0f, 28.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
