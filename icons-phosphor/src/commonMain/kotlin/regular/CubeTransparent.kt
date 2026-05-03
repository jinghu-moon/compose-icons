package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorRegularIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.66f, 90.34f),
                    PathNode.LineTo(221.66f, 90.34f),
                    PathNode.LineTo(165.66f, 34.34f),
                    PathNode.CurveTo(164.15842f, 32.84009f, 162.12238f, 31.998331f, 160.0f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(35.581722f, 32.0f, 32.0f, 35.581722f, 32.0f, 40.0f),
                    PathNode.LineTo(32.0f, 160.0f),
                    PathNode.CurveTo(32.000885f, 162.09935f, 32.826946f, 164.11421f, 34.3f, 165.61f),
                    PathNode.LineTo(90.3f, 221.61f),
                    PathNode.LineTo(90.3f, 221.61f),
                    PathNode.CurveTo(91.8031f, 223.1381f, 93.856544f, 223.99911f, 96.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.CurveTo(224.00166f, 93.87763f, 223.15993f, 91.841576f, 221.66f, 90.34f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 59.31f),
                    PathNode.LineTo(196.69f, 88.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 196.69f),
                    PathNode.LineTo(59.31f, 168.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 152.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.LineTo(48.0f, 59.31f),
                    PathNode.LineTo(88.0f, 99.31f),
                    PathNode.Close,
                    PathNode.MoveTo(59.31f, 48.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.LineTo(99.31f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 104.0f),
                    PathNode.LineTo(152.0f, 152.0f),
                    PathNode.LineTo(104.0f, 152.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 208.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.LineTo(156.69f, 168.0f),
                    PathNode.LineTo(196.69f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 196.69f),
                    PathNode.LineTo(168.0f, 156.69f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
