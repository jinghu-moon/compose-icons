package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorThinIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.83f, 173.17f),
                    PathNode.CurveTo(179.58112f, 173.92027f, 180.00314f, 174.93837f, 180.00314f, 176.0f),
                    PathNode.CurveTo(180.00314f, 177.06163f, 179.58112f, 178.07973f, 178.83f, 178.83f),
                    PathNode.LineTo(130.83f, 226.83f),
                    PathNode.CurveTo(130.07973f, 227.58112f, 129.06163f, 228.00314f, 128.0f, 228.00314f),
                    PathNode.CurveTo(126.93836f, 228.00314f, 125.92027f, 227.58112f, 125.17f, 226.83f),
                    PathNode.LineTo(77.17f, 178.83f),
                    PathNode.CurveTo(75.60703f, 177.26703f, 75.60703f, 174.73297f, 77.17f, 173.17f),
                    PathNode.CurveTo(78.73296f, 171.60704f, 81.26704f, 171.60704f, 82.83f, 173.17f),
                    PathNode.LineTo(128.0f, 218.34f),
                    PathNode.LineTo(173.17f, 173.17f),
                    PathNode.CurveTo(173.92027f, 172.41888f, 174.93837f, 171.99686f, 176.0f, 171.99686f),
                    PathNode.CurveTo(177.06163f, 171.99686f, 178.07973f, 172.41888f, 178.83f, 173.17f),
                    PathNode.Close,
                    PathNode.MoveTo(82.83f, 82.83f),
                    PathNode.LineTo(128.0f, 37.66f),
                    PathNode.LineTo(173.17f, 82.83f),
                    PathNode.CurveTo(174.73297f, 84.39297f, 177.26703f, 84.39297f, 178.83f, 82.83f),
                    PathNode.CurveTo(180.39296f, 81.26704f, 180.39296f, 78.73296f, 178.83f, 77.17f),
                    PathNode.LineTo(130.83f, 29.17f),
                    PathNode.CurveTo(130.07973f, 28.418892f, 129.06163f, 27.996853f, 128.0f, 27.996853f),
                    PathNode.CurveTo(126.93836f, 27.996853f, 125.92027f, 28.418892f, 125.17f, 29.17f),
                    PathNode.LineTo(77.17f, 77.17f),
                    PathNode.CurveTo(75.60703f, 78.73296f, 75.60703f, 81.26704f, 77.17f, 82.83f),
                    PathNode.CurveTo(78.73296f, 84.39297f, 81.26704f, 84.39297f, 82.83f, 82.83f),
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
