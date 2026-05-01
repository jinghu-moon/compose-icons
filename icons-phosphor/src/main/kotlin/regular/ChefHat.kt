package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = phosphorRegularIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 112.0f),
                    PathNode.CurveTo(239.96693f, 81.08576f, 214.91423f, 56.03307f, 184.0f, 56.0f),
                    PathNode.CurveTo(182.23f, 56.0f, 180.46f, 56.1f, 178.71f, 56.26f),
                    PathNode.CurveTo(169.49213f, 36.585945f, 149.72643f, 24.019123f, 128.0f, 24.019123f),
                    PathNode.CurveTo(106.273575f, 24.019123f, 86.50787f, 36.585945f, 77.29f, 56.26f),
                    PathNode.CurveTo(75.54f, 56.1f, 73.77f, 56.0f, 72.0f, 56.0f),
                    PathNode.CurveTo(45.81666f, 56.006348f, 23.13282f, 74.15506f, 17.38132f, 99.6989f),
                    PathNode.CurveTo(11.629824f, 125.24274f, 24.346155f, 151.36223f, 48.0f, 162.59f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(48.0f, 216.83656f, 55.163445f, 224.0f, 64.0f, 224.0f),
                    PathNode.LineTo(192.0f, 224.0f),
                    PathNode.CurveTo(200.83656f, 224.0f, 208.0f, 216.83656f, 208.0f, 208.0f),
                    PathNode.LineTo(208.0f, 162.59f),
                    PathNode.CurveTo(227.52579f, 153.30383f, 239.97559f, 133.62149f, 240.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 208.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.LineTo(64.0f, 167.42f),
                    PathNode.CurveTo(66.649185f, 167.80606f, 69.32283f, 167.99991f, 72.0f, 168.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.CurveTo(186.67717f, 167.99991f, 189.35081f, 167.80606f, 192.0f, 167.42f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 152.0f),
                    PathNode.LineTo(170.25f, 152.0f),
                    PathNode.LineTo(175.76f, 129.94f),
                    PathNode.CurveTo(176.7459f, 125.68798f, 174.14153f, 121.430504f, 169.90703f, 120.37188f),
                    PathNode.CurveTo(165.67253f, 119.313255f, 161.37103f, 121.84426f, 160.24f, 126.06f),
                    PathNode.LineTo(153.75f, 152.0f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.LineTo(136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 123.58172f, 132.41827f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(123.58172f, 120.0f, 120.0f, 123.58172f, 120.0f, 128.0f),
                    PathNode.LineTo(120.0f, 152.0f),
                    PathNode.LineTo(102.25f, 152.0f),
                    PathNode.LineTo(95.76f, 126.06f),
                    PathNode.CurveTo(95.10705f, 123.2439f, 92.98563f, 120.999115f, 90.21089f, 120.18819f),
                    PathNode.CurveTo(87.43615f, 119.377266f, 84.43976f, 120.126366f, 82.37307f, 122.14765f),
                    PathNode.CurveTo(80.30638f, 124.16892f, 79.49091f, 127.147934f, 80.24f, 129.94f),
                    PathNode.LineTo(85.75f, 152.0f),
                    PathNode.LineTo(72.0f, 152.0f),
                    PathNode.CurveTo(49.90861f, 152.0f, 32.0f, 134.09138f, 32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 89.90861f, 49.90861f, 72.0f, 72.0f, 72.0f),
                    PathNode.LineTo(72.58f, 72.0f),
                    PathNode.CurveTo(72.192955f, 74.64908f, 71.999115f, 77.3228f, 72.0f, 80.0f),
                    PathNode.CurveTo(72.0f, 84.41828f, 75.58172f, 88.0f, 80.0f, 88.0f),
                    PathNode.CurveTo(84.41828f, 88.0f, 88.0f, 84.41828f, 88.0f, 80.0f),
                    PathNode.CurveTo(88.0f, 57.90861f, 105.90861f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(150.09138f, 40.0f, 168.0f, 57.90861f, 168.0f, 80.0f),
                    PathNode.CurveTo(168.0f, 84.41828f, 171.58173f, 88.0f, 176.0f, 88.0f),
                    PathNode.CurveTo(180.41827f, 88.0f, 184.0f, 84.41828f, 184.0f, 80.0f),
                    PathNode.CurveTo(184.00089f, 77.3228f, 183.80704f, 74.64908f, 183.42f, 72.0f),
                    PathNode.LineTo(184.0f, 72.0f),
                    PathNode.CurveTo(206.09138f, 72.0f, 224.0f, 89.90861f, 224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 134.09138f, 206.09138f, 152.0f, 184.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
