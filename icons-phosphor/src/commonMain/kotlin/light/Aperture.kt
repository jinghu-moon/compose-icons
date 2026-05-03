package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorLightIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.12f, 55.88f),
                    PathNode.CurveTo(160.19586f, 16.59816f, 96.065605f, 16.857067f, 56.459946f, 56.459984f),
                    PathNode.CurveTo(16.85428f, 96.062904f, 16.590927f, 160.19315f, 55.87f, 200.12f),
                    PathNode.CurveTo(81.56494f, 226.23871f, 119.29442f, 236.56955f, 154.7109f, 227.18402f),
                    PathNode.CurveTo(190.12741f, 217.79848f, 217.78917f, 190.13864f, 227.17717f, 154.7228f),
                    PathNode.CurveTo(236.56516f, 119.30694f, 226.23692f, 81.57675f, 200.12f, 55.88f),
                    PathNode.Close,
                    PathNode.MoveTo(98.12f, 122.55f),
                    PathNode.LineTo(117.77f, 99.41f),
                    PathNode.LineTo(147.63f, 104.87f),
                    PathNode.LineTo(157.84f, 133.45f),
                    PathNode.LineTo(138.19f, 156.59f),
                    PathNode.LineTo(108.33f, 151.13f),
                    PathNode.Close,
                    PathNode.MoveTo(209.93f, 90.69f),
                    PathNode.CurveTo(221.322f, 115.8269f, 220.58519f, 144.79475f, 207.93f, 169.32f),
                    PathNode.LineTo(151.79f, 159.08f),
                    PathNode.Close,
                    PathNode.MoveTo(203.77f, 79.41f),
                    PathNode.LineTo(166.83f, 122.89f),
                    PathNode.LineTo(136.66f, 38.42f),
                    PathNode.CurveTo(157.46324f, 40.366817f, 176.92545f, 49.5459f, 191.66f, 64.36f),
                    PathNode.CurveTo(196.21735f, 68.93446f, 200.27672f, 73.97934f, 203.77f, 79.41f),
                    PathNode.Close,
                    PathNode.MoveTo(64.36f, 64.41f),
                    PathNode.CurveTo(80.171f, 48.48764f, 101.39309f, 39.09566f, 123.81f, 38.1f),
                    PathNode.LineTo(143.0f, 91.82f),
                    PathNode.LineTo(54.75f, 75.71f),
                    PathNode.CurveTo(57.639004f, 71.67136f, 60.85302f, 67.875404f, 64.36f, 64.36f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 86.68f),
                    PathNode.LineTo(104.14f, 96.92f),
                    PathNode.LineTo(46.07f, 165.31f),
                    PathNode.CurveTo(34.677994f, 140.17308f, 35.41481f, 111.205246f, 48.07f, 86.68f),
                    PathNode.Close,
                    PathNode.MoveTo(52.21f, 176.59f),
                    PathNode.LineTo(89.15f, 133.11f),
                    PathNode.LineTo(119.32f, 217.58f),
                    PathNode.CurveTo(98.51676f, 215.63318f, 79.05456f, 206.4541f, 64.32f, 191.64f),
                    PathNode.CurveTo(59.769634f, 187.06453f, 55.717003f, 182.0197f, 52.23f, 176.59f),
                    PathNode.Close,
                    PathNode.MoveTo(191.62f, 191.59f),
                    PathNode.CurveTo(175.80399f, 207.49811f, 154.58115f, 216.87257f, 132.17f, 217.85f),
                    PathNode.LineTo(113.0f, 164.18f),
                    PathNode.LineTo(201.24f, 180.29f),
                    PathNode.CurveTo(198.35419f, 184.32826f, 195.14352f, 188.1242f, 191.64f, 191.64f),
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
        return _aperture!!
    }

private var _aperture: ImageVector? = null
