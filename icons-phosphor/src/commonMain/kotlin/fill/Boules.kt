package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorFillIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 184.63f, 184.62f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(117.303986f, 232.00578f, 106.67149f, 230.35626f, 96.48f, 227.11f),
                    PathNode.CurveTo(95.14497f, 226.68939f, 94.12692f, 225.60155f, 93.79563f, 224.2416f),
                    PathNode.CurveTo(93.46434f, 222.88167f, 93.868f, 221.4475f, 94.86f, 220.46f),
                    PathNode.LineTo(220.46f, 94.85f),
                    PathNode.CurveTo(221.4475f, 93.858f, 222.88167f, 93.45434f, 224.2416f, 93.78563f),
                    PathNode.CurveTo(225.60155f, 94.11693f, 226.68939f, 95.13498f, 227.11f, 96.47f),
                    PathNode.CurveTo(230.35696f, 106.664764f, 232.00648f, 117.30066f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.84f, 72.39f),
                    PathNode.CurveTo(213.96645f, 69.43576f, 211.94383f, 66.578735f, 209.78f, 63.83f),
                    PathNode.CurveTo(209.06917f, 62.9255f, 208.00331f, 62.37083f, 206.85466f, 62.30765f),
                    PathNode.CurveTo(205.706f, 62.244476f, 204.58574f, 62.67891f, 203.78f, 63.5f),
                    PathNode.LineTo(63.5f, 203.82f),
                    PathNode.CurveTo(62.67891f, 204.62575f, 62.244476f, 205.74599f, 62.30765f, 206.89465f),
                    PathNode.CurveTo(62.37083f, 208.0433f, 62.9255f, 209.10916f, 63.83f, 209.82f),
                    PathNode.CurveTo(66.578735f, 211.98383f, 69.43576f, 214.00644f, 72.39f, 215.88f),
                    PathNode.CurveTo(73.975555f, 216.90125f, 76.05905f, 216.67624f, 77.39f, 215.34f),
                    PathNode.LineTo(215.3f, 77.39f),
                    PathNode.CurveTo(216.63623f, 76.05905f, 216.86125f, 73.975555f, 215.84f, 72.39f),
                    PathNode.Close,
                    PathNode.MoveTo(192.17f, 46.22f),
                    PathNode.CurveTo(189.42126f, 44.056168f, 186.56424f, 42.033558f, 183.61f, 40.16f),
                    PathNode.CurveTo(182.02444f, 39.138752f, 179.94095f, 39.36377f, 178.61f, 40.7f),
                    PathNode.LineTo(40.7f, 178.62f),
                    PathNode.CurveTo(39.36377f, 179.95094f, 39.138752f, 182.03444f, 40.16f, 183.62f),
                    PathNode.CurveTo(42.033558f, 186.57423f, 44.056168f, 189.43126f, 46.22f, 192.18f),
                    PathNode.CurveTo(46.930836f, 193.0845f, 47.996685f, 193.63918f, 49.145348f, 193.70235f),
                    PathNode.CurveTo(50.294006f, 193.76552f, 51.414257f, 193.33109f, 52.22f, 192.51f),
                    PathNode.LineTo(192.5f, 52.18f),
                    PathNode.CurveTo(193.30727f, 51.375214f, 193.73282f, 50.26424f, 193.66978f, 49.126095f),
                    PathNode.CurveTo(193.60678f, 47.987946f, 193.06117f, 46.930744f, 192.17f, 46.22f),
                    PathNode.Close,
                    PathNode.MoveTo(159.53f, 28.89f),
                    PathNode.CurveTo(149.33531f, 25.642723f, 138.69937f, 23.99319f, 128.0f, 24.0f),
                    PathNode.CurveTo(71.38f, 24.0f, 24.0f, 71.37f, 24.0f, 128.0f),
                    PathNode.CurveTo(23.993511f, 138.69934f, 25.643036f, 149.33524f, 28.89f, 159.53f),
                    PathNode.CurveTo(29.310604f, 160.86502f, 30.398445f, 161.88307f, 31.758387f, 162.21437f),
                    PathNode.CurveTo(33.11833f, 162.54567f, 34.552513f, 162.142f, 35.54f, 161.15f),
                    PathNode.LineTo(161.15f, 35.54f),
                    PathNode.CurveTo(162.142f, 34.552513f, 162.54567f, 33.11833f, 162.21437f, 31.758387f),
                    PathNode.CurveTo(161.88307f, 30.398445f, 160.86502f, 29.310604f, 159.53f, 28.89f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _boules!!
    }

private var _boules: ImageVector? = null
