package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DownloadSimple: ImageVector
    get() {
        if (_downloadSimple != null) return _downloadSimple!!
        _downloadSimple = phosphorThinIcon(
            name = "DownloadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 144.0f),
                    PathNode.LineTo(220.0f, 208.0f),
                    PathNode.CurveTo(220.0f, 210.20914f, 218.20914f, 212.0f, 216.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(37.79086f, 212.0f, 36.0f, 210.20914f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 141.79086f, 37.79086f, 140.0f, 40.0f, 140.0f),
                    PathNode.CurveTo(42.20914f, 140.0f, 44.0f, 141.79086f, 44.0f, 144.0f),
                    PathNode.LineTo(44.0f, 204.0f),
                    PathNode.LineTo(212.0f, 204.0f),
                    PathNode.LineTo(212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 141.79086f, 213.79086f, 140.0f, 216.0f, 140.0f),
                    PathNode.CurveTo(218.20914f, 140.0f, 220.0f, 141.79086f, 220.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(125.17f, 146.83f),
                    PathNode.CurveTo(125.92027f, 147.58112f, 126.93836f, 148.00314f, 128.0f, 148.00314f),
                    PathNode.CurveTo(129.06163f, 148.00314f, 130.07973f, 147.58112f, 130.83f, 146.83f),
                    PathNode.LineTo(170.83f, 106.83f),
                    PathNode.CurveTo(172.39296f, 105.26704f, 172.39296f, 102.73296f, 170.83f, 101.17f),
                    PathNode.CurveTo(169.26703f, 99.60703f, 166.73297f, 99.60703f, 165.17f, 101.17f),
                    PathNode.LineTo(132.0f, 134.34f),
                    PathNode.LineTo(132.0f, 32.0f),
                    PathNode.CurveTo(132.0f, 29.790861f, 130.20914f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(125.79086f, 28.0f, 124.0f, 29.790861f, 124.0f, 32.0f),
                    PathNode.LineTo(124.0f, 134.34f),
                    PathNode.LineTo(90.83f, 101.17f),
                    PathNode.CurveTo(89.26704f, 99.60703f, 86.73296f, 99.60703f, 85.17f, 101.17f),
                    PathNode.CurveTo(83.60703f, 102.73296f, 83.60703f, 105.26704f, 85.17f, 106.83f),
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
        return _downloadSimple!!
    }

private var _downloadSimple: ImageVector? = null
