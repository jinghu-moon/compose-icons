package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = phosphorThinIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 36.0f),
                    PathNode.LineTo(88.0f, 36.0f),
                    PathNode.CurveTo(59.2949f, 36.033066f, 36.033066f, 59.2949f, 36.0f, 88.0f),
                    PathNode.LineTo(36.0f, 168.0f),
                    PathNode.CurveTo(36.033066f, 196.7051f, 59.2949f, 219.96693f, 88.0f, 220.0f),
                    PathNode.LineTo(136.0f, 220.0f),
                    PathNode.CurveTo(136.42879f, 220.00102f, 136.85472f, 219.93004f, 137.26f, 219.79f),
                    PathNode.CurveTo(162.72f, 211.31f, 211.31f, 162.72f, 219.79f, 137.26f),
                    PathNode.CurveTo(219.93004f, 136.85472f, 220.00102f, 136.42879f, 220.0f, 136.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(219.96693f, 59.2949f, 196.7051f, 36.033066f, 168.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 168.0f),
                    PathNode.LineTo(44.0f, 88.0f),
                    PathNode.CurveTo(44.027554f, 63.71089f, 63.71089f, 44.027554f, 88.0f, 44.0f),
                    PathNode.LineTo(168.0f, 44.0f),
                    PathNode.CurveTo(192.28911f, 44.027554f, 211.97244f, 63.71089f, 212.0f, 88.0f),
                    PathNode.LineTo(212.0f, 132.0f),
                    PathNode.LineTo(184.0f, 132.0f),
                    PathNode.CurveTo(155.2949f, 132.03307f, 132.03307f, 155.2949f, 132.0f, 184.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.LineTo(88.0f, 212.0f),
                    PathNode.CurveTo(63.71089f, 211.97244f, 44.027554f, 192.28911f, 44.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 210.0f),
                    PathNode.LineTo(140.0f, 184.0f),
                    PathNode.CurveTo(140.02756f, 159.71089f, 159.71089f, 140.02756f, 184.0f, 140.0f),
                    PathNode.LineTo(210.0f, 140.0f),
                    PathNode.CurveTo(198.9f, 162.23f, 162.23f, 198.9f, 140.0f, 210.0f),
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
