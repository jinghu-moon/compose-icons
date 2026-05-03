package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorLightIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 138.0f),
                    PathNode.CurveTo(212.6863f, 138.0f, 210.0f, 140.6863f, 210.0f, 144.0f),
                    PathNode.CurveTo(210.0f, 170.09f, 195.0f, 175.52f, 170.42f, 182.21f),
                    PathNode.CurveTo(158.0f, 185.6f, 143.79f, 189.47f, 134.0f, 199.16f),
                    PathNode.LineTo(134.0f, 126.0f),
                    PathNode.LineTo(168.0f, 126.0f),
                    PathNode.CurveTo(171.3137f, 126.0f, 174.0f, 123.313705f, 174.0f, 120.0f),
                    PathNode.CurveTo(174.0f, 116.686295f, 171.3137f, 114.0f, 168.0f, 114.0f),
                    PathNode.LineTo(134.0f, 114.0f),
                    PathNode.LineTo(134.0f, 85.4f),
                    PathNode.CurveTo(149.08978f, 82.31981f, 159.39601f, 68.313805f, 157.84808f, 52.990852f),
                    PathNode.CurveTo(156.30016f, 37.6679f, 143.40094f, 26.006123f, 128.0f, 26.006123f),
                    PathNode.CurveTo(112.59907f, 26.006123f, 99.699844f, 37.6679f, 98.15192f, 52.990852f),
                    PathNode.CurveTo(96.60398f, 68.313805f, 106.91022f, 82.31981f, 122.0f, 85.4f),
                    PathNode.LineTo(122.0f, 114.0f),
                    PathNode.LineTo(88.0f, 114.0f),
                    PathNode.CurveTo(84.686295f, 114.0f, 82.0f, 116.686295f, 82.0f, 120.0f),
                    PathNode.CurveTo(82.0f, 123.313705f, 84.686295f, 126.0f, 88.0f, 126.0f),
                    PathNode.LineTo(122.0f, 126.0f),
                    PathNode.LineTo(122.0f, 199.16f),
                    PathNode.CurveTo(112.21f, 189.47f, 98.0f, 185.6f, 85.58f, 182.21f),
                    PathNode.CurveTo(61.0f, 175.52f, 46.0f, 170.09f, 46.0f, 144.0f),
                    PathNode.CurveTo(46.0f, 140.6863f, 43.31371f, 138.0f, 40.0f, 138.0f),
                    PathNode.CurveTo(36.68629f, 138.0f, 34.0f, 140.6863f, 34.0f, 144.0f),
                    PathNode.CurveTo(34.0f, 180.58f, 60.85f, 187.91f, 82.42f, 193.79f),
                    PathNode.CurveTo(107.0f, 200.48f, 122.0f, 205.91f, 122.0f, 232.0f),
                    PathNode.CurveTo(122.0f, 235.3137f, 124.686295f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(131.3137f, 238.0f, 134.0f, 235.3137f, 134.0f, 232.0f),
                    PathNode.CurveTo(134.0f, 205.91f, 149.0f, 200.48f, 173.58f, 193.79f),
                    PathNode.CurveTo(195.15f, 187.91f, 222.0f, 180.58f, 222.0f, 144.0f),
                    PathNode.CurveTo(222.0f, 140.6863f, 219.3137f, 138.0f, 216.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 56.0f),
                    PathNode.CurveTo(110.0f, 46.058876f, 118.05888f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(137.94113f, 38.0f, 146.0f, 46.058876f, 146.0f, 56.0f),
                    PathNode.CurveTo(146.0f, 65.941124f, 137.94113f, 74.0f, 128.0f, 74.0f),
                    PathNode.CurveTo(118.05888f, 74.0f, 110.0f, 65.941124f, 110.0f, 56.0f),
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
        return _anchor!!
    }

private var _anchor: ImageVector? = null
