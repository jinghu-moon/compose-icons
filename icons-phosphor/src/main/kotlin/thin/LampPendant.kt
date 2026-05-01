package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LampPendant: ImageVector
    get() {
        if (_lampPendant != null) return _lampPendant!!
        _lampPendant = phosphorThinIcon(
            name = "LampPendant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 77.34f),
                    PathNode.LineTo(172.0f, 72.0f),
                    PathNode.CurveTo(172.0f, 65.37258f, 166.62741f, 60.0f, 160.0f, 60.0f),
                    PathNode.LineTo(132.0f, 60.0f),
                    PathNode.LineTo(132.0f, 16.0f),
                    PathNode.CurveTo(132.0f, 13.790861f, 130.20914f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(125.79086f, 12.0f, 124.0f, 13.790861f, 124.0f, 16.0f),
                    PathNode.LineTo(124.0f, 60.0f),
                    PathNode.LineTo(96.0f, 60.0f),
                    PathNode.CurveTo(89.37258f, 60.0f, 84.0f, 65.37258f, 84.0f, 72.0f),
                    PathNode.LineTo(84.0f, 77.34f),
                    PathNode.CurveTo(45.0187f, 94.65953f, 19.924128f, 133.34438f, 20.0f, 176.0f),
                    PathNode.CurveTo(20.0f, 178.20914f, 21.790861f, 180.0f, 24.0f, 180.0f),
                    PathNode.LineTo(92.0f, 180.0f),
                    PathNode.LineTo(92.0f, 184.0f),
                    PathNode.CurveTo(92.0f, 203.88223f, 108.11775f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(147.88223f, 220.0f, 164.0f, 203.88223f, 164.0f, 184.0f),
                    PathNode.LineTo(164.0f, 180.0f),
                    PathNode.LineTo(232.0f, 180.0f),
                    PathNode.CurveTo(234.20914f, 180.0f, 236.0f, 178.20914f, 236.0f, 176.0f),
                    PathNode.CurveTo(236.07587f, 133.34438f, 210.98131f, 94.65953f, 172.0f, 77.34f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 184.0f),
                    PathNode.CurveTo(156.0f, 199.46397f, 143.46397f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(112.536026f, 212.0f, 100.0f, 199.46397f, 100.0f, 184.0f),
                    PathNode.LineTo(100.0f, 180.0f),
                    PathNode.LineTo(156.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.08f, 172.0f),
                    PathNode.CurveTo(29.568045f, 133.08144f, 53.566853f, 98.586555f, 89.54f, 83.66f),
                    PathNode.CurveTo(91.01918f, 83.04301f, 91.98729f, 81.60266f, 92.0f, 80.0f),
                    PathNode.LineTo(92.0f, 72.0f),
                    PathNode.CurveTo(92.0f, 69.79086f, 93.79086f, 68.0f, 96.0f, 68.0f),
                    PathNode.LineTo(160.0f, 68.0f),
                    PathNode.CurveTo(162.20914f, 68.0f, 164.0f, 69.79086f, 164.0f, 72.0f),
                    PathNode.LineTo(164.0f, 80.0f),
                    PathNode.CurveTo(164.00067f, 81.613594f, 164.9708f, 83.06877f, 166.46f, 83.69f),
                    PathNode.CurveTo(202.42357f, 98.612045f, 226.42044f, 133.09245f, 227.92f, 172.0f),
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
        return _lampPendant!!
    }

private var _lampPendant: ImageVector? = null
