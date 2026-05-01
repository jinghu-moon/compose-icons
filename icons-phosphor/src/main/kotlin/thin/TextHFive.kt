package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorThinIcon(
            name = "TextHFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 180.0f),
                    PathNode.CurveTo(244.0f, 197.67311f, 229.67311f, 212.0f, 212.0f, 212.0f),
                    PathNode.CurveTo(203.44942f, 212.15086f, 195.20236f, 208.83183f, 189.14f, 202.8f),
                    PathNode.CurveTo(187.5936f, 201.22046f, 187.62047f, 198.6864f, 189.2f, 197.14f),
                    PathNode.CurveTo(190.77954f, 195.5936f, 193.3136f, 195.62047f, 194.86f, 197.2f),
                    PathNode.CurveTo(199.41924f, 201.6904f, 205.60236f, 204.14343f, 212.0f, 204.0f),
                    PathNode.CurveTo(225.25484f, 204.0f, 236.0f, 193.25484f, 236.0f, 180.0f),
                    PathNode.CurveTo(236.0f, 166.74516f, 225.25484f, 156.0f, 212.0f, 156.0f),
                    PathNode.CurveTo(205.60236f, 155.85657f, 199.41924f, 158.3096f, 194.86f, 162.8f),
                    PathNode.CurveTo(193.63861f, 164.055f, 191.74286f, 164.36957f, 190.1816f, 163.57632f),
                    PathNode.CurveTo(188.62032f, 162.78308f, 187.75658f, 161.06647f, 188.05f, 159.34f),
                    PathNode.LineTo(196.05f, 111.34f),
                    PathNode.CurveTo(196.37279f, 109.41055f, 198.04375f, 107.99764f, 200.0f, 108.0f),
                    PathNode.LineTo(240.0f, 108.0f),
                    PathNode.CurveTo(242.20914f, 108.0f, 244.0f, 109.79086f, 244.0f, 112.0f),
                    PathNode.CurveTo(244.0f, 114.20914f, 242.20914f, 116.0f, 240.0f, 116.0f),
                    PathNode.LineTo(203.39f, 116.0f),
                    PathNode.LineTo(197.52f, 151.21f),
                    PathNode.CurveTo(202.04353f, 149.06375f, 206.99326f, 147.96648f, 212.0f, 148.0f),
                    PathNode.CurveTo(229.67311f, 148.0f, 244.0f, 162.32689f, 244.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 52.0f),
                    PathNode.CurveTo(141.79086f, 52.0f, 140.0f, 53.79086f, 140.0f, 56.0f),
                    PathNode.LineTo(140.0f, 112.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.CurveTo(44.0f, 53.79086f, 42.20914f, 52.0f, 40.0f, 52.0f),
                    PathNode.CurveTo(37.79086f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 176.0f),
                    PathNode.CurveTo(36.0f, 178.20914f, 37.79086f, 180.0f, 40.0f, 180.0f),
                    PathNode.CurveTo(42.20914f, 180.0f, 44.0f, 178.20914f, 44.0f, 176.0f),
                    PathNode.LineTo(44.0f, 120.0f),
                    PathNode.LineTo(140.0f, 120.0f),
                    PathNode.LineTo(140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 178.20914f, 141.79086f, 180.0f, 144.0f, 180.0f),
                    PathNode.CurveTo(146.20914f, 180.0f, 148.0f, 178.20914f, 148.0f, 176.0f),
                    PathNode.LineTo(148.0f, 56.0f),
                    PathNode.CurveTo(148.0f, 53.79086f, 146.20914f, 52.0f, 144.0f, 52.0f),
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
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
