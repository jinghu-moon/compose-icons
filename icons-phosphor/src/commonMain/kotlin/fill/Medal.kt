package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = phosphorFillIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 96.0f),
                    PathNode.CurveTo(216.02426f, 55.118633f, 187.89136f, 19.604364f, 148.08952f, 10.27156f),
                    PathNode.CurveTo(108.2877f, 0.938755f, 67.30024f, 20.245554f, 49.149273f, 56.87654f),
                    PathNode.CurveTo(30.998304f, 93.50753f, 40.464554f, 137.81458f, 72.0f, 163.83f),
                    PathNode.LineTo(72.0f, 240.0f),
                    PathNode.CurveTo(71.99802f, 242.7741f, 73.433304f, 245.35121f, 75.7928f, 246.81012f),
                    PathNode.CurveTo(78.1523f, 248.269f, 81.09917f, 248.40141f, 83.58f, 247.16f),
                    PathNode.LineTo(128.0f, 225.0f),
                    PathNode.LineTo(172.43f, 247.21f),
                    PathNode.CurveTo(173.54388f, 247.743f, 174.76523f, 248.01328f, 176.0f, 248.0f),
                    PathNode.CurveTo(180.41827f, 248.0f, 184.0f, 244.41827f, 184.0f, 240.0f),
                    PathNode.LineTo(184.0f, 163.83f),
                    PathNode.CurveTo(204.26695f, 147.138f, 216.00552f, 122.25591f, 216.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 96.0f),
                    PathNode.CurveTo(56.0f, 56.235497f, 88.2355f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(167.7645f, 24.0f, 200.0f, 56.235497f, 200.0f, 96.0f),
                    PathNode.CurveTo(200.0f, 135.7645f, 167.7645f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(88.25378f, 167.95592f, 56.04409f, 135.74623f, 56.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 96.0f),
                    PathNode.CurveTo(72.0f, 65.07205f, 97.07206f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(158.92795f, 40.0f, 184.0f, 65.07205f, 184.0f, 96.0f),
                    PathNode.CurveTo(184.0f, 126.92794f, 158.92795f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(97.08576f, 151.96693f, 72.033066f, 126.91424f, 72.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _medal!!
    }

private var _medal: ImageVector? = null
