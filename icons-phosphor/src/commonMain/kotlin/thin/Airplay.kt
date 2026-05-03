package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorThinIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(131.0f, 157.4f),
                    PathNode.CurveTo(130.2401f, 156.51483f, 129.1316f, 156.00552f, 127.965f, 156.00552f),
                    PathNode.CurveTo(126.798386f, 156.00552f, 125.68991f, 156.51483f, 124.93f, 157.4f),
                    PathNode.LineTo(76.93f, 213.4f),
                    PathNode.CurveTo(75.91966f, 214.58107f, 75.68495f, 216.24046f, 76.3281f, 217.65541f),
                    PathNode.CurveTo(76.97127f, 219.07034f, 78.375824f, 219.98462f, 79.93f, 220.0f),
                    PathNode.LineTo(175.93f, 220.0f),
                    PathNode.CurveTo(177.48418f, 219.98462f, 178.88875f, 219.07034f, 179.53189f, 217.65541f),
                    PathNode.CurveTo(180.17505f, 216.24046f, 179.94034f, 214.58107f, 178.93f, 213.4f),
                    PathNode.Close,
                    PathNode.MoveTo(88.7f, 212.0f),
                    PathNode.LineTo(128.0f, 166.15f),
                    PathNode.LineTo(167.3f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 64.0f),
                    PathNode.LineTo(228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 187.0457f, 219.0457f, 196.0f, 208.0f, 196.0f),
                    PathNode.LineTo(200.0f, 196.0f),
                    PathNode.CurveTo(197.79086f, 196.0f, 196.0f, 194.20914f, 196.0f, 192.0f),
                    PathNode.CurveTo(196.0f, 189.79086f, 197.79086f, 188.0f, 200.0f, 188.0f),
                    PathNode.LineTo(208.0f, 188.0f),
                    PathNode.CurveTo(214.62741f, 188.0f, 220.0f, 182.62741f, 220.0f, 176.0f),
                    PathNode.LineTo(220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 57.37258f, 214.62741f, 52.0f, 208.0f, 52.0f),
                    PathNode.LineTo(48.0f, 52.0f),
                    PathNode.CurveTo(41.37258f, 52.0f, 36.0f, 57.37258f, 36.0f, 64.0f),
                    PathNode.LineTo(36.0f, 176.0f),
                    PathNode.CurveTo(36.0f, 182.62741f, 41.37258f, 188.0f, 48.0f, 188.0f),
                    PathNode.LineTo(56.0f, 188.0f),
                    PathNode.CurveTo(58.20914f, 188.0f, 60.0f, 189.79086f, 60.0f, 192.0f),
                    PathNode.CurveTo(60.0f, 194.20914f, 58.20914f, 196.0f, 56.0f, 196.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.CurveTo(36.954304f, 196.0f, 28.0f, 187.0457f, 28.0f, 176.0f),
                    PathNode.LineTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 52.954304f, 36.954304f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(219.0457f, 44.0f, 228.0f, 52.954304f, 228.0f, 64.0f),
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
        return _airplay!!
    }

private var _airplay: ImageVector? = null
