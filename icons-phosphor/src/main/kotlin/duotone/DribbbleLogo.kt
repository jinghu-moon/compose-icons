package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) return _dribbbleLogo!!
        _dribbbleLogo = phosphorDuotoneIcon(
            name = "DribbbleLogo",
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.65f, 120.18f),
                    PathNode.QuadTo(211.83f, 120.0f, 208.0f, 120.0f),
                    PathNode.CurveTo(193.16013f, 120.00419f, 178.38579f, 121.96783f, 164.06f, 125.84f),
                    PathNode.CurveTo(160.56747f, 115.47578f, 156.06238f, 105.48084f, 150.61f, 96.0f),
                    PathNode.CurveTo(164.82986f, 87.42517f, 177.70262f, 76.79336f, 188.81f, 64.45f),
                    PathNode.CurveTo(204.22238f, 79.15463f, 213.76178f, 98.96203f, 215.65f, 120.18f),
                    PathNode.Close,
                    PathNode.MoveTo(176.28f, 54.46f),
                    PathNode.CurveTo(166.28745f, 65.439835f, 154.73775f, 74.893875f, 142.0f, 82.52f),
                    PathNode.CurveTo(131.33174f, 67.50419f, 118.28344f, 54.330902f, 103.37f, 43.52f),
                    PathNode.CurveTo(128.13069f, 36.29171f, 154.816f, 40.290844f, 176.37f, 54.46f),
                    PathNode.Close,
                    PathNode.MoveTo(85.65f, 50.88f),
                    PathNode.CurveTo(101.99594f, 61.17396f, 116.24658f, 74.46777f, 127.65f, 90.06f),
                    PathNode.CurveTo(107.69227f, 99.25848f, 85.97551f, 104.01467f, 64.0f, 104.0f),
                    PathNode.CurveTo(57.217667f, 103.99651f, 50.44295f, 103.54553f, 43.72f, 102.65f),
                    PathNode.CurveTo(50.40956f, 80.58507f, 65.45613f, 62.007412f, 85.65f, 50.88f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 128.0f),
                    PathNode.CurveTo(39.999588f, 124.77937f, 40.17652f, 121.56117f, 40.53f, 118.36f),
                    PathNode.CurveTo(48.305683f, 119.451706f, 56.148052f, 119.9997f, 64.0f, 120.0f),
                    PathNode.CurveTo(89.095406f, 120.02367f, 113.87672f, 114.41951f, 136.52f, 103.6f),
                    PathNode.CurveTo(141.50865f, 112.214905f, 145.6321f, 121.30256f, 148.83f, 130.73f),
                    PathNode.CurveTo(140.33186f, 133.92235f, 132.10799f, 137.80185f, 124.24f, 142.33f),
                    PathNode.CurveTo(102.29068f, 155.01047f, 83.47061f, 172.46013f, 69.17f, 193.39f),
                    PathNode.CurveTo(50.596996f, 176.72832f, 39.990246f, 152.95131f, 40.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.0f, 203.0f),
                    PathNode.CurveTo(94.983604f, 183.79688f, 112.16324f, 167.79697f, 132.24f, 156.21f),
                    PathNode.CurveTo(138.95229f, 152.33623f, 145.95692f, 148.99272f, 153.19f, 146.21f),
                    PathNode.CurveTo(155.66534f, 157.19472f, 156.9163f, 168.41983f, 156.92f, 179.68f),
                    PathNode.CurveTo(156.92537f, 190.62697f, 155.75533f, 201.54286f, 153.43f, 212.24f),
                    PathNode.CurveTo(129.39297f, 219.50151f, 103.39809f, 216.13889f, 82.0f, 203.0f),
                    PathNode.Close,
                    PathNode.MoveTo(171.06f, 204.73f),
                    PathNode.CurveTo(172.29443f, 196.4538f, 172.91612f, 188.09775f, 172.92f, 179.73f),
                    PathNode.CurveTo(172.91841f, 166.77835f, 171.42523f, 153.86998f, 168.47f, 141.26f),
                    PathNode.CurveTo(181.35918f, 137.7818f, 194.64975f, 136.01332f, 208.0f, 136.0f),
                    PathNode.QuadTo(211.8f, 136.0f, 215.61f, 136.19f),
                    PathNode.CurveTo(212.89153f, 164.95505f, 196.24586f, 190.56058f, 171.06f, 204.72f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
