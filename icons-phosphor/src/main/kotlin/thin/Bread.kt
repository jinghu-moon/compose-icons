package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorThinIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 80.000 C 236.000 60.118 219.882 44.000 200.000 44.000 L 48.000 44.000 C 30.468 44.002 15.486 56.633 12.522 73.912 C 9.557 91.192 19.471 108.094 36.000 113.940 L 36.000 200.000 C 36.000 206.627 41.373 212.000 48.000 212.000 L 200.000 212.000 C 206.627 212.000 212.000 206.627 212.000 200.000 L 212.000 113.940 C 226.370 108.837 235.979 95.249 236.000 80.000 ZM 44.000 200.000 L 44.000 115.770 C 45.328 115.923 46.663 115.999 48.000 116.000 C 50.209 116.000 52.000 114.209 52.000 112.000 C 52.000 109.791 50.209 108.000 48.000 108.000 C 32.536 108.000 20.000 95.464 20.000 80.000 C 20.000 64.536 32.536 52.000 48.000 52.000 L 144.000 52.000 C 159.464 52.000 172.000 64.536 172.000 80.000 C 172.000 95.464 159.464 108.000 144.000 108.000 C 141.791 108.000 140.000 109.791 140.000 112.000 C 140.000 114.209 141.791 116.000 144.000 116.000 C 145.337 115.999 146.672 115.923 148.000 115.770 L 148.000 200.000 C 148.000 202.209 146.209 204.000 144.000 204.000 L 48.000 204.000 C 45.791 204.000 44.000 202.209 44.000 200.000 ZM 200.000 108.000 C 197.791 108.000 196.000 109.791 196.000 112.000 C 196.000 114.209 197.791 116.000 200.000 116.000 C 201.337 115.999 202.672 115.923 204.000 115.770 L 204.000 200.000 C 204.000 202.209 202.209 204.000 200.000 204.000 L 155.300 204.000 C 155.763 202.717 156.000 201.364 156.000 200.000 L 156.000 113.940 C 168.288 109.585 177.261 98.926 179.458 86.075 C 181.655 73.225 176.733 60.191 166.590 52.000 L 200.000 52.000 C 215.464 52.000 228.000 64.536 228.000 80.000 C 228.000 95.464 215.464 108.000 200.000 108.000 Z"),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
