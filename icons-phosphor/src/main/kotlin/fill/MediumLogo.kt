package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) return _mediumLogo!!
        _mediumLogo = phosphorFillIcon(
            name = "MediumLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 163.34622f, 107.34622f, 192.0f, 72.0f, 192.0f),
                    PathNode.CurveTo(36.653774f, 192.0f, 8.0f, 163.34622f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 92.65378f, 36.653774f, 64.0f, 72.0f, 64.0f),
                    PathNode.CurveTo(107.33023f, 64.03858f, 135.96143f, 92.66977f, 136.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 64.0f),
                    PathNode.CurveTo(178.32f, 64.0f, 167.6f, 66.76f, 159.68f, 85.25f),
                    PathNode.CurveTo(154.73f, 96.8f, 152.0f, 112.0f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 144.0f, 154.73f, 159.2f, 159.68f, 170.75f),
                    PathNode.CurveTo(167.6f, 189.24f, 178.32f, 192.0f, 184.0f, 192.0f),
                    PathNode.CurveTo(189.68f, 192.0f, 200.4f, 189.24f, 208.32f, 170.75f),
                    PathNode.CurveTo(213.27f, 159.2f, 216.0f, 144.0f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 112.0f, 213.27f, 96.8f, 208.32f, 85.25f),
                    PathNode.CurveTo(200.4f, 66.76f, 189.68f, 64.0f, 184.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 64.0f),
                    PathNode.CurveTo(235.58173f, 64.0f, 232.0f, 67.58172f, 232.0f, 72.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(232.0f, 188.41827f, 235.58173f, 192.0f, 240.0f, 192.0f),
                    PathNode.CurveTo(244.41827f, 192.0f, 248.0f, 188.41827f, 248.0f, 184.0f),
                    PathNode.LineTo(248.0f, 72.0f),
                    PathNode.CurveTo(248.0f, 67.58172f, 244.41827f, 64.0f, 240.0f, 64.0f),
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
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
