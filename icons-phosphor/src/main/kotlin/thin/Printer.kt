package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = phosphorThinIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 214.670 76.000 L 196.000 76.000 L 196.000 40.000 C 196.000 37.791 194.209 36.000 192.000 36.000 L 64.000 36.000 C 61.791 36.000 60.000 37.791 60.000 40.000 L 60.000 76.000 L 41.330 76.000 C 29.570 76.000 20.000 85.000 20.000 96.000 L 20.000 176.000 C 20.000 178.209 21.791 180.000 24.000 180.000 L 60.000 180.000 L 60.000 216.000 C 60.000 218.209 61.791 220.000 64.000 220.000 L 192.000 220.000 C 194.209 220.000 196.000 218.209 196.000 216.000 L 196.000 180.000 L 232.000 180.000 C 234.209 180.000 236.000 178.209 236.000 176.000 L 236.000 96.000 C 236.000 85.000 226.430 76.000 214.670 76.000 ZM 68.000 44.000 L 188.000 44.000 L 188.000 76.000 L 68.000 76.000 ZM 188.000 212.000 L 68.000 212.000 L 68.000 156.000 L 188.000 156.000 ZM 228.000 172.000 L 196.000 172.000 L 196.000 152.000 C 196.000 149.791 194.209 148.000 192.000 148.000 L 64.000 148.000 C 61.791 148.000 60.000 149.791 60.000 152.000 L 60.000 172.000 L 28.000 172.000 L 28.000 96.000 C 28.000 89.380 34.000 84.000 41.330 84.000 L 214.670 84.000 C 222.000 84.000 228.000 89.380 228.000 96.000 ZM 196.000 116.000 C 196.000 120.418 192.418 124.000 188.000 124.000 C 183.582 124.000 180.000 120.418 180.000 116.000 C 180.000 111.582 183.582 108.000 188.000 108.000 C 192.418 108.000 196.000 111.582 196.000 116.000 Z"),
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
        return _printer!!
    }

private var _printer: ImageVector? = null
