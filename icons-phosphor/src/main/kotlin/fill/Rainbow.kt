package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorFillIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 48.0f),
                    PathNode.CurveTo(61.75553f, 48.071648f, 8.071649f, 101.75553f, 8.0f, 168.0f),
                    PathNode.LineTo(8.0f, 184.0f),
                    PathNode.CurveTo(8.0f, 188.41827f, 11.581722f, 192.0f, 16.0f, 192.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.CurveTo(244.41827f, 192.0f, 248.0f, 188.41827f, 248.0f, 184.0f),
                    PathNode.LineTo(248.0f, 168.0f),
                    PathNode.CurveTo(247.92834f, 101.75553f, 194.24448f, 48.071648f, 128.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 176.0f),
                    PathNode.CurveTo(155.58173f, 176.0f, 152.0f, 172.41827f, 152.0f, 168.0f),
                    PathNode.CurveTo(152.0f, 154.74516f, 141.25484f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(114.74516f, 144.0f, 104.0f, 154.74516f, 104.0f, 168.0f),
                    PathNode.CurveTo(104.0f, 172.41827f, 100.41828f, 176.0f, 96.0f, 176.0f),
                    PathNode.CurveTo(91.58172f, 176.0f, 88.0f, 172.41827f, 88.0f, 168.0f),
                    PathNode.CurveTo(88.0f, 145.90862f, 105.90861f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(150.09138f, 128.0f, 168.0f, 145.90862f, 168.0f, 168.0f),
                    PathNode.CurveTo(168.0f, 172.41827f, 164.41827f, 176.0f, 160.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 176.0f),
                    PathNode.CurveTo(187.58173f, 176.0f, 184.0f, 172.41827f, 184.0f, 168.0f),
                    PathNode.CurveTo(184.0f, 137.07205f, 158.92795f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(97.07206f, 112.0f, 72.0f, 137.07205f, 72.0f, 168.0f),
                    PathNode.CurveTo(72.0f, 172.41827f, 68.41828f, 176.0f, 64.0f, 176.0f),
                    PathNode.CurveTo(59.581722f, 176.0f, 56.0f, 172.41827f, 56.0f, 168.0f),
                    PathNode.CurveTo(56.0f, 128.2355f, 88.2355f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(167.7645f, 96.0f, 200.0f, 128.2355f, 200.0f, 168.0f),
                    PathNode.CurveTo(200.0f, 172.41827f, 196.41827f, 176.0f, 192.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 176.0f),
                    PathNode.CurveTo(219.58173f, 176.0f, 216.0f, 172.41827f, 216.0f, 168.0f),
                    PathNode.CurveTo(216.0f, 119.39894f, 176.60106f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(79.39894f, 80.0f, 40.0f, 119.39894f, 40.0f, 168.0f),
                    PathNode.CurveTo(40.0f, 172.41827f, 36.418278f, 176.0f, 32.0f, 176.0f),
                    PathNode.CurveTo(27.581722f, 176.0f, 24.0f, 172.41827f, 24.0f, 168.0f),
                    PathNode.CurveTo(24.0f, 110.562386f, 70.562386f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(185.4376f, 64.0f, 232.0f, 110.562386f, 232.0f, 168.0f),
                    PathNode.CurveTo(232.0f, 172.41827f, 228.41827f, 176.0f, 224.0f, 176.0f),
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
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
