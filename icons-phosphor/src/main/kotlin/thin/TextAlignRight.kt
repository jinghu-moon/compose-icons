package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextAlignRight: ImageVector
    get() {
        if (_textAlignRight != null) return _textAlignRight!!
        _textAlignRight = phosphorThinIcon(
            name = "TextAlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 61.79086f, 37.79086f, 60.0f, 40.0f, 60.0f),
                    PathNode.LineTo(216.0f, 60.0f),
                    PathNode.CurveTo(218.20914f, 60.0f, 220.0f, 61.79086f, 220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 66.20914f, 218.20914f, 68.0f, 216.0f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(37.79086f, 68.0f, 36.0f, 66.20914f, 36.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 100.0f),
                    PathNode.LineTo(88.0f, 100.0f),
                    PathNode.CurveTo(85.79086f, 100.0f, 84.0f, 101.79086f, 84.0f, 104.0f),
                    PathNode.CurveTo(84.0f, 106.20914f, 85.79086f, 108.0f, 88.0f, 108.0f),
                    PathNode.LineTo(216.0f, 108.0f),
                    PathNode.CurveTo(218.20914f, 108.0f, 220.0f, 106.20914f, 220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 101.79086f, 218.20914f, 100.0f, 216.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 140.0f),
                    PathNode.LineTo(40.0f, 140.0f),
                    PathNode.CurveTo(37.79086f, 140.0f, 36.0f, 141.79086f, 36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 146.20914f, 37.79086f, 148.0f, 40.0f, 148.0f),
                    PathNode.LineTo(216.0f, 148.0f),
                    PathNode.CurveTo(218.20914f, 148.0f, 220.0f, 146.20914f, 220.0f, 144.0f),
                    PathNode.CurveTo(220.0f, 141.79086f, 218.20914f, 140.0f, 216.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 180.0f),
                    PathNode.LineTo(88.0f, 180.0f),
                    PathNode.CurveTo(85.79086f, 180.0f, 84.0f, 181.79086f, 84.0f, 184.0f),
                    PathNode.CurveTo(84.0f, 186.20914f, 85.79086f, 188.0f, 88.0f, 188.0f),
                    PathNode.LineTo(216.0f, 188.0f),
                    PathNode.CurveTo(218.20914f, 188.0f, 220.0f, 186.20914f, 220.0f, 184.0f),
                    PathNode.CurveTo(220.0f, 181.79086f, 218.20914f, 180.0f, 216.0f, 180.0f),
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
        return _textAlignRight!!
    }

private var _textAlignRight: ImageVector? = null
