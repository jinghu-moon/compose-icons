package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorRegularIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(64.72f, 70.29f),
                    PathNode.CurveTo(48.32f, 95.0f, 40.0f, 119.78f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0018f, 179.33275f, 61.13594f, 211.23836f, 93.66899f, 225.02255f),
                    PathNode.CurveTo(126.20204f, 238.80675f, 163.82483f, 231.79634f, 189.21f, 207.22f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(88.25378f, 215.95592f, 56.04409f, 183.74623f, 56.0f, 144.0f),
                    PathNode.CurveTo(56.0f, 124.07f, 62.68f, 103.43f, 75.86f, 82.54f),
                    PathNode.LineTo(178.43f, 195.36f),
                    PathNode.CurveTo(164.98273f, 208.59557f, 146.86821f, 216.00948f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 50.51f),
                    PathNode.CurveTo(86.80246f, 47.461304f, 86.68158f, 42.397804f, 89.73f, 39.2f),
                    PathNode.CurveTo(100.03246f, 28.28374f, 111.305466f, 18.326138f, 123.41f, 9.45f),
                    PathNode.CurveTo(126.16557f, 7.519659f, 129.83443f, 7.519659f, 132.59f, 9.45f),
                    PathNode.CurveTo(136.0f, 11.83f, 216.0f, 68.7f, 216.0f, 144.0f),
                    PathNode.CurveTo(216.00494f, 151.90602f, 214.94543f, 159.77672f, 212.85f, 167.4f),
                    PathNode.CurveTo(211.89592f, 170.87161f, 208.74033f, 173.2782f, 205.14f, 173.28f),
                    PathNode.CurveTo(204.41713f, 173.2864f, 203.69688f, 173.19217f, 203.0f, 173.0f),
                    PathNode.CurveTo(198.7433f, 171.82735f, 196.24144f, 167.42783f, 197.41f, 163.17f),
                    PathNode.CurveTo(199.12517f, 156.92426f, 199.99625f, 150.47696f, 200.0f, 144.0f),
                    PathNode.CurveTo(200.0f, 86.76f, 144.52f, 39.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(118.547165f, 33.430897f, 109.63778f, 41.52821f, 101.34f, 50.23f),
                    PathNode.CurveTo(99.87623f, 51.776012f, 97.85659f, 52.67479f, 95.7282f, 52.72734f),
                    PathNode.CurveTo(93.59982f, 52.779892f, 91.538284f, 51.981888f, 90.0f, 50.51f),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
