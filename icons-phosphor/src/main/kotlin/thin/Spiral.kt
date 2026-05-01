package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorThinIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 144.0f),
                    PathNode.CurveTo(244.0f, 146.20914f, 242.20914f, 148.0f, 240.0f, 148.0f),
                    PathNode.CurveTo(237.79086f, 148.0f, 236.0f, 146.20914f, 236.0f, 144.0f),
                    PathNode.CurveTo(235.93938f, 88.79665f, 191.20334f, 44.060623f, 136.0f, 44.0f),
                    PathNode.CurveTo(85.21265f, 44.055115f, 44.055115f, 85.21265f, 44.0f, 136.0f),
                    PathNode.CurveTo(44.049603f, 182.37135f, 81.62865f, 219.9504f, 128.0f, 220.0f),
                    PathNode.CurveTo(169.95538f, 219.9559f, 203.9559f, 185.95538f, 204.0f, 144.0f),
                    PathNode.CurveTo(203.96141f, 106.46063f, 173.53935f, 76.03858f, 136.0f, 76.0f),
                    PathNode.CurveTo(102.87891f, 76.038574f, 76.038574f, 102.87891f, 76.0f, 136.0f),
                    PathNode.CurveTo(76.033066f, 164.7051f, 99.2949f, 187.96693f, 128.0f, 188.0f),
                    PathNode.CurveTo(152.28911f, 187.97244f, 171.97244f, 168.28911f, 172.0f, 144.0f),
                    PathNode.CurveTo(172.0f, 124.11775f, 155.88223f, 108.0f, 136.0f, 108.0f),
                    PathNode.CurveTo(120.536026f, 108.0f, 108.0f, 120.536026f, 108.0f, 136.0f),
                    PathNode.CurveTo(108.0f, 147.0457f, 116.95431f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(134.62741f, 156.0f, 140.0f, 150.62741f, 140.0f, 144.0f),
                    PathNode.CurveTo(140.0f, 141.79086f, 138.20914f, 140.0f, 136.0f, 140.0f),
                    PathNode.CurveTo(133.79086f, 140.0f, 132.0f, 138.20914f, 132.0f, 136.0f),
                    PathNode.CurveTo(132.0f, 133.79086f, 133.79086f, 132.0f, 136.0f, 132.0f),
                    PathNode.CurveTo(142.62741f, 132.0f, 148.0f, 137.37259f, 148.0f, 144.0f),
                    PathNode.CurveTo(148.0f, 155.0457f, 139.0457f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(112.536026f, 164.0f, 100.0f, 151.46397f, 100.0f, 136.0f),
                    PathNode.CurveTo(100.0f, 116.11775f, 116.11775f, 100.0f, 136.0f, 100.0f),
                    PathNode.CurveTo(160.28911f, 100.02756f, 179.97244f, 119.71089f, 180.0f, 144.0f),
                    PathNode.CurveTo(179.96693f, 172.7051f, 156.7051f, 195.96693f, 128.0f, 196.0f),
                    PathNode.CurveTo(94.87891f, 195.96143f, 68.038574f, 169.1211f, 68.0f, 136.0f),
                    PathNode.CurveTo(68.03858f, 98.46063f, 98.46063f, 68.03858f, 136.0f, 68.0f),
                    PathNode.CurveTo(177.95538f, 68.04409f, 211.9559f, 102.04464f, 212.0f, 144.0f),
                    PathNode.CurveTo(211.9504f, 190.37135f, 174.37135f, 227.9504f, 128.0f, 228.0f),
                    PathNode.CurveTo(77.21265f, 227.94489f, 36.055115f, 186.78735f, 36.0f, 136.0f),
                    PathNode.CurveTo(36.060623f, 80.79665f, 80.79665f, 36.060623f, 136.0f, 36.0f),
                    PathNode.CurveTo(195.61934f, 36.066135f, 243.93387f, 84.38066f, 244.0f, 144.0f),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
