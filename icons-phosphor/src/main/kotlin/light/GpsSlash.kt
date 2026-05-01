package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorLightIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 128.0f),
                    PathNode.CurveTo(246.0f, 131.3137f, 243.3137f, 134.0f, 240.0f, 134.0f),
                    PathNode.LineTo(213.79f, 134.0f),
                    PathNode.CurveTo(213.10883f, 144.08942f, 210.63693f, 153.97702f, 206.49f, 163.2f),
                    PathNode.CurveTo(205.52348f, 165.36067f, 203.377f, 166.75119f, 201.01f, 166.75f),
                    PathNode.CurveTo(200.16483f, 166.75055f, 199.32938f, 166.56982f, 198.56f, 166.22f),
                    PathNode.CurveTo(195.54385f, 164.85666f, 194.20148f, 161.30832f, 195.56f, 158.29f),
                    PathNode.CurveTo(207.57605f, 131.43156f, 202.55028f, 100.00706f, 182.7568f, 78.23598f),
                    PathNode.CurveTo(162.96333f, 56.464897f, 132.15796f, 48.478264f, 104.28f, 57.89f),
                    PathNode.CurveTo(101.14026f, 58.95039f, 97.73539f, 57.26474f, 96.675f, 54.125f),
                    PathNode.CurveTo(95.61462f, 50.98526f, 97.30026f, 47.580387f, 100.44f, 46.52f),
                    PathNode.CurveTo(107.41208f, 44.166344f, 114.65844f, 42.721107f, 122.0f, 42.22f),
                    PathNode.LineTo(122.0f, 16.0f),
                    PathNode.CurveTo(122.0f, 12.686292f, 124.686295f, 10.0f, 128.0f, 10.0f),
                    PathNode.CurveTo(131.3137f, 10.0f, 134.0f, 12.686292f, 134.0f, 16.0f),
                    PathNode.LineTo(134.0f, 42.23f),
                    PathNode.CurveTo(176.72878f, 45.279884f, 210.72012f, 79.27123f, 213.77f, 122.0f),
                    PathNode.LineTo(240.0f, 122.0f),
                    PathNode.CurveTo(243.3137f, 122.0f, 246.0f, 124.686295f, 246.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.44f, 212.0f),
                    PathNode.CurveTo(214.67123f, 214.45215f, 214.49214f, 218.24876f, 212.04f, 220.48f),
                    PathNode.CurveTo(209.58786f, 222.71123f, 205.79123f, 222.53215f, 203.56f, 220.08f),
                    PathNode.LineTo(181.26f, 195.54f),
                    PathNode.CurveTo(167.70247f, 206.23817f, 151.22993f, 212.59225f, 134.0f, 213.77f),
                    PathNode.LineTo(134.0f, 240.0f),
                    PathNode.CurveTo(134.0f, 243.3137f, 131.3137f, 246.0f, 128.0f, 246.0f),
                    PathNode.CurveTo(124.686295f, 246.0f, 122.0f, 243.3137f, 122.0f, 240.0f),
                    PathNode.LineTo(122.0f, 213.77f),
                    PathNode.CurveTo(79.27123f, 210.72012f, 45.279884f, 176.72878f, 42.23f, 134.0f),
                    PathNode.LineTo(16.0f, 134.0f),
                    PathNode.CurveTo(12.686292f, 134.0f, 10.0f, 131.3137f, 10.0f, 128.0f),
                    PathNode.CurveTo(10.0f, 124.686295f, 12.686292f, 122.0f, 16.0f, 122.0f),
                    PathNode.LineTo(42.22f, 122.0f),
                    PathNode.CurveTo(43.640114f, 101.9782f, 52.00045f, 83.079025f, 65.86f, 68.56f),
                    PathNode.LineTo(43.56f, 44.0f),
                    PathNode.CurveTo(41.69497f, 41.515873f, 42.03432f, 38.019005f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(46.65007f, 33.860672f, 50.163273f, 33.886772f, 52.44f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.17f, 186.6f),
                    PathNode.LineTo(74.0f, 77.48f),
                    PathNode.CurveTo(47.908894f, 105.65647f, 47.706295f, 149.10904f, 73.53352f, 177.52759f),
                    PathNode.CurveTo(99.36075f, 205.94614f, 142.63477f, 209.88646f, 173.17f, 186.6f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gpsSlash!!
    }

private var _gpsSlash: ImageVector? = null
