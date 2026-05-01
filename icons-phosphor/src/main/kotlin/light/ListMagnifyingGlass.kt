package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListMagnifyingGlass: ImageVector
    get() {
        if (_listMagnifyingGlass != null) return _listMagnifyingGlass!!
        _listMagnifyingGlass = phosphorLightIcon(
            name = "ListMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(34.0f, 64.0f),
                    PathNode.CurveTo(34.0f, 60.68629f, 36.68629f, 58.0f, 40.0f, 58.0f),
                    PathNode.LineTo(216.0f, 58.0f),
                    PathNode.CurveTo(219.3137f, 58.0f, 222.0f, 60.68629f, 222.0f, 64.0f),
                    PathNode.CurveTo(222.0f, 67.313705f, 219.3137f, 70.0f, 216.0f, 70.0f),
                    PathNode.LineTo(40.0f, 70.0f),
                    PathNode.CurveTo(36.68629f, 70.0f, 34.0f, 67.313705f, 34.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 134.0f),
                    PathNode.LineTo(112.0f, 134.0f),
                    PathNode.CurveTo(115.313705f, 134.0f, 118.0f, 131.3137f, 118.0f, 128.0f),
                    PathNode.CurveTo(118.0f, 124.686295f, 115.313705f, 122.0f, 112.0f, 122.0f),
                    PathNode.LineTo(40.0f, 122.0f),
                    PathNode.CurveTo(36.68629f, 122.0f, 34.0f, 124.686295f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 131.3137f, 36.68629f, 134.0f, 40.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 186.0f),
                    PathNode.LineTo(40.0f, 186.0f),
                    PathNode.CurveTo(36.68629f, 186.0f, 34.0f, 188.6863f, 34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 195.3137f, 36.68629f, 198.0f, 40.0f, 198.0f),
                    PathNode.LineTo(128.0f, 198.0f),
                    PathNode.CurveTo(131.3137f, 198.0f, 134.0f, 195.3137f, 134.0f, 192.0f),
                    PathNode.CurveTo(134.0f, 188.6863f, 131.3137f, 186.0f, 128.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.24f, 196.24f),
                    PathNode.CurveTo(233.89746f, 198.57962f, 230.10254f, 198.57962f, 227.76f, 196.24f),
                    PathNode.LineTo(206.27f, 174.76f),
                    PathNode.CurveTo(190.19386f, 186.40771f, 167.86519f, 183.7426f, 154.98212f, 168.63837f),
                    PathNode.CurveTo(142.09904f, 153.53413f, 142.98927f, 131.06459f, 157.02693f, 117.02693f),
                    PathNode.CurveTo(171.06459f, 102.98927f, 193.53413f, 102.099045f, 208.63837f, 114.98211f),
                    PathNode.CurveTo(223.7426f, 127.86518f, 226.40771f, 150.19386f, 214.76f, 166.27f),
                    PathNode.LineTo(236.24f, 187.76f),
                    PathNode.CurveTo(238.57962f, 190.10254f, 238.57962f, 193.89746f, 236.24f, 196.24f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 170.0f),
                    PathNode.CurveTo(198.3594f, 170.0f, 210.0f, 158.3594f, 210.0f, 144.0f),
                    PathNode.CurveTo(210.0f, 129.6406f, 198.3594f, 118.0f, 184.0f, 118.0f),
                    PathNode.CurveTo(169.6406f, 118.0f, 158.0f, 129.6406f, 158.0f, 144.0f),
                    PathNode.CurveTo(158.0f, 158.3594f, 169.6406f, 170.0f, 184.0f, 170.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _listMagnifyingGlass!!
    }

private var _listMagnifyingGlass: ImageVector? = null
