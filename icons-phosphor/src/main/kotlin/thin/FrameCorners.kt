package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FrameCorners: ImageVector
    get() {
        if (_frameCorners != null) return _frameCorners!!
        _frameCorners = phosphorThinIcon(
            name = "FrameCorners",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 80.000 L 196.000 112.000 C 196.000 114.209 194.209 116.000 192.000 116.000 C 189.791 116.000 188.000 114.209 188.000 112.000 L 188.000 84.000 L 160.000 84.000 C 157.791 84.000 156.000 82.209 156.000 80.000 C 156.000 77.791 157.791 76.000 160.000 76.000 L 192.000 76.000 C 194.209 76.000 196.000 77.791 196.000 80.000 ZM 96.000 172.000 L 68.000 172.000 L 68.000 144.000 C 68.000 141.791 66.209 140.000 64.000 140.000 C 61.791 140.000 60.000 141.791 60.000 144.000 L 60.000 176.000 C 60.000 178.209 61.791 180.000 64.000 180.000 L 96.000 180.000 C 98.209 180.000 100.000 178.209 100.000 176.000 C 100.000 173.791 98.209 172.000 96.000 172.000 ZM 228.000 56.000 L 228.000 200.000 C 228.000 206.627 222.627 212.000 216.000 212.000 L 40.000 212.000 C 33.373 212.000 28.000 206.627 28.000 200.000 L 28.000 56.000 C 28.000 49.373 33.373 44.000 40.000 44.000 L 216.000 44.000 C 222.627 44.000 228.000 49.373 228.000 56.000 ZM 220.000 56.000 C 220.000 53.791 218.209 52.000 216.000 52.000 L 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 L 216.000 204.000 C 218.209 204.000 220.000 202.209 220.000 200.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _frameCorners!!
    }

private var _frameCorners: ImageVector? = null
