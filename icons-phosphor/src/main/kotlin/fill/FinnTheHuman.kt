package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) return _finnTheHuman!!
        _finnTheHuman = phosphorFillIcon(
            name = "FinnTheHuman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 148.0f),
                    PathNode.CurveTo(176.0f, 154.62741f, 170.62741f, 160.0f, 164.0f, 160.0f),
                    PathNode.CurveTo(157.37259f, 160.0f, 152.0f, 154.62741f, 152.0f, 148.0f),
                    PathNode.CurveTo(152.0f, 141.37259f, 157.37259f, 136.0f, 164.0f, 136.0f),
                    PathNode.CurveTo(170.62741f, 136.0f, 176.0f, 141.37259f, 176.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 136.0f),
                    PathNode.CurveTo(85.37258f, 136.0f, 80.0f, 141.37259f, 80.0f, 148.0f),
                    PathNode.CurveTo(80.0f, 154.62741f, 85.37258f, 160.0f, 92.0f, 160.0f),
                    PathNode.CurveTo(98.62742f, 160.0f, 104.0f, 154.62741f, 104.0f, 148.0f),
                    PathNode.CurveTo(104.0f, 141.37259f, 98.62742f, 136.0f, 92.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 72.0f),
                    PathNode.LineTo(240.0f, 152.0f),
                    PathNode.CurveTo(239.95592f, 191.74623f, 207.74623f, 223.95592f, 168.0f, 224.0f),
                    PathNode.LineTo(88.0f, 224.0f),
                    PathNode.CurveTo(48.253773f, 223.95592f, 16.044088f, 191.74623f, 16.0f, 152.0f),
                    PathNode.LineTo(16.0f, 72.0f),
                    PathNode.CurveTo(15.968233f, 55.8615f, 27.95885f, 42.224945f, 43.96882f, 40.191933f),
                    PathNode.CurveTo(59.978783f, 38.15892f, 74.99713f, 48.36577f, 79.0f, 64.0f),
                    PathNode.LineTo(177.0f, 64.0f),
                    PathNode.CurveTo(181.00287f, 48.36577f, 196.02121f, 38.15892f, 212.03119f, 40.191933f),
                    PathNode.CurveTo(228.04115f, 42.224945f, 240.03177f, 55.8615f, 240.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 144.0f),
                    PathNode.CurveTo(200.0f, 126.32689f, 185.67311f, 112.0f, 168.0f, 112.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.CurveTo(70.32689f, 112.0f, 56.0f, 126.32689f, 56.0f, 144.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.CurveTo(56.0f, 169.67311f, 70.32689f, 184.0f, 88.0f, 184.0f),
                    PathNode.LineTo(168.0f, 184.0f),
                    PathNode.CurveTo(185.67311f, 184.0f, 200.0f, 169.67311f, 200.0f, 152.0f),
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
        return _finnTheHuman!!
    }

private var _finnTheHuman: ImageVector? = null
