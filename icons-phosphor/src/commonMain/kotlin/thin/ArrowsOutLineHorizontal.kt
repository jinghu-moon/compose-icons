package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrowsOutLineHorizontal != null) return _arrowsOutLineHorizontal!!
        _arrowsOutLineHorizontal = phosphorThinIcon(
            name = "ArrowsOutLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 40.0f),
                    PathNode.LineTo(132.0f, 216.0f),
                    PathNode.CurveTo(132.0f, 218.20914f, 130.20914f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(125.79086f, 220.0f, 124.0f, 218.20914f, 124.0f, 216.0f),
                    PathNode.LineTo(124.0f, 40.0f),
                    PathNode.CurveTo(124.0f, 37.79086f, 125.79086f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(130.20914f, 36.0f, 132.0f, 37.79086f, 132.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 124.0f),
                    PathNode.LineTo(25.66f, 124.0f),
                    PathNode.LineTo(50.83f, 98.83f),
                    PathNode.CurveTo(52.392967f, 97.26704f, 52.392967f, 94.73296f, 50.83f, 93.17f),
                    PathNode.CurveTo(49.267033f, 91.60703f, 46.732967f, 91.60703f, 45.17f, 93.17f),
                    PathNode.LineTo(13.17f, 125.17f),
                    PathNode.CurveTo(12.418892f, 125.92027f, 11.996854f, 126.93836f, 11.996854f, 128.0f),
                    PathNode.CurveTo(11.996854f, 129.06163f, 12.418892f, 130.07973f, 13.17f, 130.83f),
                    PathNode.LineTo(45.17f, 162.83f),
                    PathNode.CurveTo(46.732967f, 164.39296f, 49.267033f, 164.39296f, 50.83f, 162.83f),
                    PathNode.CurveTo(52.392967f, 161.26703f, 52.392967f, 158.73297f, 50.83f, 157.17f),
                    PathNode.LineTo(25.66f, 132.0f),
                    PathNode.LineTo(96.0f, 132.0f),
                    PathNode.CurveTo(98.20914f, 132.0f, 100.0f, 130.20914f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 125.79086f, 98.20914f, 124.0f, 96.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(242.83f, 125.17f),
                    PathNode.LineTo(210.83f, 93.17f),
                    PathNode.CurveTo(209.26703f, 91.60703f, 206.73297f, 91.60703f, 205.17f, 93.17f),
                    PathNode.CurveTo(203.60704f, 94.73296f, 203.60704f, 97.26704f, 205.17f, 98.83f),
                    PathNode.LineTo(230.34f, 124.0f),
                    PathNode.LineTo(160.0f, 124.0f),
                    PathNode.CurveTo(157.79086f, 124.0f, 156.0f, 125.79086f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 130.20914f, 157.79086f, 132.0f, 160.0f, 132.0f),
                    PathNode.LineTo(230.34f, 132.0f),
                    PathNode.LineTo(205.17f, 157.17f),
                    PathNode.CurveTo(203.60704f, 158.73297f, 203.60704f, 161.26703f, 205.17f, 162.83f),
                    PathNode.CurveTo(206.73297f, 164.39296f, 209.26703f, 164.39296f, 210.83f, 162.83f),
                    PathNode.LineTo(242.83f, 130.83f),
                    PathNode.CurveTo(243.58112f, 130.07973f, 244.00314f, 129.06163f, 244.00314f, 128.0f),
                    PathNode.CurveTo(244.00314f, 126.93836f, 243.58112f, 125.92027f, 242.83f, 125.17f),
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
        return _arrowsOutLineHorizontal!!
    }

private var _arrowsOutLineHorizontal: ImageVector? = null
