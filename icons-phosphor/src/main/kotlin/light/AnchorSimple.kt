package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorLightIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 114.0f),
                    PathNode.LineTo(200.0f, 114.0f),
                    PathNode.CurveTo(196.6863f, 114.0f, 194.0f, 116.686295f, 194.0f, 120.0f),
                    PathNode.CurveTo(194.0f, 123.313705f, 196.6863f, 126.0f, 200.0f, 126.0f),
                    PathNode.LineTo(217.8f, 126.0f),
                    PathNode.CurveTo(214.73006f, 170.94505f, 178.94579f, 206.7208f, 134.0f, 209.78f),
                    PathNode.LineTo(134.0f, 93.4f),
                    PathNode.CurveTo(149.08978f, 90.31981f, 159.39601f, 76.313805f, 157.84808f, 60.990852f),
                    PathNode.CurveTo(156.30016f, 45.6679f, 143.40094f, 34.006123f, 128.0f, 34.006123f),
                    PathNode.CurveTo(112.59907f, 34.006123f, 99.699844f, 45.6679f, 98.15192f, 60.990852f),
                    PathNode.CurveTo(96.60398f, 76.313805f, 106.91022f, 90.31981f, 122.0f, 93.4f),
                    PathNode.LineTo(122.0f, 209.78f),
                    PathNode.CurveTo(77.054214f, 206.7208f, 41.269936f, 170.94505f, 38.2f, 126.0f),
                    PathNode.LineTo(56.0f, 126.0f),
                    PathNode.CurveTo(59.31371f, 126.0f, 62.0f, 123.313705f, 62.0f, 120.0f),
                    PathNode.CurveTo(62.0f, 116.686295f, 59.31371f, 114.0f, 56.0f, 114.0f),
                    PathNode.LineTo(32.0f, 114.0f),
                    PathNode.CurveTo(28.68629f, 114.0f, 26.0f, 116.686295f, 26.0f, 120.0f),
                    PathNode.CurveTo(26.0f, 176.33304f, 71.666954f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(184.33304f, 222.0f, 230.0f, 176.33304f, 230.0f, 120.0f),
                    PathNode.CurveTo(230.0f, 116.686295f, 227.3137f, 114.0f, 224.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 64.0f),
                    PathNode.CurveTo(110.0f, 54.058876f, 118.05888f, 46.0f, 128.0f, 46.0f),
                    PathNode.CurveTo(137.94113f, 46.0f, 146.0f, 54.058876f, 146.0f, 64.0f),
                    PathNode.CurveTo(146.0f, 73.94112f, 137.94113f, 82.0f, 128.0f, 82.0f),
                    PathNode.CurveTo(118.05888f, 82.0f, 110.0f, 73.94112f, 110.0f, 64.0f),
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
        return _anchorSimple!!
    }

private var _anchorSimple: ImageVector? = null
