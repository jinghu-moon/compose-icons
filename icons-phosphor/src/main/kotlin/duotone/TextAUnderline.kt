package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorDuotoneIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(173.18f, 128.0f),
                    PathNode.LineTo(82.82f, 128.0f),
                    PathNode.LineTo(128.0f, 32.0f),
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
                    PathNode.MoveTo(60.59f, 175.24f),
                    PathNode.CurveTo(62.510056f, 176.14517f, 64.711136f, 176.25014f, 66.70862f, 175.5318f),
                    PathNode.CurveTo(68.7061f, 174.81346f, 70.3362f, 173.3307f, 71.24f, 171.41f),
                    PathNode.LineTo(87.9f, 136.0f),
                    PathNode.LineTo(168.1f, 136.0f),
                    PathNode.LineTo(184.76f, 171.41f),
                    PathNode.CurveTo(186.6433f, 175.40854f, 191.41145f, 177.12329f, 195.41f, 175.24f),
                    PathNode.CurveTo(199.40854f, 173.3567f, 201.12329f, 168.58855f, 199.24f, 164.59f),
                    PathNode.LineTo(135.24f, 28.59f),
                    PathNode.CurveTo(133.92117f, 25.784384f, 131.10013f, 23.993292f, 128.0f, 23.993292f),
                    PathNode.CurveTo(124.89987f, 23.993292f, 122.07883f, 25.784384f, 120.76f, 28.59f),
                    PathNode.LineTo(56.76f, 164.59f),
                    PathNode.CurveTo(55.854828f, 166.51006f, 55.749855f, 168.71114f, 56.4682f, 170.70862f),
                    PathNode.CurveTo(57.186543f, 172.7061f, 58.6693f, 174.3362f, 60.59f, 175.24f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 50.79f),
                    PathNode.LineTo(160.57f, 120.0f),
                    PathNode.LineTo(95.43f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 220.41827f, 220.41827f, 224.0f, 216.0f, 224.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.CurveTo(35.581722f, 224.0f, 32.0f, 220.41827f, 32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 211.58173f, 35.581722f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(220.41827f, 208.0f, 224.0f, 211.58173f, 224.0f, 216.0f),
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
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null
