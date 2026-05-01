package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = phosphorThinIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 136.0f),
                    PathNode.LineTo(236.0f, 200.0f),
                    PathNode.CurveTo(236.0f, 206.62741f, 230.62741f, 212.0f, 224.0f, 212.0f),
                    PathNode.LineTo(32.0f, 212.0f),
                    PathNode.CurveTo(25.372583f, 212.0f, 20.0f, 206.62741f, 20.0f, 200.0f),
                    PathNode.LineTo(20.0f, 136.0f),
                    PathNode.CurveTo(20.0f, 129.37259f, 25.372583f, 124.0f, 32.0f, 124.0f),
                    PathNode.LineTo(72.0f, 124.0f),
                    PathNode.CurveTo(74.20914f, 124.0f, 76.0f, 125.79086f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 130.20914f, 74.20914f, 132.0f, 72.0f, 132.0f),
                    PathNode.LineTo(32.0f, 132.0f),
                    PathNode.CurveTo(29.790861f, 132.0f, 28.0f, 133.79086f, 28.0f, 136.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 202.20914f, 29.790861f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(226.20914f, 204.0f, 228.0f, 202.20914f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 136.0f),
                    PathNode.CurveTo(228.0f, 133.79086f, 226.20914f, 132.0f, 224.0f, 132.0f),
                    PathNode.LineTo(184.0f, 132.0f),
                    PathNode.CurveTo(181.79086f, 132.0f, 180.0f, 130.20914f, 180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 125.79086f, 181.79086f, 124.0f, 184.0f, 124.0f),
                    PathNode.LineTo(224.0f, 124.0f),
                    PathNode.CurveTo(230.62741f, 124.0f, 236.0f, 129.37259f, 236.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(125.17f, 130.83f),
                    PathNode.CurveTo(125.92027f, 131.58112f, 126.93836f, 132.00314f, 128.0f, 132.00314f),
                    PathNode.CurveTo(129.06163f, 132.00314f, 130.07973f, 131.58112f, 130.83f, 130.83f),
                    PathNode.LineTo(178.83f, 82.83f),
                    PathNode.CurveTo(180.39296f, 81.26704f, 180.39296f, 78.73296f, 178.83f, 77.17f),
                    PathNode.CurveTo(177.26703f, 75.60703f, 174.73297f, 75.60703f, 173.17f, 77.17f),
                    PathNode.LineTo(132.0f, 118.34f),
                    PathNode.LineTo(132.0f, 24.0f),
                    PathNode.CurveTo(132.0f, 21.790861f, 130.20914f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(125.79086f, 20.0f, 124.0f, 21.790861f, 124.0f, 24.0f),
                    PathNode.LineTo(124.0f, 118.34f),
                    PathNode.LineTo(82.83f, 77.17f),
                    PathNode.CurveTo(81.26704f, 75.60703f, 78.73296f, 75.60703f, 77.17f, 77.17f),
                    PathNode.CurveTo(75.60703f, 78.73296f, 75.60703f, 81.26704f, 77.17f, 82.83f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 168.0f),
                    PathNode.CurveTo(196.0f, 163.58173f, 192.41827f, 160.0f, 188.0f, 160.0f),
                    PathNode.CurveTo(183.58173f, 160.0f, 180.0f, 163.58173f, 180.0f, 168.0f),
                    PathNode.CurveTo(180.0f, 172.41827f, 183.58173f, 176.0f, 188.0f, 176.0f),
                    PathNode.CurveTo(192.41827f, 176.0f, 196.0f, 172.41827f, 196.0f, 168.0f),
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
        return _download!!
    }

private var _download: ImageVector? = null
