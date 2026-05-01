package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorBoldIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.63f, 70.0f),
                    PathNode.CurveTo(224.61424f, 66.09375f, 214.97676f, 68.02124f, 209.08f, 74.71f),
                    PathNode.LineTo(179.56f, 106.53f),
                    PathNode.LineTo(146.22f, 31.76f),
                    PathNode.LineTo(146.16f, 31.62f),
                    PathNode.CurveTo(142.89131f, 24.536037f, 135.80173f, 19.999401f, 128.0f, 19.999401f),
                    PathNode.CurveTo(120.19828f, 19.999401f, 113.10869f, 24.536037f, 109.84f, 31.62f),
                    PathNode.LineTo(109.78f, 31.76f),
                    PathNode.LineTo(76.44f, 106.52f),
                    PathNode.LineTo(46.92f, 74.7f),
                    PathNode.CurveTo(40.962425f, 68.04251f, 31.312004f, 66.14363f, 23.276264f, 70.0477f),
                    PathNode.CurveTo(15.240524f, 73.95177f, 10.768618f, 82.711815f, 12.32f, 91.51f),
                    PathNode.CurveTo(12.32f, 91.67f, 12.38f, 91.82f, 12.41f, 91.98f),
                    PathNode.LineTo(35.07f, 195.76f),
                    PathNode.CurveTo(36.87378f, 205.18349f, 45.115425f, 211.99838f, 54.71f, 212.0f),
                    PathNode.LineTo(201.29f, 212.0f),
                    PathNode.CurveTo(210.88457f, 211.99838f, 219.12622f, 205.18349f, 220.93f, 195.76f),
                    PathNode.LineTo(243.59f, 92.0f),
                    PathNode.CurveTo(243.59f, 91.84f, 243.66f, 91.69f, 243.68f, 91.53f),
                    PathNode.CurveTo(245.31398f, 82.67661f, 240.77567f, 73.83411f, 232.63f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(198.06f, 188.0f),
                    PathNode.LineTo(57.94f, 188.0f),
                    PathNode.LineTo(39.06f, 101.51f),
                    PathNode.LineTo(71.2f, 136.16f),
                    PathNode.CurveTo(73.93937f, 139.13493f, 77.992905f, 140.52998f, 81.9829f, 139.87103f),
                    PathNode.CurveTo(85.972916f, 139.21208f, 89.36264f, 136.58775f, 91.0f, 132.89f),
                    PathNode.LineTo(128.0f, 49.82f),
                    PathNode.LineTo(165.0f, 132.89f),
                    PathNode.CurveTo(166.64203f, 136.57175f, 170.02303f, 139.18298f, 174.00024f, 139.84117f),
                    PathNode.CurveTo(177.97748f, 140.49934f, 182.01944f, 139.11649f, 184.76f, 136.16f),
                    PathNode.LineTo(216.9f, 101.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
