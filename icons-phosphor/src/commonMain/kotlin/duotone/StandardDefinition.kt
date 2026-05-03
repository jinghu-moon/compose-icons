package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) return _standardDefinition!!
        _standardDefinition = phosphorDuotoneIcon(
            name = "StandardDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
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
                    PathNode.MoveTo(144.0f, 72.0f),
                    PathNode.CurveTo(139.58173f, 72.0f, 136.0f, 75.58172f, 136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 180.41827f, 139.58173f, 184.0f, 144.0f, 184.0f),
                    PathNode.LineTo(164.0f, 184.0f),
                    PathNode.CurveTo(194.92795f, 184.0f, 220.0f, 158.92795f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 97.07206f, 194.92795f, 72.0f, 164.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 150.09138f, 186.09138f, 168.0f, 164.0f, 168.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.LineTo(164.0f, 88.0f),
                    PathNode.CurveTo(186.09138f, 88.0f, 204.0f, 105.90861f, 204.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 48.0f),
                    PathNode.CurveTo(24.0f, 43.581722f, 27.581722f, 40.0f, 32.0f, 40.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(228.41827f, 40.0f, 232.0f, 43.581722f, 232.0f, 48.0f),
                    PathNode.CurveTo(232.0f, 52.418278f, 228.41827f, 56.0f, 224.0f, 56.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(27.581722f, 56.0f, 24.0f, 52.418278f, 24.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 212.41827f, 228.41827f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(27.581722f, 216.0f, 24.0f, 212.41827f, 24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 203.58173f, 27.581722f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(228.41827f, 200.0f, 232.0f, 203.58173f, 232.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 152.0f),
                    PathNode.CurveTo(104.0f, 142.52f, 95.39f, 139.0f, 77.12f, 133.74f),
                    PathNode.CurveTo(61.37f, 129.2f, 41.78f, 123.55f, 41.78f, 104.0f),
                    PathNode.CurveTo(41.78f, 85.76f, 58.21f, 72.0f, 80.0f, 72.0f),
                    PathNode.CurveTo(95.72f, 72.0f, 109.18f, 79.3f, 115.12f, 91.0f),
                    PathNode.CurveTo(116.51549f, 93.56086f, 116.406845f, 96.67821f, 114.836464f, 99.135704f),
                    PathNode.CurveTo(113.26608f, 101.59319f, 110.4828f, 103.00141f, 107.57264f, 102.81088f),
                    PathNode.CurveTo(104.662476f, 102.62035f, 102.08656f, 100.86127f, 100.85f, 98.22f),
                    PathNode.CurveTo(97.64f, 91.94f, 89.65f, 88.0f, 80.0f, 88.0f),
                    PathNode.CurveTo(67.33f, 88.0f, 57.78f, 94.88f, 57.78f, 104.0f),
                    PathNode.CurveTo(57.78f, 111.0f, 66.78f, 114.1f, 81.55f, 118.36f),
                    PathNode.CurveTo(97.78f, 123.0f, 120.0f, 129.45f, 120.0f, 152.0f),
                    PathNode.CurveTo(120.0f, 169.64f, 102.06f, 184.0f, 80.0f, 184.0f),
                    PathNode.CurveTo(57.94f, 184.0f, 40.0f, 169.64f, 40.0f, 152.0f),
                    PathNode.CurveTo(40.0f, 147.58173f, 43.581722f, 144.0f, 48.0f, 144.0f),
                    PathNode.CurveTo(52.418278f, 144.0f, 56.0f, 147.58173f, 56.0f, 152.0f),
                    PathNode.CurveTo(56.0f, 160.67f, 67.0f, 168.0f, 80.0f, 168.0f),
                    PathNode.CurveTo(93.0f, 168.0f, 104.0f, 160.67f, 104.0f, 152.0f),
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
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null
