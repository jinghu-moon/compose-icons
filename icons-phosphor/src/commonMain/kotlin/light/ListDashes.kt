package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListDashes: ImageVector
    get() {
        if (_listDashes != null) return _listDashes!!
        _listDashes = phosphorLightIcon(
            name = "ListDashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(90.0f, 64.0f),
                    PathNode.CurveTo(90.0f, 60.68629f, 92.686295f, 58.0f, 96.0f, 58.0f),
                    PathNode.LineTo(216.0f, 58.0f),
                    PathNode.CurveTo(219.3137f, 58.0f, 222.0f, 60.68629f, 222.0f, 64.0f),
                    PathNode.CurveTo(222.0f, 67.313705f, 219.3137f, 70.0f, 216.0f, 70.0f),
                    PathNode.LineTo(96.0f, 70.0f),
                    PathNode.CurveTo(92.686295f, 70.0f, 90.0f, 67.313705f, 90.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 122.0f),
                    PathNode.LineTo(96.0f, 122.0f),
                    PathNode.CurveTo(92.686295f, 122.0f, 90.0f, 124.686295f, 90.0f, 128.0f),
                    PathNode.CurveTo(90.0f, 131.3137f, 92.686295f, 134.0f, 96.0f, 134.0f),
                    PathNode.LineTo(216.0f, 134.0f),
                    PathNode.CurveTo(219.3137f, 134.0f, 222.0f, 131.3137f, 222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 124.686295f, 219.3137f, 122.0f, 216.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 186.0f),
                    PathNode.LineTo(96.0f, 186.0f),
                    PathNode.CurveTo(92.686295f, 186.0f, 90.0f, 188.6863f, 90.0f, 192.0f),
                    PathNode.CurveTo(90.0f, 195.3137f, 92.686295f, 198.0f, 96.0f, 198.0f),
                    PathNode.LineTo(216.0f, 198.0f),
                    PathNode.CurveTo(219.3137f, 198.0f, 222.0f, 195.3137f, 222.0f, 192.0f),
                    PathNode.CurveTo(222.0f, 188.6863f, 219.3137f, 186.0f, 216.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 58.0f),
                    PathNode.LineTo(40.0f, 58.0f),
                    PathNode.CurveTo(36.68629f, 58.0f, 34.0f, 60.68629f, 34.0f, 64.0f),
                    PathNode.CurveTo(34.0f, 67.313705f, 36.68629f, 70.0f, 40.0f, 70.0f),
                    PathNode.LineTo(56.0f, 70.0f),
                    PathNode.CurveTo(59.31371f, 70.0f, 62.0f, 67.313705f, 62.0f, 64.0f),
                    PathNode.CurveTo(62.0f, 60.68629f, 59.31371f, 58.0f, 56.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 122.0f),
                    PathNode.LineTo(40.0f, 122.0f),
                    PathNode.CurveTo(36.68629f, 122.0f, 34.0f, 124.686295f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 131.3137f, 36.68629f, 134.0f, 40.0f, 134.0f),
                    PathNode.LineTo(56.0f, 134.0f),
                    PathNode.CurveTo(59.31371f, 134.0f, 62.0f, 131.3137f, 62.0f, 128.0f),
                    PathNode.CurveTo(62.0f, 124.686295f, 59.31371f, 122.0f, 56.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 186.0f),
                    PathNode.LineTo(40.0f, 186.0f),
                    PathNode.CurveTo(36.68629f, 186.0f, 34.0f, 188.6863f, 34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 195.3137f, 36.68629f, 198.0f, 40.0f, 198.0f),
                    PathNode.LineTo(56.0f, 198.0f),
                    PathNode.CurveTo(59.31371f, 198.0f, 62.0f, 195.3137f, 62.0f, 192.0f),
                    PathNode.CurveTo(62.0f, 188.6863f, 59.31371f, 186.0f, 56.0f, 186.0f),
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
        return _listDashes!!
    }

private var _listDashes: ImageVector? = null
