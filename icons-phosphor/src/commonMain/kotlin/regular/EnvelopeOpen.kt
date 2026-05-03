package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) return _envelopeOpen!!
        _envelopeOpen = phosphorRegularIcon(
            name = "EnvelopeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.44f, 89.34f),
                    PathNode.LineTo(132.44f, 25.34f),
                    PathNode.CurveTo(129.75171f, 23.546404f, 126.2483f, 23.546404f, 123.56f, 25.34f),
                    PathNode.LineTo(27.56f, 89.34f),
                    PathNode.CurveTo(25.334263f, 90.82498f, 23.998262f, 93.32436f, 24.0f, 96.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 96.0f),
                    PathNode.CurveTo(232.00174f, 93.32436f, 230.66574f, 90.82498f, 228.44f, 89.34f),
                    PathNode.Close,
                    PathNode.MoveTo(96.72f, 152.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 111.53f),
                    PathNode.Close,
                    PathNode.MoveTo(113.09f, 160.0f),
                    PathNode.LineTo(142.91f, 160.0f),
                    PathNode.LineTo(199.54f, 200.0f),
                    PathNode.LineTo(56.46f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(159.28f, 152.0f),
                    PathNode.LineTo(216.0f, 111.53f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 41.61f),
                    PathNode.LineTo(209.91f, 96.22f),
                    PathNode.LineTo(142.91f, 144.0f),
                    PathNode.LineTo(113.11f, 144.0f),
                    PathNode.LineTo(46.11f, 96.22f),
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
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
