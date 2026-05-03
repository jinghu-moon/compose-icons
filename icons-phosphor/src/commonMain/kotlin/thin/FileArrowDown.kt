package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileArrowDown: ImageVector
    get() {
        if (_fileArrowDown != null) return _fileArrowDown!!
        _fileArrowDown = phosphorThinIcon(
            name = "FileArrowDown",
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
                    PathNode.MoveTo(154.83f, 157.17f),
                    PathNode.CurveTo(155.58112f, 157.92027f, 156.00314f, 158.93837f, 156.00314f, 160.0f),
                    PathNode.CurveTo(156.00314f, 161.06163f, 155.58112f, 162.07973f, 154.83f, 162.83f),
                    PathNode.LineTo(130.83f, 186.83f),
                    PathNode.CurveTo(130.07973f, 187.58112f, 129.06163f, 188.00314f, 128.0f, 188.00314f),
                    PathNode.CurveTo(126.93836f, 188.00314f, 125.92027f, 187.58112f, 125.17f, 186.83f),
                    PathNode.LineTo(101.17f, 162.83f),
                    PathNode.CurveTo(99.60703f, 161.26703f, 99.60703f, 158.73297f, 101.17f, 157.17f),
                    PathNode.CurveTo(102.73296f, 155.60704f, 105.26704f, 155.60704f, 106.83f, 157.17f),
                    PathNode.LineTo(124.0f, 174.34f),
                    PathNode.LineTo(124.0f, 120.0f),
                    PathNode.CurveTo(124.0f, 117.79086f, 125.79086f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(130.20914f, 116.0f, 132.0f, 117.79086f, 132.0f, 120.0f),
                    PathNode.LineTo(132.0f, 174.34f),
                    PathNode.LineTo(149.17f, 157.17f),
                    PathNode.CurveTo(149.92027f, 156.41888f, 150.93837f, 155.99686f, 152.0f, 155.99686f),
                    PathNode.CurveTo(153.06163f, 155.99686f, 154.07973f, 156.41888f, 154.83f, 157.17f),
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
        return _fileArrowDown!!
    }

private var _fileArrowDown: ImageVector? = null
