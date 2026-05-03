package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) return _phosphorLogo!!
        _phosphorLogo = phosphorBoldIcon(
            name = "PhosphorLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 104.0f),
                    PathNode.CurveTo(227.9559f, 62.044636f, 193.95538f, 28.044094f, 152.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(65.37258f, 28.0f, 60.0f, 33.37258f, 60.0f, 40.0f),
                    PathNode.LineTo(60.0f, 168.0f),
                    PathNode.CurveTo(60.049603f, 214.37135f, 97.62865f, 251.9504f, 144.0f, 252.0f),
                    PathNode.CurveTo(150.62741f, 252.0f, 156.0f, 246.62741f, 156.0f, 240.0f),
                    PathNode.LineTo(156.0f, 179.89f),
                    PathNode.CurveTo(196.34094f, 177.71848f, 227.95221f, 144.39932f, 228.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 85.81f),
                    PathNode.LineTo(123.48f, 156.0f),
                    PathNode.LineTo(84.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 122.19f),
                    PathNode.LineTo(92.52f, 52.0f),
                    PathNode.LineTo(132.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(85.22f, 180.0f),
                    PathNode.LineTo(132.0f, 180.0f),
                    PathNode.LineTo(132.0f, 226.79f),
                    PathNode.CurveTo(108.46263f, 221.93343f, 90.07155f, 203.5384f, 85.22f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 155.83f),
                    PathNode.LineTo(156.0f, 52.17f),
                    PathNode.CurveTo(183.00114f, 54.358704f, 203.79868f, 76.91028f, 203.79868f, 104.0f),
                    PathNode.CurveTo(203.79868f, 131.08972f, 183.00114f, 153.6413f, 156.0f, 155.83f),
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
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
