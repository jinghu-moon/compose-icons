package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) return _flagPennant!!
        _flagPennant = phosphorFillIcon(
            name = "FlagPennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 104.0f),
                    PathNode.CurveTo(248.00198f, 107.40624f, 245.84691f, 110.4402f, 242.63f, 111.56f),
                    PathNode.LineTo(64.0f, 173.69f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.CurveTo(64.0f, 220.41827f, 60.418278f, 224.0f, 56.0f, 224.0f),
                    PathNode.CurveTo(51.581722f, 224.0f, 48.0f, 220.41827f, 48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(47.99849f, 37.40896f, 49.251945f, 34.97764f, 51.363445f, 33.475952f),
                    PathNode.CurveTo(53.474945f, 31.974262f, 56.182976f, 31.588194f, 58.63f, 32.44f),
                    PathNode.LineTo(242.63f, 96.44f),
                    PathNode.CurveTo(245.84691f, 97.5598f, 248.00198f, 100.59376f, 248.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null
