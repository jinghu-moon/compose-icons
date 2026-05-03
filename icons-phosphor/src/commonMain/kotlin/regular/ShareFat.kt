package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorRegularIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 106.35f),
                    PathNode.LineTo(157.66f, 26.35f),
                    PathNode.CurveTo(155.3732f, 24.060648f, 151.93245f, 23.374334f, 148.9423f, 24.61111f),
                    PathNode.CurveTo(145.95215f, 25.847885f, 144.0015f, 28.764166f, 144.0f, 32.0f),
                    PathNode.LineTo(144.0f, 72.35f),
                    PathNode.CurveTo(118.06f, 74.57f, 89.41f, 87.27f, 65.84f, 107.26f),
                    PathNode.CurveTo(37.46f, 131.34f, 19.79f, 162.37f, 16.08f, 194.63f),
                    PathNode.CurveTo(15.485348f, 199.77425f, 18.257767f, 204.71967f, 22.956568f, 206.89638f),
                    PathNode.CurveTo(27.65537f, 209.0731f, 33.220486f, 207.99004f, 36.76f, 204.21f),
                    PathNode.LineTo(36.76f, 204.21f),
                    PathNode.CurveTo(47.76f, 192.5f, 86.9f, 155.47f, 144.0f, 152.21f),
                    PathNode.LineTo(144.0f, 192.0f),
                    PathNode.CurveTo(144.0015f, 195.23584f, 145.95215f, 198.15211f, 148.9423f, 199.38889f),
                    PathNode.CurveTo(151.93245f, 200.62567f, 155.3732f, 199.93935f, 157.66f, 197.65f),
                    PathNode.LineTo(237.66f, 117.65f),
                    PathNode.CurveTo(240.77507f, 114.52738f, 240.77507f, 109.47262f, 237.66f, 106.35f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 172.69f),
                    PathNode.LineTo(160.0f, 144.0f),
                    PathNode.CurveTo(160.0f, 139.58173f, 156.41827f, 136.0f, 152.0f, 136.0f),
                    PathNode.CurveTo(123.92f, 136.0f, 96.57f, 143.33f, 70.71f, 157.8f),
                    PathNode.CurveTo(57.53944f, 165.20227f, 45.2681f, 174.10126f, 34.14f, 184.32f),
                    PathNode.CurveTo(39.94f, 160.48f, 54.56f, 137.81f, 76.19f, 119.46f),
                    PathNode.CurveTo(99.41f, 99.77f, 127.75f, 88.0f, 152.0f, 88.0f),
                    PathNode.CurveTo(156.41827f, 88.0f, 160.0f, 84.41828f, 160.0f, 80.0f),
                    PathNode.LineTo(160.0f, 51.32f),
                    PathNode.LineTo(220.69f, 112.0f),
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
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
