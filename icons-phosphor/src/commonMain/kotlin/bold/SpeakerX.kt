package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerX: ImageVector
    get() {
        if (_speakerX != null) return _speakerX!!
        _speakerX = phosphorBoldIcon(
            name = "SpeakerX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(157.27f, 21.22f),
                    PathNode.CurveTo(153.15225f, 19.206844f, 148.24738f, 19.715181f, 144.63f, 22.53f),
                    PathNode.LineTo(75.88f, 76.0f),
                    PathNode.LineTo(32.0f, 76.0f),
                    PathNode.CurveTo(20.954306f, 76.0f, 12.0f, 84.95431f, 12.0f, 96.0f),
                    PathNode.LineTo(12.0f, 160.0f),
                    PathNode.CurveTo(12.0f, 171.0457f, 20.954306f, 180.0f, 32.0f, 180.0f),
                    PathNode.LineTo(75.88f, 180.0f),
                    PathNode.LineTo(144.63f, 233.47f),
                    PathNode.CurveTo(148.24742f, 236.28522f, 153.15262f, 236.79373f, 157.27061f, 234.78044f),
                    PathNode.CurveTo(161.38863f, 232.76715f, 163.99995f, 228.5838f, 164.0f, 224.0f),
                    PathNode.LineTo(164.0f, 32.0f),
                    PathNode.CurveTo(163.99966f, 27.416218f, 161.38809f, 23.233044f, 157.27f, 21.22f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 100.0f),
                    PathNode.LineTo(68.0f, 100.0f),
                    PathNode.LineTo(68.0f, 156.0f),
                    PathNode.LineTo(36.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 199.47f),
                    PathNode.LineTo(92.0f, 162.12f),
                    PathNode.LineTo(92.0f, 93.88f),
                    PathNode.LineTo(140.0f, 56.54f),
                    PathNode.Close,
                    PathNode.MoveTo(248.49f, 143.52f),
                    PathNode.CurveTo(253.18442f, 148.21442f, 253.18442f, 155.82558f, 248.49f, 160.52f),
                    PathNode.CurveTo(243.79558f, 165.21442f, 236.18442f, 165.21442f, 231.49f, 160.52f),
                    PathNode.LineTo(216.0f, 145.0f),
                    PathNode.LineTo(200.49f, 160.52f),
                    PathNode.CurveTo(195.79558f, 165.21442f, 188.18442f, 165.21442f, 183.49f, 160.52f),
                    PathNode.CurveTo(178.79558f, 155.82558f, 178.79558f, 148.21442f, 183.49f, 143.52f),
                    PathNode.LineTo(199.0f, 128.0f),
                    PathNode.LineTo(183.48f, 112.49f),
                    PathNode.CurveTo(178.78558f, 107.79558f, 178.78558f, 100.18442f, 183.48f, 95.49f),
                    PathNode.CurveTo(188.17442f, 90.79558f, 195.78558f, 90.79558f, 200.48f, 95.49f),
                    PathNode.LineTo(216.0f, 111.0f),
                    PathNode.LineTo(231.51f, 95.49f),
                    PathNode.CurveTo(236.20442f, 90.79558f, 243.81558f, 90.79558f, 248.51f, 95.49f),
                    PathNode.CurveTo(253.20442f, 100.18442f, 253.20442f, 107.79558f, 248.51f, 112.49f),
                    PathNode.LineTo(233.0f, 128.0f),
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
        return _speakerX!!
    }

private var _speakerX: ImageVector? = null
