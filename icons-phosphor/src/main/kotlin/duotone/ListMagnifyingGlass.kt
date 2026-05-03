package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ListMagnifyingGlass: ImageVector
    get() {
        if (_listMagnifyingGlass != null) return _listMagnifyingGlass!!
        _listMagnifyingGlass = phosphorDuotoneIcon(
            name = "ListMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 144.000 C 216.000 161.673 201.673 176.000 184.000 176.000 C 166.327 176.000 152.000 161.673 152.000 144.000 C 152.000 126.327 166.327 112.000 184.000 112.000 C 201.673 112.000 216.000 126.327 216.000 144.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 32.000 64.000 C 32.000 59.582 35.582 56.000 40.000 56.000 L 216.000 56.000 C 220.418 56.000 224.000 59.582 224.000 64.000 C 224.000 68.418 220.418 72.000 216.000 72.000 L 40.000 72.000 C 35.582 72.000 32.000 68.418 32.000 64.000 ZM 40.000 136.000 L 112.000 136.000 C 116.418 136.000 120.000 132.418 120.000 128.000 C 120.000 123.582 116.418 120.000 112.000 120.000 L 40.000 120.000 C 35.582 120.000 32.000 123.582 32.000 128.000 C 32.000 132.418 35.582 136.000 40.000 136.000 ZM 128.000 184.000 L 40.000 184.000 C 35.582 184.000 32.000 187.582 32.000 192.000 C 32.000 196.418 35.582 200.000 40.000 200.000 L 128.000 200.000 C 132.418 200.000 136.000 196.418 136.000 192.000 C 136.000 187.582 132.418 184.000 128.000 184.000 ZM 237.660 197.660 C 236.159 199.162 234.123 200.006 232.000 200.006 C 229.877 200.006 227.841 199.162 226.340 197.660 L 206.000 177.360 C 188.865 188.665 165.954 185.164 152.977 169.257 C 140.001 153.351 141.172 130.203 155.688 115.688 C 170.203 101.172 193.351 100.001 209.257 112.977 C 225.164 125.954 228.665 148.865 217.360 166.000 L 237.660 186.300 C 239.174 187.802 240.026 189.847 240.026 191.980 C 240.026 194.113 239.174 196.158 237.660 197.660 ZM 184.000 168.000 C 197.255 168.000 208.000 157.255 208.000 144.000 C 208.000 130.745 197.255 120.000 184.000 120.000 C 170.745 120.000 160.000 130.745 160.000 144.000 C 160.000 157.255 170.745 168.000 184.000 168.000 Z"),
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
        return _listMagnifyingGlass!!
    }

private var _listMagnifyingGlass: ImageVector? = null
