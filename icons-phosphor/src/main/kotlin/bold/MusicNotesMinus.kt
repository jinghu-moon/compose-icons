package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MusicNotesMinus: ImageVector
    get() {
        if (_musicNotesMinus != null) return _musicNotesMinus!!
        _musicNotesMinus = phosphorBoldIcon(
            name = "MusicNotesMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 48.0f),
                    PathNode.CurveTo(236.0f, 54.62742f, 230.62741f, 60.0f, 224.0f, 60.0f),
                    PathNode.LineTo(176.0f, 60.0f),
                    PathNode.CurveTo(169.37259f, 60.0f, 164.0f, 54.62742f, 164.0f, 48.0f),
                    PathNode.CurveTo(164.0f, 41.37258f, 169.37259f, 36.0f, 176.0f, 36.0f),
                    PathNode.LineTo(224.0f, 36.0f),
                    PathNode.CurveTo(230.62741f, 36.0f, 236.0f, 41.37258f, 236.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 88.0f),
                    PathNode.LineTo(220.0f, 164.0f),
                    PathNode.CurveTo(220.00468f, 181.68953f, 208.3896f, 197.28146f, 191.43881f, 202.34015f),
                    PathNode.CurveTo(174.48802f, 207.39882f, 156.22742f, 200.7228f, 146.5365f, 185.92395f),
                    PathNode.CurveTo(136.84558f, 171.1251f, 138.02599f, 151.71826f, 149.43907f, 138.20305f),
                    PathNode.CurveTo(160.85216f, 124.68784f, 179.78728f, 120.274185f, 196.0f, 127.35f),
                    PathNode.LineTo(196.0f, 88.0f),
                    PathNode.CurveTo(196.0f, 81.37258f, 201.37259f, 76.0f, 208.0f, 76.0f),
                    PathNode.CurveTo(214.62741f, 76.0f, 220.0f, 81.37258f, 220.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 164.0f),
                    PathNode.CurveTo(196.0f, 155.16344f, 188.83656f, 148.0f, 180.0f, 148.0f),
                    PathNode.CurveTo(171.16344f, 148.0f, 164.0f, 155.16344f, 164.0f, 164.0f),
                    PathNode.CurveTo(164.0f, 172.83656f, 171.16344f, 180.0f, 180.0f, 180.0f),
                    PathNode.CurveTo(188.83656f, 180.0f, 196.0f, 172.83656f, 196.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 113.37f),
                    PathNode.LineTo(92.0f, 196.0f),
                    PathNode.CurveTo(92.0047f, 213.68953f, 80.3896f, 229.28146f, 63.43881f, 234.34015f),
                    PathNode.CurveTo(46.48802f, 239.39882f, 28.227425f, 232.7228f, 18.536505f, 217.92395f),
                    PathNode.CurveTo(8.845587f, 203.1251f, 10.025987f, 183.71826f, 21.439075f, 170.20305f),
                    PathNode.CurveTo(32.852165f, 156.68784f, 51.787273f, 152.27419f, 68.0f, 159.35f),
                    PathNode.LineTo(68.0f, 56.0f),
                    PathNode.CurveTo(68.00083f, 50.494102f, 71.74844f, 45.69518f, 77.09f, 44.36f),
                    PathNode.LineTo(133.09f, 30.36f),
                    PathNode.CurveTo(139.46803f, 28.881159f, 145.85426f, 32.787704f, 147.44218f, 39.139454f),
                    PathNode.CurveTo(149.03012f, 45.491207f, 145.2336f, 51.94343f, 138.91f, 53.64f),
                    PathNode.LineTo(92.0f, 65.37f),
                    PathNode.LineTo(92.0f, 88.63f),
                    PathNode.LineTo(157.09f, 72.36f),
                    PathNode.CurveTo(163.46803f, 70.88116f, 169.85426f, 74.787704f, 171.44218f, 81.13946f),
                    PathNode.CurveTo(173.03012f, 87.4912f, 169.2336f, 93.943436f, 162.91f, 95.64f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 196.0f),
                    PathNode.CurveTo(68.0f, 187.16344f, 60.836555f, 180.0f, 52.0f, 180.0f),
                    PathNode.CurveTo(43.163445f, 180.0f, 36.0f, 187.16344f, 36.0f, 196.0f),
                    PathNode.CurveTo(36.0f, 204.83656f, 43.163445f, 212.0f, 52.0f, 212.0f),
                    PathNode.CurveTo(60.836555f, 212.0f, 68.0f, 204.83656f, 68.0f, 196.0f),
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
        return _musicNotesMinus!!
    }

private var _musicNotesMinus: ImageVector? = null
