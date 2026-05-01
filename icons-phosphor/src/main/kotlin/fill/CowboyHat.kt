package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) return _cowboyHat!!
        _cowboyHat = phosphorFillIcon(
            name = "CowboyHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 120.0f),
                    PathNode.CurveTo(213.2431f, 120.00137f, 210.68115f, 121.42216f, 209.22f, 123.76f),
                    PathNode.CurveTo(205.04427f, 130.46971f, 200.43094f, 136.89696f, 195.41f, 143.0f),
                    PathNode.LineTo(193.78f, 134.43f),
                    PathNode.LineTo(193.78f, 134.43f),
                    PathNode.LineTo(178.32f, 53.07f),
                    PathNode.CurveTo(177.28569f, 47.547203f, 173.43022f, 42.97169f, 168.1628f, 41.01586f),
                    PathNode.CurveTo(162.89536f, 39.06003f, 156.98804f, 40.01055f, 152.6f, 43.52f),
                    PathNode.LineTo(152.47f, 43.62f),
                    PathNode.LineTo(128.0f, 64.0f),
                    PathNode.LineTo(103.53f, 43.62f),
                    PathNode.LineTo(103.4f, 43.52f),
                    PathNode.CurveTo(99.01476f, 40.010914f, 93.1107f, 39.058052f, 87.8442f, 41.009445f),
                    PathNode.CurveTo(82.57769f, 42.96084f, 78.71996f, 47.530716f, 77.68f, 53.05f),
                    PathNode.LineTo(62.23f, 134.38f),
                    PathNode.LineTo(62.23f, 134.38f),
                    PathNode.LineTo(60.59f, 143.0f),
                    PathNode.CurveTo(55.56724f, 136.89487f, 50.95384f, 130.46416f, 46.78f, 123.75f),
                    PathNode.CurveTo(45.316444f, 121.41598f, 42.754932f, 119.999214f, 40.0f, 120.0f),
                    PathNode.CurveTo(17.90861f, 120.0f, 1.0E-6f, 137.90862f, 1.0E-6f, 160.0f),
                    PathNode.CurveTo(1.0E-6f, 182.09138f, 17.90861f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(238.09138f, 200.0f, 256.0f, 182.09138f, 256.0f, 160.0f),
                    PathNode.CurveTo(256.0f, 137.90862f, 238.09138f, 120.0f, 216.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.68f, 144.0f),
                    PathNode.LineTo(179.31f, 144.0f),
                    PathNode.LineTo(181.85f, 157.35f),
                    PathNode.CurveTo(173.71913f, 164.99612f, 164.5029f, 171.39862f, 154.5f, 176.35f),
                    PathNode.CurveTo(139.1f, 183.77f, 128.06f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(127.67f, 184.0f, 102.51f, 183.6f, 74.14f, 157.4f),
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
        return _cowboyHat!!
    }

private var _cowboyHat: ImageVector? = null
