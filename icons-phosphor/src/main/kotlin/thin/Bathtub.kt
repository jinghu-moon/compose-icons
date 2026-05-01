package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bathtub: ImageVector
    get() {
        if (_bathtub != null) return _bathtub!!
        _bathtub = phosphorThinIcon(
            name = "Bathtub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 100.0f),
                    PathNode.LineTo(204.0f, 100.0f),
                    PathNode.LineTo(204.0f, 96.0f),
                    PathNode.CurveTo(204.0f, 93.79086f, 202.20914f, 92.0f, 200.0f, 92.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.CurveTo(133.79086f, 92.0f, 132.0f, 93.79086f, 132.0f, 96.0f),
                    PathNode.LineTo(132.0f, 100.0f),
                    PathNode.LineTo(60.0f, 100.0f),
                    PathNode.LineTo(60.0f, 52.0f),
                    PathNode.CurveTo(60.0f, 43.163445f, 67.163445f, 36.0f, 76.0f, 36.0f),
                    PathNode.CurveTo(83.68861f, 35.996197f, 90.359505f, 41.306362f, 92.08f, 48.8f),
                    PathNode.CurveTo(92.52183f, 50.964954f, 94.63504f, 52.361828f, 96.8f, 51.92f),
                    PathNode.CurveTo(98.96496f, 51.478172f, 100.36183f, 49.364956f, 99.92f, 47.2f),
                    PathNode.CurveTo(97.49641f, 35.94494f, 87.51284f, 27.931376f, 76.0f, 28.0f),
                    PathNode.CurveTo(62.745167f, 28.0f, 52.0f, 38.745167f, 52.0f, 52.0f),
                    PathNode.LineTo(52.0f, 100.0f),
                    PathNode.LineTo(16.0f, 100.0f),
                    PathNode.CurveTo(13.790861f, 100.0f, 12.0f, 101.79086f, 12.0f, 104.0f),
                    PathNode.LineTo(12.0f, 144.0f),
                    PathNode.CurveTo(12.033064f, 172.7051f, 35.2949f, 195.96693f, 64.0f, 196.0f),
                    PathNode.LineTo(68.0f, 196.0f),
                    PathNode.LineTo(68.0f, 216.0f),
                    PathNode.CurveTo(68.0f, 218.20914f, 69.79086f, 220.0f, 72.0f, 220.0f),
                    PathNode.CurveTo(74.20914f, 220.0f, 76.0f, 218.20914f, 76.0f, 216.0f),
                    PathNode.LineTo(76.0f, 196.0f),
                    PathNode.LineTo(180.0f, 196.0f),
                    PathNode.LineTo(180.0f, 216.0f),
                    PathNode.CurveTo(180.0f, 218.20914f, 181.79086f, 220.0f, 184.0f, 220.0f),
                    PathNode.CurveTo(186.20914f, 220.0f, 188.0f, 218.20914f, 188.0f, 216.0f),
                    PathNode.LineTo(188.0f, 196.0f),
                    PathNode.LineTo(192.0f, 196.0f),
                    PathNode.CurveTo(220.7051f, 195.96693f, 243.96693f, 172.7051f, 244.0f, 144.0f),
                    PathNode.LineTo(244.0f, 104.0f),
                    PathNode.CurveTo(244.0f, 101.79086f, 242.20914f, 100.0f, 240.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 100.0f),
                    PathNode.LineTo(196.0f, 100.0f),
                    PathNode.LineTo(196.0f, 140.0f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 144.0f),
                    PathNode.CurveTo(235.97244f, 168.28911f, 216.28911f, 187.97244f, 192.0f, 188.0f),
                    PathNode.LineTo(64.0f, 188.0f),
                    PathNode.CurveTo(39.71089f, 187.97244f, 20.027554f, 168.28911f, 20.0f, 144.0f),
                    PathNode.LineTo(20.0f, 108.0f),
                    PathNode.LineTo(132.0f, 108.0f),
                    PathNode.LineTo(132.0f, 144.0f),
                    PathNode.CurveTo(132.0f, 146.20914f, 133.79086f, 148.0f, 136.0f, 148.0f),
                    PathNode.LineTo(200.0f, 148.0f),
                    PathNode.CurveTo(202.20914f, 148.0f, 204.0f, 146.20914f, 204.0f, 144.0f),
                    PathNode.LineTo(204.0f, 108.0f),
                    PathNode.LineTo(236.0f, 108.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
