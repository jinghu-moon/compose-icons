package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorBoldIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 128.0f),
                    PathNode.CurveTo(196.00076f, 131.64464f, 194.3451f, 135.0921f, 191.5f, 137.37f),
                    PathNode.LineTo(151.5f, 169.37f),
                    PathNode.CurveTo(147.89807f, 172.25385f, 142.96165f, 172.81702f, 138.80272f, 170.81862f),
                    PathNode.CurveTo(134.64378f, 168.82019f, 131.99904f, 164.61417f, 132.0f, 160.0f),
                    PathNode.LineTo(132.0f, 140.17f),
                    PathNode.LineTo(95.5f, 169.37f),
                    PathNode.CurveTo(91.89807f, 172.25385f, 86.96166f, 172.81702f, 82.80272f, 170.81862f),
                    PathNode.CurveTo(78.64378f, 168.82019f, 75.99904f, 164.61417f, 76.0f, 160.0f),
                    PathNode.LineTo(76.0f, 96.0f),
                    PathNode.CurveTo(75.99904f, 91.38584f, 78.64378f, 87.17981f, 82.80272f, 85.18138f),
                    PathNode.CurveTo(86.96166f, 83.18296f, 91.89807f, 83.74615f, 95.5f, 86.63f),
                    PathNode.LineTo(132.0f, 115.83f),
                    PathNode.LineTo(132.0f, 96.0f),
                    PathNode.CurveTo(131.99904f, 91.38584f, 134.64378f, 87.17981f, 138.80272f, 85.18138f),
                    PathNode.CurveTo(142.96165f, 83.18296f, 147.89807f, 83.74615f, 151.5f, 86.63f),
                    PathNode.LineTo(191.5f, 118.63f),
                    PathNode.CurveTo(194.3451f, 120.9079f, 196.00076f, 124.35536f, 196.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 187.64676f, 187.64676f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(68.35325f, 236.0f, 20.0f, 187.64676f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 68.35325f, 68.35325f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(187.61934f, 20.066133f, 235.93387f, 68.38066f, 236.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 81.60808f, 174.39192f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(81.60808f, 44.0f, 44.0f, 81.60808f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 174.39192f, 81.60808f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(174.37135f, 211.9504f, 211.9504f, 174.37135f, 212.0f, 128.0f),
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
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
