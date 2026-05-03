package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = phosphorFillIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 64.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.CurveTo(51.581722f, 64.0f, 48.0f, 60.418278f, 48.0f, 56.0f),
                    PathNode.CurveTo(48.0f, 51.581722f, 51.581722f, 48.0f, 56.0f, 48.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.CurveTo(196.41827f, 48.0f, 200.0f, 44.418278f, 200.0f, 40.0f),
                    PathNode.CurveTo(200.0f, 35.581722f, 196.41827f, 32.0f, 192.0f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(42.745167f, 32.0f, 32.0f, 42.745167f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.CurveTo(32.0f, 197.25484f, 42.745167f, 208.0f, 56.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(224.83656f, 208.0f, 232.0f, 200.83656f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.CurveTo(232.0f, 71.163445f, 224.83656f, 64.0f, 216.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 144.0f),
                    PathNode.CurveTo(173.37259f, 144.0f, 168.0f, 138.62741f, 168.0f, 132.0f),
                    PathNode.CurveTo(168.0f, 125.37258f, 173.37259f, 120.0f, 180.0f, 120.0f),
                    PathNode.CurveTo(186.62741f, 120.0f, 192.0f, 125.37258f, 192.0f, 132.0f),
                    PathNode.CurveTo(192.0f, 138.62741f, 186.62741f, 144.0f, 180.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _wallet!!
    }

private var _wallet: ImageVector? = null
