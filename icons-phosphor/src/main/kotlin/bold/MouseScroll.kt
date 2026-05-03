package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MouseScroll: ImageVector
    get() {
        if (_mouseScroll != null) return _mouseScroll!!
        _mouseScroll = phosphorBoldIcon(
            name = "MouseScroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 12.000 L 112.000 12.000 C 74.461 12.039 44.039 42.461 44.000 80.000 L 44.000 176.000 C 44.039 213.539 74.461 243.961 112.000 244.000 L 144.000 244.000 C 181.539 243.961 211.961 213.539 212.000 176.000 L 212.000 80.000 C 211.961 42.461 181.539 12.039 144.000 12.000 ZM 188.000 176.000 C 187.972 200.289 168.289 219.972 144.000 220.000 L 112.000 220.000 C 87.711 219.972 68.028 200.289 68.000 176.000 L 68.000 80.000 C 68.028 55.711 87.711 36.028 112.000 36.000 L 144.000 36.000 C 168.289 36.028 187.972 55.711 188.000 80.000 ZM 140.000 93.000 L 140.000 163.000 L 143.510 159.480 C 148.204 154.786 155.816 154.786 160.510 159.480 C 165.204 164.174 165.204 171.786 160.510 176.480 L 136.510 200.480 C 134.258 202.739 131.200 204.009 128.010 204.009 C 124.820 204.009 121.762 202.739 119.510 200.480 L 95.510 176.480 C 90.816 171.786 90.816 164.174 95.510 159.480 C 100.204 154.786 107.816 154.786 112.510 159.480 L 116.000 163.000 L 116.000 93.000 L 112.490 96.520 C 107.796 101.214 100.184 101.214 95.490 96.520 C 90.796 91.826 90.796 84.214 95.490 79.520 L 119.490 55.520 C 121.742 53.261 124.800 51.991 127.990 51.991 C 131.180 51.991 134.238 53.261 136.490 55.520 L 160.490 79.520 C 165.184 84.214 165.184 91.826 160.490 96.520 C 155.796 101.214 148.184 101.214 143.490 96.520 Z"),
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
        return _mouseScroll!!
    }

private var _mouseScroll: ImageVector? = null
