package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorFillIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 115.06f),
                    PathNode.LineTo(172.42f, 96.84f),
                    PathNode.CurveTo(176.37436f, 94.86282f, 181.18282f, 96.465645f, 183.16f, 100.42f),
                    PathNode.CurveTo(185.13718f, 104.37436f, 183.53436f, 109.18282f, 179.58f, 111.16f),
                    PathNode.LineTo(131.58f, 135.16f),
                    PathNode.CurveTo(129.09917f, 136.40141f, 126.1523f, 136.269f, 123.7928f, 134.81012f),
                    PathNode.CurveTo(121.433304f, 133.35121f, 119.99802f, 130.7741f, 120.0f, 128.0f),
                    PathNode.LineTo(120.0f, 72.0f),
                    PathNode.CurveTo(120.0f, 67.58172f, 123.58172f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(132.41827f, 64.0f, 136.0f, 67.58172f, 136.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 132.41827f, 219.58173f, 136.0f, 224.0f, 136.0f),
                    PathNode.CurveTo(228.41827f, 136.0f, 232.0f, 132.41827f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 70.562386f, 185.4376f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(132.41827f, 232.0f, 136.0f, 228.41827f, 136.0f, 224.0f),
                    PathNode.CurveTo(136.0f, 219.58173f, 132.41827f, 216.0f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.62f, 198.62f),
                    PathNode.CurveTo(223.77629f, 189.46971f, 226.51791f, 175.7043f, 221.56615f, 163.74414f),
                    PathNode.CurveTo(216.6144f, 151.78398f, 204.9447f, 143.98517f, 192.0f, 143.98517f),
                    PathNode.CurveTo(179.0553f, 143.98517f, 167.3856f, 151.78398f, 162.43385f, 163.74414f),
                    PathNode.CurveTo(157.48209f, 175.7043f, 160.22371f, 189.46971f, 169.38f, 198.62f),
                    PathNode.CurveTo(160.95552f, 204.00151f, 154.85146f, 212.34244f, 152.27f, 222.0f),
                    PathNode.CurveTo(151.65211f, 224.39302f, 152.17499f, 226.93727f, 153.68652f, 228.89267f),
                    PathNode.CurveTo(155.19804f, 230.84808f, 157.5285f, 231.99507f, 160.0f, 232.0f),
                    PathNode.LineTo(224.0f, 232.0f),
                    PathNode.CurveTo(226.48515f, 231.99992f, 228.82916f, 230.84492f, 230.34334f, 228.87433f),
                    PathNode.CurveTo(231.85753f, 226.90373f, 232.36993f, 224.34135f, 231.73f, 221.94f),
                    PathNode.CurveTo(229.13512f, 212.3046f, 223.03247f, 203.98701f, 214.62f, 198.62f),
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
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
