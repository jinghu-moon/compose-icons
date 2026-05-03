package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorLightIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.86f, 210.49f),
                    PathNode.CurveTo(212.83945f, 210.42426f, 212.81267f, 210.36064f, 212.78f, 210.3f),
                    PathNode.LineTo(166.84f, 112.44f),
                    PathNode.LineTo(187.92f, 79.34f),
                    PathNode.LineTo(188.01f, 79.2f),
                    PathNode.CurveTo(190.66779f, 74.76791f, 190.66779f, 69.23209f, 188.01f, 64.8f),
                    PathNode.CurveTo(187.94f, 64.68f, 187.86f, 64.56f, 187.78f, 64.44f),
                    PathNode.LineTo(166.0f, 33.33f),
                    PathNode.LineTo(166.0f, 8.0f),
                    PathNode.CurveTo(166.0f, 4.686292f, 163.3137f, 2.0f, 160.0f, 2.0f),
                    PathNode.CurveTo(156.6863f, 2.0f, 154.0f, 4.686292f, 154.0f, 8.0f),
                    PathNode.LineTo(154.0f, 33.12f),
                    PathNode.LineTo(148.3f, 40.24f),
                    PathNode.CurveTo(143.36584f, 46.40567f, 135.89693f, 49.994694f, 128.0f, 49.994694f),
                    PathNode.CurveTo(120.10307f, 49.994694f, 112.634155f, 46.40567f, 107.7f, 40.24f),
                    PathNode.LineTo(102.0f, 33.12f),
                    PathNode.LineTo(102.0f, 8.0f),
                    PathNode.CurveTo(102.0f, 4.686292f, 99.313705f, 2.0f, 96.0f, 2.0f),
                    PathNode.CurveTo(92.686295f, 2.0f, 90.0f, 4.686292f, 90.0f, 8.0f),
                    PathNode.LineTo(90.0f, 33.33f),
                    PathNode.LineTo(68.22f, 64.44f),
                    PathNode.CurveTo(68.14f, 64.56f, 68.06f, 64.68f, 67.99f, 64.8f),
                    PathNode.CurveTo(65.33222f, 69.23209f, 65.33222f, 74.76791f, 67.99f, 79.2f),
                    PathNode.LineTo(68.08f, 79.34f),
                    PathNode.LineTo(89.16f, 112.44f),
                    PathNode.LineTo(43.22f, 210.3f),
                    PathNode.CurveTo(43.187336f, 210.36064f, 43.160545f, 210.42426f, 43.14f, 210.49f),
                    PathNode.CurveTo(41.288925f, 214.81369f, 41.732586f, 219.77794f, 44.321014f, 223.70486f),
                    PathNode.CurveTo(46.909447f, 227.63179f, 51.296734f, 229.9966f, 56.0f, 230.0f),
                    PathNode.LineTo(200.0f, 230.0f),
                    PathNode.CurveTo(204.70505f, 229.99995f, 209.09543f, 227.63652f, 211.68623f, 223.70903f),
                    PathNode.CurveTo(214.27704f, 219.78156f, 214.72177f, 214.81532f, 212.87f, 210.49f),
                    PathNode.Close,
                    PathNode.MoveTo(78.26f, 73.0f),
                    PathNode.CurveTo(77.92781f, 72.418144f, 77.909035f, 71.7086f, 78.21f, 71.11f),
                    PathNode.LineTo(96.32f, 45.23f),
                    PathNode.LineTo(98.32f, 47.74f),
                    PathNode.CurveTo(105.53143f, 56.75194f, 116.447914f, 61.99782f, 127.99f, 61.99782f),
                    PathNode.CurveTo(139.53209f, 61.99782f, 150.44856f, 56.75194f, 157.66f, 47.74f),
                    PathNode.LineTo(159.66f, 45.23f),
                    PathNode.LineTo(177.77f, 71.09f),
                    PathNode.CurveTo(178.08647f, 71.68026f, 178.08647f, 72.38973f, 177.77f, 72.98f),
                    PathNode.LineTo(156.77f, 105.98f),
                    PathNode.LineTo(99.29f, 105.98f),
                    PathNode.Close,
                    PathNode.MoveTo(201.66f, 217.1f),
                    PathNode.CurveTo(201.29936f, 217.67178f, 200.66586f, 218.01317f, 199.99f, 218.0f),
                    PathNode.LineTo(56.0f, 218.0f),
                    PathNode.CurveTo(55.33996f, 218.00136f, 54.721752f, 217.67697f, 54.34782f, 217.13306f),
                    PathNode.CurveTo(53.973885f, 216.58916f, 53.892384f, 215.89578f, 54.13f, 215.28f),
                    PathNode.LineTo(99.81f, 118.0f),
                    PathNode.LineTo(156.19f, 118.0f),
                    PathNode.LineTo(201.86f, 215.28f),
                    PathNode.CurveTo(202.10551f, 215.88144f, 202.03027f, 216.56624f, 201.66f, 217.1f),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
