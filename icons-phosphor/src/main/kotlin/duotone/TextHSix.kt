package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorDuotoneIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 72.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.CurveTo(240.0f, 200.83656f, 232.83656f, 208.0f, 224.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(47.163445f, 208.0f, 40.0f, 200.83656f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(232.83656f, 56.0f, 240.0f, 63.163445f, 240.0f, 72.0f),
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
                    PathNode.MoveTo(152.0f, 56.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.CurveTo(152.0f, 180.41827f, 148.41827f, 184.0f, 144.0f, 184.0f),
                    PathNode.CurveTo(139.58173f, 184.0f, 136.0f, 180.41827f, 136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 124.0f),
                    PathNode.LineTo(48.0f, 124.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.CurveTo(48.0f, 180.41827f, 44.418278f, 184.0f, 40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 180.41827f, 32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.CurveTo(44.418278f, 48.0f, 48.0f, 51.581722f, 48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 108.0f),
                    PathNode.LineTo(136.0f, 108.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.CurveTo(136.0f, 51.581722f, 139.58173f, 48.0f, 144.0f, 48.0f),
                    PathNode.CurveTo(148.41827f, 48.0f, 152.0f, 51.581722f, 152.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 180.0f),
                    PathNode.CurveTo(248.01447f, 195.09839f, 238.606f, 208.60167f, 224.43724f, 213.81786f),
                    PathNode.CurveTo(210.26852f, 219.03403f, 194.35027f, 214.85472f, 184.57127f, 203.3511f),
                    PathNode.CurveTo(174.7923f, 191.84749f, 173.23055f, 175.464f, 180.66f, 162.32f),
                    PathNode.CurveTo(180.73f, 162.18f, 180.8f, 162.04f, 180.88f, 161.9f),
                    PathNode.LineTo(213.13f, 107.9f),
                    PathNode.CurveTo(215.39436f, 104.105804f, 220.3058f, 102.86563f, 224.1f, 105.13f),
                    PathNode.CurveTo(227.8942f, 107.39437f, 229.13437f, 112.3058f, 226.87f, 116.1f),
                    PathNode.LineTo(210.18f, 144.1f),
                    PathNode.CurveTo(210.78f, 144.1f, 211.39f, 144.05f, 212.0f, 144.05f),
                    PathNode.CurveTo(231.86275f, 144.04999f, 247.97241f, 160.13728f, 248.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 180.0f),
                    PathNode.CurveTo(232.0f, 168.9543f, 223.0457f, 160.0f, 212.0f, 160.0f),
                    PathNode.CurveTo(200.9543f, 160.0f, 192.0f, 168.9543f, 192.0f, 180.0f),
                    PathNode.CurveTo(192.0f, 191.0457f, 200.9543f, 200.0f, 212.0f, 200.0f),
                    PathNode.CurveTo(223.0457f, 200.0f, 232.0f, 191.0457f, 232.0f, 180.0f),
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
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
