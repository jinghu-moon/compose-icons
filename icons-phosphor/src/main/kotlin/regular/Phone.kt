package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorRegularIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.37f, 158.46f),
                    PathNode.LineTo(175.26f, 137.35f),
                    PathNode.LineTo(175.13f, 137.29f),
                    PathNode.CurveTo(170.16138f, 135.16489f, 164.45576f, 135.69144f, 159.96f, 138.69f),
                    PathNode.CurveTo(159.69943f, 138.86209f, 159.44902f, 139.04907f, 159.21f, 139.25f),
                    PathNode.LineTo(134.87f, 160.0f),
                    PathNode.CurveTo(119.45f, 152.51f, 103.53f, 136.71f, 96.04f, 121.49f),
                    PathNode.LineTo(116.82f, 96.78f),
                    PathNode.CurveTo(117.02f, 96.53f, 117.21f, 96.28f, 117.39f, 96.01f),
                    PathNode.CurveTo(120.323395f, 91.52752f, 120.818886f, 85.874435f, 118.71f, 80.95f),
                    PathNode.LineTo(118.71f, 80.83f),
                    PathNode.LineTo(97.54f, 33.64f),
                    PathNode.CurveTo(94.720985f, 27.134975f, 87.95731f, 23.26072f, 80.92f, 24.12f),
                    PathNode.CurveTo(52.8889f, 27.808578f, 31.949318f, 51.7273f, 32.0f, 80.0f),
                    PathNode.CurveTo(32.0f, 159.4f, 96.6f, 224.0f, 176.0f, 224.0f),
                    PathNode.CurveTo(204.2727f, 224.05067f, 228.19142f, 203.1111f, 231.88f, 175.08f),
                    PathNode.CurveTo(232.74083f, 168.04518f, 228.8711f, 161.2823f, 222.37f, 158.46f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 208.0f),
                    PathNode.CurveTo(105.33954f, 207.92284f, 48.07716f, 150.66046f, 48.0f, 80.0f),
                    PathNode.CurveTo(47.922176f, 59.799286f, 62.84746f, 42.678223f, 82.87f, 40.0f),
                    PathNode.CurveTo(82.86606f, 40.0399f, 82.86606f, 40.080097f, 82.87f, 40.12f),
                    PathNode.LineTo(103.87f, 87.12f),
                    PathNode.LineTo(83.2f, 111.86f),
                    PathNode.CurveTo(82.9902f, 112.1014f, 82.79962f, 112.35886f, 82.63f, 112.63f),
                    PathNode.CurveTo(79.569214f, 117.32675f, 79.18984f, 123.28287f, 81.63f, 128.33f),
                    PathNode.CurveTo(90.69f, 146.86f, 109.36f, 165.39f, 128.09f, 174.44f),
                    PathNode.CurveTo(133.17488f, 176.85768f, 139.15628f, 176.42473f, 143.84f, 173.3f),
                    PathNode.CurveTo(144.09676f, 173.12704f, 144.3438f, 172.9401f, 144.58f, 172.74f),
                    PathNode.LineTo(168.89f, 152.0f),
                    PathNode.LineTo(215.89f, 173.05f),
                    PathNode.LineTo(215.89f, 173.05f),
                    PathNode.CurveTo(215.89f, 173.05f, 215.97f, 173.05f, 216.0f, 173.05f),
                    PathNode.CurveTo(213.35431f, 193.10208f, 196.22575f, 208.06816f, 176.0f, 208.0f),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
