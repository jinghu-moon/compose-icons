package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) return _speakerHigh!!
        _speakerHigh = phosphorFillIcon(
            name = "SpeakerHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 32.25f),
                    PathNode.LineTo(160.0f, 223.69f),
                    PathNode.CurveTo(160.04951f, 226.60428f, 158.56493f, 229.33044f, 156.09f, 230.87f),
                    PathNode.CurveTo(153.26054f, 232.55293f, 149.68901f, 232.3307f, 147.09f, 230.31f),
                    PathNode.LineTo(81.52f, 179.31f),
                    PathNode.CurveTo(80.5568f, 178.54887f, 79.996445f, 177.38762f, 80.0f, 176.16f),
                    PathNode.LineTo(80.0f, 79.84f),
                    PathNode.CurveTo(80.00367f, 78.607254f, 80.57554f, 77.44505f, 81.55f, 76.69f),
                    PathNode.LineTo(147.12f, 25.69f),
                    PathNode.CurveTo(150.07997f, 23.396374f, 154.23492f, 23.462852f, 157.12f, 25.85f),
                    PathNode.CurveTo(158.98248f, 27.450014f, 160.03769f, 29.794909f, 160.0f, 32.25f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(23.163445f, 80.0f, 16.0f, 87.163445f, 16.0f, 96.0f),
                    PathNode.LineTo(16.0f, 160.0f),
                    PathNode.CurveTo(16.0f, 168.83656f, 23.163445f, 176.0f, 32.0f, 176.0f),
                    PathNode.LineTo(60.0f, 176.0f),
                    PathNode.CurveTo(62.20914f, 176.0f, 64.0f, 174.20914f, 64.0f, 172.0f),
                    PathNode.LineTo(64.0f, 84.0f),
                    PathNode.CurveTo(64.0f, 81.79086f, 62.20914f, 80.0f, 60.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.77f, 100.84f),
                    PathNode.CurveTo(185.17451f, 102.24205f, 184.20206f, 104.22102f, 184.067f, 106.34071f),
                    PathNode.CurveTo(183.93195f, 108.4604f, 184.64536f, 110.54679f, 186.05f, 112.14f),
                    PathNode.CurveTo(194.03296f, 121.206535f, 194.03296f, 134.79347f, 186.05f, 143.86f),
                    PathNode.CurveTo(184.10605f, 145.99603f, 183.46436f, 149.01402f, 184.3711f, 151.75618f),
                    PathNode.CurveTo(185.27785f, 154.49834f, 187.59222f, 156.53885f, 190.42636f, 157.09491f),
                    PathNode.CurveTo(193.26051f, 157.65097f, 196.17433f, 156.63625f, 198.05f, 154.44f),
                    PathNode.CurveTo(211.36275f, 139.32698f, 211.36275f, 116.67301f, 198.05f, 101.56f),
                    PathNode.CurveTo(196.64766f, 99.96151f, 194.66661f, 98.98709f, 192.54448f, 98.852f),
                    PathNode.CurveTo(190.42233f, 98.7169f, 188.33372f, 99.43224f, 186.74f, 100.84f),
                    PathNode.Close,
                    PathNode.MoveTo(227.66f, 74.67f),
                    PathNode.CurveTo(225.78563f, 72.42967f, 222.8392f, 71.38902f, 219.97359f, 71.955215f),
                    PathNode.CurveTo(217.10797f, 72.52141f, 214.77873f, 74.60443f, 213.89723f, 77.38927f),
                    PathNode.CurveTo(213.01573f, 80.1741f, 213.72212f, 83.21801f, 215.74f, 85.33f),
                    PathNode.CurveTo(237.4736f, 109.62548f, 237.4736f, 146.37451f, 215.74f, 170.67f),
                    PathNode.CurveTo(213.72212f, 172.782f, 213.01573f, 175.8259f, 213.89723f, 178.61073f),
                    PathNode.CurveTo(214.77873f, 181.39557f, 217.10797f, 183.47859f, 219.97359f, 184.04478f),
                    PathNode.CurveTo(222.8392f, 184.61098f, 225.78563f, 183.57031f, 227.66f, 181.33f),
                    PathNode.CurveTo(254.81805f, 150.96294f, 254.81805f, 105.03704f, 227.66f, 74.67f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
