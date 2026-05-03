package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) return _tidalLogo!!
        _tidalLogo = phosphorDuotoneIcon(
            name = "TidalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 48.000 56.000 L 88.000 96.000 L 48.000 136.000 L 8.000 96.000 ZM 88.000 96.000 L 128.000 136.000 L 168.000 96.000 L 128.000 56.000 ZM 128.000 216.000 L 168.000 176.000 L 128.000 136.000 L 88.000 176.000 ZM 208.000 56.000 L 168.000 96.000 L 208.000 136.000 L 248.000 96.000 Z"),
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
        pathData = parseSvgPathData("M 253.660 90.340 L 213.660 50.340 C 212.159 48.838 210.123 47.994 208.000 47.994 C 205.877 47.994 203.841 48.838 202.340 50.340 L 168.000 84.690 L 133.660 50.340 C 132.159 48.838 130.123 47.994 128.000 47.994 C 125.877 47.994 123.841 48.838 122.340 50.340 L 88.000 84.690 L 53.660 50.340 C 52.159 48.838 50.123 47.994 48.000 47.994 C 45.877 47.994 43.841 48.838 42.340 50.340 L 2.340 90.340 C 0.838 91.841 -0.006 93.877 -0.006 96.000 C -0.006 98.123 0.838 100.159 2.340 101.660 L 42.340 141.660 C 43.841 143.162 45.877 144.006 48.000 144.006 C 50.123 144.006 52.159 143.162 53.660 141.660 L 88.000 107.310 L 116.690 136.000 L 82.340 170.340 C 80.838 171.841 79.994 173.877 79.994 176.000 C 79.994 178.123 80.838 180.159 82.340 181.660 L 122.340 221.660 C 123.841 223.162 125.877 224.006 128.000 224.006 C 130.123 224.006 132.159 223.162 133.660 221.660 L 173.660 181.660 C 175.162 180.159 176.006 178.123 176.006 176.000 C 176.006 173.877 175.162 171.841 173.660 170.340 L 139.310 136.000 L 168.000 107.310 L 202.340 141.660 C 203.841 143.162 205.877 144.006 208.000 144.006 C 210.123 144.006 212.159 143.162 213.660 141.660 L 253.660 101.660 C 255.162 100.159 256.006 98.123 256.006 96.000 C 256.006 93.877 255.162 91.841 253.660 90.340 ZM 48.000 124.690 L 19.310 96.000 L 48.000 67.310 L 76.690 96.000 ZM 128.000 204.690 L 99.310 176.000 L 128.000 147.310 L 156.690 176.000 ZM 128.000 124.690 L 99.310 96.000 L 128.000 67.310 L 156.690 96.000 ZM 208.000 124.690 L 179.310 96.000 L 208.000 67.310 L 236.690 96.000 Z"),
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
        return _tidalLogo!!
    }

private var _tidalLogo: ImageVector? = null
