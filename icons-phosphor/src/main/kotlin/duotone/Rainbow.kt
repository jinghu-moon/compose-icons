package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorDuotoneIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 168.0f),
                    PathNode.LineTo(240.0f, 184.0f),
                    PathNode.LineTo(176.0f, 184.0f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.CurveTo(176.0f, 141.49033f, 154.50967f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(101.49033f, 120.0f, 80.0f, 141.49033f, 80.0f, 168.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.LineTo(16.0f, 184.0f),
                    PathNode.LineTo(16.0f, 168.0f),
                    PathNode.CurveTo(16.0f, 106.14411f, 66.14411f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(189.85588f, 56.0f, 240.0f, 106.14411f, 240.0f, 168.0f),
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
                    PathNode.MoveTo(184.0f, 168.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.CurveTo(184.0f, 188.41827f, 180.41827f, 192.0f, 176.0f, 192.0f),
                    PathNode.CurveTo(171.58173f, 192.0f, 168.0f, 188.41827f, 168.0f, 184.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.CurveTo(168.0f, 145.90862f, 150.09138f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(105.90861f, 128.0f, 88.0f, 145.90862f, 88.0f, 168.0f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.CurveTo(88.0f, 188.41827f, 84.41828f, 192.0f, 80.0f, 192.0f),
                    PathNode.CurveTo(75.58172f, 192.0f, 72.0f, 188.41827f, 72.0f, 184.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.CurveTo(72.0f, 137.07205f, 97.07206f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(158.92795f, 112.0f, 184.0f, 137.07205f, 184.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.CurveTo(79.42178f, 80.05511f, 40.055107f, 119.42178f, 40.0f, 168.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(40.0f, 188.41827f, 43.581722f, 192.0f, 48.0f, 192.0f),
                    PathNode.CurveTo(52.418278f, 192.0f, 56.0f, 188.41827f, 56.0f, 184.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.CurveTo(56.0f, 128.2355f, 88.2355f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(167.7645f, 96.0f, 200.0f, 128.2355f, 200.0f, 168.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.CurveTo(200.0f, 188.41827f, 203.58173f, 192.0f, 208.0f, 192.0f),
                    PathNode.CurveTo(212.41827f, 192.0f, 216.0f, 188.41827f, 216.0f, 184.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(215.94489f, 119.42178f, 176.57822f, 80.05511f, 128.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 48.0f),
                    PathNode.CurveTo(61.75553f, 48.071648f, 8.071649f, 101.75553f, 8.0f, 168.0f),
                    PathNode.LineTo(8.0f, 184.0f),
                    PathNode.CurveTo(8.0f, 188.41827f, 11.581722f, 192.0f, 16.0f, 192.0f),
                    PathNode.CurveTo(20.418278f, 192.0f, 24.0f, 188.41827f, 24.0f, 184.0f),
                    PathNode.LineTo(24.0f, 168.0f),
                    PathNode.CurveTo(24.0f, 110.562386f, 70.562386f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(185.4376f, 64.0f, 232.0f, 110.562386f, 232.0f, 168.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(232.0f, 188.41827f, 235.58173f, 192.0f, 240.0f, 192.0f),
                    PathNode.CurveTo(244.41827f, 192.0f, 248.0f, 188.41827f, 248.0f, 184.0f),
                    PathNode.LineTo(248.0f, 168.0f),
                    PathNode.CurveTo(247.92834f, 101.75553f, 194.24448f, 48.071648f, 128.0f, 48.0f),
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
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
