package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorThinIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.81f, 44.19f),
                    PathNode.CurveTo(201.43095f, 33.77175f, 184.76099f, 33.158108f, 173.64406f, 42.785057f),
                    PathNode.CurveTo(162.52713f, 52.41201f, 160.75204f, 68.99856f, 169.58f, 80.76f),
                    PathNode.LineTo(80.76f, 169.58f),
                    PathNode.CurveTo(69.61108f, 161.24405f, 54.031364f, 162.3645f, 44.19f, 172.21f),
                    PathNode.LineTo(44.19f, 172.21f),
                    PathNode.CurveTo(33.63282f, 182.78564f, 33.24072f, 199.78775f, 43.29915f, 210.83884f),
                    PathNode.CurveTo(53.357574f, 221.88991f, 70.32146f, 223.09502f, 81.84112f, 213.57683f),
                    PathNode.CurveTo(93.36077f, 204.05865f, 95.37613f, 187.17186f, 86.42f, 175.21f),
                    PathNode.LineTo(175.24f, 86.39f),
                    PathNode.CurveTo(187.00145f, 95.21796f, 203.588f, 93.44287f, 213.21494f, 82.32594f),
                    PathNode.CurveTo(222.84189f, 71.20901f, 222.22824f, 54.53904f, 211.81f, 44.16f),
                    PathNode.Close,
                    PathNode.MoveTo(78.14f, 206.19f),
                    PathNode.CurveTo(72.42052f, 211.91121f, 63.817684f, 213.62343f, 56.343456f, 210.52815f),
                    PathNode.CurveTo(48.869225f, 207.4329f, 43.995728f, 200.1398f, 43.995728f, 192.05f),
                    PathNode.CurveTo(43.995728f, 183.9602f, 48.869225f, 176.6671f, 56.343456f, 173.57184f),
                    PathNode.CurveTo(63.817684f, 170.47656f, 72.42052f, 172.18878f, 78.14f, 177.91f),
                    PathNode.CurveTo(85.92102f, 185.7154f, 85.92102f, 198.3446f, 78.14f, 206.15f),
                    PathNode.Close,
                    PathNode.MoveTo(206.14f, 78.19f),
                    PathNode.CurveTo(198.33f, 85.99764f, 185.67f, 85.99764f, 177.86f, 78.19f),
                    PathNode.LineTo(177.86f, 78.19f),
                    PathNode.CurveTo(172.1388f, 72.47051f, 170.42656f, 63.867683f, 173.52184f, 56.393456f),
                    PathNode.CurveTo(176.61708f, 48.919228f, 183.9102f, 44.04573f, 192.0f, 44.04573f),
                    PathNode.CurveTo(200.0898f, 44.04573f, 207.38292f, 48.919228f, 210.47816f, 56.393456f),
                    PathNode.CurveTo(213.57344f, 63.867683f, 211.8612f, 72.47051f, 206.14f, 78.19f),
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
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
