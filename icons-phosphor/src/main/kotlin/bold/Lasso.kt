package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorBoldIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(207.83f, 56.53f),
                    PathNode.CurveTo(186.32f, 43.29f, 158.0f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(98.0f, 36.0f, 69.68f, 43.29f, 48.17f, 56.53f),
                    PathNode.CurveTo(24.85f, 70.89f, 12.0f, 90.6f, 12.0f, 112.0f),
                    PathNode.CurveTo(12.0f, 133.4f, 24.85f, 153.14f, 48.17f, 167.5f),
                    PathNode.CurveTo(66.65f, 178.87f, 90.17f, 185.84f, 115.46f, 187.58f),
                    PathNode.CurveTo(113.46f, 198.65f, 106.37f, 205.33f, 100.24f, 209.12f),
                    PathNode.CurveTo(86.76f, 217.43f, 67.49f, 218.3f, 53.38f, 211.22f),
                    PathNode.CurveTo(47.448463f, 208.2487f, 40.231293f, 210.64847f, 37.26f, 216.58f),
                    PathNode.CurveTo(34.288708f, 222.51154f, 36.68846f, 229.72871f, 42.62f, 232.7f),
                    PathNode.CurveTo(52.579468f, 237.57281f, 63.53261f, 240.0715f, 74.62f, 240.0f),
                    PathNode.CurveTo(88.06296f, 240.0952f, 101.27253f, 236.48662f, 112.8f, 229.57f),
                    PathNode.CurveTo(128.25f, 220.03f, 137.8f, 204.99f, 139.63f, 187.67f),
                    PathNode.CurveTo(165.23f, 186.03f, 189.1f, 179.02f, 207.79f, 167.52f),
                    PathNode.CurveTo(231.15f, 153.16f, 244.0f, 133.45f, 244.0f, 112.0f),
                    PathNode.CurveTo(244.0f, 90.55f, 231.15f, 70.89f, 207.83f, 56.53f),
                    PathNode.Close,
                    PathNode.MoveTo(73.39f, 153.53f),
                    PathNode.CurveTo(77.77528f, 146.82173f, 85.59638f, 143.19438f, 93.55f, 144.18f),
                    PathNode.CurveTo(103.91f, 145.57f, 110.09f, 153.61f, 113.27f, 163.31f),
                    PathNode.CurveTo(99.558105f, 162.10748f, 86.10999f, 158.81964f, 73.39f, 153.56f),
                    PathNode.Close,
                    PathNode.MoveTo(138.26f, 163.67f),
                    PathNode.CurveTo(136.54906f, 154.70395f, 132.87448f, 146.22783f, 127.5f, 138.85f),
                    PathNode.CurveTo(120.16352f, 128.79654f, 109.072334f, 122.138214f, 96.75f, 120.39f),
                    PathNode.CurveTo(78.75f, 117.98f, 62.23f, 126.28f, 52.65f, 141.39f),
                    PathNode.CurveTo(42.2f, 133.0f, 36.0f, 122.84f, 36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 83.81f, 78.13f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(177.87f, 60.0f, 220.0f, 83.82f, 220.0f, 112.0f),
                    PathNode.CurveTo(220.0f, 138.26f, 183.51f, 160.71f, 138.26f, 163.7f),
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
        return _lasso!!
    }

private var _lasso: ImageVector? = null
