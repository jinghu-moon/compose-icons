package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CreditCard: ImageVector
    get() {
        if (_creditCard != null) return _creditCard!!
        _creditCard = phosphorBoldIcon(
            name = "CreditCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(20.954306f, 44.0f, 12.0f, 52.954304f, 12.0f, 64.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 203.0457f, 20.954306f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(235.0457f, 212.0f, 244.0f, 203.0457f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 64.0f),
                    PathNode.CurveTo(244.0f, 52.954304f, 235.0457f, 44.0f, 224.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 68.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.LineTo(36.0f, 88.0f),
                    PathNode.LineTo(36.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 188.0f),
                    PathNode.LineTo(36.0f, 112.0f),
                    PathNode.LineTo(220.0f, 112.0f),
                    PathNode.LineTo(220.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 164.0f),
                    PathNode.CurveTo(208.0f, 170.62741f, 202.62741f, 176.0f, 196.0f, 176.0f),
                    PathNode.LineTo(164.0f, 176.0f),
                    PathNode.CurveTo(157.37259f, 176.0f, 152.0f, 170.62741f, 152.0f, 164.0f),
                    PathNode.CurveTo(152.0f, 157.37259f, 157.37259f, 152.0f, 164.0f, 152.0f),
                    PathNode.LineTo(196.0f, 152.0f),
                    PathNode.CurveTo(202.62741f, 152.0f, 208.0f, 157.37259f, 208.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 164.0f),
                    PathNode.CurveTo(140.0f, 170.62741f, 134.62741f, 176.0f, 128.0f, 176.0f),
                    PathNode.LineTo(116.0f, 176.0f),
                    PathNode.CurveTo(109.37258f, 176.0f, 104.0f, 170.62741f, 104.0f, 164.0f),
                    PathNode.CurveTo(104.0f, 157.37259f, 109.37258f, 152.0f, 116.0f, 152.0f),
                    PathNode.LineTo(128.0f, 152.0f),
                    PathNode.CurveTo(134.62741f, 152.0f, 140.0f, 157.37259f, 140.0f, 164.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
