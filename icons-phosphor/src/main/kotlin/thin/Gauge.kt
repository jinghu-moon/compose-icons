package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorThinIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.23f, 75.5f),
                    PathNode.CurveTo(183.93454f, 55.1757f, 156.34201f, 43.830383f, 127.62f, 44.0f),
                    PathNode.CurveTo(68.28f, 44.21f, 20.0f, 93.16f, 20.0f, 153.13f),
                    PathNode.LineTo(20.0f, 176.0f),
                    PathNode.CurveTo(20.0f, 182.62741f, 25.372583f, 188.0f, 32.0f, 188.0f),
                    PathNode.LineTo(224.0f, 188.0f),
                    PathNode.CurveTo(230.62741f, 188.0f, 236.0f, 182.62741f, 236.0f, 176.0f),
                    PathNode.LineTo(236.0f, 152.0f),
                    PathNode.CurveTo(236.08217f, 123.27436f, 224.63753f, 95.716385f, 204.23f, 75.5f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 178.20914f, 226.20914f, 180.0f, 224.0f, 180.0f),
                    PathNode.LineTo(111.85f, 180.0f),
                    PathNode.LineTo(171.23f, 98.35f),
                    PathNode.CurveTo(172.16237f, 97.201256f, 172.38452f, 95.631676f, 171.80754f, 94.26931f),
                    PathNode.CurveTo(171.23056f, 92.906944f, 169.9487f, 91.97432f, 168.4749f, 91.84463f),
                    PathNode.CurveTo(167.00108f, 91.71493f, 165.57605f, 92.40933f, 164.77f, 93.65f),
                    PathNode.LineTo(102.0f, 180.0f),
                    PathNode.LineTo(32.0f, 180.0f),
                    PathNode.CurveTo(29.790861f, 180.0f, 28.0f, 178.20914f, 28.0f, 176.0f),
                    PathNode.LineTo(28.0f, 153.13f),
                    PathNode.CurveTo(28.00104f, 148.73994f, 28.281607f, 144.3544f, 28.84f, 140.0f),
                    PathNode.LineTo(56.0f, 140.0f),
                    PathNode.CurveTo(58.20914f, 140.0f, 60.0f, 138.20914f, 60.0f, 136.0f),
                    PathNode.CurveTo(60.0f, 133.79086f, 58.20914f, 132.0f, 56.0f, 132.0f),
                    PathNode.LineTo(30.21f, 132.0f),
                    PathNode.CurveTo(39.59f, 87.66f, 77.84f, 53.93f, 124.0f, 52.09f),
                    PathNode.LineTo(124.0f, 80.0f),
                    PathNode.CurveTo(124.0f, 82.20914f, 125.79086f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(130.20914f, 84.0f, 132.0f, 82.20914f, 132.0f, 80.0f),
                    PathNode.LineTo(132.0f, 52.08f),
                    PathNode.CurveTo(177.98122f, 53.94009f, 216.76761f, 86.916794f, 226.0f, 132.0f),
                    PathNode.LineTo(200.0f, 132.0f),
                    PathNode.CurveTo(197.79086f, 132.0f, 196.0f, 133.79086f, 196.0f, 136.0f),
                    PathNode.CurveTo(196.0f, 138.20914f, 197.79086f, 140.0f, 200.0f, 140.0f),
                    PathNode.LineTo(227.29f, 140.0f),
                    PathNode.CurveTo(227.7633f, 143.98248f, 228.00038f, 147.98949f, 228.0f, 152.0f),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
