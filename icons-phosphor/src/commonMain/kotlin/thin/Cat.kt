package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cat: ImageVector
    get() {
        if (_cat != null) return _cat!!
        _cat = phosphorThinIcon(
            name = "Cat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.59f, 36.94f),
                    PathNode.CurveTo(216.10838f, 35.03494f, 210.91724f, 36.07079f, 207.51f, 39.55f),
                    PathNode.LineTo(207.32f, 39.75f),
                    PathNode.LineTo(187.77f, 62.24f),
                    PathNode.CurveTo(151.62993f, 37.933933f, 104.370056f, 37.933933f, 68.23f, 62.24f),
                    PathNode.LineTo(48.68f, 39.75f),
                    PathNode.LineTo(48.49f, 39.55f),
                    PathNode.CurveTo(45.063007f, 36.119164f, 39.90794f, 35.088093f, 35.424973f, 36.93685f),
                    PathNode.CurveTo(30.942005f, 38.78561f, 28.012333f, 43.1508f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 136.0f),
                    PathNode.CurveTo(28.0f, 186.72f, 72.86f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.14f, 228.0f, 228.0f, 186.73f, 228.0f, 136.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.03836f, 43.14062f, 225.0987f, 38.752926f, 220.59f, 36.94f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 136.0f),
                    PathNode.CurveTo(220.0f, 181.09f, 180.88f, 218.0f, 132.0f, 219.91f),
                    PathNode.LineTo(132.0f, 193.66f),
                    PathNode.LineTo(146.83f, 178.83f),
                    PathNode.CurveTo(147.88283f, 177.82794f, 148.30925f, 176.33363f, 147.94382f, 174.92686f),
                    PathNode.CurveTo(147.57837f, 173.52008f, 146.47859f, 172.42224f, 145.07117f, 172.05928f),
                    PathNode.CurveTo(143.66374f, 171.69633f, 142.1702f, 172.1254f, 141.17f, 173.18f),
                    PathNode.LineTo(128.0f, 186.35f),
                    PathNode.LineTo(114.83f, 173.18f),
                    PathNode.CurveTo(113.8298f, 172.1254f, 112.33626f, 171.69633f, 110.92883f, 172.05928f),
                    PathNode.CurveTo(109.521416f, 172.42224f, 108.42163f, 173.52008f, 108.05619f, 174.92686f),
                    PathNode.CurveTo(107.69075f, 176.33363f, 108.117165f, 177.82794f, 109.17f, 178.83f),
                    PathNode.LineTo(124.0f, 193.66f),
                    PathNode.LineTo(124.0f, 219.92f),
                    PathNode.CurveTo(75.12f, 218.0f, 36.0f, 181.1f, 36.0f, 136.0f),
                    PathNode.LineTo(36.0f, 48.0f),
                    PathNode.CurveTo(35.97885f, 46.37452f, 36.960667f, 44.90378f, 38.47f, 44.3f),
                    PathNode.CurveTo(38.97931f, 44.097706f, 39.52199f, 43.99256f, 40.07f, 43.99f),
                    PathNode.CurveTo(41.07072f, 43.987766f, 42.03127f, 44.3835f, 42.74f, 45.09f),
                    PathNode.LineTo(64.58f, 70.23f),
                    PathNode.CurveTo(65.950005f, 71.80614f, 68.30196f, 72.06311f, 69.98f, 70.82f),
                    PathNode.CurveTo(76.74659f, 65.82646f, 84.15268f, 61.763535f, 92.0f, 58.74f),
                    PathNode.LineTo(92.0f, 88.0f),
                    PathNode.CurveTo(92.0f, 90.20914f, 93.79086f, 92.0f, 96.0f, 92.0f),
                    PathNode.CurveTo(98.20914f, 92.0f, 100.0f, 90.20914f, 100.0f, 88.0f),
                    PathNode.LineTo(100.0f, 56.0f),
                    PathNode.CurveTo(107.81048f, 53.71915f, 115.86997f, 52.399406f, 124.0f, 52.07f),
                    PathNode.LineTo(124.0f, 88.0f),
                    PathNode.CurveTo(124.0f, 90.20914f, 125.79086f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(130.20914f, 92.0f, 132.0f, 90.20914f, 132.0f, 88.0f),
                    PathNode.LineTo(132.0f, 52.09f),
                    PathNode.CurveTo(140.1292f, 52.4129f, 148.18869f, 53.72592f, 156.0f, 56.0f),
                    PathNode.LineTo(156.0f, 88.0f),
                    PathNode.CurveTo(156.0f, 90.20914f, 157.79086f, 92.0f, 160.0f, 92.0f),
                    PathNode.CurveTo(162.20914f, 92.0f, 164.0f, 90.20914f, 164.0f, 88.0f),
                    PathNode.LineTo(164.0f, 58.74f),
                    PathNode.CurveTo(171.84035f, 61.76515f, 179.23964f, 65.828026f, 186.0f, 70.82f),
                    PathNode.CurveTo(187.67804f, 72.06311f, 190.03f, 71.80614f, 191.4f, 70.23f),
                    PathNode.LineTo(213.24f, 45.12f),
                    PathNode.CurveTo(214.39642f, 44.017574f, 216.09795f, 43.709045f, 217.56783f, 44.33526f),
                    PathNode.CurveTo(219.03769f, 44.961475f, 219.99393f, 46.40231f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 140.0f),
                    PathNode.CurveTo(92.0f, 144.41827f, 88.41828f, 148.0f, 84.0f, 148.0f),
                    PathNode.CurveTo(79.58172f, 148.0f, 76.0f, 144.41827f, 76.0f, 140.0f),
                    PathNode.CurveTo(76.0f, 135.58173f, 79.58172f, 132.0f, 84.0f, 132.0f),
                    PathNode.CurveTo(88.41828f, 132.0f, 92.0f, 135.58173f, 92.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 140.0f),
                    PathNode.CurveTo(180.0f, 144.41827f, 176.41827f, 148.0f, 172.0f, 148.0f),
                    PathNode.CurveTo(167.58173f, 148.0f, 164.0f, 144.41827f, 164.0f, 140.0f),
                    PathNode.CurveTo(164.0f, 135.58173f, 167.58173f, 132.0f, 172.0f, 132.0f),
                    PathNode.CurveTo(176.41827f, 132.0f, 180.0f, 135.58173f, 180.0f, 140.0f),
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
        return _cat!!
    }

private var _cat: ImageVector? = null
