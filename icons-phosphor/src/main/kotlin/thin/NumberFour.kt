package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberFour: ImageVector
    get() {
        if (_numberFour != null) return _numberFour!!
        _numberFour = phosphorThinIcon(
            name = "NumberFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 164.0f),
                    PathNode.LineTo(164.0f, 164.0f),
                    PathNode.LineTo(164.0f, 48.0f),
                    PathNode.CurveTo(163.99867f, 46.302837f, 162.9265f, 44.791267f, 161.32518f, 44.229008f),
                    PathNode.CurveTo(159.72386f, 43.666748f, 157.94205f, 44.176212f, 156.88f, 45.5f),
                    PathNode.LineTo(60.88f, 165.5f),
                    PathNode.CurveTo(59.919098f, 166.70018f, 59.7311f, 168.34488f, 60.396404f, 169.73093f),
                    PathNode.CurveTo(61.06171f, 171.11697f, 62.462547f, 171.99904f, 64.0f, 172.0f),
                    PathNode.LineTo(156.0f, 172.0f),
                    PathNode.LineTo(156.0f, 208.0f),
                    PathNode.CurveTo(156.0f, 210.20914f, 157.79086f, 212.0f, 160.0f, 212.0f),
                    PathNode.CurveTo(162.20914f, 212.0f, 164.0f, 210.20914f, 164.0f, 208.0f),
                    PathNode.LineTo(164.0f, 172.0f),
                    PathNode.LineTo(184.0f, 172.0f),
                    PathNode.CurveTo(186.20914f, 172.0f, 188.0f, 170.20914f, 188.0f, 168.0f),
                    PathNode.CurveTo(188.0f, 165.79086f, 186.20914f, 164.0f, 184.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 164.0f),
                    PathNode.LineTo(72.32f, 164.0f),
                    PathNode.LineTo(156.0f, 59.4f),
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
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
