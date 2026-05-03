package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Info: ImageVector
    get() {
        if (_info != null) return _info!!
        _info = phosphorLightIcon(
            name = "Info",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(142.0f, 176.0f),
                    PathNode.CurveTo(142.0f, 179.3137f, 139.3137f, 182.0f, 136.0f, 182.0f),
                    PathNode.CurveTo(128.26802f, 182.0f, 122.0f, 175.73198f, 122.0f, 168.0f),
                    PathNode.LineTo(122.0f, 128.0f),
                    PathNode.CurveTo(122.0f, 126.89543f, 121.10457f, 126.0f, 120.0f, 126.0f),
                    PathNode.CurveTo(116.686295f, 126.0f, 114.0f, 123.313705f, 114.0f, 120.0f),
                    PathNode.CurveTo(114.0f, 116.686295f, 116.686295f, 114.0f, 120.0f, 114.0f),
                    PathNode.CurveTo(127.73199f, 114.0f, 134.0f, 120.26801f, 134.0f, 128.0f),
                    PathNode.LineTo(134.0f, 168.0f),
                    PathNode.CurveTo(134.0f, 169.10457f, 134.89543f, 170.0f, 136.0f, 170.0f),
                    PathNode.CurveTo(139.3137f, 170.0f, 142.0f, 172.6863f, 142.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 94.0f),
                    PathNode.CurveTo(129.52284f, 94.0f, 134.0f, 89.52285f, 134.0f, 84.0f),
                    PathNode.CurveTo(134.0f, 78.47715f, 129.52284f, 74.0f, 124.0f, 74.0f),
                    PathNode.CurveTo(118.47715f, 74.0f, 114.0f, 78.47715f, 114.0f, 84.0f),
                    PathNode.CurveTo(114.0f, 89.52285f, 118.47715f, 94.0f, 124.0f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 184.33304f, 184.33304f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(71.666954f, 230.0f, 26.0f, 184.33304f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 71.666954f, 71.666954f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(184.30563f, 26.066126f, 229.93387f, 71.69437f, 230.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 128.0f),
                    PathNode.CurveTo(218.0f, 78.29437f, 177.70563f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(78.29437f, 38.0f, 38.0f, 78.29437f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 177.70563f, 78.29437f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(177.68279f, 217.94489f, 217.94489f, 177.68279f, 218.0f, 128.0f),
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
        return _info!!
    }

private var _info: ImageVector? = null
