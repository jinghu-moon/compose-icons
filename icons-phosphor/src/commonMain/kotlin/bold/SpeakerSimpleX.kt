package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerSimpleX: ImageVector
    get() {
        if (_speakerSimpleX != null) return _speakerSimpleX!!
        _speakerSimpleX = phosphorBoldIcon(
            name = "SpeakerSimpleX",
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
                    PathNode.MoveTo(256.49f, 143.52f),
                    PathNode.CurveTo(261.18442f, 148.21442f, 261.18442f, 155.82558f, 256.49f, 160.52f),
                    PathNode.CurveTo(251.79558f, 165.21442f, 244.18442f, 165.21442f, 239.49f, 160.52f),
                    PathNode.LineTo(224.0f, 145.0f),
                    PathNode.LineTo(208.49f, 160.52f),
                    PathNode.CurveTo(203.79558f, 165.21442f, 196.18442f, 165.21442f, 191.49f, 160.52f),
                    PathNode.CurveTo(186.79558f, 155.82558f, 186.79558f, 148.21442f, 191.49f, 143.52f),
                    PathNode.LineTo(207.0f, 128.0f),
                    PathNode.LineTo(191.48f, 112.49f),
                    PathNode.CurveTo(186.78558f, 107.79558f, 186.78558f, 100.18442f, 191.48f, 95.49f),
                    PathNode.CurveTo(196.17442f, 90.79558f, 203.78558f, 90.79558f, 208.48f, 95.49f),
                    PathNode.LineTo(224.0f, 111.0f),
                    PathNode.LineTo(239.51f, 95.49f),
                    PathNode.CurveTo(244.20442f, 90.79558f, 251.81558f, 90.79558f, 256.51f, 95.49f),
                    PathNode.CurveTo(261.2044f, 100.18442f, 261.2044f, 107.79558f, 256.51f, 112.49f),
                    PathNode.LineTo(241.0f, 128.0f),
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
        return _speakerSimpleX!!
    }

private var _speakerSimpleX: ImageVector? = null
