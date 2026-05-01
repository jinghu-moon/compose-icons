package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) return _flagPennant!!
        _flagPennant = phosphorDuotoneIcon(
            name = "FlagPennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 104.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(242.63f, 96.44f),
                    PathNode.LineTo(58.63f, 32.44f),
                    PathNode.CurveTo(56.182976f, 31.588194f, 53.474945f, 31.974262f, 51.363445f, 33.475952f),
                    PathNode.CurveTo(49.251945f, 34.97764f, 47.99849f, 37.40896f, 48.0f, 40.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(48.0f, 220.41827f, 51.581722f, 224.0f, 56.0f, 224.0f),
                    PathNode.CurveTo(60.418278f, 224.0f, 64.0f, 220.41827f, 64.0f, 216.0f),
                    PathNode.LineTo(64.0f, 173.69f),
                    PathNode.LineTo(242.63f, 111.56f),
                    PathNode.CurveTo(245.85222f, 110.44477f, 248.01344f, 107.40975f, 248.01344f, 104.0f),
                    PathNode.CurveTo(248.01344f, 100.59025f, 245.85222f, 97.55523f, 242.63f, 96.44f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 156.75f),
                    PathNode.LineTo(64.0f, 51.25f),
                    PathNode.LineTo(215.65f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null
