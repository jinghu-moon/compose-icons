package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorThinIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.26f, 84.89f),
                    PathNode.CurveTo(240.57011f, 131.46573f, 223.81017f, 187.36903f, 179.55591f, 213.98857f),
                    PathNode.CurveTo(135.30165f, 240.60812f, 78.06268f, 229.2162f, 47.372852f, 187.68098f),
                    PathNode.CurveTo(16.68302f, 146.14578f, 22.604563f, 88.08537f, 61.04758f, 53.600975f),
                    PathNode.CurveTo(99.4906f, 19.116575f, 157.85085f, 19.51454f, 195.82f, 54.52f),
                    PathNode.LineTo(221.17f, 29.17f),
                    PathNode.CurveTo(222.73297f, 27.607035f, 225.26703f, 27.607035f, 226.83f, 29.17f),
                    PathNode.CurveTo(228.39296f, 30.732965f, 228.39296f, 33.267033f, 226.83f, 34.83f),
                    PathNode.LineTo(130.83f, 130.83f),
                    PathNode.CurveTo(129.26703f, 132.39296f, 126.73296f, 132.39296f, 125.17f, 130.83f),
                    PathNode.CurveTo(123.60703f, 129.26703f, 123.60703f, 126.73296f, 125.17f, 125.17f),
                    PathNode.LineTo(156.17f, 94.17f),
                    PathNode.CurveTo(140.14398f, 80.83124f, 116.956184f, 80.57236f, 100.636345f, 93.549995f),
                    PathNode.CurveTo(84.31651f, 106.527626f, 79.34627f, 129.17795f, 88.732834f, 147.79645f),
                    PathNode.CurveTo(98.11941f, 166.41493f, 119.28514f, 175.88872f, 139.42374f, 170.4857f),
                    PathNode.CurveTo(159.56235f, 165.08269f, 173.14352f, 146.28662f, 171.95f, 125.47f),
                    PathNode.CurveTo(171.82297f, 123.260864f, 173.51086f, 121.36703f, 175.72f, 121.24f),
                    PathNode.CurveTo(177.92914f, 121.112976f, 179.82297f, 122.80086f, 179.95f, 125.01f),
                    PathNode.CurveTo(181.37318f, 149.6799f, 165.23813f, 171.94408f, 141.351f, 178.27135f),
                    PathNode.CurveTo(117.463875f, 184.59862f, 92.42306f, 173.2412f, 81.44725f, 151.10162f),
                    PathNode.CurveTo(70.47145f, 128.96202f, 76.59254f, 102.155945f, 96.09038f, 86.974915f),
                    PathNode.CurveTo(115.58822f, 71.793884f, 143.07689f, 72.4314f, 161.85f, 88.5f),
                    PathNode.LineTo(190.19f, 60.17f),
                    PathNode.CurveTo(153.27827f, 26.584143f, 96.32055f, 28.550459f, 61.812874f, 64.60188f),
                    PathNode.CurveTo(27.305193f, 100.653305f, 27.83189f, 157.64253f, 63.0f, 193.05f),
                    PathNode.CurveTo(94.704216f, 224.63652f, 144.539f, 228.82631f, 181.07205f, 202.9767f),
                    PathNode.CurveTo(217.60512f, 177.1271f, 230.23683f, 128.73805f, 211.0f, 88.33f),
                    PathNode.CurveTo(210.34357f, 87.034515f, 210.44089f, 85.48501f, 211.25423f, 84.28183f),
                    PathNode.CurveTo(212.06758f, 83.07865f, 213.4692f, 82.41085f, 214.91599f, 82.53717f),
                    PathNode.CurveTo(216.3628f, 82.66348f, 217.62746f, 83.56407f, 218.22f, 84.89f),
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
        return _target!!
    }

private var _target: ImageVector? = null
