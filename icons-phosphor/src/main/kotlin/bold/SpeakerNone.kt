package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerNone: ImageVector
    get() {
        if (_speakerNone != null) return _speakerNone!!
        _speakerNone = phosphorBoldIcon(
            name = "SpeakerNone",
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
                    PathNode.MoveTo(140.0f, 199.46f),
                    PathNode.LineTo(92.0f, 162.12f),
                    PathNode.LineTo(92.0f, 93.88f),
                    PathNode.LineTo(140.0f, 56.54f),
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
        return _speakerNone!!
    }

private var _speakerNone: ImageVector? = null
