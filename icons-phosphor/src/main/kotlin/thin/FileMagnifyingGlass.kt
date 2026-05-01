package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileMagnifyingGlass: ImageVector
    get() {
        if (_fileMagnifyingGlass != null) return _fileMagnifyingGlass!!
        _fileMagnifyingGlass = phosphorThinIcon(
            name = "FileMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.83f, 85.17f),
                    PathNode.LineTo(154.83f, 29.17f),
                    PathNode.CurveTo(154.07921f, 28.420046f, 153.06119f, 27.999166f, 152.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(49.37258f, 28.0f, 44.0f, 33.37258f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(206.62741f, 228.0f, 212.0f, 222.62741f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 88.0f),
                    PathNode.CurveTo(212.00084f, 86.93881f, 211.57996f, 85.92079f, 210.83f, 85.17f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 41.65f),
                    PathNode.LineTo(198.34f, 84.0f),
                    PathNode.LineTo(156.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(53.79086f, 220.0f, 52.0f, 218.20914f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 37.79086f, 53.79086f, 36.0f, 56.0f, 36.0f),
                    PathNode.LineTo(148.0f, 36.0f),
                    PathNode.LineTo(148.0f, 88.0f),
                    PathNode.CurveTo(148.0f, 90.20914f, 149.79086f, 92.0f, 152.0f, 92.0f),
                    PathNode.LineTo(204.0f, 92.0f),
                    PathNode.LineTo(204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 218.20914f, 202.20914f, 220.0f, 200.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(149.26f, 167.61f),
                    PathNode.CurveTo(159.64172f, 154.24487f, 157.84299f, 135.11128f, 145.15227f, 123.91519f),
                    PathNode.CurveTo(132.46155f, 112.71909f, 113.252975f, 113.31946f, 101.28622f, 125.28622f),
                    PathNode.CurveTo(89.31946f, 137.25298f, 88.71909f, 156.46155f, 99.91519f, 169.15227f),
                    PathNode.CurveTo(111.11128f, 181.84299f, 130.24487f, 183.64172f, 143.61f, 173.26f),
                    PathNode.LineTo(157.17f, 186.83f),
                    PathNode.CurveTo(158.73297f, 188.39296f, 161.26703f, 188.39296f, 162.83f, 186.83f),
                    PathNode.CurveTo(164.39296f, 185.26703f, 164.39296f, 182.73297f, 162.83f, 181.17f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 148.0f),
                    PathNode.CurveTo(100.0f, 134.74516f, 110.74516f, 124.0f, 124.0f, 124.0f),
                    PathNode.CurveTo(137.25484f, 124.0f, 148.0f, 134.74516f, 148.0f, 148.0f),
                    PathNode.CurveTo(148.0f, 161.25484f, 137.25484f, 172.0f, 124.0f, 172.0f),
                    PathNode.CurveTo(110.74516f, 172.0f, 100.0f, 161.25484f, 100.0f, 148.0f),
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
        return _fileMagnifyingGlass!!
    }

private var _fileMagnifyingGlass: ImageVector? = null
