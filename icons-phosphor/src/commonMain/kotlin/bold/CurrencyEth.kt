package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) return _currencyEth!!
        _currencyEth = phosphorBoldIcon(
            name = "CurrencyEth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.44f, 120.59f),
                    PathNode.LineTo(137.44f, 8.59f),
                    PathNode.CurveTo(135.16515f, 5.691364f, 131.68471f, 3.998536f, 128.0f, 3.998536f),
                    PathNode.CurveTo(124.31529f, 3.998536f, 120.834854f, 5.691364f, 118.56f, 8.59f),
                    PathNode.LineTo(30.56f, 120.59f),
                    PathNode.CurveTo(27.145134f, 124.93985f, 27.145134f, 131.06015f, 30.56f, 135.41f),
                    PathNode.LineTo(31.16f, 136.17f),
                    PathNode.CurveTo(31.28842f, 136.37032f, 31.43576f, 136.55783f, 31.6f, 136.73f),
                    PathNode.LineTo(118.6f, 247.41f),
                    PathNode.CurveTo(120.874855f, 250.30864f, 124.35529f, 252.00146f, 128.04f, 252.00146f),
                    PathNode.CurveTo(131.7247f, 252.00146f, 135.20514f, 250.30864f, 137.48f, 247.41f),
                    PathNode.LineTo(225.48f, 135.41f),
                    PathNode.CurveTo(228.88315f, 131.05093f, 228.86662f, 124.93063f, 225.44f, 120.59f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 50.7f),
                    PathNode.LineTo(197.12f, 123.4f),
                    PathNode.LineTo(140.0f, 149.4f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 149.36f),
                    PathNode.LineTo(58.88f, 123.36f),
                    PathNode.LineTo(116.0f, 50.7f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 175.73f),
                    PathNode.LineTo(116.0f, 205.3f),
                    PathNode.LineTo(79.85f, 159.3f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 175.73f),
                    PathNode.LineTo(176.15f, 159.3f),
                    PathNode.LineTo(140.0f, 205.3f),
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
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
