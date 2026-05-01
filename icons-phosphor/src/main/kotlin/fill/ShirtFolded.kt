package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorFillIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.0f, 40.0f),
                    PathNode.LineTo(179.35f, 40.0f),
                    PathNode.LineTo(165.66f, 26.34f),
                    PathNode.CurveTo(164.15842f, 24.840092f, 162.12238f, 23.998331f, 160.0f, 24.0f),
                    PathNode.LineTo(96.0f, 24.0f),
                    PathNode.CurveTo(93.87763f, 23.998331f, 91.841576f, 24.840092f, 90.34f, 26.34f),
                    PathNode.LineTo(76.65f, 40.0f),
                    PathNode.LineTo(55.0f, 40.0f),
                    PathNode.CurveTo(46.71573f, 40.0f, 40.0f, 46.71573f, 40.0f, 55.0f),
                    PathNode.LineTo(40.0f, 209.0f),
                    PathNode.CurveTo(40.0f, 217.28427f, 46.71573f, 224.0f, 55.0f, 224.0f),
                    PathNode.LineTo(116.0f, 224.0f),
                    PathNode.CurveTo(118.20914f, 224.0f, 120.0f, 222.20914f, 120.0f, 220.0f),
                    PathNode.LineTo(120.0f, 104.27f),
                    PathNode.CurveTo(119.93666f, 99.98119f, 123.19688f, 96.371826f, 127.47f, 96.0f),
                    PathNode.CurveTo(129.68198f, 95.85313f, 131.85571f, 96.63069f, 133.47269f, 98.147194f),
                    PathNode.CurveTo(135.08966f, 99.6637f, 136.00487f, 101.783165f, 136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 220.0f),
                    PathNode.CurveTo(136.0f, 222.20914f, 137.79086f, 224.0f, 140.0f, 224.0f),
                    PathNode.LineTo(201.0f, 224.0f),
                    PathNode.CurveTo(209.28427f, 224.0f, 216.0f, 217.28427f, 216.0f, 209.0f),
                    PathNode.LineTo(216.0f, 55.0f),
                    PathNode.CurveTo(216.0f, 46.71573f, 209.28427f, 40.0f, 201.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.54f, 107.08f),
                    PathNode.CurveTo(85.34617f, 108.06133f, 83.69384f, 108.26717f, 82.29573f, 107.608734f),
                    PathNode.CurveTo(80.89763f, 106.9503f, 80.003876f, 105.54539f, 80.0f, 104.0f),
                    PathNode.LineTo(80.0f, 59.31f),
                    PathNode.LineTo(95.24f, 44.07f),
                    PathNode.LineTo(118.71f, 79.28f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 104.0f),
                    PathNode.CurveTo(176.00359f, 105.554054f, 175.10672f, 106.96953f, 173.7f, 107.63f),
                    PathNode.CurveTo(172.31747f, 108.2967f, 170.67334f, 108.097534f, 169.49f, 107.12f),
                    PathNode.LineTo(137.29f, 79.3f),
                    PathNode.LineTo(160.76f, 44.09f),
                    PathNode.LineTo(176.0f, 59.31f),
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
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
