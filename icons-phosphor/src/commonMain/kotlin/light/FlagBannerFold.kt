package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorLightIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.0f, 44.75f),
                    PathNode.CurveTo(235.9038f, 43.04873f, 234.0238f, 42.01473f, 232.0f, 42.0f),
                    PathNode.LineTo(152.0f, 42.0f),
                    PathNode.CurveTo(149.64728f, 42.001366f, 147.51245f, 43.37766f, 146.54f, 45.52f),
                    PathNode.LineTo(137.23f, 66.0f),
                    PathNode.LineTo(28.0f, 66.0f),
                    PathNode.CurveTo(25.639715f, 66.01261f, 23.506102f, 67.407875f, 22.548286f, 69.56512f),
                    PathNode.CurveTo(21.590471f, 71.72236f, 21.98642f, 74.24075f, 23.56f, 76.0f),
                    PathNode.LineTo(59.89f, 116.0f),
                    PathNode.LineTo(23.56f, 156.0f),
                    PathNode.CurveTo(21.98642f, 157.75925f, 21.590471f, 160.27763f, 22.548286f, 162.43488f),
                    PathNode.CurveTo(23.506102f, 164.59212f, 25.639715f, 165.98738f, 28.0f, 166.0f),
                    PathNode.LineTo(101.09f, 166.0f),
                    PathNode.CurveTo(103.44272f, 165.99864f, 105.577545f, 164.62234f, 106.55f, 162.48f),
                    PathNode.LineTo(115.86f, 142.0f),
                    PathNode.LineTo(182.68f, 142.0f),
                    PathNode.LineTo(146.54f, 221.52f),
                    PathNode.CurveTo(145.88441f, 222.97067f, 145.8322f, 224.6224f, 146.39487f, 226.11159f),
                    PathNode.CurveTo(146.95753f, 227.60077f, 148.08893f, 228.8053f, 149.54f, 229.46f),
                    PathNode.CurveTo(150.31157f, 229.81496f, 151.15068f, 229.99916f, 152.0f, 230.0f),
                    PathNode.CurveTo(154.35272f, 229.99864f, 156.48755f, 228.62234f, 157.46f, 226.48f),
                    PathNode.LineTo(237.46f, 50.48f),
                    PathNode.CurveTo(238.29115f, 48.61607f, 238.11786f, 46.457466f, 237.0f, 44.75f),
                    PathNode.Close,
                    PathNode.MoveTo(97.23f, 154.0f),
                    PathNode.LineTo(41.56f, 154.0f),
                    PathNode.LineTo(72.44f, 120.0f),
                    PathNode.CurveTo(74.52529f, 117.7103f, 74.52529f, 114.2097f, 72.44f, 111.92f),
                    PathNode.LineTo(41.56f, 78.0f),
                    PathNode.LineTo(131.77f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.14f, 130.0f),
                    PathNode.LineTo(121.32f, 130.0f),
                    PathNode.LineTo(155.86f, 54.0f),
                    PathNode.LineTo(222.68f, 54.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null
