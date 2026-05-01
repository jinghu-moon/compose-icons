package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorBoldIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 224.0f),
                    PathNode.CurveTo(228.0f, 230.62741f, 222.62741f, 236.0f, 216.0f, 236.0f),
                    PathNode.LineTo(40.0f, 236.0f),
                    PathNode.CurveTo(33.37258f, 236.0f, 28.0f, 230.62741f, 28.0f, 224.0f),
                    PathNode.CurveTo(28.0f, 217.37259f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 217.37259f, 228.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 144.0f),
                    PathNode.LineTo(228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 187.0457f, 219.0457f, 196.0f, 208.0f, 196.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.CurveTo(36.954304f, 196.0f, 28.0f, 187.0457f, 28.0f, 176.0f),
                    PathNode.LineTo(28.0f, 144.0f),
                    PathNode.CurveTo(28.0f, 132.9543f, 36.954304f, 124.0f, 48.0f, 124.0f),
                    PathNode.LineTo(96.0f, 124.0f),
                    PathNode.LineTo(83.55f, 54.33f),
                    PathNode.CurveTo(81.6761f, 43.83882f, 84.54686f, 33.056553f, 91.38935f, 24.88609f),
                    PathNode.CurveTo(98.23185f, 16.715624f, 108.34278f, 11.996778f, 119.0f, 12.0f),
                    PathNode.LineTo(137.0f, 12.0f),
                    PathNode.CurveTo(147.65547f, 11.999739f, 157.76361f, 16.719849f, 164.60387f, 24.889923f),
                    PathNode.CurveTo(171.4441f, 33.059998f, 174.31358f, 43.84054f, 172.44f, 54.33f),
                    PathNode.LineTo(160.0f, 124.0f),
                    PathNode.LineTo(208.0f, 124.0f),
                    PathNode.CurveTo(219.0457f, 124.0f, 228.0f, 132.9543f, 228.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(107.17f, 50.11f),
                    PathNode.LineTo(120.37f, 124.0f),
                    PathNode.LineTo(135.63f, 124.0f),
                    PathNode.LineTo(148.83f, 50.11f),
                    PathNode.CurveTo(149.45505f, 46.61064f, 148.49644f, 43.014256f, 146.2126f, 40.290245f),
                    PathNode.CurveTo(143.92876f, 37.566235f, 140.55473f, 35.994976f, 137.0f, 36.0f),
                    PathNode.LineTo(119.0f, 36.0f),
                    PathNode.CurveTo(115.447014f, 35.99794f, 112.075775f, 37.570465f, 109.79419f, 40.294083f),
                    PathNode.CurveTo(107.5126f, 43.017704f, 106.55527f, 46.612366f, 107.18f, 50.11f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 148.0f),
                    PathNode.LineTo(52.0f, 148.0f),
                    PathNode.LineTo(52.0f, 172.0f),
                    PathNode.LineTo(204.0f, 172.0f),
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
        return _stamp!!
    }

private var _stamp: ImageVector? = null
