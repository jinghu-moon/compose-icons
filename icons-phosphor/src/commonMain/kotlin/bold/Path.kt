package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorBoldIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 164.0f),
                    PathNode.CurveTo(184.75089f, 164.0214f, 171.16277f, 173.62996f, 166.06f, 188.0f),
                    PathNode.LineTo(72.0f, 188.0f),
                    PathNode.CurveTo(56.53603f, 188.0f, 44.0f, 175.46397f, 44.0f, 160.0f),
                    PathNode.CurveTo(44.0f, 144.53603f, 56.53603f, 132.0f, 72.0f, 132.0f),
                    PathNode.LineTo(168.0f, 132.0f),
                    PathNode.CurveTo(192.30052f, 132.0f, 212.0f, 112.30053f, 212.0f, 88.0f),
                    PathNode.CurveTo(212.0f, 63.69947f, 192.30052f, 44.0f, 168.0f, 44.0f),
                    PathNode.LineTo(72.0f, 44.0f),
                    PathNode.CurveTo(65.37258f, 44.0f, 60.0f, 49.37258f, 60.0f, 56.0f),
                    PathNode.CurveTo(60.0f, 62.62742f, 65.37258f, 68.0f, 72.0f, 68.0f),
                    PathNode.LineTo(168.0f, 68.0f),
                    PathNode.CurveTo(179.0457f, 68.0f, 188.0f, 76.95431f, 188.0f, 88.0f),
                    PathNode.CurveTo(188.0f, 99.04569f, 179.0457f, 108.0f, 168.0f, 108.0f),
                    PathNode.LineTo(72.0f, 108.0f),
                    PathNode.CurveTo(43.281193f, 108.0f, 20.0f, 131.28119f, 20.0f, 160.0f),
                    PathNode.CurveTo(20.0f, 188.71881f, 43.281193f, 212.0f, 72.0f, 212.0f),
                    PathNode.LineTo(166.06f, 212.0f),
                    PathNode.CurveTo(172.16263f, 229.26082f, 190.248f, 239.19254f, 208.08798f, 235.07994f),
                    PathNode.CurveTo(225.92796f, 230.96736f, 237.84015f, 214.1204f, 235.77031f, 195.92993f),
                    PathNode.CurveTo(233.70047f, 177.73944f, 218.30786f, 163.99942f, 200.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 212.0f),
                    PathNode.CurveTo(193.37259f, 212.0f, 188.0f, 206.62741f, 188.0f, 200.0f),
                    PathNode.CurveTo(188.0f, 193.37259f, 193.37259f, 188.0f, 200.0f, 188.0f),
                    PathNode.CurveTo(206.62741f, 188.0f, 212.0f, 193.37259f, 212.0f, 200.0f),
                    PathNode.CurveTo(212.0f, 206.62741f, 206.62741f, 212.0f, 200.0f, 212.0f),
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
        return _path!!
    }

private var _path: ImageVector? = null
