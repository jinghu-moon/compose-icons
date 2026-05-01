package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = phosphorThinIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.83f, 74.83f),
                    PathNode.LineTo(98.83f, 202.83f),
                    PathNode.CurveTo(98.07973f, 203.58112f, 97.06164f, 204.00314f, 96.0f, 204.00314f),
                    PathNode.CurveTo(94.93836f, 204.00314f, 93.92027f, 203.58112f, 93.17f, 202.83f),
                    PathNode.LineTo(37.17f, 146.83f),
                    PathNode.CurveTo(35.607033f, 145.26703f, 35.607033f, 142.73297f, 37.17f, 141.17f),
                    PathNode.CurveTo(38.732967f, 139.60704f, 41.267033f, 139.60704f, 42.83f, 141.17f),
                    PathNode.LineTo(96.0f, 194.34f),
                    PathNode.LineTo(221.17f, 69.17f),
                    PathNode.CurveTo(222.73297f, 67.60703f, 225.26703f, 67.60703f, 226.83f, 69.17f),
                    PathNode.CurveTo(228.39296f, 70.73296f, 228.39296f, 73.26704f, 226.83f, 74.83f),
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
        return _check!!
    }

private var _check: ImageVector? = null
