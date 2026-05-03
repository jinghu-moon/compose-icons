package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = phosphorBoldIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 52.000 L 182.420 52.000 L 170.000 33.340 C 167.771 29.998 164.017 27.994 160.000 28.000 L 96.000 28.000 C 91.983 27.994 88.229 29.998 86.000 33.340 L 73.570 52.000 L 48.000 52.000 C 32.536 52.000 20.000 64.536 20.000 80.000 L 20.000 192.000 C 20.000 207.464 32.536 220.000 48.000 220.000 L 208.000 220.000 C 223.464 220.000 236.000 207.464 236.000 192.000 L 236.000 80.000 C 236.000 64.536 223.464 52.000 208.000 52.000 ZM 212.000 192.000 C 212.000 194.209 210.209 196.000 208.000 196.000 L 48.000 196.000 C 45.791 196.000 44.000 194.209 44.000 192.000 L 44.000 80.000 C 44.000 77.791 45.791 76.000 48.000 76.000 L 80.000 76.000 C 84.017 76.006 87.771 74.002 90.000 70.660 L 102.420 52.000 L 153.570 52.000 L 166.000 70.660 C 168.229 74.002 171.983 76.006 176.000 76.000 L 208.000 76.000 C 210.209 76.000 212.000 77.791 212.000 80.000 ZM 128.000 84.000 C 101.490 84.000 80.000 105.490 80.000 132.000 C 80.000 158.510 101.490 180.000 128.000 180.000 C 154.510 180.000 176.000 158.510 176.000 132.000 C 175.972 105.502 154.498 84.028 128.000 84.000 ZM 128.000 156.000 C 114.745 156.000 104.000 145.255 104.000 132.000 C 104.000 118.745 114.745 108.000 128.000 108.000 C 141.255 108.000 152.000 118.745 152.000 132.000 C 152.000 145.255 141.255 156.000 128.000 156.000 Z"),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
