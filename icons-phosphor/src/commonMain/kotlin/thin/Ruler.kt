package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorThinIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 76.2f),
                    PathNode.LineTo(179.8f, 23.51f),
                    PathNode.CurveTo(177.54837f, 21.250546f, 174.48982f, 19.980537f, 171.3f, 19.980537f),
                    PathNode.CurveTo(168.11017f, 19.980537f, 165.05162f, 21.250546f, 162.8f, 23.51f),
                    PathNode.LineTo(23.51f, 162.83f),
                    PathNode.CurveTo(21.250546f, 165.08162f, 19.980537f, 168.14018f, 19.980537f, 171.33f),
                    PathNode.CurveTo(19.980537f, 174.51982f, 21.250546f, 177.57838f, 23.51f, 179.83f),
                    PathNode.LineTo(76.2f, 232.49f),
                    PathNode.CurveTo(78.45162f, 234.74945f, 81.510185f, 236.01947f, 84.7f, 236.01947f),
                    PathNode.CurveTo(87.88982f, 236.01947f, 90.94838f, 234.74945f, 93.2f, 232.49f),
                    PathNode.LineTo(232.49f, 93.17f),
                    PathNode.CurveTo(237.17592f, 88.48377f, 237.17592f, 80.88623f, 232.49f, 76.2f),
                    PathNode.Close,
                    PathNode.MoveTo(226.83f, 87.51f),
                    PathNode.LineTo(87.51f, 226.83f),
                    PathNode.CurveTo(85.94869f, 228.38753f, 83.42131f, 228.38753f, 81.86f, 226.83f),
                    PathNode.LineTo(29.17f, 174.14f),
                    PathNode.CurveTo(27.612467f, 172.57869f, 27.612467f, 170.05132f, 29.17f, 168.49f),
                    PathNode.LineTo(64.0f, 133.66f),
                    PathNode.LineTo(93.17f, 162.83f),
                    PathNode.CurveTo(94.73296f, 164.39296f, 97.26704f, 164.39296f, 98.83f, 162.83f),
                    PathNode.CurveTo(100.39297f, 161.26703f, 100.39297f, 158.73297f, 98.83f, 157.17f),
                    PathNode.LineTo(69.65f, 128.0f),
                    PathNode.LineTo(96.0f, 101.66f),
                    PathNode.LineTo(125.17f, 130.83f),
                    PathNode.CurveTo(126.73296f, 132.39296f, 129.26703f, 132.39296f, 130.83f, 130.83f),
                    PathNode.CurveTo(132.39296f, 129.26703f, 132.39296f, 126.73296f, 130.83f, 125.17f),
                    PathNode.LineTo(101.65f, 96.0f),
                    PathNode.LineTo(128.0f, 69.66f),
                    PathNode.LineTo(157.17f, 98.83f),
                    PathNode.CurveTo(158.73297f, 100.39297f, 161.26703f, 100.39297f, 162.83f, 98.83f),
                    PathNode.CurveTo(164.39296f, 97.26704f, 164.39296f, 94.73296f, 162.83f, 93.17f),
                    PathNode.LineTo(133.66f, 64.0f),
                    PathNode.LineTo(168.49f, 29.17f),
                    PathNode.CurveTo(170.05132f, 27.612467f, 172.57869f, 27.612467f, 174.14f, 29.17f),
                    PathNode.LineTo(226.83f, 81.86f),
                    PathNode.CurveTo(228.38753f, 83.42131f, 228.38753f, 85.94869f, 226.83f, 87.51f),
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null
