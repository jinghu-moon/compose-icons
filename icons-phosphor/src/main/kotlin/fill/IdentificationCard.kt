package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) return _identificationCard!!
        _identificationCard = phosphorFillIcon(
            name = "IdentificationCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 112.000 120.000 C 112.000 128.837 104.837 136.000 96.000 136.000 C 87.163 136.000 80.000 128.837 80.000 120.000 C 80.000 111.163 87.163 104.000 96.000 104.000 C 104.837 104.000 112.000 111.163 112.000 120.000 ZM 232.000 56.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 135.750 166.000 C 133.161 156.334 127.023 148.000 118.560 142.660 C 127.751 133.523 130.524 119.744 125.582 107.763 C 120.641 95.783 108.960 87.965 96.000 87.965 C 83.040 87.965 71.359 95.783 66.418 107.763 C 61.476 119.744 64.249 133.523 73.440 142.660 C 64.983 148.006 58.846 156.338 56.250 166.000 C 55.145 170.280 57.720 174.645 62.000 175.750 C 66.280 176.855 70.645 174.280 71.750 170.000 C 74.390 159.750 84.810 152.000 96.000 152.000 C 107.190 152.000 117.620 159.730 120.250 170.000 C 121.355 174.280 125.720 176.855 130.000 175.750 C 134.280 174.645 136.855 170.280 135.750 166.000 ZM 200.000 144.000 C 200.000 139.582 196.418 136.000 192.000 136.000 L 152.000 136.000 C 147.582 136.000 144.000 139.582 144.000 144.000 C 144.000 148.418 147.582 152.000 152.000 152.000 L 192.000 152.000 C 196.418 152.000 200.000 148.418 200.000 144.000 ZM 200.000 112.000 C 200.000 107.582 196.418 104.000 192.000 104.000 L 152.000 104.000 C 147.582 104.000 144.000 107.582 144.000 112.000 C 144.000 116.418 147.582 120.000 152.000 120.000 L 192.000 120.000 C 196.418 120.000 200.000 116.418 200.000 112.000 Z"),
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
        return _identificationCard!!
    }

private var _identificationCard: ImageVector? = null
