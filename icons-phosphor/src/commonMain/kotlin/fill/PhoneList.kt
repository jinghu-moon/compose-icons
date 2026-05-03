package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneList: ImageVector
    get() {
        if (_phoneList != null) return _phoneList!!
        _phoneList = phosphorFillIcon(
            name = "PhoneList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.88f, 183.08f),
                    PathNode.CurveTo(220.19142f, 211.1111f, 196.2727f, 232.05067f, 168.0f, 232.0f),
                    PathNode.CurveTo(88.6f, 232.0f, 24.0f, 167.4f, 24.0f, 88.0f),
                    PathNode.CurveTo(23.949318f, 59.7273f, 44.8889f, 35.80858f, 72.92f, 32.12f),
                    PathNode.CurveTo(79.95731f, 31.26072f, 86.720985f, 35.134975f, 89.54f, 41.64f),
                    PathNode.LineTo(110.66f, 88.79f),
                    PathNode.CurveTo(110.65606f, 88.8299f, 110.65606f, 88.870094f, 110.66f, 88.91f),
                    PathNode.CurveTo(112.79448f, 93.834625f, 112.31756f, 99.5014f, 109.39f, 104.0f),
                    PathNode.CurveTo(109.21f, 104.27f, 109.02f, 104.52f, 108.82f, 104.77f),
                    PathNode.LineTo(88.0f, 129.45f),
                    PathNode.CurveTo(95.49f, 144.67f, 111.41f, 160.45f, 126.83f, 167.96f),
                    PathNode.LineTo(151.17f, 147.25f),
                    PathNode.CurveTo(151.40903f, 147.04907f, 151.65944f, 146.86209f, 151.92f, 146.69f),
                    PathNode.CurveTo(156.41823f, 143.6879f, 162.12857f, 143.16124f, 167.1f, 145.29f),
                    PathNode.LineTo(167.22f, 145.35f),
                    PathNode.LineTo(214.32f, 166.46f),
                    PathNode.CurveTo(220.84076f, 169.26581f, 224.73311f, 176.03265f, 223.88f, 183.08f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 72.0f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.CurveTo(212.41827f, 72.0f, 216.0f, 68.41828f, 216.0f, 64.0f),
                    PathNode.CurveTo(216.0f, 59.581722f, 212.41827f, 56.0f, 208.0f, 56.0f),
                    PathNode.LineTo(144.0f, 56.0f),
                    PathNode.CurveTo(139.58173f, 56.0f, 136.0f, 59.581722f, 136.0f, 64.0f),
                    PathNode.CurveTo(136.0f, 68.41828f, 139.58173f, 72.0f, 144.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 112.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.CurveTo(212.41827f, 112.0f, 216.0f, 108.41828f, 216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 99.58172f, 212.41827f, 96.0f, 208.0f, 96.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.CurveTo(139.58173f, 96.0f, 136.0f, 99.58172f, 136.0f, 104.0f),
                    PathNode.CurveTo(136.0f, 108.41828f, 139.58173f, 112.0f, 144.0f, 112.0f),
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
        return _phoneList!!
    }

private var _phoneList: ImageVector? = null
