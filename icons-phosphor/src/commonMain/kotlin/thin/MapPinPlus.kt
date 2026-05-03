package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) return _mapPinPlus!!
        _mapPinPlus = phosphorThinIcon(
            name = "MapPinPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 106.20914f, 162.20914f, 108.0f, 160.0f, 108.0f),
                    PathNode.LineTo(132.0f, 108.0f),
                    PathNode.LineTo(132.0f, 136.0f),
                    PathNode.CurveTo(132.0f, 138.20914f, 130.20914f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(125.79086f, 140.0f, 124.0f, 138.20914f, 124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 108.0f),
                    PathNode.LineTo(96.0f, 108.0f),
                    PathNode.CurveTo(93.79086f, 108.0f, 92.0f, 106.20914f, 92.0f, 104.0f),
                    PathNode.CurveTo(92.0f, 101.79086f, 93.79086f, 100.0f, 96.0f, 100.0f),
                    PathNode.LineTo(124.0f, 100.0f),
                    PathNode.LineTo(124.0f, 72.0f),
                    PathNode.CurveTo(124.0f, 69.79086f, 125.79086f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(130.20914f, 68.0f, 132.0f, 69.79086f, 132.0f, 72.0f),
                    PathNode.LineTo(132.0f, 100.0f),
                    PathNode.LineTo(160.0f, 100.0f),
                    PathNode.CurveTo(162.20914f, 100.0f, 164.0f, 101.79086f, 164.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 134.42f, 197.83f, 166.79f, 171.0f, 197.62f),
                    PathNode.CurveTo(158.86241f, 211.6454f, 145.20168f, 224.27646f, 130.27f, 235.28f),
                    PathNode.CurveTo(128.89441f, 236.24051f, 127.06559f, 236.24051f, 125.69f, 235.28f),
                    PathNode.CurveTo(110.77231f, 224.27414f, 97.12508f, 211.64314f, 85.0f, 197.62f),
                    PathNode.CurveTo(58.17f, 166.79f, 44.0f, 134.42f, 44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 57.60808f, 81.60808f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(174.39192f, 20.0f, 212.0f, 57.60808f, 212.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 62.02636f, 169.97365f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(86.02636f, 28.0f, 52.0f, 62.02636f, 52.0f, 104.0f),
                    PathNode.CurveTo(52.0f, 139.9f, 73.15f, 171.8f, 90.9f, 192.23f),
                    PathNode.CurveTo(102.075554f, 205.02884f, 114.50417f, 216.67691f, 128.0f, 227.0f),
                    PathNode.CurveTo(141.49776f, 216.6643f, 153.92644f, 205.00278f, 165.1f, 192.19f),
                    PathNode.CurveTo(182.85f, 171.8f, 204.0f, 139.9f, 204.0f, 104.0f),
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
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
