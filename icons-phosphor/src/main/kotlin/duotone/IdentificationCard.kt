package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) return _identificationCard!!
        _identificationCard = phosphorDuotoneIcon(
            name = "IdentificationCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 48.000 L 40.000 48.000 C 35.582 48.000 32.000 51.582 32.000 56.000 L 32.000 200.000 C 32.000 204.418 35.582 208.000 40.000 208.000 L 216.000 208.000 C 220.418 208.000 224.000 204.418 224.000 200.000 L 224.000 56.000 C 224.000 51.582 220.418 48.000 216.000 48.000 ZM 96.000 144.000 C 82.745 144.000 72.000 133.255 72.000 120.000 C 72.000 106.745 82.745 96.000 96.000 96.000 C 109.255 96.000 120.000 106.745 120.000 120.000 C 120.000 133.255 109.255 144.000 96.000 144.000 Z"),
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
        pathData = parseSvgPathData("M 200.000 112.000 C 200.000 116.418 196.418 120.000 192.000 120.000 L 152.000 120.000 C 147.582 120.000 144.000 116.418 144.000 112.000 C 144.000 107.582 147.582 104.000 152.000 104.000 L 192.000 104.000 C 196.418 104.000 200.000 107.582 200.000 112.000 ZM 192.000 136.000 L 152.000 136.000 C 147.582 136.000 144.000 139.582 144.000 144.000 C 144.000 148.418 147.582 152.000 152.000 152.000 L 192.000 152.000 C 196.418 152.000 200.000 148.418 200.000 144.000 C 200.000 139.582 196.418 136.000 192.000 136.000 ZM 232.000 56.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 216.000 200.000 L 216.000 56.000 L 40.000 56.000 L 40.000 200.000 L 216.000 200.000 ZM 135.740 166.000 C 136.845 170.280 134.270 174.645 129.990 175.750 C 125.710 176.855 121.345 174.280 120.240 170.000 C 117.610 159.740 107.180 152.000 95.990 152.000 C 84.800 152.000 74.380 159.740 71.740 170.000 C 70.635 174.280 66.270 176.855 61.990 175.750 C 57.710 174.645 55.135 170.280 56.240 166.000 C 58.836 156.338 64.973 148.006 73.430 142.660 C 64.239 133.523 61.466 119.744 66.408 107.763 C 71.349 95.783 83.030 87.965 95.990 87.965 C 108.950 87.965 120.631 95.783 125.572 107.763 C 130.514 119.744 127.741 133.523 118.550 142.660 C 127.017 147.998 133.159 156.332 135.750 166.000 ZM 96.000 136.000 C 104.837 136.000 112.000 128.837 112.000 120.000 C 112.000 111.163 104.837 104.000 96.000 104.000 C 87.163 104.000 80.000 111.163 80.000 120.000 C 80.000 128.837 87.163 136.000 96.000 136.000 Z"),
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
        return _identificationCard!!
    }

private var _identificationCard: ImageVector? = null
