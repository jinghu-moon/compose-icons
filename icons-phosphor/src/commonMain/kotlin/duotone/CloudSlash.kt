package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorDuotoneIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 172.18279f, 204.18279f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.CurveTo(50.325085f, 207.97327f, 30.61199f, 195.44093f, 21.390259f, 175.82558f),
                    PathNode.CurveTo(12.168529f, 156.21022f, 15.094369f, 133.0347f, 28.901815f, 116.32671f),
                    PathNode.CurveTo(42.709263f, 99.61871f, 64.918526f, 92.378975f, 85.92f, 97.74f),
                    PathNode.LineTo(85.92f, 97.84f),
                    PathNode.CurveTo(100.35724f, 62.427902f, 137.83798f, 42.185604f, 175.36777f, 49.531776f),
                    PathNode.CurveTo(212.89755f, 56.87795f, 239.98f, 89.758f, 240.0f, 128.0f),
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
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(81.32f, 88.55f),
                    PathNode.LineTo(81.26f, 88.67f),
                    PathNode.CurveTo(78.19325f, 88.22623f, 75.098694f, 88.00233f, 72.0f, 88.0f),
                    PathNode.CurveTo(36.653774f, 88.0f, 8.0f, 116.65378f, 8.0f, 152.0f),
                    PathNode.CurveTo(8.0f, 187.34622f, 36.653774f, 216.0f, 72.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(170.87677f, 216.02066f, 181.66171f, 214.0095f, 191.8f, 210.07f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 200.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(45.490334f, 200.0f, 24.0f, 178.50967f, 24.0f, 152.0f),
                    PathNode.CurveTo(24.0f, 125.49033f, 45.490334f, 104.0f, 72.0f, 104.0f),
                    PathNode.CurveTo(73.1f, 104.0f, 74.2f, 104.0f, 75.3f, 104.12f),
                    PathNode.CurveTo(73.1147f, 111.89197f, 72.00439f, 119.92666f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 132.41827f, 75.58172f, 136.0f, 80.0f, 136.0f),
                    PathNode.CurveTo(84.41828f, 136.0f, 88.0f, 132.41827f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.00283f, 118.913864f, 89.719505f, 109.90979f, 93.06f, 101.46f),
                    PathNode.LineTo(180.06f, 197.16f),
                    PathNode.CurveTo(173.54158f, 199.0519f, 166.78741f, 200.00812f, 160.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 128.0f),
                    PathNode.CurveTo(248.01253f, 149.62067f, 240.05534f, 170.48737f, 225.65f, 186.61f),
                    PathNode.CurveTo(222.6558f, 189.60884f, 217.84254f, 189.75252f, 214.67479f, 186.93764f),
                    PathNode.CurveTo(211.50703f, 184.12274f, 211.08392f, 179.32596f, 213.71f, 176.0f),
                    PathNode.CurveTo(238.32578f, 148.50745f, 238.17068f, 106.85471f, 213.35088f, 79.54623f),
                    PathNode.CurveTo(188.53107f, 52.237736f, 147.08255f, 48.11528f, 117.37f, 70.0f),
                    PathNode.CurveTo(113.81052f, 72.61783f, 108.80283f, 71.85448f, 106.185f, 68.295f),
                    PathNode.CurveTo(103.56717f, 64.73553f, 104.33053f, 59.72783f, 107.89f, 57.11f),
                    PathNode.CurveTo(134.62167f, 37.466187f, 170.1286f, 34.52427f, 199.72871f, 49.500732f),
                    PathNode.CurveTo(229.32884f, 64.477196f, 247.9916f, 94.8268f, 248.0f, 128.0f),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
