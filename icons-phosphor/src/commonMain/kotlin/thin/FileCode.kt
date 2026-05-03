package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileCode: ImageVector
    get() {
        if (_fileCode != null) return _fileCode!!
        _fileCode = phosphorThinIcon(
            name = "FileCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.83f, 149.17f),
                    PathNode.CurveTo(179.58112f, 149.92027f, 180.00314f, 150.93837f, 180.00314f, 152.0f),
                    PathNode.CurveTo(180.00314f, 153.06163f, 179.58112f, 154.07973f, 178.83f, 154.83f),
                    PathNode.LineTo(154.83f, 178.83f),
                    PathNode.CurveTo(153.26703f, 180.39296f, 150.73297f, 180.39296f, 149.17f, 178.83f),
                    PathNode.CurveTo(147.60704f, 177.26703f, 147.60704f, 174.73297f, 149.17f, 173.17f),
                    PathNode.LineTo(170.34f, 152.0f),
                    PathNode.LineTo(149.17f, 130.83f),
                    PathNode.CurveTo(147.60704f, 129.26703f, 147.60704f, 126.73296f, 149.17f, 125.17f),
                    PathNode.CurveTo(150.73297f, 123.60703f, 153.26703f, 123.60703f, 154.83f, 125.17f),
                    PathNode.Close,
                    PathNode.MoveTo(106.83f, 125.17f),
                    PathNode.CurveTo(106.07973f, 124.418884f, 105.06164f, 123.99686f, 104.0f, 123.99686f),
                    PathNode.CurveTo(102.93836f, 123.99686f, 101.92027f, 124.418884f, 101.17f, 125.17f),
                    PathNode.LineTo(77.17f, 149.17f),
                    PathNode.CurveTo(76.418884f, 149.92027f, 75.99686f, 150.93837f, 75.99686f, 152.0f),
                    PathNode.CurveTo(75.99686f, 153.06163f, 76.418884f, 154.07973f, 77.17f, 154.83f),
                    PathNode.LineTo(101.17f, 178.83f),
                    PathNode.CurveTo(102.73296f, 180.39296f, 105.26704f, 180.39296f, 106.83f, 178.83f),
                    PathNode.CurveTo(108.39297f, 177.26703f, 108.39297f, 174.73297f, 106.83f, 173.17f),
                    PathNode.LineTo(85.66f, 152.0f),
                    PathNode.LineTo(106.83f, 130.83f),
                    PathNode.CurveTo(107.581116f, 130.07973f, 108.00314f, 129.06163f, 108.00314f, 128.0f),
                    PathNode.CurveTo(108.00314f, 126.93836f, 107.581116f, 125.92027f, 106.83f, 125.17f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 88.0f),
                    PathNode.LineTo(212.0f, 216.0f),
                    PathNode.CurveTo(212.0f, 222.62741f, 206.62741f, 228.0f, 200.0f, 228.0f),
                    PathNode.LineTo(56.0f, 228.0f),
                    PathNode.CurveTo(49.37258f, 228.0f, 44.0f, 222.62741f, 44.0f, 216.0f),
                    PathNode.LineTo(44.0f, 40.0f),
                    PathNode.CurveTo(44.0f, 33.37258f, 49.37258f, 28.0f, 56.0f, 28.0f),
                    PathNode.LineTo(152.0f, 28.0f),
                    PathNode.CurveTo(153.06119f, 27.999166f, 154.07921f, 28.420046f, 154.83f, 29.17f),
                    PathNode.LineTo(210.83f, 85.17f),
                    PathNode.CurveTo(211.57996f, 85.92079f, 212.00084f, 86.93881f, 212.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 84.0f),
                    PathNode.LineTo(198.34f, 84.0f),
                    PathNode.LineTo(156.0f, 41.65f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 216.0f),
                    PathNode.LineTo(204.0f, 92.0f),
                    PathNode.LineTo(152.0f, 92.0f),
                    PathNode.CurveTo(149.79086f, 92.0f, 148.0f, 90.20914f, 148.0f, 88.0f),
                    PathNode.LineTo(148.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(53.79086f, 36.0f, 52.0f, 37.79086f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 218.20914f, 53.79086f, 220.0f, 56.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(202.20914f, 220.0f, 204.0f, 218.20914f, 204.0f, 216.0f),
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
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
