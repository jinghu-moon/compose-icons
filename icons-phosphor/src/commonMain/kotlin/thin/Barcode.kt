package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Barcode: ImageVector
    get() {
        if (_barcode != null) return _barcode!!
        _barcode = phosphorThinIcon(
            name = "Barcode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 48.0f),
                    PathNode.LineTo(228.0f, 88.0f),
                    PathNode.CurveTo(228.0f, 90.20914f, 226.20914f, 92.0f, 224.0f, 92.0f),
                    PathNode.CurveTo(221.79086f, 92.0f, 220.0f, 90.20914f, 220.0f, 88.0f),
                    PathNode.LineTo(220.0f, 52.0f),
                    PathNode.LineTo(184.0f, 52.0f),
                    PathNode.CurveTo(181.79086f, 52.0f, 180.0f, 50.20914f, 180.0f, 48.0f),
                    PathNode.CurveTo(180.0f, 45.79086f, 181.79086f, 44.0f, 184.0f, 44.0f),
                    PathNode.LineTo(224.0f, 44.0f),
                    PathNode.CurveTo(226.20914f, 44.0f, 228.0f, 45.79086f, 228.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 204.0f),
                    PathNode.LineTo(36.0f, 204.0f),
                    PathNode.LineTo(36.0f, 168.0f),
                    PathNode.CurveTo(36.0f, 165.79086f, 34.20914f, 164.0f, 32.0f, 164.0f),
                    PathNode.CurveTo(29.790861f, 164.0f, 28.0f, 165.79086f, 28.0f, 168.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 210.20914f, 29.790861f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(72.0f, 212.0f),
                    PathNode.CurveTo(74.20914f, 212.0f, 76.0f, 210.20914f, 76.0f, 208.0f),
                    PathNode.CurveTo(76.0f, 205.79086f, 74.20914f, 204.0f, 72.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 164.0f),
                    PathNode.CurveTo(221.79086f, 164.0f, 220.0f, 165.79086f, 220.0f, 168.0f),
                    PathNode.LineTo(220.0f, 204.0f),
                    PathNode.LineTo(184.0f, 204.0f),
                    PathNode.CurveTo(181.79086f, 204.0f, 180.0f, 205.79086f, 180.0f, 208.0f),
                    PathNode.CurveTo(180.0f, 210.20914f, 181.79086f, 212.0f, 184.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(226.20914f, 212.0f, 228.0f, 210.20914f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 168.0f),
                    PathNode.CurveTo(228.0f, 165.79086f, 226.20914f, 164.0f, 224.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 92.0f),
                    PathNode.CurveTo(34.20914f, 92.0f, 36.0f, 90.20914f, 36.0f, 88.0f),
                    PathNode.LineTo(36.0f, 52.0f),
                    PathNode.LineTo(72.0f, 52.0f),
                    PathNode.CurveTo(74.20914f, 52.0f, 76.0f, 50.20914f, 76.0f, 48.0f),
                    PathNode.CurveTo(76.0f, 45.79086f, 74.20914f, 44.0f, 72.0f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(29.790861f, 44.0f, 28.0f, 45.79086f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 88.0f),
                    PathNode.CurveTo(28.0f, 90.20914f, 29.790861f, 92.0f, 32.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 84.0f),
                    PathNode.CurveTo(77.79086f, 84.0f, 76.0f, 85.79086f, 76.0f, 88.0f),
                    PathNode.LineTo(76.0f, 168.0f),
                    PathNode.CurveTo(76.0f, 170.20914f, 77.79086f, 172.0f, 80.0f, 172.0f),
                    PathNode.CurveTo(82.20914f, 172.0f, 84.0f, 170.20914f, 84.0f, 168.0f),
                    PathNode.LineTo(84.0f, 88.0f),
                    PathNode.CurveTo(84.0f, 85.79086f, 82.20914f, 84.0f, 80.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 88.0f),
                    PathNode.CurveTo(180.0f, 85.79086f, 178.20914f, 84.0f, 176.0f, 84.0f),
                    PathNode.CurveTo(173.79086f, 84.0f, 172.0f, 85.79086f, 172.0f, 88.0f),
                    PathNode.LineTo(172.0f, 168.0f),
                    PathNode.CurveTo(172.0f, 170.20914f, 173.79086f, 172.0f, 176.0f, 172.0f),
                    PathNode.CurveTo(178.20914f, 172.0f, 180.0f, 170.20914f, 180.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 84.0f),
                    PathNode.CurveTo(141.79086f, 84.0f, 140.0f, 85.79086f, 140.0f, 88.0f),
                    PathNode.LineTo(140.0f, 168.0f),
                    PathNode.CurveTo(140.0f, 170.20914f, 141.79086f, 172.0f, 144.0f, 172.0f),
                    PathNode.CurveTo(146.20914f, 172.0f, 148.0f, 170.20914f, 148.0f, 168.0f),
                    PathNode.LineTo(148.0f, 88.0f),
                    PathNode.CurveTo(148.0f, 85.79086f, 146.20914f, 84.0f, 144.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 84.0f),
                    PathNode.CurveTo(109.79086f, 84.0f, 108.0f, 85.79086f, 108.0f, 88.0f),
                    PathNode.LineTo(108.0f, 168.0f),
                    PathNode.CurveTo(108.0f, 170.20914f, 109.79086f, 172.0f, 112.0f, 172.0f),
                    PathNode.CurveTo(114.20914f, 172.0f, 116.0f, 170.20914f, 116.0f, 168.0f),
                    PathNode.LineTo(116.0f, 88.0f),
                    PathNode.CurveTo(116.0f, 85.79086f, 114.20914f, 84.0f, 112.0f, 84.0f),
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
        return _barcode!!
    }

private var _barcode: ImageVector? = null
