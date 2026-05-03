package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorThinIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 148.0f),
                    PathNode.CurveTo(208.69106f, 148.0008f, 205.40216f, 148.51352f, 202.25f, 149.52f),
                    PathNode.LineTo(223.43f, 114.05f),
                    PathNode.CurveTo(224.44333f, 112.166336f, 223.79547f, 109.8188f, 221.95946f, 108.72148f),
                    PathNode.CurveTo(220.12346f, 107.62416f, 217.74907f, 108.1654f, 216.57f, 109.95f),
                    PathNode.LineTo(184.32f, 163.95f),
                    PathNode.CurveTo(184.28741f, 164.0037f, 184.26059f, 164.06067f, 184.24f, 164.12f),
                    PathNode.CurveTo(177.058f, 176.68477f, 179.2032f, 192.50589f, 189.47171f, 202.70451f),
                    PathNode.CurveTo(199.74022f, 212.90315f, 215.5756f, 214.94029f, 228.09105f, 207.67268f),
                    PathNode.CurveTo(240.60649f, 200.40508f, 246.68617f, 185.64204f, 242.91817f, 171.66861f),
                    PathNode.CurveTo(239.15016f, 157.69519f, 226.47253f, 147.99016f, 212.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 204.0f),
                    PathNode.CurveTo(198.74516f, 204.0f, 188.0f, 193.25484f, 188.0f, 180.0f),
                    PathNode.CurveTo(188.0f, 166.74516f, 198.74516f, 156.0f, 212.0f, 156.0f),
                    PathNode.CurveTo(225.25484f, 156.0f, 236.0f, 166.74516f, 236.0f, 180.0f),
                    PathNode.CurveTo(236.0f, 193.25484f, 225.25484f, 204.0f, 212.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 56.0f),
                    PathNode.LineTo(148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 178.20914f, 146.20914f, 180.0f, 144.0f, 180.0f),
                    PathNode.CurveTo(141.79086f, 180.0f, 140.0f, 178.20914f, 140.0f, 176.0f),
                    PathNode.LineTo(140.0f, 120.0f),
                    PathNode.LineTo(44.0f, 120.0f),
                    PathNode.LineTo(44.0f, 176.0f),
                    PathNode.CurveTo(44.0f, 178.20914f, 42.20914f, 180.0f, 40.0f, 180.0f),
                    PathNode.CurveTo(37.79086f, 180.0f, 36.0f, 178.20914f, 36.0f, 176.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.CurveTo(42.20914f, 52.0f, 44.0f, 53.79086f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.LineTo(140.0f, 112.0f),
                    PathNode.LineTo(140.0f, 56.0f),
                    PathNode.CurveTo(140.0f, 53.79086f, 141.79086f, 52.0f, 144.0f, 52.0f),
                    PathNode.CurveTo(146.20914f, 52.0f, 148.0f, 53.79086f, 148.0f, 56.0f),
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
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
