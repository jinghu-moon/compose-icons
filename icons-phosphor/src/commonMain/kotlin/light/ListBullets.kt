package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorLightIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(82.0f, 64.0f),
                    PathNode.CurveTo(82.0f, 60.68629f, 84.686295f, 58.0f, 88.0f, 58.0f),
                    PathNode.LineTo(216.0f, 58.0f),
                    PathNode.CurveTo(219.3137f, 58.0f, 222.0f, 60.68629f, 222.0f, 64.0f),
                    PathNode.CurveTo(222.0f, 67.313705f, 219.3137f, 70.0f, 216.0f, 70.0f),
                    PathNode.LineTo(88.0f, 70.0f),
                    PathNode.CurveTo(84.686295f, 70.0f, 82.0f, 67.313705f, 82.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 122.0f),
                    PathNode.LineTo(88.0f, 122.0f),
                    PathNode.CurveTo(84.686295f, 122.0f, 82.0f, 124.686295f, 82.0f, 128.0f),
                    PathNode.CurveTo(82.0f, 131.3137f, 84.686295f, 134.0f, 88.0f, 134.0f),
                    PathNode.LineTo(216.0f, 134.0f),
                    PathNode.CurveTo(219.3137f, 134.0f, 222.0f, 131.3137f, 222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 124.686295f, 219.3137f, 122.0f, 216.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 186.0f),
                    PathNode.LineTo(88.0f, 186.0f),
                    PathNode.CurveTo(84.686295f, 186.0f, 82.0f, 188.6863f, 82.0f, 192.0f),
                    PathNode.CurveTo(82.0f, 195.3137f, 84.686295f, 198.0f, 88.0f, 198.0f),
                    PathNode.LineTo(216.0f, 198.0f),
                    PathNode.CurveTo(219.3137f, 198.0f, 222.0f, 195.3137f, 222.0f, 192.0f),
                    PathNode.CurveTo(222.0f, 188.6863f, 219.3137f, 186.0f, 216.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 54.0f),
                    PathNode.CurveTo(38.477154f, 54.0f, 34.0f, 58.477154f, 34.0f, 64.0f),
                    PathNode.CurveTo(34.0f, 69.52285f, 38.477154f, 74.0f, 44.0f, 74.0f),
                    PathNode.CurveTo(49.522846f, 74.0f, 54.0f, 69.52285f, 54.0f, 64.0f),
                    PathNode.CurveTo(54.0f, 58.477154f, 49.522846f, 54.0f, 44.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 182.0f),
                    PathNode.CurveTo(38.477154f, 182.0f, 34.0f, 186.47716f, 34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 197.52284f, 38.477154f, 202.0f, 44.0f, 202.0f),
                    PathNode.CurveTo(49.522846f, 202.0f, 54.0f, 197.52284f, 54.0f, 192.0f),
                    PathNode.CurveTo(54.0f, 186.47716f, 49.522846f, 182.0f, 44.0f, 182.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 118.0f),
                    PathNode.CurveTo(38.477154f, 118.0f, 34.0f, 122.47715f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 133.52284f, 38.477154f, 138.0f, 44.0f, 138.0f),
                    PathNode.CurveTo(49.522846f, 138.0f, 54.0f, 133.52284f, 54.0f, 128.0f),
                    PathNode.CurveTo(54.0f, 122.47715f, 49.522846f, 118.0f, 44.0f, 118.0f),
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
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null
