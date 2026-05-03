package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) return _envelopeOpen!!
        _envelopeOpen = phosphorBoldIcon(
            name = "EnvelopeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.66f, 86.0f),
                    PathNode.LineTo(134.66f, 22.0f),
                    PathNode.CurveTo(130.62756f, 19.309605f, 125.37245f, 19.309605f, 121.34f, 22.0f),
                    PathNode.LineTo(25.34f, 86.0f),
                    PathNode.CurveTo(21.998442f, 88.22944f, 19.994045f, 91.982994f, 20.0f, 96.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(227.0457f, 220.0f, 236.0f, 211.0457f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 96.0f),
                    PathNode.CurveTo(236.00595f, 91.982994f, 234.00156f, 88.22944f, 230.66f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(89.81f, 152.0f),
                    PathNode.LineTo(44.0f, 184.31f),
                    PathNode.LineTo(44.0f, 119.31f),
                    PathNode.Close,
                    PathNode.MoveTo(114.36f, 164.0f),
                    PathNode.LineTo(141.64f, 164.0f),
                    PathNode.LineTo(187.0f, 196.0f),
                    PathNode.LineTo(69.05f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.19f, 152.0f),
                    PathNode.LineTo(212.0f, 119.29f),
                    PathNode.LineTo(212.0f, 184.29f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 46.42f),
                    PathNode.LineTo(202.86f, 96.33f),
                    PathNode.LineTo(141.61f, 140.0f),
                    PathNode.LineTo(114.39f, 140.0f),
                    PathNode.LineTo(53.14f, 96.33f),
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
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
