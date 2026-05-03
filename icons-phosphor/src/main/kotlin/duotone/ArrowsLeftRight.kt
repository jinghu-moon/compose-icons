package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) return _arrowsLeftRight!!
        _arrowsLeftRight = phosphorDuotoneIcon(
            name = "ArrowsLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 80.000 L 208.000 176.000 L 48.000 176.000 L 48.000 80.000 Z"),
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
        pathData = parseSvgPathData("M 213.660 181.660 L 181.660 213.660 C 178.534 216.786 173.466 216.786 170.340 213.660 C 167.214 210.534 167.214 205.466 170.340 202.340 L 188.690 184.000 L 48.000 184.000 C 43.582 184.000 40.000 180.418 40.000 176.000 C 40.000 171.582 43.582 168.000 48.000 168.000 L 188.690 168.000 L 170.340 149.660 C 167.214 146.534 167.214 141.466 170.340 138.340 C 173.466 135.214 178.534 135.214 181.660 138.340 L 213.660 170.340 C 215.162 171.841 216.006 173.877 216.006 176.000 C 216.006 178.123 215.162 180.159 213.660 181.660 ZM 74.340 117.660 C 77.466 120.786 82.534 120.786 85.660 117.660 C 88.786 114.534 88.786 109.466 85.660 106.340 L 67.310 88.000 L 208.000 88.000 C 212.418 88.000 216.000 84.418 216.000 80.000 C 216.000 75.582 212.418 72.000 208.000 72.000 L 67.310 72.000 L 85.660 53.660 C 88.786 50.534 88.786 45.466 85.660 42.340 C 82.534 39.214 77.466 39.214 74.340 42.340 L 42.340 74.340 C 40.838 75.841 39.994 77.877 39.994 80.000 C 39.994 82.123 40.838 84.159 42.340 85.660 Z"),
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
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null
