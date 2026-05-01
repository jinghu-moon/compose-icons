package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SignIn: ImageVector
    get() {
        if (_signIn != null) return _signIn!!
        _signIn = phosphorDuotoneIcon(
            name = "SignIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
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
                    PathNode.MoveTo(141.66f, 133.66f),
                    PathNode.LineTo(101.66f, 173.66f),
                    PathNode.CurveTo(98.534065f, 176.78593f, 93.465935f, 176.78593f, 90.34f, 173.66f),
                    PathNode.CurveTo(87.214066f, 170.53407f, 87.214066f, 165.46593f, 90.34f, 162.34f),
                    PathNode.LineTo(116.69f, 136.0f),
                    PathNode.LineTo(24.0f, 136.0f),
                    PathNode.CurveTo(19.581722f, 136.0f, 16.0f, 132.41827f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 123.58172f, 19.581722f, 120.0f, 24.0f, 120.0f),
                    PathNode.LineTo(116.69f, 120.0f),
                    PathNode.LineTo(90.34f, 93.66f),
                    PathNode.CurveTo(87.214066f, 90.534065f, 87.214066f, 85.465935f, 90.34f, 82.34f),
                    PathNode.CurveTo(93.465935f, 79.214066f, 98.534065f, 79.214066f, 101.66f, 82.34f),
                    PathNode.LineTo(141.66f, 122.34f),
                    PathNode.CurveTo(143.16223f, 123.840546f, 144.00629f, 125.876724f, 144.00629f, 128.0f),
                    PathNode.CurveTo(144.00629f, 130.12328f, 143.16223f, 132.15945f, 141.66f, 133.66f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 32.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.CurveTo(131.58173f, 32.0f, 128.0f, 35.581722f, 128.0f, 40.0f),
                    PathNode.CurveTo(128.0f, 44.418278f, 131.58173f, 48.0f, 136.0f, 48.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.CurveTo(131.58173f, 208.0f, 128.0f, 211.58173f, 128.0f, 216.0f),
                    PathNode.CurveTo(128.0f, 220.41827f, 131.58173f, 224.0f, 136.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(204.41827f, 224.0f, 208.0f, 220.41827f, 208.0f, 216.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 35.581722f, 204.41827f, 32.0f, 200.0f, 32.0f),
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
        return _signIn!!
    }

private var _signIn: ImageVector? = null
