package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EnvelopeSimpleOpen: ImageVector
    get() {
        if (_envelopeSimpleOpen != null) return _envelopeSimpleOpen!!
        _envelopeSimpleOpen = phosphorBoldIcon(
            name = "EnvelopeSimpleOpen",
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
                    PathNode.MoveTo(128.0f, 46.42f),
                    PathNode.LineTo(202.86f, 96.33f),
                    PathNode.LineTo(141.61f, 140.0f),
                    PathNode.LineTo(114.39f, 140.0f),
                    PathNode.LineTo(53.14f, 96.33f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 119.29f),
                    PathNode.LineTo(103.58f, 161.77f),
                    PathNode.CurveTo(105.62282f, 163.22687f, 108.07091f, 164.00674f, 110.58f, 164.0f),
                    PathNode.LineTo(145.48f, 164.0f),
                    PathNode.CurveTo(147.98909f, 164.00674f, 150.43718f, 163.22687f, 152.48f, 161.77f),
                    PathNode.LineTo(212.0f, 119.29f),
                    PathNode.LineTo(212.0f, 196.0f),
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
        return _envelopeSimpleOpen!!
    }

private var _envelopeSimpleOpen: ImageVector? = null
