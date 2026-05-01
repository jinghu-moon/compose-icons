package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hockey: ImageVector
    get() {
        if (_hockey != null) return _hockey!!
        _hockey = phosphorFillIcon(
            name = "Hockey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(149.9f, 122.82f),
                    PathNode.LineTo(217.9f, 42.82f),
                    PathNode.CurveTo(220.76083f, 39.45106f, 225.81107f, 39.039165f, 229.18f, 41.9f),
                    PathNode.CurveTo(232.54893f, 44.760834f, 232.96083f, 49.81106f, 230.1f, 53.18f),
                    PathNode.LineTo(162.1f, 133.18f),
                    PathNode.CurveTo(159.23917f, 136.54893f, 154.18893f, 136.96083f, 150.82f, 134.1f),
                    PathNode.CurveTo(147.45107f, 131.23917f, 147.03917f, 126.188934f, 149.9f, 122.82f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 168.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(240.0f, 208.83656f, 232.83656f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(171.7f, 216.0f),
                    PathNode.CurveTo(167.00607f, 215.9991f, 162.54932f, 213.93707f, 159.51f, 210.36f),
                    PathNode.LineTo(25.9f, 53.18f),
                    PathNode.LineTo(25.9f, 53.18f),
                    PathNode.CurveTo(23.039165f, 49.81106f, 23.451063f, 44.760834f, 26.82f, 41.9f),
                    PathNode.CurveTo(30.188936f, 39.039165f, 35.239166f, 39.45106f, 38.1f, 42.82f),
                    PathNode.LineTo(130.9f, 152.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(232.83656f, 152.0f, 240.0f, 159.16344f, 240.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(115.3f, 183.06f),
                    PathNode.CurveTo(116.568985f, 184.55351f, 116.568985f, 186.74649f, 115.3f, 188.24f),
                    PathNode.LineTo(96.49f, 210.36f),
                    PathNode.CurveTo(93.45068f, 213.93707f, 88.99392f, 215.9991f, 84.3f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(23.163445f, 216.0f, 16.0f, 208.83656f, 16.0f, 200.0f),
                    PathNode.LineTo(16.0f, 168.0f),
                    PathNode.CurveTo(16.0f, 159.16344f, 23.163445f, 152.0f, 32.0f, 152.0f),
                    PathNode.LineTo(87.05f, 152.0f),
                    PathNode.CurveTo(88.206856f, 152.01404f, 89.300964f, 152.52826f, 90.05f, 153.41f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 168.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _hockey!!
    }

private var _hockey: ImageVector? = null
