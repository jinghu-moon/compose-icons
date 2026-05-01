package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) return _uploadSimple!!
        _uploadSimple = phosphorThinIcon(
            name = "UploadSimple",
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
                    PathNode.MoveTo(90.83f, 74.83f),
                    PathNode.LineTo(124.0f, 41.66f),
                    PathNode.LineTo(124.0f, 144.0f),
                    PathNode.CurveTo(124.0f, 146.20914f, 125.79086f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(130.20914f, 148.0f, 132.0f, 146.20914f, 132.0f, 144.0f),
                    PathNode.LineTo(132.0f, 41.66f),
                    PathNode.LineTo(165.17f, 74.83f),
                    PathNode.CurveTo(166.73297f, 76.39297f, 169.26703f, 76.39297f, 170.83f, 74.83f),
                    PathNode.CurveTo(172.39296f, 73.26704f, 172.39296f, 70.73296f, 170.83f, 69.17f),
                    PathNode.LineTo(130.83f, 29.17f),
                    PathNode.CurveTo(130.07973f, 28.418892f, 129.06163f, 27.996853f, 128.0f, 27.996853f),
                    PathNode.CurveTo(126.93836f, 27.996853f, 125.92027f, 28.418892f, 125.17f, 29.17f),
                    PathNode.LineTo(85.17f, 69.17f),
                    PathNode.CurveTo(83.60703f, 70.73296f, 83.60703f, 73.26704f, 85.17f, 74.83f),
                    PathNode.CurveTo(86.73296f, 76.39297f, 89.26704f, 76.39297f, 90.83f, 74.83f),
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
        return _uploadSimple!!
    }

private var _uploadSimple: ImageVector? = null
