package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorFillIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 104.0f),
                    PathNode.CurveTo(144.49199f, 104.00057f, 162.27068f, 118.14731f, 166.87415f, 138.11552f),
                    PathNode.CurveTo(171.4776f, 158.08374f, 161.68697f, 178.5863f, 143.26353f, 187.55843f),
                    PathNode.CurveTo(124.8401f, 196.53055f, 102.66201f, 191.5966f, 89.78f, 175.66f),
                    PathNode.CurveTo(87.07139f, 172.22057f, 87.63049f, 167.24277f, 91.03462f, 164.48991f),
                    PathNode.CurveTo(94.43875f, 161.73706f, 99.423355f, 162.23175f, 102.22f, 165.6f),
                    PathNode.CurveTo(109.6461f, 174.79053f, 122.04222f, 178.33022f, 133.20158f, 174.44676f),
                    PathNode.CurveTo(144.36095f, 170.5633f, 151.88144f, 160.0926f, 151.99754f, 148.27739f),
                    PathNode.CurveTo(152.11363f, 136.46217f, 144.80034f, 125.84573f, 133.71944f, 121.74374f),
                    PathNode.CurveTo(122.63854f, 117.64174f, 110.17526f, 120.937164f, 102.57f, 129.98f),
                    PathNode.CurveTo(100.26098f, 132.67346f, 96.45385f, 133.52449f, 93.21774f, 132.07056f),
                    PathNode.CurveTo(89.98164f, 130.61661f, 88.08962f, 127.20505f, 88.57f, 123.69f),
                    PathNode.LineTo(96.12f, 70.87f),
                    PathNode.CurveTo(96.680244f, 66.94311f, 100.033394f, 64.01974f, 104.0f, 64.0f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.CurveTo(164.41827f, 64.0f, 168.0f, 67.58172f, 168.0f, 72.0f),
                    PathNode.CurveTo(168.0f, 76.41828f, 164.41827f, 80.0f, 160.0f, 80.0f),
                    PathNode.LineTo(110.94f, 80.0f),
                    PathNode.LineTo(107.0f, 107.4f),
                    PathNode.CurveTo(112.3851f, 105.15046f, 118.163925f, 103.9947f, 124.0f, 104.0f),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
