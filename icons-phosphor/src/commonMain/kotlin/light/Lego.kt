package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = phosphorLightIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(242.68f, 74.63f),
                    PathNode.LineTo(195.85f, 51.22f),
                    PathNode.CurveTo(190.69f, 41.09f, 176.78f, 34.0f, 160.0f, 34.0f),
                    PathNode.CurveTo(138.69f, 34.0f, 122.0f, 45.42f, 122.0f, 60.0f),
                    PathNode.CurveTo(122.005714f, 62.583183f, 122.53646f, 65.138245f, 123.56f, 67.51f),
                    PathNode.LineTo(101.56f, 78.51f),
                    PathNode.CurveTo(94.78298f, 75.46849f, 87.42791f, 73.92993f, 80.0f, 74.0f),
                    PathNode.CurveTo(58.69f, 74.0f, 42.0f, 85.42f, 42.0f, 100.0f),
                    PathNode.CurveTo(42.005714f, 102.58318f, 42.53646f, 105.138245f, 43.56f, 107.51f),
                    PathNode.LineTo(13.32f, 122.63f),
                    PathNode.CurveTo(11.284913f, 123.64599f, 9.999319f, 125.725395f, 10.0f, 128.0f),
                    PathNode.LineTo(10.0f, 192.0f),
                    PathNode.CurveTo(9.999319f, 194.2746f, 11.284913f, 196.354f, 13.32f, 197.37f),
                    PathNode.LineTo(77.32f, 229.37f),
                    PathNode.CurveTo(79.00737f, 230.2124f, 80.99263f, 230.2124f, 82.68f, 229.37f),
                    PathNode.LineTo(242.68f, 149.37f),
                    PathNode.CurveTo(244.71509f, 148.354f, 246.00069f, 146.2746f, 246.0f, 144.0f),
                    PathNode.LineTo(246.0f, 80.0f),
                    PathNode.CurveTo(246.00069f, 77.725395f, 244.71509f, 75.64599f, 242.68f, 74.63f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 153.29f),
                    PathNode.LineTo(29.42f, 128.0f),
                    PathNode.LineTo(51.19f, 117.12f),
                    PathNode.CurveTo(58.1f, 122.59f, 68.36f, 126.0f, 80.0f, 126.0f),
                    PathNode.CurveTo(101.31f, 126.0f, 118.0f, 114.58f, 118.0f, 100.0f),
                    PathNode.CurveTo(117.93063f, 94.957794f, 115.99621f, 90.119965f, 112.57f, 86.42f),
                    PathNode.LineTo(131.19f, 77.12f),
                    PathNode.CurveTo(138.1f, 82.59f, 148.36f, 86.0f, 160.0f, 86.0f),
                    PathNode.CurveTo(178.63f, 86.0f, 193.74f, 77.27f, 197.23f, 65.33f),
                    PathNode.LineTo(226.58f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 46.0f),
                    PathNode.CurveTo(175.32f, 46.0f, 186.0f, 53.38f, 186.0f, 60.0f),
                    PathNode.CurveTo(186.0f, 66.62f, 175.32f, 74.0f, 160.0f, 74.0f),
                    PathNode.CurveTo(144.68f, 74.0f, 134.0f, 66.62f, 134.0f, 60.0f),
                    PathNode.CurveTo(134.0f, 53.38f, 144.68f, 46.0f, 160.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 86.0f),
                    PathNode.CurveTo(95.32f, 86.0f, 106.0f, 93.38f, 106.0f, 100.0f),
                    PathNode.CurveTo(106.0f, 106.62f, 95.32f, 114.0f, 80.0f, 114.0f),
                    PathNode.CurveTo(64.68f, 114.0f, 54.0f, 106.62f, 54.0f, 100.0f),
                    PathNode.CurveTo(54.0f, 93.38f, 64.68f, 86.0f, 80.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(22.0f, 137.71f),
                    PathNode.LineTo(74.0f, 163.71f),
                    PathNode.LineTo(74.0f, 214.29f),
                    PathNode.LineTo(22.0f, 188.29f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 214.29f),
                    PathNode.LineTo(86.0f, 163.71f),
                    PathNode.LineTo(234.0f, 89.71f),
                    PathNode.LineTo(234.0f, 140.29f),
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
        return _lego!!
    }

private var _lego: ImageVector? = null
