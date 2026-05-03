package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandFist: ImageVector
    get() {
        if (_handFist != null) return _handFist!!
        _handFist = phosphorDuotoneIcon(
            name = "HandFist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 112.000 L 224.000 128.000 C 224.000 181.019 181.019 224.000 128.000 224.000 C 74.981 224.000 32.000 181.019 32.000 128.000 L 32.000 88.000 C 32.000 74.745 42.745 64.000 56.000 64.000 C 69.255 64.000 80.000 74.745 80.000 88.000 L 80.000 64.000 C 80.000 50.745 90.745 40.000 104.000 40.000 C 117.255 40.000 128.000 50.745 128.000 64.000 C 128.000 50.745 138.745 40.000 152.000 40.000 C 165.255 40.000 176.000 50.745 176.000 64.000 L 176.000 88.000 L 200.000 88.000 C 213.255 88.000 224.000 98.745 224.000 112.000 Z"),
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
        pathData = parseSvgPathData("M 200.000 80.000 L 184.000 80.000 L 184.000 64.000 C 183.985 50.698 175.742 38.792 163.297 34.096 C 150.851 29.400 136.798 32.893 128.000 42.870 C 119.633 33.387 106.466 29.721 94.402 33.516 C 82.338 37.311 73.641 47.855 72.210 60.420 C 62.317 54.608 50.069 54.537 40.110 60.235 C 30.150 65.932 24.004 76.526 24.000 88.000 L 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 L 232.000 112.000 C 232.000 94.327 217.673 80.000 200.000 80.000 ZM 152.000 48.000 C 160.837 48.000 168.000 55.163 168.000 64.000 L 168.000 80.000 L 136.000 80.000 L 136.000 64.000 C 136.000 55.163 143.163 48.000 152.000 48.000 ZM 88.000 64.000 C 88.000 55.163 95.163 48.000 104.000 48.000 C 112.837 48.000 120.000 55.163 120.000 64.000 L 120.000 104.000 C 120.000 112.837 112.837 120.000 104.000 120.000 C 95.163 120.000 88.000 112.837 88.000 104.000 ZM 40.000 88.000 C 40.000 79.163 47.163 72.000 56.000 72.000 C 64.837 72.000 72.000 79.163 72.000 88.000 L 72.000 104.000 C 72.000 112.837 64.837 120.000 56.000 120.000 C 47.163 120.000 40.000 112.837 40.000 104.000 ZM 216.000 128.000 C 215.999 175.870 177.734 214.958 129.875 215.979 C 82.017 216.999 42.121 179.576 40.080 131.750 C 53.265 139.333 69.969 136.563 80.000 125.130 C 91.469 138.198 111.287 139.688 124.580 128.480 C 127.458 133.250 131.524 137.191 136.380 139.920 C 125.966 149.017 119.994 162.172 120.000 176.000 C 120.000 180.418 123.582 184.000 128.000 184.000 C 132.418 184.000 136.000 180.418 136.000 176.000 C 136.000 158.327 150.327 144.000 168.000 144.000 C 172.418 144.000 176.000 140.418 176.000 136.000 C 176.000 131.582 172.418 128.000 168.000 128.000 L 152.000 128.000 C 143.163 128.000 136.000 120.837 136.000 112.000 L 136.000 96.000 L 200.000 96.000 C 208.837 96.000 216.000 103.163 216.000 112.000 Z"),
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
        return _handFist!!
    }

private var _handFist: ImageVector? = null
