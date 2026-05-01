package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorThinIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 164.0f),
                    PathNode.LineTo(188.0f, 164.0f),
                    PathNode.LineTo(188.0f, 92.0f),
                    PathNode.LineTo(248.0f, 92.0f),
                    PathNode.CurveTo(250.20914f, 92.0f, 252.0f, 90.20914f, 252.0f, 88.0f),
                    PathNode.CurveTo(252.0f, 85.79086f, 250.20914f, 84.0f, 248.0f, 84.0f),
                    PathNode.LineTo(187.3f, 84.0f),
                    PathNode.CurveTo(185.60657f, 79.21018f, 181.08037f, 76.005806f, 176.0f, 76.0f),
                    PathNode.LineTo(112.0f, 76.0f),
                    PathNode.CurveTo(106.91964f, 76.005806f, 102.393456f, 79.21018f, 100.7f, 84.0f),
                    PathNode.LineTo(60.0f, 84.0f),
                    PathNode.LineTo(60.0f, 80.0f),
                    PathNode.CurveTo(60.0f, 77.79086f, 58.20914f, 76.0f, 56.0f, 76.0f),
                    PathNode.CurveTo(53.79086f, 76.0f, 52.0f, 77.79086f, 52.0f, 80.0f),
                    PathNode.LineTo(52.0f, 84.0f),
                    PathNode.LineTo(8.0f, 84.0f),
                    PathNode.CurveTo(5.790861f, 84.0f, 4.0f, 85.79086f, 4.0f, 88.0f),
                    PathNode.CurveTo(4.0f, 90.20914f, 5.790861f, 92.0f, 8.0f, 92.0f),
                    PathNode.LineTo(52.0f, 92.0f),
                    PathNode.LineTo(52.0f, 164.0f),
                    PathNode.LineTo(8.0f, 164.0f),
                    PathNode.CurveTo(5.790861f, 164.0f, 4.0f, 165.79086f, 4.0f, 168.0f),
                    PathNode.CurveTo(4.0f, 170.20914f, 5.790861f, 172.0f, 8.0f, 172.0f),
                    PathNode.LineTo(52.0f, 172.0f),
                    PathNode.LineTo(52.0f, 176.0f),
                    PathNode.CurveTo(52.0f, 178.20914f, 53.79086f, 180.0f, 56.0f, 180.0f),
                    PathNode.CurveTo(58.20914f, 180.0f, 60.0f, 178.20914f, 60.0f, 176.0f),
                    PathNode.LineTo(60.0f, 172.0f),
                    PathNode.LineTo(100.7f, 172.0f),
                    PathNode.CurveTo(102.393456f, 176.78981f, 106.91964f, 179.9942f, 112.0f, 180.0f),
                    PathNode.LineTo(176.0f, 180.0f),
                    PathNode.CurveTo(181.08037f, 179.9942f, 185.60657f, 176.78981f, 187.3f, 172.0f),
                    PathNode.LineTo(248.0f, 172.0f),
                    PathNode.CurveTo(250.20914f, 172.0f, 252.0f, 170.20914f, 252.0f, 168.0f),
                    PathNode.CurveTo(252.0f, 165.79086f, 250.20914f, 164.0f, 248.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 92.0f),
                    PathNode.LineTo(100.0f, 92.0f),
                    PathNode.LineTo(100.0f, 164.0f),
                    PathNode.LineTo(60.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 172.0f),
                    PathNode.LineTo(112.0f, 172.0f),
                    PathNode.CurveTo(109.79086f, 172.0f, 108.0f, 170.20914f, 108.0f, 168.0f),
                    PathNode.LineTo(108.0f, 88.0f),
                    PathNode.CurveTo(108.0f, 85.79086f, 109.79086f, 84.0f, 112.0f, 84.0f),
                    PathNode.LineTo(176.0f, 84.0f),
                    PathNode.CurveTo(178.20914f, 84.0f, 180.0f, 85.79086f, 180.0f, 88.0f),
                    PathNode.LineTo(180.0f, 124.0f),
                    PathNode.LineTo(144.0f, 124.0f),
                    PathNode.CurveTo(141.79086f, 124.0f, 140.0f, 125.79086f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 130.20914f, 141.79086f, 132.0f, 144.0f, 132.0f),
                    PathNode.LineTo(180.0f, 132.0f),
                    PathNode.LineTo(180.0f, 168.0f),
                    PathNode.CurveTo(180.0f, 170.20914f, 178.20914f, 172.0f, 176.0f, 172.0f),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
