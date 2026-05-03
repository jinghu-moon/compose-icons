package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorLightIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(142.0f, 192.0f),
                    PathNode.CurveTo(142.0f, 195.3137f, 139.3137f, 198.0f, 136.0f, 198.0f),
                    PathNode.LineTo(120.0f, 198.0f),
                    PathNode.CurveTo(116.686295f, 198.0f, 114.0f, 195.3137f, 114.0f, 192.0f),
                    PathNode.CurveTo(114.0f, 188.6863f, 116.686295f, 186.0f, 120.0f, 186.0f),
                    PathNode.LineTo(136.0f, 186.0f),
                    PathNode.CurveTo(139.3137f, 186.0f, 142.0f, 188.6863f, 142.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 70.0f),
                    PathNode.LineTo(136.0f, 70.0f),
                    PathNode.CurveTo(139.3137f, 70.0f, 142.0f, 67.313705f, 142.0f, 64.0f),
                    PathNode.CurveTo(142.0f, 60.68629f, 139.3137f, 58.0f, 136.0f, 58.0f),
                    PathNode.LineTo(120.0f, 58.0f),
                    PathNode.CurveTo(116.686295f, 58.0f, 114.0f, 60.68629f, 114.0f, 64.0f),
                    PathNode.CurveTo(114.0f, 67.313705f, 116.686295f, 70.0f, 120.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 122.0f),
                    PathNode.LineTo(120.0f, 122.0f),
                    PathNode.CurveTo(116.686295f, 122.0f, 114.0f, 124.686295f, 114.0f, 128.0f),
                    PathNode.CurveTo(114.0f, 131.3137f, 116.686295f, 134.0f, 120.0f, 134.0f),
                    PathNode.LineTo(136.0f, 134.0f),
                    PathNode.CurveTo(139.3137f, 134.0f, 142.0f, 131.3137f, 142.0f, 128.0f),
                    PathNode.CurveTo(142.0f, 124.686295f, 139.3137f, 122.0f, 136.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 40.0f),
                    PathNode.LineTo(214.0f, 216.0f),
                    PathNode.CurveTo(214.0f, 223.73198f, 207.73198f, 230.0f, 200.0f, 230.0f),
                    PathNode.LineTo(56.0f, 230.0f),
                    PathNode.CurveTo(48.268013f, 230.0f, 42.0f, 223.73198f, 42.0f, 216.0f),
                    PathNode.LineTo(42.0f, 40.0f),
                    PathNode.CurveTo(42.0f, 32.268013f, 48.268013f, 26.0f, 56.0f, 26.0f),
                    PathNode.LineTo(200.0f, 26.0f),
                    PathNode.CurveTo(207.73198f, 26.0f, 214.0f, 32.268013f, 214.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 154.0f),
                    PathNode.LineTo(202.0f, 154.0f),
                    PathNode.LineTo(202.0f, 102.0f),
                    PathNode.LineTo(54.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 40.0f),
                    PathNode.LineTo(54.0f, 90.0f),
                    PathNode.LineTo(202.0f, 90.0f),
                    PathNode.LineTo(202.0f, 40.0f),
                    PathNode.CurveTo(202.0f, 38.89543f, 201.10457f, 38.0f, 200.0f, 38.0f),
                    PathNode.LineTo(56.0f, 38.0f),
                    PathNode.CurveTo(54.89543f, 38.0f, 54.0f, 38.89543f, 54.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 216.0f),
                    PathNode.LineTo(202.0f, 166.0f),
                    PathNode.LineTo(54.0f, 166.0f),
                    PathNode.LineTo(54.0f, 216.0f),
                    PathNode.CurveTo(54.0f, 217.10457f, 54.89543f, 218.0f, 56.0f, 218.0f),
                    PathNode.LineTo(200.0f, 218.0f),
                    PathNode.CurveTo(201.10457f, 218.0f, 202.0f, 217.10457f, 202.0f, 216.0f),
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
        return _dresser!!
    }

private var _dresser: ImageVector? = null
