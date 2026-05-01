package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorThinIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.49f, 83.06f),
                    PathNode.LineTo(172.94f, 31.51f),
                    PathNode.CurveTo(170.68764f, 29.260138f, 167.63358f, 27.997498f, 164.45f, 28.0f),
                    PathNode.LineTo(91.55f, 28.0f),
                    PathNode.CurveTo(88.36645f, 27.997498f, 85.31236f, 29.260138f, 83.06f, 31.51f),
                    PathNode.LineTo(31.51f, 83.06f),
                    PathNode.CurveTo(29.260138f, 85.31236f, 27.997498f, 88.36645f, 28.0f, 91.55f),
                    PathNode.LineTo(28.0f, 164.45f),
                    PathNode.CurveTo(27.997498f, 167.63358f, 29.260138f, 170.68764f, 31.51f, 172.94f),
                    PathNode.LineTo(83.06f, 224.49f),
                    PathNode.CurveTo(85.31236f, 226.73987f, 88.36645f, 228.0025f, 91.55f, 228.0f),
                    PathNode.LineTo(164.45f, 228.0f),
                    PathNode.CurveTo(167.63358f, 228.0025f, 170.68764f, 226.73987f, 172.94f, 224.49f),
                    PathNode.LineTo(224.49f, 172.94f),
                    PathNode.CurveTo(226.73987f, 170.68764f, 228.0025f, 167.63358f, 228.0f, 164.45f),
                    PathNode.LineTo(228.0f, 91.55f),
                    PathNode.CurveTo(228.0025f, 88.36645f, 226.73987f, 85.31236f, 224.49f, 83.06f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 164.45f),
                    PathNode.CurveTo(220.00084f, 165.51118f, 219.57996f, 166.5292f, 218.83f, 167.28f),
                    PathNode.LineTo(167.28f, 218.83f),
                    PathNode.CurveTo(166.5292f, 219.57996f, 165.51118f, 220.00084f, 164.45f, 220.0f),
                    PathNode.LineTo(91.55f, 220.0f),
                    PathNode.CurveTo(90.488815f, 220.00084f, 89.47079f, 219.57996f, 88.72f, 218.83f),
                    PathNode.LineTo(37.17f, 167.28f),
                    PathNode.CurveTo(36.420044f, 166.5292f, 35.999165f, 165.51118f, 36.0f, 164.45f),
                    PathNode.LineTo(36.0f, 91.55f),
                    PathNode.CurveTo(35.999165f, 90.488815f, 36.420044f, 89.47079f, 37.17f, 88.72f),
                    PathNode.LineTo(88.72f, 37.17f),
                    PathNode.CurveTo(89.47079f, 36.420044f, 90.488815f, 35.999165f, 91.55f, 36.0f),
                    PathNode.LineTo(164.45f, 36.0f),
                    PathNode.CurveTo(165.51118f, 35.999165f, 166.5292f, 36.420044f, 167.28f, 37.17f),
                    PathNode.LineTo(218.83f, 88.72f),
                    PathNode.CurveTo(219.57996f, 89.47079f, 220.00084f, 90.488815f, 220.0f, 91.55f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _octagon!!
    }

private var _octagon: ImageVector? = null
