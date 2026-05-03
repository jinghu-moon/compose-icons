package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorDuotoneIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(63.163445f, 200.0f, 56.0f, 192.83656f, 56.0f, 184.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.38f, 221.92f),
                    PathNode.CurveTo(210.11035f, 224.89098f, 205.05144f, 224.64922f, 202.08f, 221.38f),
                    PathNode.LineTo(136.0f, 148.69f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.CurveTo(164.41827f, 192.0f, 168.0f, 195.58173f, 168.0f, 200.0f),
                    PathNode.CurveTo(168.0f, 204.41827f, 164.41827f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(91.58172f, 208.0f, 88.0f, 204.41827f, 88.0f, 200.0f),
                    PathNode.CurveTo(88.0f, 195.58173f, 91.58172f, 192.0f, 96.0f, 192.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 131.09f),
                    PathNode.LineTo(64.0f, 69.49f),
                    PathNode.LineTo(64.0f, 88.0f),
                    PathNode.CurveTo(64.0f, 92.41828f, 60.418278f, 96.0f, 56.0f, 96.0f),
                    PathNode.CurveTo(51.581722f, 96.0f, 48.0f, 92.41828f, 48.0f, 88.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.CurveTo(48.00098f, 54.85792f, 48.246483f, 53.729294f, 48.72f, 52.69f),
                    PathNode.LineTo(42.08f, 45.38f),
                    PathNode.CurveTo(40.116978f, 43.271305f, 39.439384f, 40.26998f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(41.17271f, 34.774906f, 43.44975f, 32.70557f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(49.085068f, 31.50414f, 52.008102f, 32.46484f, 53.92f, 34.62f),
                    PathNode.LineTo(213.92f, 210.62f),
                    PathNode.CurveTo(216.89098f, 213.88965f, 216.64922f, 218.94856f, 213.38f, 221.92f),
                    PathNode.Close,
                    PathNode.MoveTo(105.79f, 64.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.LineTo(120.0f, 80.43f),
                    PathNode.CurveTo(120.0f, 84.848274f, 123.58172f, 88.43f, 128.0f, 88.43f),
                    PathNode.CurveTo(132.41827f, 88.43f, 136.0f, 84.848274f, 136.0f, 80.43f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.LineTo(192.0f, 88.0f),
                    PathNode.CurveTo(192.0f, 92.41828f, 195.58173f, 96.0f, 200.0f, 96.0f),
                    PathNode.CurveTo(204.41827f, 96.0f, 208.0f, 92.41828f, 208.0f, 88.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.CurveTo(208.0f, 51.581722f, 204.41827f, 48.0f, 200.0f, 48.0f),
                    PathNode.LineTo(105.79f, 48.0f),
                    PathNode.CurveTo(101.37172f, 48.0f, 97.79f, 51.581722f, 97.79f, 56.0f),
                    PathNode.CurveTo(97.79f, 60.418278f, 101.37172f, 64.0f, 105.79f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
