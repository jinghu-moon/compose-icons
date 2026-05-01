package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Circuitry: ImageVector
    get() {
        if (_circuitry != null) return _circuitry!!
        _circuitry = phosphorFillIcon(
            name = "Circuitry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 111.31f),
                    PathNode.LineTo(136.0f, 159.31f),
                    PathNode.LineTo(136.0f, 220.0f),
                    PathNode.CurveTo(136.0f, 222.20914f, 134.20914f, 224.0f, 132.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(68.0f, 32.0f),
                    PathNode.CurveTo(70.20914f, 32.0f, 72.0f, 33.79086f, 72.0f, 36.0f),
                    PathNode.LineTo(72.0f, 153.38f),
                    PathNode.CurveTo(60.979626f, 157.27629f, 54.369022f, 168.54533f, 56.345634f, 180.06586f),
                    PathNode.CurveTo(58.322247f, 191.5864f, 68.31113f, 200.0074f, 80.0f, 200.0074f),
                    PathNode.CurveTo(91.68887f, 200.0074f, 101.67776f, 191.5864f, 103.654366f, 180.06586f),
                    PathNode.CurveTo(105.630974f, 168.54533f, 99.02037f, 157.27629f, 88.0f, 153.38f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 184.0f),
                    PathNode.CurveTo(84.41828f, 184.0f, 88.0f, 180.41827f, 88.0f, 176.0f),
                    PathNode.CurveTo(88.0f, 171.58173f, 84.41828f, 168.0f, 80.0f, 168.0f),
                    PathNode.CurveTo(75.58172f, 168.0f, 72.0f, 171.58173f, 72.0f, 176.0f),
                    PathNode.CurveTo(72.0f, 180.41827f, 75.58172f, 184.0f, 80.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 99.58172f, 180.41827f, 96.0f, 176.0f, 96.0f),
                    PathNode.CurveTo(171.58173f, 96.0f, 168.0f, 99.58172f, 168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 108.41828f, 171.58173f, 112.0f, 176.0f, 112.0f),
                    PathNode.CurveTo(180.41827f, 112.0f, 184.0f, 108.41828f, 184.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(156.0f, 32.0f),
                    PathNode.CurveTo(153.79086f, 32.0f, 152.0f, 33.79086f, 152.0f, 36.0f),
                    PathNode.LineTo(152.0f, 68.69f),
                    PathNode.LineTo(165.66f, 82.35f),
                    PathNode.CurveTo(176.20757f, 77.311066f, 188.85133f, 80.60415f, 195.60077f, 90.14812f),
                    PathNode.CurveTo(202.3502f, 99.69208f, 201.24187f, 112.71056f, 192.97621f, 120.97622f),
                    PathNode.CurveTo(184.71057f, 129.24187f, 171.69208f, 130.3502f, 162.14812f, 123.60077f),
                    PathNode.CurveTo(152.60416f, 116.85134f, 149.31107f, 104.207565f, 154.35f, 93.66f),
                    PathNode.LineTo(138.35f, 77.66f),
                    PathNode.CurveTo(136.84642f, 76.160065f, 136.00098f, 74.12381f, 136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 36.0f),
                    PathNode.CurveTo(136.0f, 33.79086f, 134.20914f, 32.0f, 132.0f, 32.0f),
                    PathNode.LineTo(92.0f, 32.0f),
                    PathNode.CurveTo(89.79086f, 32.0f, 88.0f, 33.79086f, 88.0f, 36.0f),
                    PathNode.LineTo(88.0f, 88.69f),
                    PathNode.LineTo(149.66f, 150.34f),
                    PathNode.CurveTo(151.15993f, 151.84158f, 152.00166f, 153.87762f, 152.0f, 156.0f),
                    PathNode.LineTo(152.0f, 220.0f),
                    PathNode.CurveTo(152.0f, 222.20914f, 153.79086f, 224.0f, 156.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
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
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
