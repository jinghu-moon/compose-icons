package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Atom: ImageVector
    get() {
        if (_atom != null) return _atom!!
        _atom = phosphorThinIcon(
            name = "Atom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.89f, 162.47f),
                    PathNode.CurveTo(206.24638f, 150.30661f, 199.36687f, 138.75586f, 191.36f, 128.0f),
                    PathNode.CurveTo(199.36687f, 117.24414f, 206.24638f, 105.69338f, 211.89f, 93.53f),
                    PathNode.CurveTo(222.27f, 70.47f, 222.7f, 52.53f, 213.1f, 42.9f),
                    PathNode.CurveTo(203.5f, 33.27f, 185.53f, 33.73f, 162.47f, 44.11f),
                    PathNode.CurveTo(150.30661f, 49.753616f, 138.75586f, 56.633137f, 128.0f, 64.64f),
                    PathNode.CurveTo(117.24414f, 56.633137f, 105.69338f, 49.753616f, 93.53f, 44.11f),
                    PathNode.CurveTo(70.47f, 33.73f, 52.49f, 33.3f, 42.9f, 42.9f),
                    PathNode.CurveTo(33.31f, 52.5f, 33.73f, 70.47f, 44.11f, 93.53f),
                    PathNode.CurveTo(49.753616f, 105.69338f, 56.633137f, 117.24414f, 64.64f, 128.0f),
                    PathNode.CurveTo(56.633137f, 138.75586f, 49.753616f, 150.30661f, 44.11f, 162.47f),
                    PathNode.CurveTo(33.73f, 185.53f, 33.3f, 203.47f, 42.9f, 213.1f),
                    PathNode.LineTo(42.9f, 213.1f),
                    PathNode.CurveTo(47.5f, 217.7f, 54.0f, 220.0f, 62.12f, 220.0f),
                    PathNode.CurveTo(70.9f, 220.0f, 81.53f, 217.29f, 93.53f, 211.89f),
                    PathNode.CurveTo(105.69338f, 206.24638f, 117.24414f, 199.36687f, 128.0f, 191.36f),
                    PathNode.CurveTo(138.75586f, 199.36687f, 150.30661f, 206.24638f, 162.47f, 211.89f),
                    PathNode.CurveTo(174.47f, 217.29f, 185.1f, 220.0f, 193.88f, 220.0f),
                    PathNode.CurveTo(201.97f, 220.0f, 208.5f, 217.7f, 213.1f, 213.1f),
                    PathNode.LineTo(213.1f, 213.1f),
                    PathNode.CurveTo(222.7f, 203.51f, 222.27f, 185.53f, 211.89f, 162.47f),
                    PathNode.Close,
                    PathNode.MoveTo(207.45f, 48.55f),
                    PathNode.CurveTo(217.72f, 58.83f, 210.59f, 87.6f, 186.35f, 121.39f),
                    PathNode.CurveTo(178.79721f, 111.77389f, 170.66547f, 102.62694f, 162.0f, 94.0f),
                    PathNode.CurveTo(153.35898f, 85.34699f, 144.19867f, 77.22861f, 134.57f, 69.69f),
                    PathNode.CurveTo(168.4f, 45.4f, 197.17f, 38.27f, 207.45f, 48.55f),
                    PathNode.Close,
                    PathNode.MoveTo(181.45f, 128.0f),
                    PathNode.CurveTo(173.7362f, 137.98825f, 165.38551f, 147.46797f, 156.45f, 156.38f),
                    PathNode.CurveTo(147.54054f, 165.31824f, 138.06064f, 173.6691f, 128.07f, 181.38f),
                    PathNode.CurveTo(118.07937f, 173.6691f, 108.599464f, 165.31824f, 99.69f, 156.38f),
                    PathNode.CurveTo(90.75449f, 147.46797f, 82.403786f, 137.98825f, 74.69f, 128.0f),
                    PathNode.CurveTo(90.159256f, 108.036804f, 108.06873f, 90.09037f, 128.0f, 74.58f),
                    PathNode.CurveTo(137.98012f, 82.299805f, 147.45615f, 90.65019f, 156.37f, 99.58f),
                    PathNode.CurveTo(165.32057f, 108.503654f, 173.6847f, 117.996796f, 181.41f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.55f, 48.55f),
                    PathNode.CurveTo(51.6f, 45.55f, 56.26f, 44.0f, 62.19f, 44.0f),
                    PathNode.CurveTo(76.3f, 44.0f, 97.6f, 52.59f, 121.38f, 69.65f),
                    PathNode.CurveTo(102.12234f, 84.757706f, 84.75398f, 102.12942f, 69.65f, 121.39f),
                    PathNode.CurveTo(45.41f, 87.6f, 38.28f, 58.83f, 48.55f, 48.55f),
                    PathNode.Close,
                    PathNode.MoveTo(48.55f, 207.45f),
                    PathNode.CurveTo(38.28f, 197.17f, 45.41f, 168.45f, 69.65f, 134.61f),
                    PathNode.CurveTo(77.2028f, 144.2261f, 85.33453f, 153.37306f, 94.0f, 162.0f),
                    PathNode.CurveTo(102.64102f, 170.65302f, 111.80133f, 178.7714f, 121.43f, 186.31f),
                    PathNode.CurveTo(87.6f, 210.59f, 58.83f, 217.72f, 48.55f, 207.45f),
                    PathNode.Close,
                    PathNode.MoveTo(207.45f, 207.45f),
                    PathNode.CurveTo(197.17f, 217.72f, 168.45f, 210.59f, 134.61f, 186.35f),
                    PathNode.CurveTo(144.2261f, 178.79721f, 153.37306f, 170.66547f, 162.0f, 162.0f),
                    PathNode.CurveTo(170.65302f, 153.35898f, 178.7714f, 144.19867f, 186.31f, 134.57f),
                    PathNode.CurveTo(210.59f, 168.4f, 217.72f, 197.17f, 207.45f, 207.45f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 132.41827f, 132.41827f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 132.41827f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 123.58172f, 123.58172f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(132.41827f, 120.0f, 136.0f, 123.58172f, 136.0f, 128.0f),
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
        return _atom!!
    }

private var _atom: ImageVector? = null
