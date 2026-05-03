package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = phosphorThinIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 104.0f),
                    PathNode.CurveTo(100.0f, 101.79086f, 101.79086f, 100.0f, 104.0f, 100.0f),
                    PathNode.LineTo(168.0f, 100.0f),
                    PathNode.CurveTo(170.20914f, 100.0f, 172.0f, 101.79086f, 172.0f, 104.0f),
                    PathNode.CurveTo(172.0f, 106.20914f, 170.20914f, 108.0f, 168.0f, 108.0f),
                    PathNode.LineTo(104.0f, 108.0f),
                    PathNode.CurveTo(101.79086f, 108.0f, 100.0f, 106.20914f, 100.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 140.0f),
                    PathNode.LineTo(168.0f, 140.0f),
                    PathNode.CurveTo(170.20914f, 140.0f, 172.0f, 138.20914f, 172.0f, 136.0f),
                    PathNode.CurveTo(172.0f, 133.79086f, 170.20914f, 132.0f, 168.0f, 132.0f),
                    PathNode.LineTo(104.0f, 132.0f),
                    PathNode.CurveTo(101.79086f, 132.0f, 100.0f, 133.79086f, 100.0f, 136.0f),
                    PathNode.CurveTo(100.0f, 138.20914f, 101.79086f, 140.0f, 104.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 207.46397f, 215.46397f, 220.0f, 200.0f, 220.0f),
                    PathNode.LineTo(88.0f, 220.0f),
                    PathNode.CurveTo(72.536026f, 220.0f, 60.0f, 207.46397f, 60.0f, 192.0f),
                    PathNode.LineTo(60.0f, 64.0f),
                    PathNode.CurveTo(60.0f, 52.954304f, 51.045696f, 44.0f, 40.0f, 44.0f),
                    PathNode.CurveTo(28.954306f, 44.0f, 20.0f, 52.954304f, 20.0f, 64.0f),
                    PathNode.CurveTo(20.0f, 71.78f, 26.34f, 76.75f, 26.4f, 76.8f),
                    PathNode.CurveTo(28.16731f, 78.12548f, 28.525484f, 80.63269f, 27.2f, 82.4f),
                    PathNode.CurveTo(25.874517f, 84.16731f, 23.367311f, 84.52548f, 21.6f, 83.2f),
                    PathNode.CurveTo(21.21f, 82.91f, 12.0f, 75.86f, 12.0f, 64.0f),
                    PathNode.CurveTo(12.0f, 48.53603f, 24.536028f, 36.0f, 40.0f, 36.0f),
                    PathNode.LineTo(176.0f, 36.0f),
                    PathNode.CurveTo(191.46397f, 36.0f, 204.0f, 48.53603f, 204.0f, 64.0f),
                    PathNode.LineTo(204.0f, 172.0f),
                    PathNode.LineTo(216.0f, 172.0f),
                    PathNode.CurveTo(216.86548f, 172.0f, 217.70761f, 172.28072f, 218.4f, 172.8f),
                    PathNode.CurveTo(218.79f, 173.09f, 228.0f, 180.14f, 228.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 192.0f),
                    PathNode.CurveTo(108.0f, 184.22f, 101.66f, 179.25f, 101.6f, 179.2f),
                    PathNode.CurveTo(100.222626f, 178.16696f, 99.66081f, 176.36845f, 100.20527f, 174.73509f),
                    PathNode.CurveTo(100.749725f, 173.10172f, 102.27828f, 172.0f, 104.0f, 172.0f),
                    PathNode.LineTo(196.0f, 172.0f),
                    PathNode.LineTo(196.0f, 64.0f),
                    PathNode.CurveTo(196.0f, 52.954304f, 187.0457f, 44.0f, 176.0f, 44.0f),
                    PathNode.LineTo(59.57f, 44.0f),
                    PathNode.CurveTo(64.96418f, 49.25564f, 68.004524f, 56.4688f, 68.0f, 64.0f),
                    PathNode.LineTo(68.0f, 192.0f),
                    PathNode.CurveTo(68.0f, 203.0457f, 76.95431f, 212.0f, 88.0f, 212.0f),
                    PathNode.CurveTo(99.04569f, 212.0f, 108.0f, 203.0457f, 108.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 186.0f, 216.26f, 181.7f, 214.5f, 180.0f),
                    PathNode.LineTo(112.61f, 180.0f),
                    PathNode.CurveTo(114.808784f, 183.61792f, 115.98072f, 187.76637f, 116.0f, 192.0f),
                    PathNode.CurveTo(116.00261f, 199.52881f, 112.96667f, 206.74007f, 107.58f, 212.0f),
                    PathNode.LineTo(200.0f, 212.0f),
                    PathNode.CurveTo(211.0457f, 212.0f, 220.0f, 203.0457f, 220.0f, 192.0f),
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
        return _scroll!!
    }

private var _scroll: ImageVector? = null
