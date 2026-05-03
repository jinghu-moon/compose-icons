package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorFillIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.32f, 96.0f),
                    PathNode.LineTo(96.0f, 235.31f),
                    PathNode.CurveTo(92.99931f, 238.31137f, 88.92911f, 239.99759f, 84.685f, 239.99759f),
                    PathNode.CurveTo(80.4409f, 239.99759f, 76.37069f, 238.31137f, 73.37f, 235.31f),
                    PathNode.LineTo(20.68f, 182.63f),
                    PathNode.CurveTo(17.678629f, 179.62932f, 15.992416f, 175.5591f, 15.992416f, 171.315f),
                    PathNode.CurveTo(15.992416f, 167.0709f, 17.678629f, 163.00069f, 20.68f, 160.0f),
                    PathNode.LineTo(49.85f, 130.83f),
                    PathNode.CurveTo(50.600273f, 130.07889f, 51.618362f, 129.65686f, 52.68f, 129.65686f),
                    PathNode.CurveTo(53.74164f, 129.65686f, 54.759727f, 130.07889f, 55.51f, 130.83f),
                    PathNode.LineTo(90.34f, 165.66f),
                    PathNode.CurveTo(91.912254f, 167.23128f, 94.06736f, 168.07756f, 96.28867f, 167.99602f),
                    PathNode.CurveTo(98.50999f, 167.91444f, 100.59723f, 166.91237f, 102.05f, 165.23f),
                    PathNode.CurveTo(104.77471f, 161.94319f, 104.51343f, 157.11366f, 101.45f, 154.14f),
                    PathNode.LineTo(66.82f, 119.51f),
                    PathNode.CurveTo(65.26247f, 117.94869f, 65.26247f, 115.42131f, 66.82f, 113.86f),
                    PathNode.LineTo(81.82f, 98.86f),
                    PathNode.CurveTo(82.570274f, 98.108894f, 83.58836f, 97.68685f, 84.65f, 97.68685f),
                    PathNode.CurveTo(85.71164f, 97.68685f, 86.72973f, 98.108894f, 87.48f, 98.86f),
                    PathNode.LineTo(122.31f, 133.69f),
                    PathNode.CurveTo(123.88225f, 135.26128f, 126.03736f, 136.10757f, 128.25868f, 136.02602f),
                    PathNode.CurveTo(130.48f, 135.94444f, 132.56723f, 134.94237f, 134.02f, 133.26f),
                    PathNode.CurveTo(136.7447f, 129.97319f, 136.48341f, 125.14366f, 133.42f, 122.17f),
                    PathNode.LineTo(98.83f, 87.51f),
                    PathNode.CurveTo(97.27247f, 85.94869f, 97.27247f, 83.42131f, 98.83f, 81.86f),
                    PathNode.LineTo(113.83f, 66.86f),
                    PathNode.CurveTo(115.39131f, 65.30247f, 117.91869f, 65.30247f, 119.48f, 66.86f),
                    PathNode.LineTo(154.31f, 101.69f),
                    PathNode.CurveTo(155.88258f, 103.26458f, 158.03992f, 104.11298f, 160.2638f, 104.03139f),
                    PathNode.CurveTo(162.48764f, 103.9498f, 164.57706f, 102.94558f, 166.03f, 101.26f),
                    PathNode.CurveTo(168.75209f, 97.97064f, 168.48643f, 93.14096f, 165.42f, 90.17f),
                    PathNode.LineTo(130.83f, 55.51f),
                    PathNode.CurveTo(129.27246f, 53.94869f, 129.27246f, 51.42131f, 130.83f, 49.86f),
                    PathNode.LineTo(160.0f, 20.69f),
                    PathNode.CurveTo(163.00069f, 17.688627f, 167.0709f, 16.002417f, 171.315f, 16.002417f),
                    PathNode.CurveTo(175.5591f, 16.002417f, 179.62932f, 17.688627f, 182.63f, 20.69f),
                    PathNode.LineTo(235.32f, 73.37f),
                    PathNode.CurveTo(238.32137f, 76.37069f, 240.00758f, 80.4409f, 240.00758f, 84.685f),
                    PathNode.CurveTo(240.00758f, 88.92911f, 238.32137f, 92.99931f, 235.32f, 96.0f),
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null
