package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorThinIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 140.0f),
                    PathNode.CurveTo(213.79086f, 140.0f, 212.0f, 141.79086f, 212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 172.94f, 193.0f, 178.13f, 170.95f, 184.14f),
                    PathNode.CurveTo(156.66f, 188.04f, 141.13f, 192.28f, 132.0f, 204.38f),
                    PathNode.LineTo(132.0f, 124.0f),
                    PathNode.LineTo(168.0f, 124.0f),
                    PathNode.CurveTo(170.20914f, 124.0f, 172.0f, 122.20914f, 172.0f, 120.0f),
                    PathNode.CurveTo(172.0f, 117.79086f, 170.20914f, 116.0f, 168.0f, 116.0f),
                    PathNode.LineTo(132.0f, 116.0f),
                    PathNode.LineTo(132.0f, 83.71f),
                    PathNode.CurveTo(146.53531f, 81.61201f, 156.97981f, 68.64027f, 155.92812f, 53.99204f),
                    PathNode.CurveTo(154.87642f, 39.34381f, 142.68594f, 27.997187f, 128.0f, 27.997187f),
                    PathNode.CurveTo(113.314064f, 27.997187f, 101.12358f, 39.34381f, 100.07189f, 53.99204f),
                    PathNode.CurveTo(99.020195f, 68.64027f, 109.46469f, 81.61201f, 124.0f, 83.71f),
                    PathNode.LineTo(124.0f, 116.0f),
                    PathNode.LineTo(88.0f, 116.0f),
                    PathNode.CurveTo(85.79086f, 116.0f, 84.0f, 117.79086f, 84.0f, 120.0f),
                    PathNode.CurveTo(84.0f, 122.20914f, 85.79086f, 124.0f, 88.0f, 124.0f),
                    PathNode.LineTo(124.0f, 124.0f),
                    PathNode.LineTo(124.0f, 204.38f),
                    PathNode.CurveTo(114.87f, 192.28f, 99.34f, 188.04f, 85.05f, 184.14f),
                    PathNode.CurveTo(63.05f, 178.14f, 44.05f, 172.94f, 44.05f, 144.0f),
                    PathNode.CurveTo(44.05f, 141.79086f, 42.25914f, 140.0f, 40.05f, 140.0f),
                    PathNode.CurveTo(37.840862f, 140.0f, 36.05f, 141.79086f, 36.05f, 144.0f),
                    PathNode.CurveTo(36.05f, 179.06f, 60.99f, 185.86f, 83.05f, 191.86f),
                    PathNode.CurveTo(105.11f, 197.86f, 124.0f, 203.06f, 124.0f, 232.0f),
                    PathNode.CurveTo(124.0f, 234.20914f, 125.79086f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(130.20914f, 236.0f, 132.0f, 234.20914f, 132.0f, 232.0f),
                    PathNode.CurveTo(132.0f, 203.06f, 151.0f, 197.87f, 173.05f, 191.86f),
                    PathNode.CurveTo(195.1f, 185.85f, 220.0f, 179.06f, 220.0f, 144.0f),
                    PathNode.CurveTo(220.0f, 141.79086f, 218.20914f, 140.0f, 216.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 56.0f),
                    PathNode.CurveTo(108.0f, 44.954304f, 116.95431f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(139.0457f, 36.0f, 148.0f, 44.954304f, 148.0f, 56.0f),
                    PathNode.CurveTo(148.0f, 67.04569f, 139.0457f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(116.95431f, 76.0f, 108.0f, 67.04569f, 108.0f, 56.0f),
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
        return _anchor!!
    }

private var _anchor: ImageVector? = null
