package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CashRegister: ImageVector
    get() {
        if (_cashRegister != null) return _cashRegister!!
        _cashRegister = phosphorRegularIcon(
            name = "CashRegister",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 239.760 158.060 L 217.280 68.120 C 215.499 60.994 209.095 55.997 201.750 56.000 L 136.000 56.000 L 136.000 40.000 C 136.000 31.163 128.837 24.000 120.000 24.000 L 80.000 24.000 C 71.163 24.000 64.000 31.163 64.000 40.000 L 64.000 56.000 L 54.250 56.000 C 46.905 55.997 40.501 60.994 38.720 68.120 L 16.240 158.060 C 16.080 158.694 16.000 159.346 16.000 160.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 160.000 C 240.000 159.346 239.920 158.694 239.760 158.060 ZM 80.000 40.000 L 120.000 40.000 L 120.000 56.000 L 80.000 56.000 ZM 54.250 72.000 L 201.750 72.000 L 221.750 152.000 L 34.250 152.000 ZM 32.000 192.000 L 32.000 168.000 L 224.000 168.000 L 224.000 192.000 ZM 64.000 96.000 C 64.000 91.582 67.582 88.000 72.000 88.000 L 88.000 88.000 C 92.418 88.000 96.000 91.582 96.000 96.000 C 96.000 100.418 92.418 104.000 88.000 104.000 L 72.000 104.000 C 67.582 104.000 64.000 100.418 64.000 96.000 ZM 112.000 96.000 C 112.000 91.582 115.582 88.000 120.000 88.000 L 136.000 88.000 C 140.418 88.000 144.000 91.582 144.000 96.000 C 144.000 100.418 140.418 104.000 136.000 104.000 L 120.000 104.000 C 115.582 104.000 112.000 100.418 112.000 96.000 ZM 160.000 96.000 C 160.000 91.582 163.582 88.000 168.000 88.000 L 184.000 88.000 C 188.418 88.000 192.000 91.582 192.000 96.000 C 192.000 100.418 188.418 104.000 184.000 104.000 L 168.000 104.000 C 163.582 104.000 160.000 100.418 160.000 96.000 ZM 64.000 128.000 C 64.000 123.582 67.582 120.000 72.000 120.000 L 88.000 120.000 C 92.418 120.000 96.000 123.582 96.000 128.000 C 96.000 132.418 92.418 136.000 88.000 136.000 L 72.000 136.000 C 67.582 136.000 64.000 132.418 64.000 128.000 ZM 112.000 128.000 C 112.000 123.582 115.582 120.000 120.000 120.000 L 136.000 120.000 C 140.418 120.000 144.000 123.582 144.000 128.000 C 144.000 132.418 140.418 136.000 136.000 136.000 L 120.000 136.000 C 115.582 136.000 112.000 132.418 112.000 128.000 ZM 160.000 128.000 C 160.000 123.582 163.582 120.000 168.000 120.000 L 184.000 120.000 C 188.418 120.000 192.000 123.582 192.000 128.000 C 192.000 132.418 188.418 136.000 184.000 136.000 L 168.000 136.000 C 163.582 136.000 160.000 132.418 160.000 128.000 Z"),
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
        return _cashRegister!!
    }

private var _cashRegister: ImageVector? = null
