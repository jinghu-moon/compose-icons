package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorFillIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 56.0f),
                    PathNode.CurveTo(120.0f, 38.32689f, 134.32689f, 24.0f, 152.0f, 24.0f),
                    PathNode.CurveTo(169.67311f, 24.0f, 184.0f, 38.32689f, 184.0f, 56.0f),
                    PathNode.CurveTo(184.0f, 73.67311f, 169.67311f, 88.0f, 152.0f, 88.0f),
                    PathNode.CurveTo(134.32689f, 88.0f, 120.0f, 73.67311f, 120.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(223.28f, 130.08f),
                    PathNode.CurveTo(222.40714f, 128.14186f, 220.79881f, 126.63077f, 218.81007f, 125.8803f),
                    PathNode.CurveTo(216.82133f, 125.12983f, 214.61568f, 125.20168f, 212.68f, 126.08f),
                    PathNode.CurveTo(212.43f, 126.2f, 185.97f, 136.8f, 140.5f, 105.89f),
                    PathNode.CurveTo(88.21f, 70.35f, 52.5f, 98.12f, 50.99f, 99.32f),
                    PathNode.CurveTo(48.657215f, 101.07247f, 47.463512f, 103.955986f, 47.87503f, 106.844536f),
                    PathNode.CurveTo(48.286552f, 109.73308f, 50.23802f, 112.16851f, 52.967396f, 113.19981f),
                    PathNode.CurveTo(55.696774f, 114.231094f, 58.771152f, 113.69467f, 60.99f, 111.8f),
                    PathNode.CurveTo(61.25f, 111.59f, 86.11f, 92.3f, 125.06f, 115.07f),
                    PathNode.CurveTo(120.81f, 128.42f, 112.3f, 146.89f, 99.81f, 162.07f),
                    PathNode.CurveTo(81.25f, 184.55f, 58.7f, 194.63f, 32.81f, 192.07f),
                    PathNode.CurveTo(28.411053f, 191.62541f, 24.484589f, 194.83105f, 24.04f, 199.23f),
                    PathNode.CurveTo(23.595411f, 203.62897f, 26.801052f, 207.5554f, 31.2f, 208.0f),
                    PathNode.CurveTo(34.30339f, 208.3144f, 37.420723f, 208.47127f, 40.54f, 208.47f),
                    PathNode.CurveTo(67.92f, 208.47f, 92.54f, 196.09f, 112.17f, 172.29f),
                    PathNode.CurveTo(112.74f, 171.6f, 113.31f, 170.89f, 113.86f, 170.19f),
                    PathNode.CurveTo(133.31f, 175.29f, 168.0f, 190.3f, 168.0f, 232.0f),
                    PathNode.CurveTo(168.0f, 236.41827f, 171.58173f, 240.0f, 176.0f, 240.0f),
                    PathNode.CurveTo(180.41827f, 240.0f, 184.0f, 236.41827f, 184.0f, 232.0f),
                    PathNode.CurveTo(184.0f, 207.35f, 173.92f, 186.65f, 154.85f, 172.14f),
                    PathNode.CurveTo(145.38075f, 165.14014f, 134.79439f, 159.79457f, 123.54f, 156.33f),
                    PathNode.CurveTo(129.82254f, 146.13058f, 135.00488f, 135.29324f, 139.0f, 124.0f),
                    PathNode.CurveTo(165.14f, 140.09f, 185.84f, 144.0f, 199.69f, 144.0f),
                    PathNode.CurveTo(211.87f, 144.0f, 218.75f, 141.0f, 219.36f, 140.72f),
                    PathNode.CurveTo(221.29411f, 139.83261f, 222.79498f, 138.21121f, 223.53062f, 136.21445f),
                    PathNode.CurveTo(224.26628f, 134.21768f, 224.17609f, 132.0101f, 223.28f, 130.08f),
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
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
