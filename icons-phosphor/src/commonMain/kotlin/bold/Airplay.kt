package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorBoldIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(137.11f, 152.19f),
                    PathNode.CurveTo(134.83023f, 149.531f, 131.50252f, 148.00076f, 128.0f, 148.00076f),
                    PathNode.CurveTo(124.49748f, 148.00076f, 121.16978f, 149.531f, 118.89f, 152.19f),
                    PathNode.LineTo(70.89f, 208.19f),
                    PathNode.CurveTo(67.83996f, 211.74799f, 67.14023f, 216.75597f, 69.09822f, 221.01369f),
                    PathNode.CurveTo(71.05621f, 225.27141f, 75.313644f, 227.99974f, 80.0f, 228.0f),
                    PathNode.LineTo(176.0f, 228.0f),
                    PathNode.CurveTo(180.68636f, 227.99974f, 184.94379f, 225.27141f, 186.90178f, 221.01369f),
                    PathNode.CurveTo(188.85977f, 216.75597f, 188.16003f, 211.74799f, 185.11f, 208.19f),
                    PathNode.Close,
                    PathNode.MoveTo(106.11f, 204.0f),
                    PathNode.LineTo(128.0f, 178.44f),
                    PathNode.LineTo(149.91f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 64.0f),
                    PathNode.LineTo(236.0f, 176.0f),
                    PathNode.CurveTo(236.0f, 191.46397f, 223.46397f, 204.0f, 208.0f, 204.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.CurveTo(197.37259f, 204.0f, 192.0f, 198.62741f, 192.0f, 192.0f),
                    PathNode.CurveTo(192.0f, 185.37259f, 197.37259f, 180.0f, 204.0f, 180.0f),
                    PathNode.LineTo(208.0f, 180.0f),
                    PathNode.CurveTo(210.20914f, 180.0f, 212.0f, 178.20914f, 212.0f, 176.0f),
                    PathNode.LineTo(212.0f, 64.0f),
                    PathNode.CurveTo(212.0f, 61.79086f, 210.20914f, 60.0f, 208.0f, 60.0f),
                    PathNode.LineTo(48.0f, 60.0f),
                    PathNode.CurveTo(45.79086f, 60.0f, 44.0f, 61.79086f, 44.0f, 64.0f),
                    PathNode.LineTo(44.0f, 176.0f),
                    PathNode.CurveTo(44.0f, 178.20914f, 45.79086f, 180.0f, 48.0f, 180.0f),
                    PathNode.LineTo(52.0f, 180.0f),
                    PathNode.CurveTo(58.62742f, 180.0f, 64.0f, 185.37259f, 64.0f, 192.0f),
                    PathNode.CurveTo(64.0f, 198.62741f, 58.62742f, 204.0f, 52.0f, 204.0f),
                    PathNode.LineTo(48.0f, 204.0f),
                    PathNode.CurveTo(32.536026f, 204.0f, 20.0f, 191.46397f, 20.0f, 176.0f),
                    PathNode.LineTo(20.0f, 64.0f),
                    PathNode.CurveTo(20.0f, 48.53603f, 32.536026f, 36.0f, 48.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(223.46397f, 36.0f, 236.0f, 48.53603f, 236.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _airplay!!
    }

private var _airplay: ImageVector? = null
