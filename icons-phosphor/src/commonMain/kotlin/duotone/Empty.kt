package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorDuotoneIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 176.60106f, 176.60106f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
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
                    PathNode.MoveTo(198.24f, 62.63f),
                    PathNode.LineTo(213.92f, 45.38f),
                    PathNode.CurveTo(216.82726f, 42.102833f, 216.55795f, 37.0969f, 213.31587f, 34.15056f),
                    PathNode.CurveTo(210.0738f, 31.204214f, 205.065f, 31.413485f, 202.08f, 34.62f),
                    PathNode.LineTo(186.4f, 51.86f),
                    PathNode.CurveTo(146.8147f, 21.457952f, 90.53202f, 26.482422f, 56.95786f, 63.41556f),
                    PathNode.CurveTo(23.383698f, 100.3487f, 23.732477f, 156.85413f, 57.76f, 193.37f),
                    PathNode.LineTo(42.08f, 210.62f),
                    PathNode.CurveTo(40.116978f, 212.7287f, 39.439384f, 215.73003f, 40.30605f, 218.47755f),
                    PathNode.CurveTo(41.17271f, 221.2251f, 43.44975f, 223.29443f, 46.26741f, 223.89514f),
                    PathNode.CurveTo(49.085068f, 224.49586f, 52.008102f, 223.53516f, 53.92f, 221.38f),
                    PathNode.LineTo(69.6f, 204.14f),
                    PathNode.CurveTo(109.18531f, 234.54205f, 165.46799f, 229.51758f, 199.04214f, 192.58444f),
                    PathNode.CurveTo(232.6163f, 155.65129f, 232.26752f, 99.145874f, 198.24f, 62.63f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 128.0f),
                    PathNode.CurveTo(48.01814f, 97.796715f, 65.04497f, 70.17833f, 92.02145f, 56.59495f),
                    PathNode.CurveTo(118.99793f, 43.011574f, 151.32484f, 45.779037f, 175.6f, 63.75f),
                    PathNode.LineTo(68.6f, 181.48f),
                    PathNode.CurveTo(55.333996f, 166.82777f, 47.99138f, 147.76549f, 48.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(110.85042f, 208.01811f, 94.15416f, 202.49362f, 80.4f, 192.25f),
                    PathNode.LineTo(187.4f, 74.52f),
                    PathNode.CurveTo(208.549f, 97.98211f, 213.9016f, 131.69662f, 201.05919f, 160.5553f),
                    PathNode.CurveTo(188.21678f, 189.41397f, 159.58719f, 208.00604f, 128.0f, 208.0f),
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
        return _empty!!
    }

private var _empty: ImageVector? = null
