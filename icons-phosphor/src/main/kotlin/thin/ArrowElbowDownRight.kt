package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowDownRight: ImageVector
    get() {
        if (_arrowElbowDownRight != null) return _arrowElbowDownRight!!
        _arrowElbowDownRight = phosphorThinIcon(
            name = "ArrowElbowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.83f, 178.83f),
                    PathNode.LineTo(170.83f, 226.83f),
                    PathNode.CurveTo(169.26703f, 228.39296f, 166.73297f, 228.39296f, 165.17f, 226.83f),
                    PathNode.CurveTo(163.60704f, 225.26703f, 163.60704f, 222.73297f, 165.17f, 221.17f),
                    PathNode.LineTo(206.34f, 180.0f),
                    PathNode.LineTo(72.0f, 180.0f),
                    PathNode.CurveTo(69.79086f, 180.0f, 68.0f, 178.20914f, 68.0f, 176.0f),
                    PathNode.LineTo(68.0f, 32.0f),
                    PathNode.CurveTo(68.0f, 29.790861f, 69.79086f, 28.0f, 72.0f, 28.0f),
                    PathNode.CurveTo(74.20914f, 28.0f, 76.0f, 29.790861f, 76.0f, 32.0f),
                    PathNode.LineTo(76.0f, 172.0f),
                    PathNode.LineTo(206.34f, 172.0f),
                    PathNode.LineTo(165.17f, 130.83f),
                    PathNode.CurveTo(163.60704f, 129.26703f, 163.60704f, 126.73296f, 165.17f, 125.17f),
                    PathNode.CurveTo(166.73297f, 123.60703f, 169.26703f, 123.60703f, 170.83f, 125.17f),
                    PathNode.LineTo(218.83f, 173.17f),
                    PathNode.CurveTo(219.58112f, 173.92027f, 220.00314f, 174.93837f, 220.00314f, 176.0f),
                    PathNode.CurveTo(220.00314f, 177.06163f, 219.58112f, 178.07973f, 218.83f, 178.83f),
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
        return _arrowElbowDownRight!!
    }

private var _arrowElbowDownRight: ImageVector? = null
