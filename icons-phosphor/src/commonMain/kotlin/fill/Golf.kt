package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorFillIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(175.47f, 197.14f),
                    PathNode.CurveTo(177.04881f, 201.26555f, 174.98506f, 205.88994f, 170.86f, 207.47f),
                    PathNode.CurveTo(159.69054f, 211.85371f, 147.95184f, 214.61835f, 136.0f, 215.68f),
                    PathNode.LineTo(136.0f, 248.0f),
                    PathNode.CurveTo(136.0f, 252.41827f, 132.41827f, 256.0f, 128.0f, 256.0f),
                    PathNode.CurveTo(123.58172f, 256.0f, 120.0f, 252.41827f, 120.0f, 248.0f),
                    PathNode.LineTo(120.0f, 215.68f),
                    PathNode.CurveTo(108.048164f, 214.61835f, 96.30945f, 211.85371f, 85.14f, 207.47f),
                    PathNode.CurveTo(82.4221f, 206.48346f, 80.44804f, 204.1071f, 79.97663f, 201.25438f),
                    PathNode.CurveTo(79.50522f, 198.40166f, 80.609825f, 195.51656f, 82.865845f, 193.70807f),
                    PathNode.CurveTo(85.12187f, 191.89958f, 88.17819f, 191.44919f, 90.86f, 192.53f),
                    PathNode.CurveTo(104.0f, 197.56f, 116.15f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(139.85f, 200.0f, 152.0f, 197.56f, 165.14f, 192.53f),
                    PathNode.CurveTo(169.26555f, 190.95119f, 173.88994f, 193.01494f, 175.47f, 197.14f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 96.0f),
                    PathNode.CurveTo(216.0f, 144.60106f, 176.60106f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(79.39894f, 184.0f, 40.0f, 144.60106f, 40.0f, 96.0f),
                    PathNode.CurveTo(40.0f, 47.39894f, 79.39894f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(176.57822f, 8.055109f, 215.94489f, 47.421787f, 216.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 132.0f),
                    PathNode.CurveTo(144.0f, 125.37258f, 138.62741f, 120.0f, 132.0f, 120.0f),
                    PathNode.CurveTo(125.37258f, 120.0f, 120.0f, 125.37258f, 120.0f, 132.0f),
                    PathNode.CurveTo(120.0f, 138.62741f, 125.37258f, 144.0f, 132.0f, 144.0f),
                    PathNode.CurveTo(138.62741f, 144.0f, 144.0f, 138.62741f, 144.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 100.0f),
                    PathNode.CurveTo(176.0f, 93.37258f, 170.62741f, 88.0f, 164.0f, 88.0f),
                    PathNode.CurveTo(157.37259f, 88.0f, 152.0f, 93.37258f, 152.0f, 100.0f),
                    PathNode.CurveTo(152.0f, 106.62742f, 157.37259f, 112.0f, 164.0f, 112.0f),
                    PathNode.CurveTo(170.62741f, 112.0f, 176.0f, 106.62742f, 176.0f, 100.0f),
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
        return _golf!!
    }

private var _golf: ImageVector? = null
