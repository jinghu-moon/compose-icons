package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = phosphorBoldIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 96.0f),
                    PathNode.CurveTo(144.0f, 87.163445f, 151.16344f, 80.0f, 160.0f, 80.0f),
                    PathNode.CurveTo(168.83656f, 80.0f, 176.0f, 87.163445f, 176.0f, 96.0f),
                    PathNode.CurveTo(176.0f, 104.836555f, 168.83656f, 112.0f, 160.0f, 112.0f),
                    PathNode.CurveTo(151.16344f, 112.0f, 144.0f, 104.836555f, 144.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.LineTo(236.0f, 200.0f),
                    PathNode.CurveTo(236.0f, 211.0457f, 227.0457f, 220.0f, 216.0f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(28.954306f, 220.0f, 20.0f, 211.0457f, 20.0f, 200.0f),
                    PathNode.LineTo(20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 44.954304f, 28.954306f, 36.0f, 40.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(227.0457f, 36.0f, 236.0f, 44.954304f, 236.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 60.0f),
                    PathNode.LineTo(44.0f, 139.72f),
                    PathNode.LineTo(77.86f, 105.86f),
                    PathNode.CurveTo(85.67f, 98.05236f, 98.33f, 98.05236f, 106.14f, 105.86f),
                    PathNode.LineTo(147.31f, 147.0f),
                    PathNode.LineTo(164.49f, 129.83f),
                    PathNode.CurveTo(172.3f, 122.02236f, 184.96f, 122.02236f, 192.77f, 129.83f),
                    PathNode.LineTo(212.0f, 149.09f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 196.0f),
                    PathNode.LineTo(162.34f, 196.0f),
                    PathNode.LineTo(92.0f, 125.66f),
                    PathNode.LineTo(44.0f, 173.66f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(212.0f, 183.0f),
                    PathNode.LineTo(178.63f, 149.63f),
                    PathNode.LineTo(164.28f, 164.0f),
                    PathNode.LineTo(196.28f, 196.0f),
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
        return _image!!
    }

private var _image: ImageVector? = null
