package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) return _pawPrint!!
        _pawPrint = phosphorFillIcon(
            name = "PawPrint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 108.000 C 240.000 123.464 227.464 136.000 212.000 136.000 C 196.536 136.000 184.000 123.464 184.000 108.000 C 184.000 92.536 196.536 80.000 212.000 80.000 C 227.464 80.000 240.000 92.536 240.000 108.000 ZM 72.000 108.000 C 72.000 92.536 59.464 80.000 44.000 80.000 C 28.536 80.000 16.000 92.536 16.000 108.000 C 16.000 123.464 28.536 136.000 44.000 136.000 C 59.464 136.000 72.000 123.464 72.000 108.000 ZM 92.000 88.000 C 107.464 88.000 120.000 75.464 120.000 60.000 C 120.000 44.536 107.464 32.000 92.000 32.000 C 76.536 32.000 64.000 44.536 64.000 60.000 C 64.000 75.464 76.536 88.000 92.000 88.000 ZM 164.000 88.000 C 179.464 88.000 192.000 75.464 192.000 60.000 C 192.000 44.536 179.464 32.000 164.000 32.000 C 148.536 32.000 136.000 44.536 136.000 60.000 C 136.000 75.464 148.536 88.000 164.000 88.000 ZM 187.120 148.860 C 178.913 144.332 172.844 136.727 170.250 127.720 C 164.786 108.930 147.569 96.006 128.000 96.006 C 108.431 96.006 91.214 108.930 85.750 127.720 C 83.181 136.694 77.157 144.282 69.000 148.820 C 52.902 157.530 44.771 176.056 49.255 193.801 C 53.740 211.546 69.697 223.984 88.000 224.000 C 93.332 224.015 98.611 222.951 103.520 220.870 C 119.171 214.415 136.739 214.415 152.390 220.870 C 172.089 229.438 195.038 220.916 204.371 201.567 C 213.704 182.219 206.088 158.954 187.120 148.870 Z"),
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
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
