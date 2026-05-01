package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorDuotoneIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 127.15f),
                    PathNode.CurveTo(248.2274f, 144.27065f, 241.58508f, 160.76852f, 229.55803f, 172.95532f),
                    PathNode.CurveTo(217.53096f, 185.14214f, 201.12216f, 192.00151f, 184.0f, 192.0f),
                    PathNode.CurveTo(168.52f, 192.0f, 154.32f, 182.65f, 143.25f, 173.5f),
                    PathNode.CurveTo(134.42406f, 166.18686f, 121.64992f, 166.16588f, 112.8f, 173.45f),
                    PathNode.CurveTo(100.99f, 183.24f, 85.61f, 192.71f, 68.91f, 191.93f),
                    PathNode.CurveTo(34.165325f, 190.3045f, 7.079638f, 161.22707f, 7.919528f, 126.45453f),
                    PathNode.CurveTo(8.759418f, 91.68199f, 37.217365f, 63.94612f, 72.0f, 64.0f),
                    PathNode.LineTo(183.05f, 64.0f),
                    PathNode.CurveTo(218.22f, 64.0f, 247.54f, 92.0f, 248.0f, 127.15f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(183.05f, 56.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.CurveTo(52.31435f, 55.999912f, 33.487137f, 64.06011f, 19.899885f, 78.30481f),
                    PathNode.CurveTo(6.312634f, 92.549515f, -0.8496f, 111.73631f, 0.08f, 131.4f),
                    PathNode.CurveTo(1.77f, 168.09f, 31.84f, 198.19f, 68.53f, 199.92f),
                    PathNode.CurveTo(84.38f, 200.66f, 100.53f, 194.02f, 117.91f, 179.62f),
                    PathNode.CurveTo(123.78271f, 174.76353f, 132.2773f, 174.76353f, 138.15f, 179.62f),
                    PathNode.CurveTo(148.72f, 188.39f, 165.0f, 200.0f, 184.0f, 200.0f),
                    PathNode.CurveTo(203.26134f, 200.00168f, 221.72026f, 192.28572f, 235.25053f, 178.57693f),
                    PathNode.CurveTo(248.7808f, 164.86813f, 256.25415f, 146.30965f, 256.0f, 127.05f),
                    PathNode.CurveTo(255.49f, 87.87f, 222.76f, 56.0f, 183.05f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(223.86f, 167.34f),
                    PathNode.CurveTo(213.36026f, 178.03636f, 198.9885f, 184.04323f, 184.0f, 184.0f),
                    PathNode.CurveTo(170.12f, 184.0f, 157.0f, 174.49f, 148.35f, 167.33f),
                    PathNode.CurveTo(136.55289f, 157.58286f, 119.49711f, 157.58286f, 107.7f, 167.33f),
                    PathNode.CurveTo(93.52f, 179.0f, 81.0f, 184.49f, 69.28f, 183.94f),
                    PathNode.CurveTo(40.53679f, 182.37697f, 17.590633f, 159.40495f, 16.06f, 130.66f),
                    PathNode.CurveTo(15.332572f, 115.36301f, 20.90154f, 100.43548f, 31.470375f, 89.35275f),
                    PathNode.CurveTo(42.03921f, 78.27002f, 56.68572f, 71.99912f, 72.0f, 72.0f),
                    PathNode.LineTo(183.05f, 72.0f),
                    PathNode.CurveTo(214.05f, 72.0f, 239.6f, 96.79f, 240.0f, 127.25f),
                    PathNode.CurveTo(240.23932f, 142.24176f, 234.42014f, 156.69603f, 223.86f, 167.34f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 96.0f),
                    PathNode.CurveTo(184.0f, 100.41828f, 180.41827f, 104.0f, 176.0f, 104.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.CurveTo(75.58172f, 104.0f, 72.0f, 100.41828f, 72.0f, 96.0f),
                    PathNode.CurveTo(72.0f, 91.58172f, 75.58172f, 88.0f, 80.0f, 88.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.CurveTo(180.41827f, 88.0f, 184.0f, 91.58172f, 184.0f, 96.0f),
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
        return _visor!!
    }

private var _visor: ImageVector? = null
