package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorThinIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 80.0f),
                    PathNode.CurveTo(124.0f, 77.79086f, 125.79086f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(130.20914f, 76.0f, 132.0f, 77.79086f, 132.0f, 80.0f),
                    PathNode.LineTo(132.0f, 136.0f),
                    PathNode.CurveTo(132.0f, 138.20914f, 130.20914f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(125.79086f, 140.0f, 124.0f, 138.20914f, 124.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 91.55f),
                    PathNode.LineTo(228.0f, 164.45f),
                    PathNode.CurveTo(228.0025f, 167.63358f, 226.73987f, 170.68764f, 224.49f, 172.94f),
                    PathNode.LineTo(172.94f, 224.49f),
                    PathNode.CurveTo(170.68764f, 226.73987f, 167.63358f, 228.0025f, 164.45f, 228.0f),
                    PathNode.LineTo(91.55f, 228.0f),
                    PathNode.CurveTo(88.36645f, 228.0025f, 85.31236f, 226.73987f, 83.06f, 224.49f),
                    PathNode.LineTo(31.51f, 172.94f),
                    PathNode.CurveTo(29.260138f, 170.68764f, 27.997498f, 167.63358f, 28.0f, 164.45f),
                    PathNode.LineTo(28.0f, 91.55f),
                    PathNode.CurveTo(27.997498f, 88.36645f, 29.260138f, 85.31236f, 31.51f, 83.06f),
                    PathNode.LineTo(83.06f, 31.51f),
                    PathNode.CurveTo(85.31236f, 29.260138f, 88.36645f, 27.997498f, 91.55f, 28.0f),
                    PathNode.LineTo(164.45f, 28.0f),
                    PathNode.CurveTo(167.63358f, 27.997498f, 170.68764f, 29.260138f, 172.94f, 31.51f),
                    PathNode.LineTo(224.49f, 83.06f),
                    PathNode.CurveTo(226.73987f, 85.31236f, 228.0025f, 88.36645f, 228.0f, 91.55f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 91.55f),
                    PathNode.CurveTo(220.00084f, 90.488815f, 219.57996f, 89.47079f, 218.83f, 88.72f),
                    PathNode.LineTo(167.28f, 37.17f),
                    PathNode.CurveTo(166.52554f, 36.425552f, 165.50989f, 36.00565f, 164.45f, 36.0f),
                    PathNode.LineTo(91.55f, 36.0f),
                    PathNode.CurveTo(90.49011f, 36.00565f, 89.47445f, 36.425552f, 88.72f, 37.17f),
                    PathNode.LineTo(37.17f, 88.72f),
                    PathNode.CurveTo(36.420044f, 89.47079f, 35.999165f, 90.488815f, 36.0f, 91.55f),
                    PathNode.LineTo(36.0f, 164.45f),
                    PathNode.CurveTo(35.999165f, 165.51118f, 36.420044f, 166.5292f, 37.17f, 167.28f),
                    PathNode.LineTo(88.72f, 218.83f),
                    PathNode.CurveTo(89.47445f, 219.57445f, 90.49011f, 219.99435f, 91.55f, 220.0f),
                    PathNode.LineTo(164.45f, 220.0f),
                    PathNode.CurveTo(165.50989f, 219.99435f, 166.52554f, 219.57445f, 167.28f, 218.83f),
                    PathNode.LineTo(218.83f, 167.28f),
                    PathNode.CurveTo(219.57996f, 166.5292f, 220.00084f, 165.51118f, 220.0f, 164.45f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(123.58172f, 164.0f, 120.0f, 167.58173f, 120.0f, 172.0f),
                    PathNode.CurveTo(120.0f, 176.41827f, 123.58172f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(132.41827f, 180.0f, 136.0f, 176.41827f, 136.0f, 172.0f),
                    PathNode.CurveTo(136.0f, 167.58173f, 132.41827f, 164.0f, 128.0f, 164.0f),
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
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
