package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberFour: ImageVector
    get() {
        if (_numberFour != null) return _numberFour!!
        _numberFour = phosphorLightIcon(
            name = "NumberFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 162.0f),
                    PathNode.LineTo(166.0f, 162.0f),
                    PathNode.LineTo(166.0f, 48.0f),
                    PathNode.CurveTo(166.00333f, 45.449024f, 164.39328f, 43.174847f, 161.98611f, 42.330425f),
                    PathNode.CurveTo(159.57895f, 41.486008f, 156.90103f, 42.255985f, 155.31f, 44.25f),
                    PathNode.LineTo(59.31f, 164.25f),
                    PathNode.CurveTo(57.867508f, 166.05167f, 57.586304f, 168.52103f, 58.586773f, 170.60089f),
                    PathNode.CurveTo(59.587242f, 172.68077f, 61.692017f, 174.00241f, 64.0f, 174.0f),
                    PathNode.LineTo(154.0f, 174.0f),
                    PathNode.LineTo(154.0f, 208.0f),
                    PathNode.CurveTo(154.0f, 211.3137f, 156.6863f, 214.0f, 160.0f, 214.0f),
                    PathNode.CurveTo(163.3137f, 214.0f, 166.0f, 211.3137f, 166.0f, 208.0f),
                    PathNode.LineTo(166.0f, 174.0f),
                    PathNode.LineTo(184.0f, 174.0f),
                    PathNode.CurveTo(187.3137f, 174.0f, 190.0f, 171.3137f, 190.0f, 168.0f),
                    PathNode.CurveTo(190.0f, 164.6863f, 187.3137f, 162.0f, 184.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.0f, 162.0f),
                    PathNode.LineTo(76.48f, 162.0f),
                    PathNode.LineTo(154.0f, 65.1f),
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
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
