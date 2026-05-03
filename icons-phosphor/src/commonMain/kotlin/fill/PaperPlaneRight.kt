package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorFillIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 127.89f),
                    PathNode.CurveTo(240.01494f, 133.69504f, 236.88449f, 139.0528f, 231.82f, 141.89f),
                    PathNode.LineTo(63.9f, 237.9f),
                    PathNode.CurveTo(61.490322f, 239.26588f, 58.769848f, 239.98904f, 56.0f, 240.0f),
                    PathNode.CurveTo(50.821686f, 239.97215f, 45.97705f, 237.43988f, 42.998253f, 233.20403f),
                    PathNode.CurveTo(40.01945f, 228.96817f, 39.274876f, 223.55258f, 41.0f, 218.67f),
                    PathNode.LineTo(68.0f, 138.72f),
                    PathNode.CurveTo(68.54068f, 137.11836f, 70.02982f, 136.02953f, 71.72f, 136.0f),
                    PathNode.LineTo(144.0f, 136.0f),
                    PathNode.CurveTo(146.21684f, 136.00487f, 148.3363f, 135.08966f, 149.85281f, 133.47269f),
                    PathNode.CurveTo(151.36931f, 131.85571f, 152.14687f, 129.68198f, 152.0f, 127.47f),
                    PathNode.CurveTo(151.62376f, 123.203094f, 148.02313f, 119.94683f, 143.74f, 120.0f),
                    PathNode.LineTo(71.74f, 120.0f),
                    PathNode.CurveTo(70.02401f, 120.000145f, 68.499115f, 118.905754f, 67.95f, 117.28f),
                    PathNode.LineTo(40.95f, 37.34f),
                    PathNode.CurveTo(38.749714f, 31.066519f, 40.65807f, 24.08605f, 45.743942f, 19.804497f),
                    PathNode.CurveTo(50.829815f, 15.522941f, 58.03343f, 14.832479f, 63.84f, 18.07f),
                    PathNode.LineTo(231.84f, 113.96f),
                    PathNode.CurveTo(236.87491f, 116.790146f, 239.99365f, 122.1142f, 240.0f, 127.89f),
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
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
