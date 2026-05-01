package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cardholder: ImageVector
    get() {
        if (_cardholder != null) return _cardholder!!
        _cardholder = phosphorLightIcon(
            name = "Cardholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 50.0f),
                    PathNode.LineTo(48.0f, 50.0f),
                    PathNode.CurveTo(35.849735f, 50.0f, 26.0f, 59.849735f, 26.0f, 72.0f),
                    PathNode.LineTo(26.0f, 184.0f),
                    PathNode.CurveTo(26.0f, 196.15027f, 35.849735f, 206.0f, 48.0f, 206.0f),
                    PathNode.LineTo(208.0f, 206.0f),
                    PathNode.CurveTo(220.15027f, 206.0f, 230.0f, 196.15027f, 230.0f, 184.0f),
                    PathNode.LineTo(230.0f, 72.0f),
                    PathNode.CurveTo(230.0f, 59.849735f, 220.15027f, 50.0f, 208.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 94.0f),
                    PathNode.LineTo(218.0f, 94.0f),
                    PathNode.LineTo(218.0f, 114.0f),
                    PathNode.LineTo(160.0f, 114.0f),
                    PathNode.CurveTo(156.6863f, 114.0f, 154.0f, 116.686295f, 154.0f, 120.0f),
                    PathNode.CurveTo(154.0f, 134.3594f, 142.3594f, 146.0f, 128.0f, 146.0f),
                    PathNode.CurveTo(113.640594f, 146.0f, 102.0f, 134.3594f, 102.0f, 120.0f),
                    PathNode.CurveTo(102.0f, 116.686295f, 99.313705f, 114.0f, 96.0f, 114.0f),
                    PathNode.LineTo(38.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 62.0f),
                    PathNode.LineTo(208.0f, 62.0f),
                    PathNode.CurveTo(213.52284f, 62.0f, 218.0f, 66.47715f, 218.0f, 72.0f),
                    PathNode.LineTo(218.0f, 82.0f),
                    PathNode.LineTo(38.0f, 82.0f),
                    PathNode.LineTo(38.0f, 72.0f),
                    PathNode.CurveTo(38.0f, 66.47715f, 42.477154f, 62.0f, 48.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 194.0f),
                    PathNode.LineTo(48.0f, 194.0f),
                    PathNode.CurveTo(42.477154f, 194.0f, 38.0f, 189.52284f, 38.0f, 184.0f),
                    PathNode.LineTo(38.0f, 126.0f),
                    PathNode.LineTo(90.47f, 126.0f),
                    PathNode.CurveTo(93.39993f, 144.45558f, 109.31329f, 158.04189f, 128.0f, 158.04189f),
                    PathNode.CurveTo(146.6867f, 158.04189f, 162.60007f, 144.45558f, 165.53f, 126.0f),
                    PathNode.LineTo(218.0f, 126.0f),
                    PathNode.LineTo(218.0f, 184.0f),
                    PathNode.CurveTo(218.0f, 189.52284f, 213.52284f, 194.0f, 208.0f, 194.0f),
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
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
