package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) return _identificationBadge!!
        _identificationBadge = phosphorThinIcon(
            name = "IdentificationBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(146.7f, 166.75f),
                    PathNode.CurveTo(160.49402f, 158.36476f, 167.01979f, 141.82245f, 162.66582f, 126.27799f),
                    PathNode.CurveTo(158.31183f, 110.73354f, 144.14272f, 99.98785f, 128.0f, 99.98785f),
                    PathNode.CurveTo(111.8573f, 99.98785f, 97.68816f, 110.73354f, 93.33418f, 126.27799f),
                    PathNode.CurveTo(88.9802f, 141.82245f, 95.50598f, 158.36476f, 109.3f, 166.75f),
                    PathNode.CurveTo(96.30495f, 170.70148f, 84.91593f, 178.70883f, 76.8f, 189.6f),
                    PathNode.CurveTo(75.47452f, 191.36731f, 75.83269f, 193.87451f, 77.6f, 195.2f),
                    PathNode.CurveTo(79.36731f, 196.52548f, 81.87452f, 196.16731f, 83.2f, 194.4f),
                    PathNode.CurveTo(93.77585f, 180.29887f, 110.37359f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(145.6264f, 172.0f, 162.22415f, 180.29887f, 172.8f, 194.4f),
                    PathNode.CurveTo(174.12549f, 196.16731f, 176.63269f, 196.52548f, 178.4f, 195.2f),
                    PathNode.CurveTo(180.16731f, 193.87451f, 180.52548f, 191.36731f, 179.2f, 189.6f),
                    PathNode.CurveTo(171.08209f, 178.71088f, 159.69382f, 170.70404f, 146.7f, 166.75f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 136.0f),
                    PathNode.CurveTo(100.0f, 120.536026f, 112.536026f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(143.46397f, 108.0f, 156.0f, 120.536026f, 156.0f, 136.0f),
                    PathNode.CurveTo(156.0f, 151.46397f, 143.46397f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(112.536026f, 164.0f, 100.0f, 151.46397f, 100.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(49.37258f, 28.0f, 44.0f, 33.37258f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(206.62741f, 228.0f, 212.0f, 222.62741f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 33.37258f, 206.62741f, 28.0f, 200.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 218.20914f, 202.20914f, 220.0f, 200.0f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(53.79086f, 220.0f, 52.0f, 218.20914f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 37.79086f, 53.79086f, 36.0f, 56.0f, 36.0f),
                    PathNode.LineTo(200.0f, 36.0f),
                    PathNode.CurveTo(202.20914f, 36.0f, 204.0f, 37.79086f, 204.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 64.0f),
                    PathNode.CurveTo(92.0f, 61.79086f, 93.79086f, 60.0f, 96.0f, 60.0f),
                    PathNode.LineTo(160.0f, 60.0f),
                    PathNode.CurveTo(162.20914f, 60.0f, 164.0f, 61.79086f, 164.0f, 64.0f),
                    PathNode.CurveTo(164.0f, 66.20914f, 162.20914f, 68.0f, 160.0f, 68.0f),
                    PathNode.LineTo(96.0f, 68.0f),
                    PathNode.CurveTo(93.79086f, 68.0f, 92.0f, 66.20914f, 92.0f, 64.0f),
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
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
