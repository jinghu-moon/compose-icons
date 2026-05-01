package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorLightIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.24f, 196.24f),
                    PathNode.CurveTo(193.89746f, 198.57962f, 190.10254f, 198.57962f, 187.76f, 196.24f),
                    PathNode.LineTo(70.0f, 78.48f),
                    PathNode.LineTo(70.0f, 168.0f),
                    PathNode.CurveTo(70.0f, 171.3137f, 67.313705f, 174.0f, 64.0f, 174.0f),
                    PathNode.CurveTo(60.68629f, 174.0f, 58.0f, 171.3137f, 58.0f, 168.0f),
                    PathNode.LineTo(58.0f, 64.0f),
                    PathNode.CurveTo(58.0f, 60.68629f, 60.68629f, 58.0f, 64.0f, 58.0f),
                    PathNode.LineTo(168.0f, 58.0f),
                    PathNode.CurveTo(171.3137f, 58.0f, 174.0f, 60.68629f, 174.0f, 64.0f),
                    PathNode.CurveTo(174.0f, 67.313705f, 171.3137f, 70.0f, 168.0f, 70.0f),
                    PathNode.LineTo(78.48f, 70.0f),
                    PathNode.LineTo(196.24f, 187.76f),
                    PathNode.CurveTo(198.57962f, 190.10254f, 198.57962f, 193.89746f, 196.24f, 196.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
