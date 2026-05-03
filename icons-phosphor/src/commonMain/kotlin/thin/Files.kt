package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = phosphorThinIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.83f, 69.17f),
                    PathNode.LineTo(170.83f, 29.17f),
                    PathNode.CurveTo(170.07921f, 28.420046f, 169.06119f, 27.999166f, 168.0f, 28.0f),
                    PathNode.LineTo(88.0f, 28.0f),
                    PathNode.CurveTo(81.37258f, 28.0f, 76.0f, 33.37258f, 76.0f, 40.0f),
                    PathNode.LineTo(76.0f, 60.0f),
                    PathNode.LineTo(56.0f, 60.0f),
                    PathNode.CurveTo(49.37258f, 60.0f, 44.0f, 65.37258f, 44.0f, 72.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(168.0f, 228.0f),
                    PathNode.CurveTo(174.62741f, 228.0f, 180.0f, 222.62741f, 180.0f, 216.0f),
                    PathNode.LineTo(180.0f, 196.0f),
                    PathNode.LineTo(200.0f, 196.0f),
                    PathNode.CurveTo(206.62741f, 196.0f, 212.0f, 190.62741f, 212.0f, 184.0f),
                    PathNode.LineTo(212.0f, 72.0f),
                    PathNode.CurveTo(212.00084f, 70.93881f, 211.57996f, 69.92079f, 210.83f, 69.17f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 216.0f),
                    PathNode.CurveTo(172.0f, 218.20914f, 170.20914f, 220.0f, 168.0f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(53.79086f, 220.0f, 52.0f, 218.20914f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 72.0f),
                    PathNode.CurveTo(52.0f, 69.79086f, 53.79086f, 68.0f, 56.0f, 68.0f),
                    PathNode.LineTo(134.34f, 68.0f),
                    PathNode.LineTo(172.0f, 105.66f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 184.0f),
                    PathNode.CurveTo(204.0f, 186.20914f, 202.20914f, 188.0f, 200.0f, 188.0f),
                    PathNode.LineTo(180.0f, 188.0f),
                    PathNode.LineTo(180.0f, 104.0f),
                    PathNode.CurveTo(180.00084f, 102.93881f, 179.57996f, 101.92079f, 178.83f, 101.17f),
                    PathNode.LineTo(138.83f, 61.17f),
                    PathNode.CurveTo(138.07921f, 60.420044f, 137.06119f, 59.999165f, 136.0f, 60.0f),
                    PathNode.LineTo(84.0f, 60.0f),
                    PathNode.LineTo(84.0f, 40.0f),
                    PathNode.CurveTo(84.0f, 37.79086f, 85.79086f, 36.0f, 88.0f, 36.0f),
                    PathNode.LineTo(166.34f, 36.0f),
                    PathNode.LineTo(204.0f, 73.66f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 152.0f),
                    PathNode.CurveTo(140.0f, 154.20914f, 138.20914f, 156.0f, 136.0f, 156.0f),
                    PathNode.LineTo(88.0f, 156.0f),
                    PathNode.CurveTo(85.79086f, 156.0f, 84.0f, 154.20914f, 84.0f, 152.0f),
                    PathNode.CurveTo(84.0f, 149.79086f, 85.79086f, 148.0f, 88.0f, 148.0f),
                    PathNode.LineTo(136.0f, 148.0f),
                    PathNode.CurveTo(138.20914f, 148.0f, 140.0f, 149.79086f, 140.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 184.0f),
                    PathNode.CurveTo(140.0f, 186.20914f, 138.20914f, 188.0f, 136.0f, 188.0f),
                    PathNode.LineTo(88.0f, 188.0f),
                    PathNode.CurveTo(85.79086f, 188.0f, 84.0f, 186.20914f, 84.0f, 184.0f),
                    PathNode.CurveTo(84.0f, 181.79086f, 85.79086f, 180.0f, 88.0f, 180.0f),
                    PathNode.LineTo(136.0f, 180.0f),
                    PathNode.CurveTo(138.20914f, 180.0f, 140.0f, 181.79086f, 140.0f, 184.0f),
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
        return _files!!
    }

private var _files: ImageVector? = null
