package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = phosphorFillIcon(
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
                    PathNode.MoveTo(152.24f, 142.06f),
                    PathNode.LineTo(160.24f, 110.06f),
                    PathNode.CurveTo(161.37103f, 105.84426f, 165.67253f, 103.313255f, 169.90703f, 104.37188f),
                    PathNode.CurveTo(174.14153f, 105.430504f, 176.7459f, 109.68798f, 175.76f, 113.94f),
                    PathNode.LineTo(167.76f, 145.94f),
                    PathNode.CurveTo(166.86987f, 149.50104f, 163.6706f, 151.99945f, 160.0f, 152.0f),
                    PathNode.CurveTo(159.34268f, 151.99913f, 158.6879f, 151.91853f, 158.05f, 151.76f),
                    PathNode.CurveTo(153.76874f, 150.6835f, 151.16866f, 146.34254f, 152.24f, 142.06f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 112.0f),
                    PathNode.CurveTo(120.0f, 107.58172f, 123.58172f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(132.41827f, 104.0f, 136.0f, 107.58172f, 136.0f, 112.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.CurveTo(136.0f, 148.41827f, 132.41827f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(123.58172f, 152.0f, 120.0f, 148.41827f, 120.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.06f, 104.24f),
                    PathNode.CurveTo(90.34563f, 103.169266f, 94.688f, 105.77469f, 95.76f, 110.06f),
                    PathNode.LineTo(103.76f, 142.06f),
                    PathNode.CurveTo(104.830734f, 146.34563f, 102.22531f, 150.688f, 97.94f, 151.76f),
                    PathNode.CurveTo(97.28586f, 151.92259f, 96.61404f, 152.00322f, 95.94f, 152.0f),
                    PathNode.CurveTo(92.27313f, 151.99486f, 89.079216f, 149.49742f, 88.19f, 145.94f),
                    PathNode.LineTo(80.19f, 113.94f),
                    PathNode.CurveTo(79.67737f, 111.87502f, 80.00843f, 109.6909f, 81.10999f, 107.870605f),
                    PathNode.CurveTo(82.211555f, 106.05031f, 83.99285f, 104.743805f, 86.06f, 104.24f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 208.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.LineTo(64.0f, 167.42f),
                    PathNode.CurveTo(66.649185f, 167.80606f, 69.32283f, 167.99991f, 72.0f, 168.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.CurveTo(186.67717f, 167.99991f, 189.35081f, 167.80606f, 192.0f, 167.42f),
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
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
