package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretLineRight: ImageVector
    get() {
        if (_caretLineRight != null) return _caretLineRight!!
        _caretLineRight = phosphorThinIcon(
            name = "CaretLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(146.83f, 125.17f),
                    PathNode.CurveTo(147.58112f, 125.92027f, 148.00314f, 126.93836f, 148.00314f, 128.0f),
                    PathNode.CurveTo(148.00314f, 129.06163f, 147.58112f, 130.07973f, 146.83f, 130.83f),
                    PathNode.LineTo(66.83f, 210.83f),
                    PathNode.CurveTo(65.26704f, 212.39296f, 62.732967f, 212.39296f, 61.17f, 210.83f),
                    PathNode.CurveTo(59.607033f, 209.26703f, 59.607033f, 206.73297f, 61.17f, 205.17f),
                    PathNode.LineTo(138.34f, 128.0f),
                    PathNode.LineTo(61.17f, 50.83f),
                    PathNode.CurveTo(59.607033f, 49.267033f, 59.607033f, 46.732967f, 61.17f, 45.17f),
                    PathNode.CurveTo(62.732967f, 43.607033f, 65.26704f, 43.607033f, 66.83f, 45.17f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 44.0f),
                    PathNode.CurveTo(181.79086f, 44.0f, 180.0f, 45.79086f, 180.0f, 48.0f),
                    PathNode.LineTo(180.0f, 208.0f),
                    PathNode.CurveTo(180.0f, 210.20914f, 181.79086f, 212.0f, 184.0f, 212.0f),
                    PathNode.CurveTo(186.20914f, 212.0f, 188.0f, 210.20914f, 188.0f, 208.0f),
                    PathNode.LineTo(188.0f, 48.0f),
                    PathNode.CurveTo(188.0f, 45.79086f, 186.20914f, 44.0f, 184.0f, 44.0f),
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
        return _caretLineRight!!
    }

private var _caretLineRight: ImageVector? = null
