package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SmileyWink: ImageVector
    get() {
        if (_smileyWink != null) return _smileyWink!!
        _smileyWink = phosphorRegularIcon(
            name = "SmileyWink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 108.0f),
                    PathNode.CurveTo(80.0f, 101.37258f, 85.37258f, 96.0f, 92.0f, 96.0f),
                    PathNode.CurveTo(98.62742f, 96.0f, 104.0f, 101.37258f, 104.0f, 108.0f),
                    PathNode.CurveTo(104.0f, 114.62742f, 98.62742f, 120.0f, 92.0f, 120.0f),
                    PathNode.CurveTo(85.37258f, 120.0f, 80.0f, 114.62742f, 80.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 108.0f),
                    PathNode.CurveTo(184.0f, 112.41828f, 180.41827f, 116.0f, 176.0f, 116.0f),
                    PathNode.LineTo(152.0f, 116.0f),
                    PathNode.CurveTo(147.58173f, 116.0f, 144.0f, 112.41828f, 144.0f, 108.0f),
                    PathNode.CurveTo(144.0f, 103.58172f, 147.58173f, 100.0f, 152.0f, 100.0f),
                    PathNode.LineTo(176.0f, 100.0f),
                    PathNode.CurveTo(180.41827f, 100.0f, 184.0f, 103.58172f, 184.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.92f, 156.0f),
                    PathNode.CurveTo(164.63f, 173.79f, 147.53f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(108.47f, 184.0f, 91.37f, 173.8f, 81.07f, 156.0f),
                    PathNode.CurveTo(78.86086f, 152.17267f, 80.17267f, 147.27916f, 84.0f, 145.07f),
                    PathNode.CurveTo(87.82733f, 142.86086f, 92.72086f, 144.17267f, 94.93f, 148.0f),
                    PathNode.CurveTo(102.39f, 160.91f, 114.13f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(141.87f, 168.0f, 153.61f, 160.9f, 161.08f, 148.0f),
                    PathNode.CurveTo(162.44211f, 145.39618f, 165.12209f, 143.7487f, 168.0604f, 143.70892f),
                    PathNode.CurveTo(170.9987f, 143.66916f, 173.7223f, 145.24348f, 175.15439f, 147.8095f),
                    PathNode.CurveTo(176.58647f, 150.3755f, 176.49648f, 153.52008f, 174.92f, 156.0f),
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
        return _smileyWink!!
    }

private var _smileyWink: ImageVector? = null
