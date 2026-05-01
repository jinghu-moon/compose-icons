package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorFillIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.CurveTo(47.163445f, 48.0f, 40.0f, 55.163445f, 40.0f, 64.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(40.0f, 188.41827f, 36.418278f, 192.0f, 32.0f, 192.0f),
                    PathNode.CurveTo(27.581722f, 192.0f, 24.0f, 188.41827f, 24.0f, 184.0f),
                    PathNode.LineTo(24.0f, 88.0f),
                    PathNode.CurveTo(24.0f, 83.58172f, 20.418278f, 80.0f, 16.0f, 80.0f),
                    PathNode.CurveTo(11.581722f, 80.0f, 8.0f, 83.58172f, 8.0f, 88.0f),
                    PathNode.LineTo(8.0f, 184.11f),
                    PathNode.CurveTo(8.060555f, 197.32185f, 18.788006f, 208.00014f, 32.0f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(221.25484f, 208.0f, 232.0f, 197.25484f, 232.0f, 184.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 55.163445f, 224.83656f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 152.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(91.58172f, 152.0f, 88.0f, 148.41827f, 88.0f, 144.0f),
                    PathNode.CurveTo(88.0f, 139.58173f, 91.58172f, 136.0f, 96.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.CurveTo(180.41827f, 136.0f, 184.0f, 139.58173f, 184.0f, 144.0f),
                    PathNode.CurveTo(184.0f, 148.41827f, 180.41827f, 152.0f, 176.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(91.58172f, 120.0f, 88.0f, 116.41828f, 88.0f, 112.0f),
                    PathNode.CurveTo(88.0f, 107.58172f, 91.58172f, 104.0f, 96.0f, 104.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.CurveTo(180.41827f, 104.0f, 184.0f, 107.58172f, 184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 116.41828f, 180.41827f, 120.0f, 176.0f, 120.0f),
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
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
