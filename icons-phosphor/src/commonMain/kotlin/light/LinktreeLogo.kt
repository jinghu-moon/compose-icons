package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorLightIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.0f, 160.0f),
                    PathNode.LineTo(134.0f, 232.0f),
                    PathNode.CurveTo(134.0f, 235.3137f, 131.3137f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(124.686295f, 238.0f, 122.0f, 235.3137f, 122.0f, 232.0f),
                    PathNode.LineTo(122.0f, 160.0f),
                    PathNode.CurveTo(122.0f, 156.6863f, 124.686295f, 154.0f, 128.0f, 154.0f),
                    PathNode.CurveTo(131.3137f, 154.0f, 134.0f, 156.6863f, 134.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 98.0f),
                    PathNode.LineTo(142.48f, 98.0f),
                    PathNode.LineTo(188.24f, 52.24f),
                    PathNode.CurveTo(190.44287f, 49.875923f, 190.37787f, 46.19192f, 188.09297f, 43.907024f),
                    PathNode.CurveTo(185.80807f, 41.622128f, 182.12408f, 41.55713f, 179.76f, 43.76f),
                    PathNode.LineTo(134.0f, 89.52f),
                    PathNode.LineTo(134.0f, 24.0f),
                    PathNode.CurveTo(134.0f, 20.68629f, 131.3137f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(124.686295f, 18.0f, 122.0f, 20.68629f, 122.0f, 24.0f),
                    PathNode.LineTo(122.0f, 89.52f),
                    PathNode.LineTo(76.24f, 43.76f),
                    PathNode.CurveTo(73.87592f, 41.55713f, 70.191925f, 41.622128f, 67.90703f, 43.907024f),
                    PathNode.CurveTo(65.62213f, 46.19192f, 65.55713f, 49.875923f, 67.76f, 52.24f),
                    PathNode.LineTo(113.52f, 98.0f),
                    PathNode.LineTo(48.0f, 98.0f),
                    PathNode.CurveTo(44.68629f, 98.0f, 42.0f, 100.686295f, 42.0f, 104.0f),
                    PathNode.CurveTo(42.0f, 107.313705f, 44.68629f, 110.0f, 48.0f, 110.0f),
                    PathNode.LineTo(113.52f, 110.0f),
                    PathNode.LineTo(67.76f, 155.76f),
                    PathNode.CurveTo(66.15478f, 157.25575f, 65.494f, 159.50844f, 66.03692f, 161.63431f),
                    PathNode.CurveTo(66.57983f, 163.76018f, 68.23982f, 165.42018f, 70.3657f, 165.96309f),
                    PathNode.CurveTo(72.491554f, 166.506f, 74.74423f, 165.84523f, 76.24f, 164.24f),
                    PathNode.LineTo(128.0f, 112.48f),
                    PathNode.LineTo(179.76f, 164.24f),
                    PathNode.CurveTo(182.12408f, 166.44287f, 185.80807f, 166.37787f, 188.09297f, 164.09297f),
                    PathNode.CurveTo(190.37787f, 161.80807f, 190.44287f, 158.12408f, 188.24f, 155.76f),
                    PathNode.LineTo(142.48f, 110.0f),
                    PathNode.LineTo(208.0f, 110.0f),
                    PathNode.CurveTo(211.3137f, 110.0f, 214.0f, 107.313705f, 214.0f, 104.0f),
                    PathNode.CurveTo(214.0f, 100.686295f, 211.3137f, 98.0f, 208.0f, 98.0f),
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
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
