package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorBoldIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 140.0f),
                    PathNode.LineTo(164.0f, 140.0f),
                    PathNode.LineTo(164.0f, 116.0f),
                    PathNode.LineTo(180.0f, 116.0f),
                    PathNode.CurveTo(202.09138f, 116.0f, 220.0f, 98.09139f, 220.0f, 76.0f),
                    PathNode.CurveTo(220.0f, 53.90861f, 202.09138f, 36.0f, 180.0f, 36.0f),
                    PathNode.CurveTo(157.90862f, 36.0f, 140.0f, 53.90861f, 140.0f, 76.0f),
                    PathNode.LineTo(140.0f, 92.0f),
                    PathNode.LineTo(116.0f, 92.0f),
                    PathNode.LineTo(116.0f, 76.0f),
                    PathNode.CurveTo(116.0f, 53.90861f, 98.09139f, 36.0f, 76.0f, 36.0f),
                    PathNode.CurveTo(53.90861f, 36.0f, 36.0f, 53.90861f, 36.0f, 76.0f),
                    PathNode.CurveTo(36.0f, 98.09139f, 53.90861f, 116.0f, 76.0f, 116.0f),
                    PathNode.LineTo(92.0f, 116.0f),
                    PathNode.LineTo(92.0f, 140.0f),
                    PathNode.LineTo(76.0f, 140.0f),
                    PathNode.CurveTo(53.90861f, 140.0f, 36.0f, 157.90862f, 36.0f, 180.0f),
                    PathNode.CurveTo(36.0f, 202.09138f, 53.90861f, 220.0f, 76.0f, 220.0f),
                    PathNode.CurveTo(98.09139f, 220.0f, 116.0f, 202.09138f, 116.0f, 180.0f),
                    PathNode.LineTo(116.0f, 164.0f),
                    PathNode.LineTo(140.0f, 164.0f),
                    PathNode.LineTo(140.0f, 180.0f),
                    PathNode.CurveTo(140.0f, 202.09138f, 157.90862f, 220.0f, 180.0f, 220.0f),
                    PathNode.CurveTo(202.09138f, 220.0f, 220.0f, 202.09138f, 220.0f, 180.0f),
                    PathNode.CurveTo(220.0f, 157.90862f, 202.09138f, 140.0f, 180.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 76.0f),
                    PathNode.CurveTo(164.0f, 67.163445f, 171.16344f, 60.0f, 180.0f, 60.0f),
                    PathNode.CurveTo(188.83656f, 60.0f, 196.0f, 67.163445f, 196.0f, 76.0f),
                    PathNode.CurveTo(196.0f, 84.836555f, 188.83656f, 92.0f, 180.0f, 92.0f),
                    PathNode.LineTo(164.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 76.0f),
                    PathNode.CurveTo(60.0f, 67.163445f, 67.163445f, 60.0f, 76.0f, 60.0f),
                    PathNode.CurveTo(84.836555f, 60.0f, 92.0f, 67.163445f, 92.0f, 76.0f),
                    PathNode.LineTo(92.0f, 92.0f),
                    PathNode.LineTo(76.0f, 92.0f),
                    PathNode.CurveTo(67.163445f, 92.0f, 60.0f, 84.836555f, 60.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 180.0f),
                    PathNode.CurveTo(92.0f, 188.83656f, 84.836555f, 196.0f, 76.0f, 196.0f),
                    PathNode.CurveTo(67.163445f, 196.0f, 60.0f, 188.83656f, 60.0f, 180.0f),
                    PathNode.CurveTo(60.0f, 171.16344f, 67.163445f, 164.0f, 76.0f, 164.0f),
                    PathNode.LineTo(92.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 116.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 196.0f),
                    PathNode.CurveTo(171.16344f, 196.0f, 164.0f, 188.83656f, 164.0f, 180.0f),
                    PathNode.LineTo(164.0f, 164.0f),
                    PathNode.LineTo(180.0f, 164.0f),
                    PathNode.CurveTo(188.83656f, 164.0f, 196.0f, 171.16344f, 196.0f, 180.0f),
                    PathNode.CurveTo(196.0f, 188.83656f, 188.83656f, 196.0f, 180.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _command!!
    }

private var _command: ImageVector? = null
