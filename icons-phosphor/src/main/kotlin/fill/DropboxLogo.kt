package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) return _dropboxLogo!!
        _dropboxLogo = phosphorFillIcon(
            name = "DropboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 120.0f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.LineTo(183.56f, 43.0f),
                    PathNode.CurveTo(186.24829f, 41.2064f, 189.75171f, 41.2064f, 192.44f, 43.0f),
                    PathNode.LineTo(238.0f, 73.34f),
                    PathNode.CurveTo(240.22871f, 74.8232f, 241.5678f, 77.32287f, 241.5678f, 80.0f),
                    PathNode.CurveTo(241.5678f, 82.67713f, 240.22871f, 85.1768f, 238.0f, 86.66f),
                    PathNode.Close,
                    PathNode.MoveTo(72.44f, 43.0f),
                    PathNode.CurveTo(69.7517f, 41.2064f, 66.2483f, 41.2064f, 63.56f, 43.0f),
                    PathNode.LineTo(18.0f, 73.34f),
                    PathNode.CurveTo(15.771294f, 74.8232f, 14.4322f, 77.32287f, 14.4322f, 80.0f),
                    PathNode.CurveTo(14.4322f, 82.67713f, 15.771294f, 85.1768f, 18.0f, 86.66f),
                    PathNode.LineTo(68.0f, 120.0f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(238.0f, 153.34f),
                    PathNode.LineTo(188.0f, 120.0f),
                    PathNode.LineTo(128.0f, 160.0f),
                    PathNode.LineTo(183.56f, 197.0f),
                    PathNode.CurveTo(186.24829f, 198.7936f, 189.75171f, 198.7936f, 192.44f, 197.0f),
                    PathNode.LineTo(238.0f, 166.66f),
                    PathNode.CurveTo(240.22871f, 165.1768f, 241.5678f, 162.67712f, 241.5678f, 160.0f),
                    PathNode.CurveTo(241.5678f, 157.32288f, 240.22871f, 154.8232f, 238.0f, 153.34f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 153.34f),
                    PathNode.CurveTo(15.771294f, 154.8232f, 14.4322f, 157.32288f, 14.4322f, 160.0f),
                    PathNode.CurveTo(14.4322f, 162.67712f, 15.771294f, 165.1768f, 18.0f, 166.66f),
                    PathNode.LineTo(63.56f, 197.0f),
                    PathNode.CurveTo(66.2483f, 198.7936f, 69.7517f, 198.7936f, 72.44f, 197.0f),
                    PathNode.LineTo(128.0f, 160.0f),
                    PathNode.LineTo(68.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.61f, 206.29f),
                    PathNode.LineTo(130.24f, 180.71f),
                    PathNode.CurveTo(128.89586f, 179.8132f, 127.14415f, 179.8132f, 125.8f, 180.71f),
                    PathNode.LineTo(87.41f, 206.29f),
                    PathNode.CurveTo(86.29997f, 207.03233f, 85.6336f, 208.27963f, 85.6336f, 209.615f),
                    PathNode.CurveTo(85.6336f, 210.95036f, 86.29997f, 212.19766f, 87.41f, 212.94f),
                    PathNode.LineTo(123.56f, 237.0f),
                    PathNode.CurveTo(126.2483f, 238.7936f, 129.75171f, 238.7936f, 132.44f, 237.0f),
                    PathNode.LineTo(168.59f, 212.9f),
                    PathNode.CurveTo(169.68289f, 212.1549f, 170.33678f, 210.91772f, 170.33678f, 209.595f),
                    PathNode.CurveTo(170.33678f, 208.27228f, 169.68289f, 207.0351f, 168.59f, 206.29f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
