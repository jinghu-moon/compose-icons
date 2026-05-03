package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Prohibit: ImageVector
    get() {
        if (_prohibit != null) return _prohibit!!
        _prohibit = phosphorRegularIcon(
            name = "Prohibit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.02048f, 148.57533f, 208.79453f, 168.50072f, 195.59f, 184.28f),
                    PathNode.LineTo(71.72f, 60.4f),
                    PathNode.CurveTo(97.952354f, 38.57663f, 134.43628f, 33.885685f, 165.33604f, 48.36326f),
                    PathNode.CurveTo(196.23581f, 62.84083f, 215.9805f, 93.87676f, 216.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 128.0f),
                    PathNode.CurveTo(39.979523f, 107.42466f, 47.205482f, 87.49928f, 60.41f, 71.72f),
                    PathNode.LineTo(184.28f, 195.6f),
                    PathNode.CurveTo(158.04765f, 217.42337f, 121.56372f, 222.11432f, 90.663956f, 207.63673f),
                    PathNode.CurveTo(59.764187f, 193.15916f, 40.019497f, 162.12325f, 40.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _prohibit!!
    }

private var _prohibit: ImageVector? = null
