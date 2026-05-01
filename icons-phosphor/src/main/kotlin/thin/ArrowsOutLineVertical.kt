package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsOutLineVertical: ImageVector
    get() {
        if (_arrowsOutLineVertical != null) return _arrowsOutLineVertical!!
        _arrowsOutLineVertical = phosphorThinIcon(
            name = "ArrowsOutLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 130.20914f, 218.20914f, 132.0f, 216.0f, 132.0f),
                    PathNode.LineTo(40.0f, 132.0f),
                    PathNode.CurveTo(37.79086f, 132.0f, 36.0f, 130.20914f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 125.79086f, 37.79086f, 124.0f, 40.0f, 124.0f),
                    PathNode.LineTo(216.0f, 124.0f),
                    PathNode.CurveTo(218.20914f, 124.0f, 220.0f, 125.79086f, 220.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.83f, 50.83f),
                    PathNode.LineTo(124.0f, 25.66f),
                    PathNode.LineTo(124.0f, 96.0f),
                    PathNode.CurveTo(124.0f, 98.20914f, 125.79086f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(130.20914f, 100.0f, 132.0f, 98.20914f, 132.0f, 96.0f),
                    PathNode.LineTo(132.0f, 25.66f),
                    PathNode.LineTo(157.17f, 50.83f),
                    PathNode.CurveTo(158.73297f, 52.392967f, 161.26703f, 52.392967f, 162.83f, 50.83f),
                    PathNode.CurveTo(164.39296f, 49.267033f, 164.39296f, 46.732967f, 162.83f, 45.17f),
                    PathNode.LineTo(130.83f, 13.17f),
                    PathNode.CurveTo(130.07973f, 12.418892f, 129.06163f, 11.996854f, 128.0f, 11.996854f),
                    PathNode.CurveTo(126.93836f, 11.996854f, 125.92027f, 12.418892f, 125.17f, 13.17f),
                    PathNode.LineTo(93.17f, 45.17f),
                    PathNode.CurveTo(91.60703f, 46.732967f, 91.60703f, 49.267033f, 93.17f, 50.83f),
                    PathNode.CurveTo(94.73296f, 52.392967f, 97.26704f, 52.392967f, 98.83f, 50.83f),
                    PathNode.Close,
                    PathNode.MoveTo(157.17f, 205.17f),
                    PathNode.LineTo(132.0f, 230.34f),
                    PathNode.LineTo(132.0f, 160.0f),
                    PathNode.CurveTo(132.0f, 157.79086f, 130.20914f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(125.79086f, 156.0f, 124.0f, 157.79086f, 124.0f, 160.0f),
                    PathNode.LineTo(124.0f, 230.34f),
                    PathNode.LineTo(98.83f, 205.17f),
                    PathNode.CurveTo(97.26704f, 203.60704f, 94.73296f, 203.60704f, 93.17f, 205.17f),
                    PathNode.CurveTo(91.60703f, 206.73297f, 91.60703f, 209.26703f, 93.17f, 210.83f),
                    PathNode.LineTo(125.17f, 242.83f),
                    PathNode.CurveTo(125.92027f, 243.58112f, 126.93836f, 244.00314f, 128.0f, 244.00314f),
                    PathNode.CurveTo(129.06163f, 244.00314f, 130.07973f, 243.58112f, 130.83f, 242.83f),
                    PathNode.LineTo(162.83f, 210.83f),
                    PathNode.CurveTo(164.39296f, 209.26703f, 164.39296f, 206.73297f, 162.83f, 205.17f),
                    PathNode.CurveTo(161.26703f, 203.60704f, 158.73297f, 203.60704f, 157.17f, 205.17f),
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
        return _arrowsOutLineVertical!!
    }

private var _arrowsOutLineVertical: ImageVector? = null
