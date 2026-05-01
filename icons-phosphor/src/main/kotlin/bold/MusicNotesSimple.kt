package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MusicNotesSimple: ImageVector
    get() {
        if (_musicNotesSimple != null) return _musicNotesSimple!!
        _musicNotesSimple = phosphorBoldIcon(
            name = "MusicNotesSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.38f, 14.54f),
                    PathNode.CurveTo(212.46815f, 12.26871f, 208.67271f, 11.464622f, 205.09f, 12.36f),
                    PathNode.LineTo(77.09f, 44.36f),
                    PathNode.CurveTo(71.74844f, 45.69518f, 68.00083f, 50.494102f, 68.0f, 56.0f),
                    PathNode.LineTo(68.0f, 159.35f),
                    PathNode.CurveTo(51.787273f, 152.27419f, 32.852165f, 156.68784f, 21.439075f, 170.20305f),
                    PathNode.CurveTo(10.025987f, 183.71826f, 8.845587f, 203.1251f, 18.536505f, 217.92395f),
                    PathNode.CurveTo(28.227425f, 232.7228f, 46.48802f, 239.39882f, 63.43881f, 234.34015f),
                    PathNode.CurveTo(80.3896f, 229.28146f, 92.0047f, 213.68953f, 92.0f, 196.0f),
                    PathNode.LineTo(92.0f, 65.37f),
                    PathNode.LineTo(196.0f, 39.37f),
                    PathNode.LineTo(196.0f, 127.37f),
                    PathNode.CurveTo(179.78558f, 120.29345f, 160.84845f, 124.70883f, 149.43585f, 138.22688f),
                    PathNode.CurveTo(138.02327f, 151.74493f, 136.84636f, 171.15436f, 146.542f, 185.95232f),
                    PathNode.CurveTo(156.23764f, 200.75029f, 174.50253f, 207.42142f, 191.4532f, 202.35585f),
                    PathNode.CurveTo(208.40387f, 197.29028f, 220.01353f, 181.69138f, 220.0f, 164.0f),
                    PathNode.LineTo(220.0f, 24.0f),
                    PathNode.CurveTo(219.99928f, 20.30339f, 218.29488f, 16.813416f, 215.38f, 14.54f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 212.0f),
                    PathNode.CurveTo(43.163445f, 212.0f, 36.0f, 204.83656f, 36.0f, 196.0f),
                    PathNode.CurveTo(36.0f, 187.16344f, 43.163445f, 180.0f, 52.0f, 180.0f),
                    PathNode.CurveTo(60.836555f, 180.0f, 68.0f, 187.16344f, 68.0f, 196.0f),
                    PathNode.CurveTo(68.0f, 204.83656f, 60.836555f, 212.0f, 52.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 180.0f),
                    PathNode.CurveTo(171.16344f, 180.0f, 164.0f, 172.83656f, 164.0f, 164.0f),
                    PathNode.CurveTo(164.0f, 155.16344f, 171.16344f, 148.0f, 180.0f, 148.0f),
                    PathNode.CurveTo(188.83656f, 148.0f, 196.0f, 155.16344f, 196.0f, 164.0f),
                    PathNode.CurveTo(196.0f, 172.83656f, 188.83656f, 180.0f, 180.0f, 180.0f),
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
        return _musicNotesSimple!!
    }

private var _musicNotesSimple: ImageVector? = null
