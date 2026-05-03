package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Hockey: ImageVector
    get() {
        if (_hockey != null) return _hockey!!
        _hockey = phosphorRegularIcon(
            name = "Hockey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 152.0f),
                    PathNode.LineTo(130.9f, 152.0f),
                    PathNode.LineTo(38.1f, 42.82f),
                    PathNode.CurveTo(35.239166f, 39.45106f, 30.188936f, 39.039165f, 26.82f, 41.9f),
                    PathNode.CurveTo(23.451063f, 44.760834f, 23.039165f, 49.81106f, 25.9f, 53.18f),
                    PathNode.LineTo(159.51f, 210.36f),
                    PathNode.CurveTo(162.54932f, 213.93707f, 167.00607f, 215.9991f, 171.7f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(232.83656f, 216.0f, 240.0f, 208.83656f, 240.0f, 200.0f),
                    PathNode.LineTo(240.0f, 168.0f),
                    PathNode.CurveTo(240.0f, 159.16344f, 232.83656f, 152.0f, 224.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.5f, 168.0f),
                    PathNode.LineTo(192.0f, 168.0f),
                    PathNode.LineTo(192.0f, 200.0f),
                    PathNode.LineTo(171.7f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.18f, 179.55f),
                    PathNode.CurveTo(108.815674f, 176.69199f, 103.77219f, 177.09923f, 100.91f, 180.46f),
                    PathNode.LineTo(84.3f, 200.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.LineTo(64.0f, 168.0f),
                    PathNode.LineTo(85.2f, 168.0f),
                    PathNode.CurveTo(89.61828f, 168.0f, 93.2f, 164.41827f, 93.2f, 160.0f),
                    PathNode.CurveTo(93.2f, 155.58173f, 89.61828f, 152.0f, 85.2f, 152.0f),
                    PathNode.LineTo(32.0f, 152.0f),
                    PathNode.CurveTo(23.163445f, 152.0f, 16.0f, 159.16344f, 16.0f, 168.0f),
                    PathNode.LineTo(16.0f, 200.0f),
                    PathNode.CurveTo(16.0f, 208.83656f, 23.163445f, 216.0f, 32.0f, 216.0f),
                    PathNode.LineTo(84.3f, 216.0f),
                    PathNode.CurveTo(88.99392f, 215.9991f, 93.45068f, 213.93707f, 96.49f, 210.36f),
                    PathNode.LineTo(113.1f, 190.83f),
                    PathNode.CurveTo(114.474495f, 189.21246f, 115.14981f, 187.11499f, 114.97726f, 184.99937f),
                    PathNode.CurveTo(114.80471f, 182.88374f, 113.79844f, 180.92343f, 112.18f, 179.55f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 168.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(149.9f, 122.82f),
                    PathNode.LineTo(217.9f, 42.82f),
                    PathNode.CurveTo(220.76083f, 39.45106f, 225.81107f, 39.039165f, 229.18f, 41.9f),
                    PathNode.CurveTo(232.54893f, 44.760834f, 232.96083f, 49.81106f, 230.1f, 53.18f),
                    PathNode.LineTo(162.1f, 133.18f),
                    PathNode.CurveTo(159.23917f, 136.54893f, 154.18893f, 136.96083f, 150.82f, 134.1f),
                    PathNode.CurveTo(147.45107f, 131.23917f, 147.03917f, 126.188934f, 149.9f, 122.82f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hockey!!
    }

private var _hockey: ImageVector? = null
