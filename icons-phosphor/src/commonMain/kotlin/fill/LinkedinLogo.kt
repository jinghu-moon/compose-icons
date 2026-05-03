package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = phosphorFillIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 24.0f),
                    PathNode.LineTo(40.0f, 24.0f),
                    PathNode.CurveTo(31.163445f, 24.0f, 24.0f, 31.163445f, 24.0f, 40.0f),
                    PathNode.LineTo(24.0f, 216.0f),
                    PathNode.CurveTo(24.0f, 224.83656f, 31.163445f, 232.0f, 40.0f, 232.0f),
                    PathNode.LineTo(216.0f, 232.0f),
                    PathNode.CurveTo(224.83656f, 232.0f, 232.0f, 224.83656f, 232.0f, 216.0f),
                    PathNode.LineTo(232.0f, 40.0f),
                    PathNode.CurveTo(232.0f, 31.163445f, 224.83656f, 24.0f, 216.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 176.0f),
                    PathNode.CurveTo(96.0f, 180.41827f, 92.41828f, 184.0f, 88.0f, 184.0f),
                    PathNode.CurveTo(83.58172f, 184.0f, 80.0f, 180.41827f, 80.0f, 176.0f),
                    PathNode.LineTo(80.0f, 112.0f),
                    PathNode.CurveTo(80.0f, 107.58172f, 83.58172f, 104.0f, 88.0f, 104.0f),
                    PathNode.CurveTo(92.41828f, 104.0f, 96.0f, 107.58172f, 96.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 96.0f),
                    PathNode.CurveTo(81.37258f, 96.0f, 76.0f, 90.62742f, 76.0f, 84.0f),
                    PathNode.CurveTo(76.0f, 77.37258f, 81.37258f, 72.0f, 88.0f, 72.0f),
                    PathNode.CurveTo(94.62742f, 72.0f, 100.0f, 77.37258f, 100.0f, 84.0f),
                    PathNode.CurveTo(100.0f, 90.62742f, 94.62742f, 96.0f, 88.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 176.0f),
                    PathNode.CurveTo(184.0f, 180.41827f, 180.41827f, 184.0f, 176.0f, 184.0f),
                    PathNode.CurveTo(171.58173f, 184.0f, 168.0f, 180.41827f, 168.0f, 176.0f),
                    PathNode.LineTo(168.0f, 140.0f),
                    PathNode.CurveTo(168.0f, 128.9543f, 159.0457f, 120.0f, 148.0f, 120.0f),
                    PathNode.CurveTo(136.9543f, 120.0f, 128.0f, 128.9543f, 128.0f, 140.0f),
                    PathNode.LineTo(128.0f, 176.0f),
                    PathNode.CurveTo(128.0f, 180.41827f, 124.41828f, 184.0f, 120.0f, 184.0f),
                    PathNode.CurveTo(115.58172f, 184.0f, 112.0f, 180.41827f, 112.0f, 176.0f),
                    PathNode.LineTo(112.0f, 112.0f),
                    PathNode.CurveTo(112.020546f, 107.94401f, 115.07323f, 104.545235f, 119.10374f, 104.09087f),
                    PathNode.CurveTo(123.13425f, 103.63652f, 126.86699f, 106.27038f, 127.79f, 110.22f),
                    PathNode.CurveTo(138.81844f, 102.73861f, 153.07759f, 101.9617f, 164.85358f, 108.20061f),
                    PathNode.CurveTo(176.62956f, 114.43951f, 183.9956f, 126.67342f, 184.0f, 140.0f),
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
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
