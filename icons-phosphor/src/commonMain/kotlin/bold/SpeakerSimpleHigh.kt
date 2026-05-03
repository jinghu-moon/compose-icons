package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerSimpleHigh: ImageVector
    get() {
        if (_speakerSimpleHigh != null) return _speakerSimpleHigh!!
        _speakerSimpleHigh = phosphorBoldIcon(
            name = "SpeakerSimpleHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(165.27f, 21.22f),
                    PathNode.CurveTo(161.15225f, 19.206844f, 156.24738f, 19.715181f, 152.63f, 22.53f),
                    PathNode.LineTo(83.88f, 76.0f),
                    PathNode.LineTo(40.0f, 76.0f),
                    PathNode.CurveTo(28.954306f, 76.0f, 20.0f, 84.95431f, 20.0f, 96.0f),
                    PathNode.LineTo(20.0f, 160.0f),
                    PathNode.CurveTo(20.0f, 171.0457f, 28.954306f, 180.0f, 40.0f, 180.0f),
                    PathNode.LineTo(83.88f, 180.0f),
                    PathNode.LineTo(152.63f, 233.47f),
                    PathNode.CurveTo(156.24742f, 236.28522f, 161.15262f, 236.79373f, 165.27061f, 234.78044f),
                    PathNode.CurveTo(169.38863f, 232.76715f, 171.99995f, 228.5838f, 172.0f, 224.0f),
                    PathNode.LineTo(172.0f, 32.0f),
                    PathNode.CurveTo(171.99966f, 27.416218f, 169.38809f, 23.233044f, 165.27f, 21.22f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 199.47f),
                    PathNode.LineTo(95.37f, 158.53f),
                    PathNode.CurveTo(93.26316f, 156.89032f, 90.6697f, 156.00003f, 88.0f, 156.0f),
                    PathNode.LineTo(44.0f, 156.0f),
                    PathNode.LineTo(44.0f, 100.0f),
                    PathNode.LineTo(88.0f, 100.0f),
                    PathNode.CurveTo(90.6697f, 99.99997f, 93.26316f, 99.10967f, 95.37f, 97.47f),
                    PathNode.LineTo(148.0f, 56.54f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 104.0f),
                    PathNode.LineTo(212.0f, 152.0f),
                    PathNode.CurveTo(212.0f, 158.62741f, 206.62741f, 164.0f, 200.0f, 164.0f),
                    PathNode.CurveTo(193.37259f, 164.0f, 188.0f, 158.62741f, 188.0f, 152.0f),
                    PathNode.LineTo(188.0f, 104.0f),
                    PathNode.CurveTo(188.0f, 97.37258f, 193.37259f, 92.0f, 200.0f, 92.0f),
                    PathNode.CurveTo(206.62741f, 92.0f, 212.0f, 97.37258f, 212.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 88.0f),
                    PathNode.LineTo(248.0f, 168.0f),
                    PathNode.CurveTo(248.0f, 174.62741f, 242.62741f, 180.0f, 236.0f, 180.0f),
                    PathNode.CurveTo(229.37259f, 180.0f, 224.0f, 174.62741f, 224.0f, 168.0f),
                    PathNode.LineTo(224.0f, 88.0f),
                    PathNode.CurveTo(224.0f, 81.37258f, 229.37259f, 76.0f, 236.0f, 76.0f),
                    PathNode.CurveTo(242.62741f, 76.0f, 248.0f, 81.37258f, 248.0f, 88.0f),
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
        return _speakerSimpleHigh!!
    }

private var _speakerSimpleHigh: ImageVector? = null
