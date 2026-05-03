package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = phosphorLightIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.57f, 81.81f),
                    PathNode.LineTo(182.19f, 40.43f),
                    PathNode.CurveTo(178.0639f, 36.301968f, 172.46655f, 33.982697f, 166.63f, 33.982697f),
                    PathNode.CurveTo(160.79344f, 33.982697f, 155.19609f, 36.301968f, 151.07f, 40.43f),
                    PathNode.LineTo(32.43f, 159.07f),
                    PathNode.CurveTo(23.840265f, 167.66124f, 23.840265f, 181.58876f, 32.43f, 190.18f),
                    PathNode.LineTo(62.5f, 220.24f),
                    PathNode.CurveTo(63.624138f, 221.36554f, 65.14924f, 221.9986f, 66.74f, 222.0f),
                    PathNode.LineTo(216.0f, 222.0f),
                    PathNode.CurveTo(219.3137f, 222.0f, 222.0f, 219.3137f, 222.0f, 216.0f),
                    PathNode.CurveTo(222.0f, 212.6863f, 219.3137f, 210.0f, 216.0f, 210.0f),
                    PathNode.LineTo(126.49f, 210.0f),
                    PathNode.LineTo(223.57f, 112.92f),
                    PathNode.CurveTo(232.15973f, 104.32877f, 232.15973f, 90.40122f, 223.57f, 81.81f),
                    PathNode.Close,
                    PathNode.MoveTo(109.51f, 210.0f),
                    PathNode.LineTo(69.22f, 210.0f),
                    PathNode.LineTo(40.92f, 181.7f),
                    PathNode.CurveTo(39.04223f, 179.82431f, 37.987133f, 177.2791f, 37.987133f, 174.62498f),
                    PathNode.CurveTo(37.987133f, 171.9709f, 39.04223f, 169.42569f, 40.92f, 167.55f),
                    PathNode.LineTo(96.0f, 112.48f),
                    PathNode.LineTo(151.52f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.08f, 104.44f),
                    PathNode.LineTo(160.0f, 159.51f),
                    PathNode.LineTo(104.48f, 104.0f),
                    PathNode.LineTo(159.56f, 48.93f),
                    PathNode.CurveTo(163.465f, 45.02618f, 169.795f, 45.02618f, 173.7f, 48.93f),
                    PathNode.LineTo(215.08f, 90.3f),
                    PathNode.CurveTo(218.98383f, 94.205f, 218.98383f, 100.535f, 215.08f, 104.44f),
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
