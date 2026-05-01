package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorThinIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(152.28911f, 171.97244f, 171.97244f, 152.28911f, 172.0f, 128.0f),
                    PathNode.LineTo(172.0f, 64.0f),
                    PathNode.CurveTo(172.0f, 39.69947f, 152.30052f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(103.69947f, 20.0f, 84.0f, 39.69947f, 84.0f, 64.0f),
                    PathNode.LineTo(84.0f, 128.0f),
                    PathNode.CurveTo(84.02756f, 152.28911f, 103.71089f, 171.97244f, 128.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 64.0f),
                    PathNode.CurveTo(92.0f, 44.11775f, 108.11775f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(147.88223f, 28.0f, 164.0f, 44.11775f, 164.0f, 64.0f),
                    PathNode.LineTo(164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 147.88223f, 147.88223f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(108.11775f, 164.0f, 92.0f, 147.88223f, 92.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 203.89f),
                    PathNode.LineTo(132.0f, 240.0f),
                    PathNode.CurveTo(132.0f, 242.20914f, 130.20914f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(125.79086f, 244.0f, 124.0f, 242.20914f, 124.0f, 240.0f),
                    PathNode.LineTo(124.0f, 203.89f),
                    PathNode.CurveTo(83.65906f, 201.71848f, 52.047787f, 168.39932f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 125.79086f, 53.79086f, 124.0f, 56.0f, 124.0f),
                    PathNode.CurveTo(58.20914f, 124.0f, 60.0f, 125.79086f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 165.55536f, 90.44463f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(165.55536f, 196.0f, 196.0f, 165.55536f, 196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 125.79086f, 197.79086f, 124.0f, 200.0f, 124.0f),
                    PathNode.CurveTo(202.20914f, 124.0f, 204.0f, 125.79086f, 204.0f, 128.0f),
                    PathNode.CurveTo(203.95221f, 168.39932f, 172.34094f, 201.71848f, 132.0f, 203.89f),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
