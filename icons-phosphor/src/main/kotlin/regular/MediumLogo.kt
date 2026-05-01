package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) return _mediumLogo!!
        _mediumLogo = phosphorRegularIcon(
            name = "MediumLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 64.0f),
                    PathNode.CurveTo(36.653774f, 64.0f, 8.0f, 92.65378f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 163.34622f, 36.653774f, 192.0f, 72.0f, 192.0f),
                    PathNode.CurveTo(107.34622f, 192.0f, 136.0f, 163.34622f, 136.0f, 128.0f),
                    PathNode.CurveTo(135.96143f, 92.66977f, 107.33023f, 64.03858f, 72.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 176.0f),
                    PathNode.CurveTo(45.490334f, 176.0f, 24.0f, 154.50967f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 101.49033f, 45.490334f, 80.0f, 72.0f, 80.0f),
                    PathNode.CurveTo(98.50967f, 80.0f, 120.0f, 101.49033f, 120.0f, 128.0f),
                    PathNode.CurveTo(119.97244f, 154.49825f, 98.498245f, 175.97244f, 72.0f, 176.0f),
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
                    PathNode.MoveTo(184.0f, 176.0f),
                    PathNode.CurveTo(178.36f, 176.0f, 168.0f, 157.78f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 98.22f, 178.36f, 80.0f, 184.0f, 80.0f),
                    PathNode.CurveTo(189.64f, 80.0f, 200.0f, 98.22f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 157.78f, 189.64f, 176.0f, 184.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 72.0f),
                    PathNode.LineTo(248.0f, 184.0f),
                    PathNode.CurveTo(248.0f, 188.41827f, 244.41827f, 192.0f, 240.0f, 192.0f),
                    PathNode.CurveTo(235.58173f, 192.0f, 232.0f, 188.41827f, 232.0f, 184.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.CurveTo(232.0f, 67.58172f, 235.58173f, 64.0f, 240.0f, 64.0f),
                    PathNode.CurveTo(244.41827f, 64.0f, 248.0f, 67.58172f, 248.0f, 72.0f),
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
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
