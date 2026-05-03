package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HouseLine: ImageVector
    get() {
        if (_houseLine != null) return _houseLine!!
        _houseLine = phosphorLightIcon(
            name = "HouseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 210.0f),
                    PathNode.LineTo(222.0f, 210.0f),
                    PathNode.LineTo(222.0f, 131.17f),
                    PathNode.LineTo(227.76f, 136.93f),
                    PathNode.CurveTo(230.10991f, 139.23932f, 233.88234f, 139.22177f, 236.21066f, 136.8907f),
                    PathNode.CurveTo(238.53899f, 134.55963f, 238.55208f, 130.78719f, 236.24f, 128.44f),
                    PathNode.LineTo(137.9f, 30.09f),
                    PathNode.CurveTo(135.27444f, 27.464182f, 131.71327f, 25.98899f, 128.0f, 25.98899f),
                    PathNode.CurveTo(124.28672f, 25.98899f, 120.72555f, 27.464182f, 118.1f, 30.09f),
                    PathNode.LineTo(19.76f, 128.44f),
                    PathNode.CurveTo(17.447916f, 130.78719f, 17.461014f, 134.55963f, 19.78934f, 136.8907f),
                    PathNode.CurveTo(22.117666f, 139.22177f, 25.890093f, 139.23932f, 28.24f, 136.93f),
                    PathNode.LineTo(34.0f, 131.17f),
                    PathNode.LineTo(34.0f, 210.0f),
                    PathNode.LineTo(16.0f, 210.0f),
                    PathNode.CurveTo(12.686292f, 210.0f, 10.0f, 212.6863f, 10.0f, 216.0f),
                    PathNode.CurveTo(10.0f, 219.3137f, 12.686292f, 222.0f, 16.0f, 222.0f),
                    PathNode.LineTo(240.0f, 222.0f),
                    PathNode.CurveTo(243.3137f, 222.0f, 246.0f, 219.3137f, 246.0f, 216.0f),
                    PathNode.CurveTo(246.0f, 212.6863f, 243.3137f, 210.0f, 240.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 119.17f),
                    PathNode.LineTo(126.58f, 38.58f),
                    PathNode.CurveTo(126.955536f, 38.201378f, 127.46673f, 37.988403f, 128.0f, 37.988403f),
                    PathNode.CurveTo(128.53328f, 37.988403f, 129.04446f, 38.201378f, 129.42f, 38.58f),
                    PathNode.LineTo(210.0f, 119.17f),
                    PathNode.LineTo(210.0f, 210.0f),
                    PathNode.LineTo(158.0f, 210.0f),
                    PathNode.LineTo(158.0f, 152.0f),
                    PathNode.CurveTo(158.0f, 148.6863f, 155.3137f, 146.0f, 152.0f, 146.0f),
                    PathNode.LineTo(104.0f, 146.0f),
                    PathNode.CurveTo(100.686295f, 146.0f, 98.0f, 148.6863f, 98.0f, 152.0f),
                    PathNode.LineTo(98.0f, 210.0f),
                    PathNode.LineTo(46.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 210.0f),
                    PathNode.LineTo(110.0f, 210.0f),
                    PathNode.LineTo(110.0f, 158.0f),
                    PathNode.LineTo(146.0f, 158.0f),
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
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
