package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) return _personSimpleSki!!
        _personSimpleSki = phosphorFillIcon(
            name = "PersonSimpleSki",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 60.0f),
                    PathNode.CurveTo(144.0f, 44.53603f, 156.53603f, 32.0f, 172.0f, 32.0f),
                    PathNode.CurveTo(187.46397f, 32.0f, 200.0f, 44.53603f, 200.0f, 60.0f),
                    PathNode.CurveTo(200.0f, 75.463974f, 187.46397f, 88.0f, 172.0f, 88.0f),
                    PathNode.CurveTo(156.53603f, 88.0f, 144.0f, 75.463974f, 144.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(37.76f, 87.68f),
                    PathNode.LineTo(148.76f, 120.04f),
                    PathNode.LineTo(154.37f, 125.65f),
                    PathNode.CurveTo(155.86258f, 127.14624f, 157.8866f, 127.99108f, 160.0f, 128.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.CurveTo(204.41827f, 128.0f, 208.0f, 124.41828f, 208.0f, 120.0f),
                    PathNode.CurveTo(208.0f, 115.58172f, 204.41827f, 112.0f, 200.0f, 112.0f),
                    PathNode.LineTo(163.31f, 112.0f),
                    PathNode.LineTo(158.59f, 107.28f),
                    PathNode.LineTo(158.59f, 107.28f),
                    PathNode.LineTo(133.69f, 82.38f),
                    PathNode.CurveTo(132.18945f, 80.877785f, 130.15327f, 80.03371f, 128.03f, 80.03371f),
                    PathNode.CurveTo(125.90672f, 80.03371f, 123.870544f, 80.877785f, 122.37f, 82.38f),
                    PathNode.LineTo(112.0f, 92.67f),
                    PathNode.LineTo(42.24f, 72.32f),
                    PathNode.CurveTo(37.99845f, 71.082886f, 33.557117f, 73.518456f, 32.32f, 77.76f),
                    PathNode.CurveTo(31.082882f, 82.00155f, 33.51845f, 86.44288f, 37.76f, 87.68f),
                    PathNode.Close,
                    PathNode.MoveTo(238.66f, 193.15f),
                    PathNode.CurveTo(237.4832f, 191.38274f, 235.65213f, 190.15576f, 233.57013f, 189.73935f),
                    PathNode.CurveTo(231.48813f, 189.32297f, 229.326f, 189.75128f, 227.56f, 190.93f),
                    PathNode.CurveTo(214.32121f, 199.77858f, 197.8418f, 202.30542f, 182.56f, 197.83f),
                    PathNode.LineTo(119.77f, 179.55f),
                    PathNode.LineTo(149.67f, 149.65f),
                    PathNode.CurveTo(151.67482f, 147.64557f, 152.46907f, 144.7298f, 151.75781f, 141.98552f),
                    PathNode.CurveTo(151.04655f, 139.24123f, 148.93604f, 137.07831f, 146.21f, 136.3f),
                    PathNode.LineTo(90.21f, 120.3f),
                    PathNode.CurveTo(85.96017f, 119.08498f, 81.53003f, 121.545166f, 80.315f, 125.795f),
                    PathNode.CurveTo(79.099976f, 130.04483f, 81.560165f, 134.47498f, 85.81f, 135.69f),
                    PathNode.LineTo(128.73f, 148.0f),
                    PathNode.LineTo(102.23f, 174.49f),
                    PathNode.LineTo(26.23f, 152.36f),
                    PathNode.CurveTo(21.988453f, 151.12288f, 17.547117f, 153.55846f, 16.31f, 157.8f),
                    PathNode.CurveTo(15.072882f, 162.04155f, 17.508453f, 166.48288f, 21.75f, 167.72f),
                    PathNode.LineTo(178.06f, 213.24f),
                    PathNode.CurveTo(197.88239f, 219.04211f, 219.25671f, 215.76474f, 236.43f, 204.29f),
                    PathNode.CurveTo(238.2102f, 203.11438f, 239.44711f, 201.27643f, 239.86584f, 199.18459f),
                    PathNode.CurveTo(240.28459f, 197.09274f, 239.8505f, 194.92029f, 238.66f, 193.15f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
