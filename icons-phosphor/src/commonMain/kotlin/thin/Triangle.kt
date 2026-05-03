package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = phosphorThinIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.34f, 190.09f),
                    PathNode.LineTo(145.88f, 38.22f),
                    PathNode.CurveTo(142.15059f, 31.88708f, 135.34944f, 27.999392f, 128.0f, 27.999392f),
                    PathNode.CurveTo(120.65055f, 27.999392f, 113.84941f, 31.88708f, 110.12f, 38.22f),
                    PathNode.LineTo(22.66f, 190.09f),
                    PathNode.CurveTo(19.099482f, 196.17761f, 19.099482f, 203.71239f, 22.66f, 209.8f),
                    PathNode.CurveTo(26.335732f, 216.1844f, 33.173573f, 220.08517f, 40.54f, 220.0f),
                    PathNode.LineTo(215.46f, 220.0f),
                    PathNode.CurveTo(222.8193f, 220.07791f, 229.64778f, 216.17812f, 233.32f, 209.8f),
                    PathNode.CurveTo(236.8867f, 203.716f, 236.89435f, 196.18121f, 233.34f, 190.09f),
                    PathNode.Close,
                    PathNode.MoveTo(226.4f, 205.8f),
                    PathNode.CurveTo(224.13855f, 209.68861f, 219.95802f, 212.05785f, 215.46f, 212.0f),
                    PathNode.LineTo(40.54f, 212.0f),
                    PathNode.CurveTo(36.04198f, 212.05785f, 31.86145f, 209.68861f, 29.6f, 205.8f),
                    PathNode.CurveTo(27.449085f, 202.18939f, 27.449085f, 197.69061f, 29.6f, 194.08f),
                    PathNode.LineTo(117.05f, 42.21f),
                    PathNode.CurveTo(119.354095f, 38.358677f, 123.51207f, 36.00096f, 128.0f, 36.00096f),
                    PathNode.CurveTo(132.48793f, 36.00096f, 136.6459f, 38.358677f, 138.95f, 42.21f),
                    PathNode.LineTo(226.4f, 194.08f),
                    PathNode.CurveTo(228.55092f, 197.69061f, 228.55092f, 202.18939f, 226.4f, 205.8f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _triangle!!
    }

private var _triangle: ImageVector? = null
