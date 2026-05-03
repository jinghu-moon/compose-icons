package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = phosphorBoldIcon(
            name = "CameraRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 52.000 L 182.420 52.000 L 170.000 33.340 C 167.771 29.998 164.017 27.994 160.000 28.000 L 96.000 28.000 C 91.983 27.994 88.229 29.998 86.000 33.340 L 73.570 52.000 L 48.000 52.000 C 32.536 52.000 20.000 64.536 20.000 80.000 L 20.000 192.000 C 20.000 207.464 32.536 220.000 48.000 220.000 L 208.000 220.000 C 223.464 220.000 236.000 207.464 236.000 192.000 L 236.000 80.000 C 236.000 64.536 223.464 52.000 208.000 52.000 ZM 212.000 192.000 C 212.000 194.209 210.209 196.000 208.000 196.000 L 48.000 196.000 C 45.791 196.000 44.000 194.209 44.000 192.000 L 44.000 80.000 C 44.000 77.791 45.791 76.000 48.000 76.000 L 80.000 76.000 C 84.017 76.006 87.771 74.002 90.000 70.660 L 102.420 52.000 L 153.570 52.000 L 166.000 70.660 C 168.229 74.002 171.983 76.006 176.000 76.000 L 208.000 76.000 C 210.209 76.000 212.000 77.791 212.000 80.000 ZM 180.000 100.000 L 180.000 120.000 C 180.000 126.627 174.627 132.000 168.000 132.000 L 148.000 132.000 C 142.973 131.993 138.483 128.854 136.751 124.135 C 135.018 119.416 136.411 114.117 140.240 110.860 C 130.821 106.291 119.641 107.343 111.240 113.590 C 105.941 117.580 98.410 116.519 94.420 111.220 C 90.430 105.921 91.491 98.390 96.790 94.400 C 114.849 80.968 139.479 80.601 157.930 93.490 C 160.820 89.031 166.298 87.003 171.395 88.507 C 176.492 90.010 179.993 94.686 180.000 100.000 ZM 161.590 152.800 C 165.571 158.097 164.505 165.617 159.210 169.600 C 150.230 176.334 139.304 179.963 128.080 179.940 C 117.348 179.946 106.875 176.650 98.080 170.500 C 95.194 174.967 89.713 177.002 84.611 175.501 C 79.510 173.999 76.005 169.318 76.000 164.000 L 76.000 144.000 C 76.000 137.373 81.373 132.000 88.000 132.000 L 108.000 132.000 C 113.027 132.007 117.517 135.146 119.249 139.865 C 120.982 144.584 119.589 149.883 115.760 153.140 C 125.179 157.709 136.359 156.657 144.760 150.410 C 147.307 148.490 150.513 147.663 153.671 148.111 C 156.829 148.560 159.678 150.247 161.590 152.800 Z"),
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
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
