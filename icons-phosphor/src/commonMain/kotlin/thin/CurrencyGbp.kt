package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorThinIcon(
            name = "CurrencyGbp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 208.0f),
                    PathNode.CurveTo(188.0f, 210.20914f, 186.20914f, 212.0f, 184.0f, 212.0f),
                    PathNode.LineTo(56.0f, 212.0f),
                    PathNode.CurveTo(53.79086f, 212.0f, 52.0f, 210.20914f, 52.0f, 208.0f),
                    PathNode.CurveTo(52.0f, 205.79086f, 53.79086f, 204.0f, 56.0f, 204.0f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.CurveTo(77.67311f, 204.0f, 92.0f, 189.67311f, 92.0f, 172.0f),
                    PathNode.LineTo(92.0f, 132.0f),
                    PathNode.LineTo(56.0f, 132.0f),
                    PathNode.CurveTo(53.79086f, 132.0f, 52.0f, 130.20914f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 125.79086f, 53.79086f, 124.0f, 56.0f, 124.0f),
                    PathNode.LineTo(92.0f, 124.0f),
                    PathNode.LineTo(92.0f, 84.0f),
                    PathNode.CurveTo(92.01525f, 65.428955f, 102.741745f, 48.53297f, 119.54149f, 40.617645f),
                    PathNode.CurveTo(136.34123f, 32.702316f, 156.19957f, 35.188038f, 170.53f, 47.0f),
                    PathNode.CurveTo(171.66356f, 47.89958f, 172.22284f, 49.34128f, 171.9925f, 50.769966f),
                    PathNode.CurveTo(171.76215f, 52.198654f, 170.77808f, 53.391514f, 169.41922f, 53.889233f),
                    PathNode.CurveTo(168.06036f, 54.38695f, 166.53865f, 54.111904f, 165.44f, 53.17f),
                    PathNode.CurveTo(153.4984f, 43.328125f, 136.95126f, 41.257065f, 122.95239f, 47.852196f),
                    PathNode.CurveTo(108.953514f, 54.447327f, 100.01453f, 68.525375f, 100.0f, 84.0f),
                    PathNode.LineTo(100.0f, 124.0f),
                    PathNode.LineTo(136.0f, 124.0f),
                    PathNode.CurveTo(138.20914f, 124.0f, 140.0f, 125.79086f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 130.20914f, 138.20914f, 132.0f, 136.0f, 132.0f),
                    PathNode.LineTo(100.0f, 132.0f),
                    PathNode.LineTo(100.0f, 172.0f),
                    PathNode.CurveTo(100.0f, 184.59029f, 94.072235f, 196.44583f, 84.0f, 204.0f),
                    PathNode.LineTo(184.0f, 204.0f),
                    PathNode.CurveTo(186.20914f, 204.0f, 188.0f, 205.79086f, 188.0f, 208.0f),
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
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
