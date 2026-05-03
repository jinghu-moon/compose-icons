package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ListBullet: ImageVector
    get() {
        if (_listBullet != null) return _listBullet!!
        _listBullet = radixIcon(
            name = "ListBullet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 1.500 9.750 C 1.914 9.750 2.250 10.086 2.250 10.500 C 2.250 10.914 1.914 11.250 1.500 11.250 C 1.086 11.250 0.750 10.914 0.750 10.500 C 0.750 10.086 1.086 9.750 1.500 9.750 ZM 13.601 10.010 C 13.829 10.056 14.000 10.258 14.000 10.500 C 14.000 10.742 13.829 10.944 13.601 10.990 L 13.500 11.000 L 4.500 11.000 C 4.224 11.000 4.000 10.776 4.000 10.500 C 4.000 10.224 4.224 10.000 4.500 10.000 L 13.500 10.000 L 13.601 10.010 ZM 1.500 6.750 C 1.914 6.750 2.250 7.086 2.250 7.500 C 2.250 7.914 1.914 8.250 1.500 8.250 C 1.086 8.250 0.750 7.914 0.750 7.500 C 0.750 7.086 1.086 6.750 1.500 6.750 ZM 13.601 7.010 C 13.829 7.056 14.000 7.258 14.000 7.500 C 14.000 7.742 13.829 7.944 13.601 7.990 L 13.500 8.000 L 4.500 8.000 C 4.224 8.000 4.000 7.776 4.000 7.500 C 4.000 7.224 4.224 7.000 4.500 7.000 L 13.500 7.000 L 13.601 7.010 ZM 1.500 3.750 C 1.914 3.750 2.250 4.086 2.250 4.500 C 2.250 4.914 1.914 5.250 1.500 5.250 C 1.086 5.250 0.750 4.914 0.750 4.500 C 0.750 4.086 1.086 3.750 1.500 3.750 ZM 13.601 4.010 C 13.829 4.056 14.000 4.258 14.000 4.500 C 14.000 4.742 13.829 4.944 13.601 4.990 L 13.500 5.000 L 4.500 5.000 C 4.224 5.000 4.000 4.776 4.000 4.500 C 4.000 4.224 4.224 4.000 4.500 4.000 L 13.500 4.000 L 13.601 4.010 Z"),
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
        return _listBullet!!
    }

private var _listBullet: ImageVector? = null
