package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorLightIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 154.0f),
                    PathNode.LineTo(48.0f, 154.0f),
                    PathNode.CurveTo(40.268013f, 154.0f, 34.0f, 160.26802f, 34.0f, 168.0f),
                    PathNode.LineTo(34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 199.73198f, 40.268013f, 206.0f, 48.0f, 206.0f),
                    PathNode.LineTo(208.0f, 206.0f),
                    PathNode.CurveTo(215.73198f, 206.0f, 222.0f, 199.73198f, 222.0f, 192.0f),
                    PathNode.LineTo(222.0f, 168.0f),
                    PathNode.CurveTo(222.0f, 160.26802f, 215.73198f, 154.0f, 208.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 192.0f),
                    PathNode.CurveTo(210.0f, 193.10457f, 209.10457f, 194.0f, 208.0f, 194.0f),
                    PathNode.LineTo(48.0f, 194.0f),
                    PathNode.CurveTo(46.89543f, 194.0f, 46.0f, 193.10457f, 46.0f, 192.0f),
                    PathNode.LineTo(46.0f, 168.0f),
                    PathNode.CurveTo(46.0f, 166.89543f, 46.89543f, 166.0f, 48.0f, 166.0f),
                    PathNode.LineTo(208.0f, 166.0f),
                    PathNode.CurveTo(209.10457f, 166.0f, 210.0f, 166.89543f, 210.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.24f, 134.0f),
                    PathNode.LineTo(207.76f, 134.0f),
                    PathNode.CurveTo(213.44518f, 134.03162f, 218.6004f, 130.66693f, 220.86f, 125.45f),
                    PathNode.CurveTo(223.10136f, 120.36367f, 222.02458f, 114.42549f, 218.14f, 110.45f),
                    PathNode.LineTo(144.41f, 33.0f),
                    PathNode.CurveTo(140.11865f, 28.534817f, 134.19302f, 26.01116f, 128.0f, 26.01116f),
                    PathNode.CurveTo(121.80698f, 26.01116f, 115.881355f, 28.534817f, 111.59f, 33.0f),
                    PathNode.LineTo(37.86f, 110.5f),
                    PathNode.CurveTo(33.97542f, 114.47549f, 32.89863f, 120.41367f, 35.14f, 125.5f),
                    PathNode.CurveTo(37.41481f, 130.69736f, 42.566753f, 134.04022f, 48.24f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.55f, 118.77f),
                    PathNode.LineTo(120.28f, 41.26f),
                    PathNode.CurveTo(122.30765f, 39.175552f, 125.09203f, 37.999626f, 128.0f, 37.999626f),
                    PathNode.CurveTo(130.90796f, 37.999626f, 133.69235f, 39.175552f, 135.72f, 41.26f),
                    PathNode.LineTo(209.45f, 118.77f),
                    PathNode.CurveTo(210.01534f, 119.273476f, 210.17128f, 120.09426f, 209.83f, 120.77f),
                    PathNode.CurveTo(209.47719f, 121.58778f, 208.64888f, 122.09598f, 207.76f, 122.04f),
                    PathNode.LineTo(48.24f, 122.04f),
                    PathNode.CurveTo(47.351116f, 122.09598f, 46.522808f, 121.58778f, 46.17f, 120.77f),
                    PathNode.CurveTo(45.828712f, 120.09426f, 45.98466f, 119.273476f, 46.55f, 118.77f),
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
        return _eject!!
    }

private var _eject: ImageVector? = null
