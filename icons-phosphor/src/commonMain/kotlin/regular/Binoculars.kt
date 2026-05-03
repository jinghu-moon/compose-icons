package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = phosphorRegularIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.2f, 151.87f),
                    PathNode.LineTo(237.2f, 151.87f),
                    PathNode.CurveTo(236.53201f, 150.00574f, 235.74713f, 148.18546f, 234.85f, 146.42f),
                    PathNode.LineTo(193.26f, 51.8f),
                    PathNode.CurveTo(192.86655f, 50.888683f, 192.30318f, 50.060608f, 191.6f, 49.36f),
                    PathNode.CurveTo(185.59863f, 43.357258f, 177.45819f, 39.984833f, 168.97f, 39.984833f),
                    PathNode.CurveTo(160.48181f, 39.984833f, 152.34137f, 43.357258f, 146.34f, 49.36f),
                    PathNode.CurveTo(144.84499f, 50.856674f, 144.00363f, 52.88456f, 144.0f, 55.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.LineTo(112.0f, 55.0f),
                    PathNode.CurveTo(112.00167f, 52.87763f, 111.15991f, 50.841576f, 109.66f, 49.34f),
                    PathNode.CurveTo(103.65862f, 43.337257f, 95.5182f, 39.964832f, 87.03f, 39.964832f),
                    PathNode.CurveTo(78.54181f, 39.964832f, 70.401375f, 43.337257f, 64.4f, 49.34f),
                    PathNode.CurveTo(63.696823f, 50.040607f, 63.133457f, 50.868683f, 62.74f, 51.78f),
                    PathNode.LineTo(21.15f, 146.4f),
                    PathNode.CurveTo(20.252872f, 148.16545f, 19.467981f, 149.98573f, 18.8f, 151.85f),
                    PathNode.LineTo(18.8f, 151.85f),
                    PathNode.CurveTo(12.362848f, 169.86131f, 17.233404f, 189.97536f, 31.197111f, 203.04666f),
                    PathNode.CurveTo(45.160816f, 216.11797f, 65.552284f, 219.65147f, 83.09988f, 212.04054f),
                    PathNode.CurveTo(100.64747f, 204.42963f, 112.00169f, 187.12704f, 112.0f, 168.0f),
                    PathNode.LineTo(112.0f, 96.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.CurveTo(143.99034f, 187.12947f, 155.3402f, 204.43846f, 172.8879f, 212.05522f),
                    PathNode.CurveTo(190.43558f, 219.67198f, 210.83072f, 216.14223f, 224.798f, 203.07121f),
                    PathNode.CurveTo(238.7653f, 190.0002f, 243.63795f, 169.88359f, 237.2f, 151.87f),
                    PathNode.Close,
                    PathNode.MoveTo(76.71f, 59.75f),
                    PathNode.CurveTo(82.1908f, 55.135174f, 90.07139f, 54.726643f, 96.0f, 58.75f),
                    PathNode.LineTo(96.0f, 132.26f),
                    PathNode.CurveTo(83.2884f, 120.84581f, 65.4597f, 117.065926f, 49.21f, 122.34f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 200.0f),
                    PathNode.CurveTo(46.32689f, 200.0f, 32.0f, 185.67311f, 32.0f, 168.0f),
                    PathNode.CurveTo(32.0f, 150.32689f, 46.32689f, 136.0f, 64.0f, 136.0f),
                    PathNode.CurveTo(81.67311f, 136.0f, 96.0f, 150.32689f, 96.0f, 168.0f),
                    PathNode.CurveTo(96.0f, 185.67311f, 81.67311f, 200.0f, 64.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 58.74f),
                    PathNode.CurveTo(165.9286f, 54.71664f, 173.8092f, 55.12517f, 179.29f, 59.74f),
                    PathNode.LineTo(206.79f, 122.32f),
                    PathNode.CurveTo(190.53854f, 117.04858f, 172.70961f, 120.83232f, 160.0f, 132.25f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 200.0f),
                    PathNode.CurveTo(174.32689f, 200.0f, 160.0f, 185.67311f, 160.0f, 168.0f),
                    PathNode.CurveTo(160.0f, 150.32689f, 174.32689f, 136.0f, 192.0f, 136.0f),
                    PathNode.CurveTo(209.67311f, 136.0f, 224.0f, 150.32689f, 224.0f, 168.0f),
                    PathNode.CurveTo(224.0f, 185.67311f, 209.67311f, 200.0f, 192.0f, 200.0f),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
