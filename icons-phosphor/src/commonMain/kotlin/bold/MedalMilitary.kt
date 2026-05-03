package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) return _medalMilitary!!
        _medalMilitary = phosphorBoldIcon(
            name = "MedalMilitary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(207.0f, 36.0f),
                    PathNode.LineTo(49.0f, 36.0f),
                    PathNode.CurveTo(37.40202f, 36.0f, 28.0f, 45.40202f, 28.0f, 57.0f),
                    PathNode.LineTo(28.0f, 106.21f),
                    PathNode.CurveTo(28.002993f, 114.44219f, 32.815712f, 121.91344f, 40.31f, 125.32f),
                    PathNode.LineTo(96.31f, 150.79f),
                    PathNode.CurveTo(78.63858f, 164.35275f, 71.56896f, 187.66489f, 78.73052f, 208.75847f),
                    PathNode.CurveTo(85.89209f, 229.85207f, 105.69384f, 244.04099f, 127.97f, 244.04099f),
                    PathNode.CurveTo(150.24617f, 244.04099f, 170.04791f, 229.85207f, 177.20947f, 208.75847f),
                    PathNode.CurveTo(184.37103f, 187.66489f, 177.30142f, 164.35275f, 159.63f, 150.79f),
                    PathNode.LineTo(215.63f, 125.32f),
                    PathNode.CurveTo(223.14774f, 121.931206f, 227.98634f, 114.45621f, 228.0f, 106.21f),
                    PathNode.LineTo(228.0f, 57.0f),
                    PathNode.CurveTo(228.0f, 45.40202f, 218.59798f, 36.0f, 207.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 138.82f),
                    PathNode.LineTo(100.0f, 126.09f),
                    PathNode.LineTo(100.0f, 60.0f),
                    PathNode.LineTo(156.0f, 60.0f),
                    PathNode.LineTo(156.0f, 126.09f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 60.0f),
                    PathNode.LineTo(76.0f, 60.0f),
                    PathNode.LineTo(76.0f, 115.18f),
                    PathNode.LineTo(52.0f, 104.27f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(112.536026f, 220.0f, 100.0f, 207.46397f, 100.0f, 192.0f),
                    PathNode.CurveTo(100.0f, 176.53603f, 112.536026f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(143.46397f, 164.0f, 156.0f, 176.53603f, 156.0f, 192.0f),
                    PathNode.CurveTo(156.0f, 207.46397f, 143.46397f, 220.0f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 104.27f),
                    PathNode.LineTo(180.0f, 115.18f),
                    PathNode.LineTo(180.0f, 60.0f),
                    PathNode.LineTo(204.0f, 60.0f),
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
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
