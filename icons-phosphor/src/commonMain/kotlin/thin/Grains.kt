package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorThinIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 60.0f),
                    PathNode.CurveTo(196.33041f, 59.99299f, 184.78894f, 62.432095f, 174.12f, 67.16f),
                    PathNode.CurveTo(161.12f, 36.38f, 131.12f, 21.08f, 129.79f, 20.42f),
                    PathNode.CurveTo(128.66327f, 19.85618f, 127.33674f, 19.85618f, 126.21f, 20.42f),
                    PathNode.CurveTo(124.89f, 21.08f, 94.91f, 36.42f, 81.88f, 67.16f),
                    PathNode.CurveTo(71.21107f, 62.432095f, 59.669582f, 59.99299f, 48.0f, 60.0f),
                    PathNode.CurveTo(45.79086f, 60.0f, 44.0f, 61.79086f, 44.0f, 64.0f),
                    PathNode.LineTo(44.0f, 144.0f),
                    PathNode.CurveTo(44.0f, 190.39192f, 81.60808f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(174.39192f, 228.0f, 212.0f, 190.39192f, 212.0f, 144.0f),
                    PathNode.LineTo(212.0f, 64.0f),
                    PathNode.CurveTo(212.0f, 61.79086f, 210.20914f, 60.0f, 208.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 219.9f),
                    PathNode.CurveTo(83.659744f, 217.71844f, 52.052525f, 184.39917f, 52.0f, 144.0f),
                    PathNode.LineTo(52.0f, 124.1f),
                    PathNode.CurveTo(92.340256f, 126.281555f, 123.94748f, 159.60083f, 124.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 164.27f),
                    PathNode.CurveTo(110.74783f, 136.13992f, 83.05843f, 117.61494f, 52.0f, 116.1f),
                    PathNode.LineTo(52.0f, 68.1f),
                    PathNode.CurveTo(92.340256f, 70.281555f, 123.94748f, 103.60083f, 124.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(89.05f, 70.75f),
                    PathNode.CurveTo(99.12f, 46.53f, 121.51f, 32.28f, 128.05f, 28.56f),
                    PathNode.CurveTo(134.54f, 32.28f, 156.93f, 46.56f, 167.0f, 70.75f),
                    PathNode.CurveTo(148.46317f, 81.15988f, 134.53586f, 98.17976f, 128.0f, 118.41f),
                    PathNode.CurveTo(121.476395f, 98.18813f, 107.56797f, 81.16951f, 89.05f, 70.75f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 144.0f),
                    PathNode.CurveTo(203.94748f, 184.39917f, 172.34026f, 217.71844f, 132.0f, 219.9f),
                    PathNode.LineTo(132.0f, 200.0f),
                    PathNode.CurveTo(132.05252f, 159.60083f, 163.65974f, 126.281555f, 204.0f, 124.1f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 116.1f),
                    PathNode.CurveTo(172.94157f, 117.61494f, 145.25217f, 136.13992f, 132.0f, 164.27f),
                    PathNode.LineTo(132.0f, 144.0f),
                    PathNode.CurveTo(132.05252f, 103.60083f, 163.65974f, 70.281555f, 204.0f, 68.1f),
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
        return _grains!!
    }

private var _grains: ImageVector? = null
