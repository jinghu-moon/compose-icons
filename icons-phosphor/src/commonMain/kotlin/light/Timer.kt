package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = phosphorLightIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 42.0f),
                    PathNode.CurveTo(76.085236f, 42.0f, 34.0f, 84.085236f, 34.0f, 136.0f),
                    PathNode.CurveTo(34.0f, 187.91476f, 76.085236f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(179.91476f, 230.0f, 222.0f, 187.91476f, 222.0f, 136.0f),
                    PathNode.CurveTo(221.93938f, 84.11036f, 179.88963f, 42.060616f, 128.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(82.712654f, 218.0f, 46.0f, 181.28735f, 46.0f, 136.0f),
                    PathNode.CurveTo(46.0f, 90.712654f, 82.712654f, 54.0f, 128.0f, 54.0f),
                    PathNode.CurveTo(173.28735f, 54.0f, 210.0f, 90.712654f, 210.0f, 136.0f),
                    PathNode.CurveTo(209.9449f, 181.26451f, 173.26451f, 217.9449f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.24f, 91.76f),
                    PathNode.CurveTo(174.57962f, 94.10254f, 174.57962f, 97.89746f, 172.24f, 100.24f),
                    PathNode.LineTo(132.24f, 140.24f),
                    PathNode.CurveTo(130.74423f, 141.84523f, 128.49156f, 142.506f, 126.3657f, 141.96309f),
                    PathNode.CurveTo(124.23982f, 141.42018f, 122.57983f, 139.76018f, 122.03692f, 137.63431f),
                    PathNode.CurveTo(121.494f, 135.50844f, 122.15478f, 133.25577f, 123.76f, 131.76f),
                    PathNode.LineTo(163.76f, 91.76f),
                    PathNode.CurveTo(166.10254f, 89.42038f, 169.89746f, 89.42038f, 172.24f, 91.76f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 16.0f),
                    PathNode.CurveTo(98.0f, 12.686292f, 100.686295f, 10.0f, 104.0f, 10.0f),
                    PathNode.LineTo(152.0f, 10.0f),
                    PathNode.CurveTo(155.3137f, 10.0f, 158.0f, 12.686292f, 158.0f, 16.0f),
                    PathNode.CurveTo(158.0f, 19.31371f, 155.3137f, 22.0f, 152.0f, 22.0f),
                    PathNode.LineTo(104.0f, 22.0f),
                    PathNode.CurveTo(100.686295f, 22.0f, 98.0f, 19.31371f, 98.0f, 16.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _timer!!
    }

private var _timer: ImageVector? = null
