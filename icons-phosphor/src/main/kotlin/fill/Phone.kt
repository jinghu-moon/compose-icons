package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorFillIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.88f, 175.08f),
                    PathNode.CurveTo(228.19142f, 203.1111f, 204.2727f, 224.05067f, 176.0f, 224.0f),
                    PathNode.CurveTo(96.6f, 224.0f, 32.0f, 159.4f, 32.0f, 80.0f),
                    PathNode.CurveTo(31.949318f, 51.7273f, 52.8889f, 27.808578f, 80.92f, 24.12f),
                    PathNode.CurveTo(87.95731f, 23.26072f, 94.720985f, 27.134975f, 97.54f, 33.64f),
                    PathNode.LineTo(118.66f, 80.79f),
                    PathNode.LineTo(118.66f, 80.91f),
                    PathNode.CurveTo(120.79448f, 85.834625f, 120.31756f, 91.5014f, 117.39f, 96.0f),
                    PathNode.CurveTo(117.21f, 96.27f, 117.02f, 96.52f, 116.82f, 96.77f),
                    PathNode.LineTo(96.0f, 121.45f),
                    PathNode.CurveTo(103.49f, 136.67f, 119.41f, 152.45f, 134.83f, 159.96f),
                    PathNode.LineTo(159.17f, 139.25f),
                    PathNode.CurveTo(159.40903f, 139.04907f, 159.65944f, 138.86209f, 159.92f, 138.69f),
                    PathNode.CurveTo(164.41577f, 135.69144f, 170.12137f, 135.16489f, 175.09f, 137.29f),
                    PathNode.LineTo(175.22f, 137.35f),
                    PathNode.LineTo(222.33f, 158.46f),
                    PathNode.CurveTo(228.84682f, 161.26912f, 232.73465f, 168.03517f, 231.88f, 175.08f),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
