package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) return _speakerHigh!!
        _speakerHigh = phosphorBoldIcon(
            name = "SpeakerHigh",
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
                    PathNode.LineTo(92.0f, 162.13f),
                    PathNode.LineTo(92.0f, 93.87f),
                    PathNode.LineTo(140.0f, 56.54f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.CurveTo(212.00165f, 138.7193f, 208.09015f, 149.07053f, 201.0f, 157.11f),
                    PathNode.CurveTo(196.61485f, 162.08057f, 189.03056f, 162.55515f, 184.06f, 158.17f),
                    PathNode.CurveTo(179.08942f, 153.78487f, 178.61485f, 146.20056f, 183.0f, 141.23f),
                    PathNode.CurveTo(189.65051f, 133.67508f, 189.65051f, 122.35491f, 183.0f, 114.8f),
                    PathNode.CurveTo(178.84547f, 109.80713f, 179.4177f, 102.41497f, 184.29112f, 98.12095f),
                    PathNode.CurveTo(189.16454f, 93.82693f, 196.56992f, 94.18993f, 201.0f, 98.94f),
                    PathNode.CurveTo(208.08357f, 106.96366f, 211.99498f, 117.29691f, 212.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 128.0f),
                    PathNode.CurveTo(252.01227f, 148.66435f, 244.39532f, 168.60583f, 230.61f, 184.0f),
                    PathNode.CurveTo(226.19173f, 188.94019f, 218.6052f, 189.36328f, 213.665f, 184.945f),
                    PathNode.CurveTo(208.7248f, 180.52672f, 208.30173f, 172.94019f, 212.72f, 168.0f),
                    PathNode.CurveTo(233.09152f, 145.22395f, 233.09152f, 110.776054f, 212.72f, 88.0f),
                    PathNode.CurveTo(209.74321f, 84.82381f, 208.71994f, 80.28461f, 210.04605f, 76.13843f),
                    PathNode.CurveTo(211.37215f, 71.992226f, 214.83963f, 68.889336f, 219.10709f, 68.030106f),
                    PathNode.CurveTo(223.37454f, 67.170876f, 227.77266f, 68.69008f, 230.6f, 72.0f),
                    PathNode.CurveTo(244.38895f, 87.392685f, 252.0095f, 107.334335f, 252.0f, 128.0f),
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
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
