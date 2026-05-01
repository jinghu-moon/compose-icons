package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = phosphorBoldIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 60.0f),
                    PathNode.CurveTo(103.69947f, 60.0f, 84.0f, 79.69947f, 84.0f, 104.0f),
                    PathNode.CurveTo(84.0f, 128.30052f, 103.69947f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(152.30052f, 148.0f, 172.0f, 128.30052f, 172.0f, 104.0f),
                    PathNode.CurveTo(171.97244f, 79.71089f, 152.28911f, 60.027554f, 128.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 124.0f),
                    PathNode.CurveTo(116.95431f, 124.0f, 108.0f, 115.04569f, 108.0f, 104.0f),
                    PathNode.CurveTo(108.0f, 92.95431f, 116.95431f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(139.0457f, 84.0f, 148.0f, 92.95431f, 148.0f, 104.0f),
                    PathNode.CurveTo(148.0f, 115.04569f, 139.0457f, 124.0f, 128.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 12.0f),
                    PathNode.CurveTo(77.21265f, 12.055114f, 36.055115f, 53.21265f, 36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 181.36f, 117.64f, 239.4f, 121.12f, 241.83f),
                    PathNode.CurveTo(125.25116f, 244.72084f, 130.74884f, 244.72084f, 134.88f, 241.83f),
                    PathNode.CurveTo(150.34268f, 230.43431f, 164.48969f, 217.35388f, 177.06f, 202.83f),
                    PathNode.CurveTo(205.15f, 170.57f, 220.0f, 136.37f, 220.0f, 104.0f),
                    PathNode.CurveTo(219.94489f, 53.21265f, 178.78735f, 12.055114f, 128.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(159.3f, 186.71f),
                    PathNode.CurveTo(149.76535f, 197.6622f, 139.2922f, 207.76057f, 128.0f, 216.89f),
                    PathNode.CurveTo(116.707794f, 207.76057f, 106.23466f, 197.6622f, 96.7f, 186.71f),
                    PathNode.CurveTo(80.0f, 167.37f, 60.0f, 137.31f, 60.0f, 104.0f),
                    PathNode.CurveTo(60.0f, 66.44463f, 90.44463f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(165.55536f, 36.0f, 196.0f, 66.44463f, 196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 137.31f, 176.0f, 167.37f, 159.3f, 186.71f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
