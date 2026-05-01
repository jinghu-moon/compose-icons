package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorBoldIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 137.0f),
                    PathNode.CurveTo(231.08733f, 194.10583f, 182.46854f, 237.4572f, 125.17523f, 235.81786f),
                    PathNode.CurveTo(67.88193f, 234.17851f, 21.821493f, 188.11807f, 20.18215f, 130.82477f),
                    PathNode.CurveTo(18.542805f, 73.531456f, 61.89417f, 24.912666f, 119.0f, 20.0f),
                    PathNode.CurveTo(125.62742f, 19.447716f, 131.44771f, 24.372583f, 132.0f, 31.0f),
                    PathNode.CurveTo(132.55229f, 37.62742f, 127.62742f, 43.447716f, 121.0f, 44.0f),
                    PathNode.CurveTo(76.56761f, 47.810463f, 42.830303f, 85.63348f, 44.101837f, 130.21085f),
                    PathNode.CurveTo(45.37337f, 174.7882f, 81.2118f, 210.62663f, 125.789154f, 211.89816f),
                    PathNode.CurveTo(170.36652f, 213.1697f, 208.18954f, 179.43239f, 212.0f, 135.0f),
                    PathNode.CurveTo(212.55229f, 128.37259f, 218.37259f, 123.447716f, 225.0f, 124.0f),
                    PathNode.CurveTo(231.62741f, 124.552284f, 236.55229f, 130.37259f, 236.0f, 137.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 76.0f),
                    PathNode.LineTo(116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 134.62741f, 121.37258f, 140.0f, 128.0f, 140.0f),
                    PathNode.LineTo(180.0f, 140.0f),
                    PathNode.CurveTo(186.62741f, 140.0f, 192.0f, 134.62741f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 121.37258f, 186.62741f, 116.0f, 180.0f, 116.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(140.0f, 76.0f),
                    PathNode.CurveTo(140.0f, 69.37258f, 134.62741f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(121.37258f, 64.0f, 116.0f, 69.37258f, 116.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.CurveTo(216.83656f, 96.0f, 224.0f, 88.836555f, 224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 71.163445f, 216.83656f, 64.0f, 208.0f, 64.0f),
                    PathNode.CurveTo(199.16344f, 64.0f, 192.0f, 71.163445f, 192.0f, 80.0f),
                    PathNode.CurveTo(192.0f, 88.836555f, 199.16344f, 96.0f, 208.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 64.0f),
                    PathNode.CurveTo(184.83656f, 64.0f, 192.0f, 56.836555f, 192.0f, 48.0f),
                    PathNode.CurveTo(192.0f, 39.163445f, 184.83656f, 32.0f, 176.0f, 32.0f),
                    PathNode.CurveTo(167.16344f, 32.0f, 160.0f, 39.163445f, 160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 56.836555f, 167.16344f, 64.0f, 176.0f, 64.0f),
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
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
