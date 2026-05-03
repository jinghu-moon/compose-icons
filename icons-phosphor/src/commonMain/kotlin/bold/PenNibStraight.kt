package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorBoldIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.92f, 122.11f),
                    PathNode.CurveTo(225.82f, 121.92f, 225.73f, 121.74f, 225.62f, 121.55f),
                    PathNode.LineTo(196.0f, 68.85f),
                    PathNode.LineTo(196.0f, 32.0f),
                    PathNode.CurveTo(196.0f, 20.954306f, 187.0457f, 12.0f, 176.0f, 12.0f),
                    PathNode.LineTo(80.0f, 12.0f),
                    PathNode.CurveTo(68.95431f, 12.0f, 60.0f, 20.954306f, 60.0f, 32.0f),
                    PathNode.LineTo(60.0f, 68.87f),
                    PathNode.LineTo(30.38f, 121.55f),
                    PathNode.CurveTo(30.268135f, 121.73351f, 30.167938f, 121.92389f, 30.08f, 122.12f),
                    PathNode.CurveTo(26.746313f, 128.81807f, 27.453415f, 136.8203f, 31.91f, 142.83f),
                    PathNode.CurveTo(32.0f, 142.96f, 32.09f, 143.08f, 32.19f, 143.2f),
                    PathNode.LineTo(118.63f, 251.49f),
                    PathNode.CurveTo(120.907135f, 254.33998f, 124.357025f, 255.99937f, 128.005f, 255.99937f),
                    PathNode.CurveTo(131.65297f, 255.99937f, 135.10287f, 254.33998f, 137.38f, 251.49f),
                    PathNode.LineTo(223.81f, 143.2f),
                    PathNode.CurveTo(223.91f, 143.08f, 224.0f, 142.96f, 224.09f, 142.83f),
                    PathNode.CurveTo(228.54613f, 136.81635f, 229.2531f, 128.8116f, 225.92f, 122.11f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 36.0f),
                    PathNode.LineTo(172.0f, 60.0f),
                    PathNode.LineTo(84.0f, 60.0f),
                    PathNode.LineTo(84.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 144.0f),
                    PathNode.CurveTo(122.47715f, 144.0f, 118.0f, 139.52284f, 118.0f, 134.0f),
                    PathNode.CurveTo(118.0f, 128.47716f, 122.47715f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(133.52284f, 124.0f, 138.0f, 128.47716f, 138.0f, 134.0f),
                    PathNode.CurveTo(138.0f, 139.52284f, 133.52284f, 144.0f, 128.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 209.74f),
                    PathNode.LineTo(140.0f, 165.81f),
                    PathNode.CurveTo(155.36824f, 160.01285f, 164.39488f, 144.05798f, 161.44852f, 127.89913f),
                    PathNode.CurveTo(158.50215f, 111.740265f, 144.42528f, 99.998055f, 128.0f, 99.998055f),
                    PathNode.CurveTo(111.57472f, 99.998055f, 97.497856f, 111.740265f, 94.55148f, 127.89913f),
                    PathNode.CurveTo(91.60512f, 144.05798f, 100.63176f, 160.01285f, 116.0f, 165.81f),
                    PathNode.LineTo(116.0f, 209.73f),
                    PathNode.LineTo(52.83f, 130.59f),
                    PathNode.LineTo(79.0f, 84.0f),
                    PathNode.LineTo(177.0f, 84.0f),
                    PathNode.LineTo(203.19f, 130.59f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
