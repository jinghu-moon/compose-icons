package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowRightDown: ImageVector
    get() {
        if (_arrowElbowRightDown != null) return _arrowElbowRightDown!!
        _arrowElbowRightDown = phosphorThinIcon(
            name = "ArrowElbowRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.83f, 162.83f),
                    PathNode.LineTo(178.83f, 210.83f),
                    PathNode.CurveTo(178.07973f, 211.58112f, 177.06163f, 212.00314f, 176.0f, 212.00314f),
                    PathNode.CurveTo(174.93837f, 212.00314f, 173.92027f, 211.58112f, 173.17f, 210.83f),
                    PathNode.LineTo(125.17f, 162.83f),
                    PathNode.CurveTo(123.60703f, 161.26703f, 123.60703f, 158.73297f, 125.17f, 157.17f),
                    PathNode.CurveTo(126.73296f, 155.60704f, 129.26703f, 155.60704f, 130.83f, 157.17f),
                    PathNode.LineTo(172.0f, 198.34f),
                    PathNode.LineTo(172.0f, 68.0f),
                    PathNode.LineTo(32.0f, 68.0f),
                    PathNode.CurveTo(29.790861f, 68.0f, 28.0f, 66.20914f, 28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 61.79086f, 29.790861f, 60.0f, 32.0f, 60.0f),
                    PathNode.LineTo(176.0f, 60.0f),
                    PathNode.CurveTo(178.20914f, 60.0f, 180.0f, 61.79086f, 180.0f, 64.0f),
                    PathNode.LineTo(180.0f, 198.34f),
                    PathNode.LineTo(221.17f, 157.17f),
                    PathNode.CurveTo(222.73297f, 155.60704f, 225.26703f, 155.60704f, 226.83f, 157.17f),
                    PathNode.CurveTo(228.39296f, 158.73297f, 228.39296f, 161.26703f, 226.83f, 162.83f),
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
        return _arrowElbowRightDown!!
    }

private var _arrowElbowRightDown: ImageVector? = null
