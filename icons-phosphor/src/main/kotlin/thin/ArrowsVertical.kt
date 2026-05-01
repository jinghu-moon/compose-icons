package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsVertical: ImageVector
    get() {
        if (_arrowsVertical != null) return _arrowsVertical!!
        _arrowsVertical = phosphorThinIcon(
            name = "ArrowsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(162.83f, 197.17f),
                    PathNode.CurveTo(163.58112f, 197.92027f, 164.00314f, 198.93837f, 164.00314f, 200.0f),
                    PathNode.CurveTo(164.00314f, 201.06163f, 163.58112f, 202.07973f, 162.83f, 202.83f),
                    PathNode.LineTo(130.83f, 234.83f),
                    PathNode.CurveTo(130.07973f, 235.58112f, 129.06163f, 236.00314f, 128.0f, 236.00314f),
                    PathNode.CurveTo(126.93836f, 236.00314f, 125.92027f, 235.58112f, 125.17f, 234.83f),
                    PathNode.LineTo(93.17f, 202.83f),
                    PathNode.CurveTo(91.60703f, 201.26703f, 91.60703f, 198.73297f, 93.17f, 197.17f),
                    PathNode.CurveTo(94.73296f, 195.60704f, 97.26704f, 195.60704f, 98.83f, 197.17f),
                    PathNode.LineTo(124.0f, 222.34f),
                    PathNode.LineTo(124.0f, 33.66f),
                    PathNode.LineTo(98.83f, 58.83f),
                    PathNode.CurveTo(97.26704f, 60.392967f, 94.73296f, 60.392967f, 93.17f, 58.83f),
                    PathNode.CurveTo(91.60703f, 57.267033f, 91.60703f, 54.732967f, 93.17f, 53.17f),
                    PathNode.LineTo(125.17f, 21.17f),
                    PathNode.CurveTo(125.92027f, 20.418892f, 126.93836f, 19.996853f, 128.0f, 19.996853f),
                    PathNode.CurveTo(129.06163f, 19.996853f, 130.07973f, 20.418892f, 130.83f, 21.17f),
                    PathNode.LineTo(162.83f, 53.17f),
                    PathNode.CurveTo(164.39296f, 54.732967f, 164.39296f, 57.267033f, 162.83f, 58.83f),
                    PathNode.CurveTo(161.26703f, 60.392967f, 158.73297f, 60.392967f, 157.17f, 58.83f),
                    PathNode.LineTo(132.0f, 33.66f),
                    PathNode.LineTo(132.0f, 222.34f),
                    PathNode.LineTo(157.17f, 197.17f),
                    PathNode.CurveTo(157.92027f, 196.41888f, 158.93837f, 195.99686f, 160.0f, 195.99686f),
                    PathNode.CurveTo(161.06163f, 195.99686f, 162.07973f, 196.41888f, 162.83f, 197.17f),
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
        return _arrowsVertical!!
    }

private var _arrowsVertical: ImageVector? = null
