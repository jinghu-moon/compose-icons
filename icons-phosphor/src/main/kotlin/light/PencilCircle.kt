package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) return _pencilCircle!!
        _pencilCircle = phosphorLightIcon(
            name = "PencilCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.12f, 55.87f),
                    PathNode.CurveTo(174.42325f, 29.753078f, 136.69305f, 19.42484f, 101.277214f, 28.812836f),
                    PathNode.CurveTo(65.86137f, 38.200832f, 38.201523f, 65.86259f, 28.815983f, 101.27908f),
                    PathNode.CurveTo(19.430443f, 136.69559f, 29.761297f, 174.42508f, 55.88f, 200.12f),
                    PathNode.CurveTo(81.57675f, 226.23692f, 119.30694f, 236.56516f, 154.7228f, 227.17717f),
                    PathNode.CurveTo(190.13864f, 217.78917f, 217.79848f, 190.12741f, 227.18402f, 154.7109f),
                    PathNode.CurveTo(236.56955f, 119.29442f, 226.23871f, 81.56494f, 200.12f, 55.87f),
                    PathNode.Close,
                    PathNode.MoveTo(106.0f, 134.0f),
                    PathNode.LineTo(150.0f, 134.0f),
                    PathNode.LineTo(164.1f, 164.56f),
                    PathNode.CurveTo(151.3355f, 158.93008f, 136.37462f, 162.84229f, 128.0f, 174.0f),
                    PathNode.CurveTo(119.6297f, 162.83026f, 104.66172f, 158.909f, 91.89f, 164.54f),
                    PathNode.Close,
                    PathNode.MoveTo(111.54f, 122.0f),
                    PathNode.LineTo(128.0f, 86.32f),
                    PathNode.LineTo(144.47f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 192.0f),
                    PathNode.CurveTo(134.0f, 182.05887f, 142.05887f, 174.0f, 152.0f, 174.0f),
                    PathNode.CurveTo(161.94113f, 174.0f, 170.0f, 182.05887f, 170.0f, 192.0f),
                    PathNode.LineTo(170.0f, 207.64f),
                    PathNode.CurveTo(158.85072f, 213.52434f, 146.58142f, 216.9802f, 134.0f, 217.78f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 192.0f),
                    PathNode.CurveTo(86.0f, 182.05887f, 94.05888f, 174.0f, 104.0f, 174.0f),
                    PathNode.CurveTo(113.94112f, 174.0f, 122.0f, 182.05887f, 122.0f, 192.0f),
                    PathNode.LineTo(122.0f, 217.78f),
                    PathNode.CurveTo(109.41858f, 216.9802f, 97.14928f, 213.52434f, 86.0f, 207.64f),
                    PathNode.Close,
                    PathNode.MoveTo(191.64f, 191.64f),
                    PathNode.CurveTo(188.62238f, 194.64464f, 185.40141f, 197.4379f, 182.0f, 200.0f),
                    PathNode.LineTo(182.0f, 176.0f),
                    PathNode.CurveTo(182.00008f, 175.13344f, 181.81244f, 174.27713f, 181.45f, 173.49f),
                    PathNode.LineTo(133.45f, 69.49f),
                    PathNode.CurveTo(132.47037f, 67.36246f, 130.34224f, 65.99948f, 128.0f, 65.99948f),
                    PathNode.CurveTo(125.65775f, 65.99948f, 123.52964f, 67.36246f, 122.55f, 69.49f),
                    PathNode.LineTo(74.55f, 173.49f),
                    PathNode.CurveTo(74.18756f, 174.27713f, 73.99992f, 175.13344f, 74.0f, 176.0f),
                    PathNode.LineTo(74.0f, 200.0f),
                    PathNode.CurveTo(70.59826f, 197.4347f, 67.3773f, 194.63808f, 64.36f, 191.63f),
                    PathNode.CurveTo(29.21313f, 156.4827f, 29.213364f, 99.498055f, 64.36052f, 64.351036f),
                    PathNode.CurveTo(99.507675f, 29.204025f, 156.49232f, 29.204025f, 191.63948f, 64.351036f),
                    PathNode.CurveTo(226.78664f, 99.498055f, 226.78687f, 156.4827f, 191.64f, 191.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
