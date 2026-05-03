package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorThinIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.5f, 104.8f),
                    PathNode.LineTo(179.72f, 30.87f),
                    PathNode.CurveTo(179.2196f, 29.170847f, 177.6613f, 28.003132f, 175.89f, 28.0f),
                    PathNode.LineTo(80.11f, 28.0f),
                    PathNode.CurveTo(78.3387f, 28.003132f, 76.78038f, 29.170847f, 76.28f, 30.87f),
                    PathNode.LineTo(54.5f, 104.8f),
                    PathNode.CurveTo(47.972553f, 126.466064f, 54.297386f, 149.95943f, 70.82f, 165.42f),
                    PathNode.CurveTo(85.302864f, 179.01035f, 104.16074f, 186.9854f, 124.0f, 187.91f),
                    PathNode.LineTo(124.0f, 236.0f),
                    PathNode.LineTo(88.0f, 236.0f),
                    PathNode.CurveTo(85.79086f, 236.0f, 84.0f, 237.79086f, 84.0f, 240.0f),
                    PathNode.CurveTo(84.0f, 242.20914f, 85.79086f, 244.0f, 88.0f, 244.0f),
                    PathNode.LineTo(168.0f, 244.0f),
                    PathNode.CurveTo(170.20914f, 244.0f, 172.0f, 242.20914f, 172.0f, 240.0f),
                    PathNode.CurveTo(172.0f, 237.79086f, 170.20914f, 236.0f, 168.0f, 236.0f),
                    PathNode.LineTo(132.0f, 236.0f),
                    PathNode.LineTo(132.0f, 187.91f),
                    PathNode.CurveTo(151.83925f, 186.9854f, 170.69714f, 179.01035f, 185.18f, 165.42f),
                    PathNode.CurveTo(201.7026f, 149.95943f, 208.02745f, 126.466064f, 201.5f, 104.8f),
                    PathNode.Close,
                    PathNode.MoveTo(83.1f, 36.0f),
                    PathNode.LineTo(172.9f, 36.0f),
                    PathNode.LineTo(193.83f, 107.06f),
                    PathNode.CurveTo(194.26f, 108.55f, 194.63f, 110.06f, 194.93f, 111.53f),
                    PathNode.CurveTo(171.29f, 122.0f, 144.17f, 111.71f, 129.81f, 104.43f),
                    PathNode.CurveTo(101.59f, 90.14f, 80.33f, 90.33f, 65.93f, 94.29f),
                    PathNode.Close,
                    PathNode.MoveTo(179.72f, 159.57f),
                    PathNode.CurveTo(150.62033f, 186.8107f, 105.37966f, 186.8107f, 76.28f, 159.57f),
                    PathNode.CurveTo(61.9735f, 146.17426f, 56.504738f, 125.82239f, 62.17f, 107.06f),
                    PathNode.LineTo(63.17f, 103.6f),
                    PathNode.CurveTo(75.83f, 98.73f, 96.62f, 96.6f, 126.17f, 111.6f),
                    PathNode.CurveTo(137.0f, 117.0f, 154.33f, 124.0f, 172.8f, 124.0f),
                    PathNode.CurveTo(180.73047f, 124.07135f, 188.60263f, 122.63943f, 196.0f, 119.78f),
                    PathNode.CurveTo(196.6662f, 134.78815f, 190.71516f, 149.33308f, 179.72f, 159.57f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wine!!
    }

private var _wine: ImageVector? = null
