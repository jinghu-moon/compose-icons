package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) return _envelopeOpen!!
        _envelopeOpen = phosphorThinIcon(
            name = "EnvelopeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.22f, 92.67f),
                    PathNode.LineTo(130.22f, 28.67f),
                    PathNode.CurveTo(128.87585f, 27.7732f, 127.124146f, 27.7732f, 125.78f, 28.67f),
                    PathNode.LineTo(29.78f, 92.67f),
                    PathNode.CurveTo(28.667131f, 93.41249f, 27.99913f, 94.66218f, 28.0f, 96.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 96.0f),
                    PathNode.CurveTo(228.00087f, 94.66218f, 227.33287f, 93.41249f, 226.22f, 92.67f),
                    PathNode.Close,
                    PathNode.MoveTo(103.63f, 152.0f),
                    PathNode.LineTo(36.0f, 199.76f),
                    PathNode.LineTo(36.0f, 103.76f),
                    PathNode.Close,
                    PathNode.MoveTo(111.82f, 156.0f),
                    PathNode.LineTo(144.18f, 156.0f),
                    PathNode.LineTo(212.18f, 204.0f),
                    PathNode.LineTo(43.86f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.37f, 152.0f),
                    PathNode.LineTo(220.0f, 103.76f),
                    PathNode.LineTo(220.0f, 199.76f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.81f),
                    PathNode.LineTo(217.0f, 96.11f),
                    PathNode.LineTo(144.17f, 148.0f),
                    PathNode.LineTo(111.83f, 148.0f),
                    PathNode.LineTo(39.05f, 96.11f),
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
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
