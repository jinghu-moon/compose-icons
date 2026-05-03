package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListMagnifyingGlass: ImageVector
    get() {
        if (_listMagnifyingGlass != null) return _listMagnifyingGlass!!
        _listMagnifyingGlass = phosphorThinIcon(
            name = "ListMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 L 216.000 60.000 C 218.209 60.000 220.000 61.791 220.000 64.000 C 220.000 66.209 218.209 68.000 216.000 68.000 L 40.000 68.000 C 37.791 68.000 36.000 66.209 36.000 64.000 ZM 40.000 132.000 L 112.000 132.000 C 114.209 132.000 116.000 130.209 116.000 128.000 C 116.000 125.791 114.209 124.000 112.000 124.000 L 40.000 124.000 C 37.791 124.000 36.000 125.791 36.000 128.000 C 36.000 130.209 37.791 132.000 40.000 132.000 ZM 128.000 188.000 L 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 C 36.000 194.209 37.791 196.000 40.000 196.000 L 128.000 196.000 C 130.209 196.000 132.000 194.209 132.000 192.000 C 132.000 189.791 130.209 188.000 128.000 188.000 ZM 234.830 194.830 C 234.080 195.581 233.062 196.003 232.000 196.003 C 230.938 196.003 229.920 195.581 229.170 194.830 L 206.450 172.110 C 191.500 184.056 169.822 182.244 157.063 167.981 C 144.305 153.718 144.909 131.973 158.441 118.441 C 171.973 104.909 193.718 104.305 207.981 117.063 C 222.244 129.822 224.056 151.500 212.110 166.450 L 234.830 189.170 C 235.581 189.920 236.003 190.938 236.003 192.000 C 236.003 193.062 235.581 194.080 234.830 194.830 ZM 184.000 172.000 C 199.464 172.000 212.000 159.464 212.000 144.000 C 212.000 128.536 199.464 116.000 184.000 116.000 C 168.536 116.000 156.000 128.536 156.000 144.000 C 156.000 159.464 168.536 172.000 184.000 172.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _listMagnifyingGlass!!
    }

private var _listMagnifyingGlass: ImageVector? = null
