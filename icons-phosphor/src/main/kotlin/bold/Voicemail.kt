package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = phosphorBoldIcon(
            name = "Voicemail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 68.0f),
                    PathNode.CurveTo(173.27368f, 68.0f, 152.4979f, 80.84014f, 142.33437f, 101.16718f),
                    PathNode.CurveTo(132.17085f, 121.494225f, 134.36421f, 145.81894f, 148.0f, 164.0f),
                    PathNode.LineTo(108.0f, 164.0f),
                    PathNode.CurveTo(124.69599f, 141.73868f, 123.89496f, 110.91911f, 106.0651f, 89.55515f),
                    PathNode.CurveTo(88.235245f, 68.19119f, 58.0561f, 61.88991f, 33.167183f, 74.334366f),
                    PathNode.CurveTo(8.278271f, 86.778824f, -4.788194f, 114.70291f, 1.605061f, 141.78517f),
                    PathNode.CurveTo(7.998315f, 168.86742f, 32.173347f, 188.0f, 60.0f, 188.0f),
                    PathNode.LineTo(196.0f, 188.0f),
                    PathNode.CurveTo(229.13708f, 188.0f, 256.0f, 161.13708f, 256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 94.862915f, 229.13708f, 68.0f, 196.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 108.11775f, 40.11775f, 92.0f, 60.0f, 92.0f),
                    PathNode.CurveTo(79.88225f, 92.0f, 96.0f, 108.11775f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 147.88223f, 79.88225f, 164.0f, 60.0f, 164.0f),
                    PathNode.CurveTo(40.11775f, 164.0f, 24.0f, 147.88223f, 24.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 164.0f),
                    PathNode.CurveTo(176.11777f, 164.0f, 160.0f, 147.88223f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 108.11775f, 176.11777f, 92.0f, 196.0f, 92.0f),
                    PathNode.CurveTo(215.88223f, 92.0f, 232.0f, 108.11775f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 147.88223f, 215.88223f, 164.0f, 196.0f, 164.0f),
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
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
