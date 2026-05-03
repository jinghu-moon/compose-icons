package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Fingerprint: ImageVector
    get() {
        if (_fingerprint != null) return _fingerprint!!
        _fingerprint = phosphorDuotoneIcon(
            name = "Fingerprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(74.98067f, 224.0f, 32.0f, 181.01933f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 74.98067f, 74.98067f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(181.01933f, 32.0f, 224.0f, 74.98067f, 224.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 128.0f),
                    PathNode.CurveTo(72.05725f, 148.98476f, 67.20824f, 169.69237f, 57.84f, 188.47f),
                    PathNode.CurveTo(56.622463f, 191.1207f, 54.058716f, 192.8986f, 51.149426f, 193.1098f),
                    PathNode.CurveTo(48.240135f, 193.32097f, 45.446495f, 191.93196f, 43.85891f, 189.48491f),
                    PathNode.CurveTo(42.27132f, 187.03784f, 42.141457f, 183.92064f, 43.52f, 181.35f),
                    PathNode.CurveTo(51.780006f, 164.78197f, 56.053654f, 146.51282f, 56.0f, 128.0f),
                    PathNode.CurveTo(55.961952f, 106.13018f, 65.90316f, 85.43775f, 83.0f, 71.8f),
                    PathNode.CurveTo(86.44902f, 69.038574f, 91.483574f, 69.595985f, 94.245f, 73.045f),
                    PathNode.CurveTo(97.006424f, 76.49402f, 96.44902f, 81.52858f, 93.0f, 84.29f),
                    PathNode.CurveTo(79.69922f, 94.89407f, 71.96633f, 110.98953f, 72.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 120.0f),
                    PathNode.CurveTo(123.58172f, 120.0f, 120.0f, 123.58172f, 120.0f, 128.0f),
                    PathNode.CurveTo(119.998375f, 159.168f, 112.08455f, 189.82547f, 97.0f, 217.1f),
                    PathNode.CurveTo(94.857124f, 220.96599f, 96.254005f, 225.83711f, 100.12f, 227.98f),
                    PathNode.CurveTo(103.98599f, 230.12286f, 108.857124f, 228.726f, 111.0f, 224.86f),
                    PathNode.CurveTo(127.39581f, 195.20918f, 135.9977f, 161.88205f, 136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 123.58172f, 132.41827f, 120.0f, 128.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 88.0f),
                    PathNode.CurveTo(105.90861f, 88.0f, 88.0f, 105.90861f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 132.41827f, 91.58172f, 136.0f, 96.0f, 136.0f),
                    PathNode.CurveTo(100.41828f, 136.0f, 104.0f, 132.41827f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 114.74516f, 114.74516f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(141.25484f, 104.0f, 152.0f, 114.74516f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.08295f, 159.80954f, 145.07649f, 191.23784f, 131.49f, 220.0f),
                    PathNode.CurveTo(129.60394f, 224.00682f, 131.32318f, 228.78395f, 135.33f, 230.67f),
                    PathNode.CurveTo(139.33682f, 232.55605f, 144.11395f, 230.83682f, 146.0f, 226.83f),
                    PathNode.CurveTo(160.58336f, 195.9298f, 168.09877f, 162.16852f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 105.90861f, 150.09138f, 88.0f, 128.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.58752f, 24.060629f, 24.060629f, 70.58752f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.014845f, 137.98999f, 22.323883f, 147.90918f, 19.0f, 157.33f),
                    PathNode.CurveTo(17.528162f, 161.497f, 19.71301f, 166.06816f, 23.88f, 167.54f),
                    PathNode.CurveTo(28.046988f, 169.01184f, 32.61816f, 166.827f, 34.09f, 162.66f),
                    PathNode.CurveTo(38.01474f, 151.5263f, 40.01335f, 139.80519f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.00398f, 146.27847f, 214.23233f, 164.51411f, 210.71f, 182.45f),
                    PathNode.CurveTo(210.29848f, 184.532f, 210.73111f, 186.69218f, 211.91266f, 188.45514f),
                    PathNode.CurveTo(213.09421f, 190.21808f, 214.92784f, 191.4393f, 217.01f, 191.85f),
                    PathNode.CurveTo(217.52075f, 191.94894f, 218.03975f, 191.99916f, 218.56f, 192.0f),
                    PathNode.CurveTo(222.37755f, 191.99599f, 225.66035f, 189.29521f, 226.4f, 185.55f),
                    PathNode.CurveTo(230.12544f, 166.5932f, 232.00092f, 147.3194f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93387f, 70.5898f, 185.4102f, 24.066128f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.4f, 152.17f),
                    PathNode.CurveTo(90.080444f, 151.3107f, 85.87878f, 154.10437f, 85.0f, 158.42f),
                    PathNode.CurveTo(81.75393f, 174.3964f, 75.94203f, 189.7417f, 67.79f, 203.86f),
                    PathNode.CurveTo(65.580864f, 207.68733f, 66.89267f, 212.58087f, 70.72f, 214.79f),
                    PathNode.CurveTo(74.54733f, 216.99915f, 79.440865f, 215.68733f, 81.65f, 211.86f),
                    PathNode.CurveTo(90.658905f, 196.24762f, 97.07558f, 179.27722f, 100.65f, 161.61f),
                    PathNode.CurveTo(101.07454f, 159.52924f, 100.65434f, 157.36504f, 99.48199f, 155.59433f),
                    PathNode.CurveTo(98.30964f, 153.82361f, 96.48135f, 152.59167f, 94.4f, 152.17f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(124.99132f, 56.000637f, 121.98556f, 56.187664f, 119.0f, 56.56f),
                    PathNode.CurveTo(114.70356f, 57.204987f, 111.707214f, 61.16114f, 112.25044f, 65.471634f),
                    PathNode.CurveTo(112.79366f, 69.78212f, 116.67787f, 72.87116f, 121.0f, 72.43f),
                    PathNode.CurveTo(136.94221f, 70.44764f, 152.96909f, 75.39748f, 165.01695f, 86.02445f),
                    PathNode.CurveTo(177.06482f, 96.65144f, 183.97668f, 111.935036f, 184.0f, 128.0f),
                    PathNode.CurveTo(183.99771f, 138.36298f, 183.35649f, 148.71594f, 182.08f, 159.0f),
                    PathNode.CurveTo(181.79657f, 161.1124f, 182.36777f, 163.25058f, 183.6669f, 164.9402f),
                    PathNode.CurveTo(184.96603f, 166.62982f, 186.88568f, 167.7312f, 189.0f, 168.0f),
                    PathNode.CurveTo(189.33186f, 168.0399f, 189.66577f, 168.05994f, 190.0f, 168.06f),
                    PathNode.CurveTo(194.02504f, 168.05132f, 197.41687f, 165.05348f, 197.92f, 161.06f),
                    PathNode.CurveTo(199.26903f, 150.112f, 199.93698f, 139.09079f, 199.92f, 128.06f),
                    PathNode.CurveTo(199.90907f, 88.321526f, 167.73839f, 56.088207f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(185.93f, 184.25f),
                    PathNode.CurveTo(183.87453f, 183.71849f, 181.69206f, 184.02582f, 179.86331f, 185.10431f),
                    PathNode.CurveTo(178.03456f, 186.18282f, 176.7095f, 187.944f, 176.18f, 190.0f),
                    PathNode.CurveTo(174.72f, 195.69f, 173.03f, 201.4f, 171.18f, 207.0f),
                    PathNode.CurveTo(169.77052f, 211.17757f, 172.00667f, 215.70802f, 176.18f, 217.13f),
                    PathNode.CurveTo(177.0011f, 217.40938f, 177.86267f, 217.55128f, 178.73f, 217.55f),
                    PathNode.CurveTo(182.16727f, 217.5474f, 185.21867f, 215.34941f, 186.31f, 212.09f),
                    PathNode.CurveTo(188.31f, 206.17f, 190.1f, 200.09f, 191.66f, 194.04f),
                    PathNode.CurveTo(192.20157f, 191.98444f, 191.90279f, 189.79787f, 190.8296f, 187.96294f),
                    PathNode.CurveTo(189.75641f, 186.12804f, 187.9971f, 184.79568f, 185.94f, 184.26f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _fingerprint!!
    }

private var _fingerprint: ImageVector? = null
