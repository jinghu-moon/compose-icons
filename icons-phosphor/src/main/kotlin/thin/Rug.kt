package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rug: ImageVector
    get() {
        if (_rug != null) return _rug!!
        _rug = phosphorThinIcon(
            name = "Rug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 20.000 C 197.791 20.000 196.000 21.791 196.000 24.000 L 196.000 44.000 L 156.000 44.000 L 156.000 24.000 C 156.000 21.791 154.209 20.000 152.000 20.000 C 149.791 20.000 148.000 21.791 148.000 24.000 L 148.000 44.000 L 108.000 44.000 L 108.000 24.000 C 108.000 21.791 106.209 20.000 104.000 20.000 C 101.791 20.000 100.000 21.791 100.000 24.000 L 100.000 44.000 L 60.000 44.000 L 60.000 24.000 C 60.000 21.791 58.209 20.000 56.000 20.000 C 53.791 20.000 52.000 21.791 52.000 24.000 L 52.000 232.000 C 52.000 234.209 53.791 236.000 56.000 236.000 C 58.209 236.000 60.000 234.209 60.000 232.000 L 60.000 212.000 L 100.000 212.000 L 100.000 232.000 C 100.000 234.209 101.791 236.000 104.000 236.000 C 106.209 236.000 108.000 234.209 108.000 232.000 L 108.000 212.000 L 148.000 212.000 L 148.000 232.000 C 148.000 234.209 149.791 236.000 152.000 236.000 C 154.209 236.000 156.000 234.209 156.000 232.000 L 156.000 212.000 L 196.000 212.000 L 196.000 232.000 C 196.000 234.209 197.791 236.000 200.000 236.000 C 202.209 236.000 204.000 234.209 204.000 232.000 L 204.000 24.000 C 204.000 21.791 202.209 20.000 200.000 20.000 ZM 60.000 52.000 L 196.000 52.000 L 196.000 204.000 L 60.000 204.000 ZM 128.000 172.000 C 129.405 172.000 130.707 171.264 131.430 170.060 L 155.430 130.060 C 156.192 128.792 156.192 127.208 155.430 125.940 L 131.430 85.940 C 130.707 84.735 129.405 83.998 128.000 83.998 C 126.595 83.998 125.293 84.735 124.570 85.940 L 100.570 125.940 C 99.808 127.208 99.808 128.792 100.570 130.060 L 124.570 170.060 C 125.293 171.264 126.595 172.000 128.000 172.000 ZM 128.000 95.770 L 147.330 128.000 L 128.000 160.230 L 108.670 128.000 Z"),
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
        return _rug!!
    }

private var _rug: ImageVector? = null
