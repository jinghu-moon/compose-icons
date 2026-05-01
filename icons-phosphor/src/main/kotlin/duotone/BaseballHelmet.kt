package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorDuotoneIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 176.0f),
                    PathNode.CurveTo(76.95431f, 176.0f, 68.0f, 167.0457f, 68.0f, 156.0f),
                    PathNode.CurveTo(68.0f, 144.9543f, 76.95431f, 136.0f, 88.0f, 136.0f),
                    PathNode.CurveTo(99.04569f, 136.0f, 108.0f, 144.9543f, 108.0f, 156.0f),
                    PathNode.CurveTo(108.0f, 167.0457f, 99.04569f, 176.0f, 88.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 128.0f),
                    PathNode.LineTo(152.0f, 152.0f),
                    PathNode.CurveTo(152.0f, 187.34622f, 123.34622f, 216.0f, 88.0f, 216.0f),
                    PathNode.LineTo(128.0f, 216.0f),
                    PathNode.CurveTo(163.34622f, 216.0f, 192.0f, 187.34622f, 192.0f, 152.0f),
                    PathNode.LineTo(192.0f, 128.0f),
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
                    PathNode.MoveTo(88.0f, 128.0f),
                    PathNode.CurveTo(72.536026f, 128.0f, 60.0f, 140.53603f, 60.0f, 156.0f),
                    PathNode.CurveTo(60.0f, 171.46397f, 72.536026f, 184.0f, 88.0f, 184.0f),
                    PathNode.CurveTo(103.463974f, 184.0f, 116.0f, 171.46397f, 116.0f, 156.0f),
                    PathNode.CurveTo(116.0f, 140.53603f, 103.463974f, 128.0f, 88.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 168.0f),
                    PathNode.CurveTo(81.37258f, 168.0f, 76.0f, 162.62741f, 76.0f, 156.0f),
                    PathNode.CurveTo(76.0f, 149.37259f, 81.37258f, 144.0f, 88.0f, 144.0f),
                    PathNode.CurveTo(94.62742f, 144.0f, 100.0f, 149.37259f, 100.0f, 156.0f),
                    PathNode.CurveTo(100.0f, 162.62741f, 94.62742f, 168.0f, 88.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 120.0f),
                    PathNode.LineTo(223.7f, 120.0f),
                    PathNode.CurveTo(219.4559f, 64.2396f, 171.87738f, 21.81766f, 115.99714f, 23.970007f),
                    PathNode.CurveTo(60.116894f, 26.122349f, 15.942435f, 72.078354f, 16.0f, 128.0f),
                    PathNode.LineTo(16.0f, 152.0f),
                    PathNode.CurveTo(16.044088f, 191.74623f, 48.253773f, 223.95592f, 88.0f, 224.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.CurveTo(167.74623f, 223.95592f, 199.95592f, 191.74623f, 200.0f, 152.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.LineTo(248.0f, 136.0f),
                    PathNode.CurveTo(252.41827f, 136.0f, 256.0f, 132.41827f, 256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 123.58172f, 252.41827f, 120.0f, 248.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 152.0f),
                    PathNode.CurveTo(183.9694f, 180.7697f, 162.16582f, 204.84613f, 133.54f, 207.72f),
                    PathNode.CurveTo(150.28723f, 194.06828f, 160.00401f, 173.60646f, 160.0f, 152.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 120.0f),
                    PathNode.CurveTo(147.58173f, 120.0f, 144.0f, 123.58172f, 144.0f, 128.0f),
                    PathNode.LineTo(144.0f, 152.0f),
                    PathNode.CurveTo(144.0f, 182.92795f, 118.92794f, 208.0f, 88.0f, 208.0f),
                    PathNode.CurveTo(57.072056f, 208.0f, 32.0f, 182.92795f, 32.0f, 152.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.CurveTo(31.97412f, 80.937164f, 68.98184f, 42.18413f, 115.99594f, 40.042747f),
                    PathNode.CurveTo(163.01006f, 37.901363f, 203.38744f, 73.129684f, 207.64f, 120.0f),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
