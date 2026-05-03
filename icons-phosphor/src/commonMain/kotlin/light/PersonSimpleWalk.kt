package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorLightIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 78.0f),
                    PathNode.CurveTo(168.56854f, 78.0f, 182.0f, 64.56854f, 182.0f, 48.0f),
                    PathNode.CurveTo(182.0f, 31.431458f, 168.56854f, 18.0f, 152.0f, 18.0f),
                    PathNode.CurveTo(135.43146f, 18.0f, 122.0f, 31.431458f, 122.0f, 48.0f),
                    PathNode.CurveTo(122.0f, 64.56854f, 135.43146f, 78.0f, 152.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 30.0f),
                    PathNode.CurveTo(161.94113f, 30.0f, 170.0f, 38.058876f, 170.0f, 48.0f),
                    PathNode.CurveTo(170.0f, 57.941124f, 161.94113f, 66.0f, 152.0f, 66.0f),
                    PathNode.CurveTo(142.05887f, 66.0f, 134.0f, 57.941124f, 134.0f, 48.0f),
                    PathNode.CurveTo(134.0f, 38.058876f, 142.05887f, 30.0f, 152.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 144.0f),
                    PathNode.CurveTo(214.0f, 147.3137f, 211.3137f, 150.0f, 208.0f, 150.0f),
                    PathNode.CurveTo(173.52f, 150.0f, 156.94f, 133.25f, 142.3f, 118.48f),
                    PathNode.CurveTo(138.83f, 114.97f, 135.55f, 111.66f, 132.15f, 108.7f),
                    PathNode.LineTo(117.0f, 143.61f),
                    PathNode.LineTo(155.52f, 171.12f),
                    PathNode.CurveTo(157.08377f, 172.25282f, 158.00674f, 174.06903f, 158.0f, 176.0f),
                    PathNode.LineTo(158.0f, 232.0f),
                    PathNode.CurveTo(158.0f, 235.3137f, 155.3137f, 238.0f, 152.0f, 238.0f),
                    PathNode.CurveTo(148.6863f, 238.0f, 146.0f, 235.3137f, 146.0f, 232.0f),
                    PathNode.LineTo(146.0f, 179.09f),
                    PathNode.LineTo(112.08f, 154.86f),
                    PathNode.LineTo(77.5f, 234.39f),
                    PathNode.CurveTo(76.11388f, 237.31622f, 72.65599f, 238.61478f, 69.68633f, 237.32434f),
                    PathNode.CurveTo(66.71667f, 236.03389f, 65.30658f, 232.61996f, 66.5f, 229.61f),
                    PathNode.LineTo(121.5f, 103.0f),
                    PathNode.CurveTo(111.32f, 100.25f, 98.43f, 103.0f, 82.99f, 111.29f),
                    PathNode.CurveTo(71.87513f, 117.4155f, 61.500492f, 124.79719f, 52.07f, 133.29f),
                    PathNode.CurveTo(49.647102f, 135.4902f, 45.90796f, 135.34285f, 43.665733f, 132.95877f),
                    PathNode.CurveTo(41.423508f, 130.5747f, 41.50549f, 126.83356f, 43.85f, 124.55f),
                    PathNode.CurveTo(53.97538f, 115.356705f, 65.14123f, 107.37917f, 77.12f, 100.78f),
                    PathNode.CurveTo(103.05f, 86.78f, 124.76f, 86.39f, 139.89f, 99.52f),
                    PathNode.CurveTo(143.66f, 102.79f, 147.29f, 106.45f, 150.79f, 109.99f),
                    PathNode.CurveTo(164.41f, 123.74f, 178.48f, 137.99f, 207.96f, 137.99f),
                    PathNode.CurveTo(209.55995f, 137.97932f, 211.0979f, 138.60814f, 212.23207f, 139.73668f),
                    PathNode.CurveTo(213.36626f, 140.86522f, 214.0027f, 142.40001f, 214.0f, 144.0f),
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
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
