package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Textbox: ImageVector
    get() {
        if (_textbox != null) return _textbox!!
        _textbox = phosphorThinIcon(
            name = "Textbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.0f, 44.0f),
                    PathNode.CurveTo(109.79086f, 44.0f, 108.0f, 45.79086f, 108.0f, 48.0f),
                    PathNode.LineTo(108.0f, 68.0f),
                    PathNode.LineTo(24.0f, 68.0f),
                    PathNode.CurveTo(17.372583f, 68.0f, 12.0f, 73.37258f, 12.0f, 80.0f),
                    PathNode.LineTo(12.0f, 176.0f),
                    PathNode.CurveTo(12.0f, 182.62741f, 17.372583f, 188.0f, 24.0f, 188.0f),
                    PathNode.LineTo(108.0f, 188.0f),
                    PathNode.LineTo(108.0f, 208.0f),
                    PathNode.CurveTo(108.0f, 210.20914f, 109.79086f, 212.0f, 112.0f, 212.0f),
                    PathNode.CurveTo(114.20914f, 212.0f, 116.0f, 210.20914f, 116.0f, 208.0f),
                    PathNode.LineTo(116.0f, 48.0f),
                    PathNode.CurveTo(116.0f, 45.79086f, 114.20914f, 44.0f, 112.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 180.0f),
                    PathNode.CurveTo(21.790861f, 180.0f, 20.0f, 178.20914f, 20.0f, 176.0f),
                    PathNode.LineTo(20.0f, 80.0f),
                    PathNode.CurveTo(20.0f, 77.79086f, 21.790861f, 76.0f, 24.0f, 76.0f),
                    PathNode.LineTo(108.0f, 76.0f),
                    PathNode.LineTo(108.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 80.0f),
                    PathNode.LineTo(244.0f, 176.0f),
                    PathNode.CurveTo(244.0f, 182.62741f, 238.62741f, 188.0f, 232.0f, 188.0f),
                    PathNode.LineTo(144.0f, 188.0f),
                    PathNode.CurveTo(141.79086f, 188.0f, 140.0f, 186.20914f, 140.0f, 184.0f),
                    PathNode.CurveTo(140.0f, 181.79086f, 141.79086f, 180.0f, 144.0f, 180.0f),
                    PathNode.LineTo(232.0f, 180.0f),
                    PathNode.CurveTo(234.20914f, 180.0f, 236.0f, 178.20914f, 236.0f, 176.0f),
                    PathNode.LineTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 77.79086f, 234.20914f, 76.0f, 232.0f, 76.0f),
                    PathNode.LineTo(144.0f, 76.0f),
                    PathNode.CurveTo(141.79086f, 76.0f, 140.0f, 74.20914f, 140.0f, 72.0f),
                    PathNode.CurveTo(140.0f, 69.79086f, 141.79086f, 68.0f, 144.0f, 68.0f),
                    PathNode.LineTo(232.0f, 68.0f),
                    PathNode.CurveTo(238.62741f, 68.0f, 244.0f, 73.37258f, 244.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 112.0f),
                    PathNode.CurveTo(84.0f, 114.20914f, 82.20914f, 116.0f, 80.0f, 116.0f),
                    PathNode.LineTo(68.0f, 116.0f),
                    PathNode.LineTo(68.0f, 144.0f),
                    PathNode.CurveTo(68.0f, 146.20914f, 66.20914f, 148.0f, 64.0f, 148.0f),
                    PathNode.CurveTo(61.79086f, 148.0f, 60.0f, 146.20914f, 60.0f, 144.0f),
                    PathNode.LineTo(60.0f, 116.0f),
                    PathNode.LineTo(48.0f, 116.0f),
                    PathNode.CurveTo(45.79086f, 116.0f, 44.0f, 114.20914f, 44.0f, 112.0f),
                    PathNode.CurveTo(44.0f, 109.79086f, 45.79086f, 108.0f, 48.0f, 108.0f),
                    PathNode.LineTo(80.0f, 108.0f),
                    PathNode.CurveTo(82.20914f, 108.0f, 84.0f, 109.79086f, 84.0f, 112.0f),
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
        return _textbox!!
    }

private var _textbox: ImageVector? = null
