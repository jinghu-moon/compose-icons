package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = phosphorThinIcon(
            name = "Upload",
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
                    PathNode.LineTo(80.0f, 124.0f),
                    PathNode.CurveTo(82.20914f, 124.0f, 84.0f, 125.79086f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 130.20914f, 82.20914f, 132.0f, 80.0f, 132.0f),
                    PathNode.LineTo(32.0f, 132.0f),
                    PathNode.CurveTo(29.790861f, 132.0f, 28.0f, 133.79086f, 28.0f, 136.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 202.20914f, 29.790861f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(226.20914f, 204.0f, 228.0f, 202.20914f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 136.0f),
                    PathNode.CurveTo(228.0f, 133.79086f, 226.20914f, 132.0f, 224.0f, 132.0f),
                    PathNode.LineTo(176.0f, 132.0f),
                    PathNode.CurveTo(173.79086f, 132.0f, 172.0f, 130.20914f, 172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 125.79086f, 173.79086f, 124.0f, 176.0f, 124.0f),
                    PathNode.LineTo(224.0f, 124.0f),
                    PathNode.CurveTo(230.62741f, 124.0f, 236.0f, 129.37259f, 236.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.83f, 74.83f),
                    PathNode.LineTo(124.0f, 33.66f),
                    PathNode.LineTo(124.0f, 128.0f),
                    PathNode.CurveTo(124.0f, 130.20914f, 125.79086f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(130.20914f, 132.0f, 132.0f, 130.20914f, 132.0f, 128.0f),
                    PathNode.LineTo(132.0f, 33.66f),
                    PathNode.LineTo(173.17f, 74.83f),
                    PathNode.CurveTo(174.73297f, 76.39297f, 177.26703f, 76.39297f, 178.83f, 74.83f),
                    PathNode.CurveTo(180.39296f, 73.26704f, 180.39296f, 70.73296f, 178.83f, 69.17f),
                    PathNode.LineTo(130.83f, 21.17f),
                    PathNode.CurveTo(130.07973f, 20.418892f, 129.06163f, 19.996853f, 128.0f, 19.996853f),
                    PathNode.CurveTo(126.93836f, 19.996853f, 125.92027f, 20.418892f, 125.17f, 21.17f),
                    PathNode.LineTo(77.17f, 69.17f),
                    PathNode.CurveTo(75.60703f, 70.73296f, 75.60703f, 73.26704f, 77.17f, 74.83f),
                    PathNode.CurveTo(78.73296f, 76.39297f, 81.26704f, 76.39297f, 82.83f, 74.83f),
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
        return _upload!!
    }

private var _upload: ImageVector? = null
