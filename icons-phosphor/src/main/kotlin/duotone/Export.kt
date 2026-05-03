package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Export: ImageVector
    get() {
        if (_export != null) return _export!!
        _export = phosphorDuotoneIcon(
            name = "Export",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 104.000 L 208.000 216.000 L 48.000 216.000 L 48.000 104.000 Z"),
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
        pathData = parseSvgPathData("M 216.000 112.000 L 216.000 208.000 C 216.000 216.837 208.837 224.000 200.000 224.000 L 56.000 224.000 C 47.163 224.000 40.000 216.837 40.000 208.000 L 40.000 112.000 C 40.000 103.163 47.163 96.000 56.000 96.000 L 80.000 96.000 C 84.418 96.000 88.000 99.582 88.000 104.000 C 88.000 108.418 84.418 112.000 80.000 112.000 L 56.000 112.000 L 56.000 208.000 L 200.000 208.000 L 200.000 112.000 L 176.000 112.000 C 171.582 112.000 168.000 108.418 168.000 104.000 C 168.000 99.582 171.582 96.000 176.000 96.000 L 200.000 96.000 C 208.837 96.000 216.000 103.163 216.000 112.000 ZM 93.660 69.660 L 120.000 43.310 L 120.000 136.000 C 120.000 140.418 123.582 144.000 128.000 144.000 C 132.418 144.000 136.000 140.418 136.000 136.000 L 136.000 43.310 L 162.340 69.660 C 165.466 72.786 170.534 72.786 173.660 69.660 C 176.786 66.534 176.786 61.466 173.660 58.340 L 133.660 18.340 C 132.159 16.838 130.123 15.994 128.000 15.994 C 125.877 15.994 123.841 16.838 122.340 18.340 L 82.340 58.340 C 79.214 61.466 79.214 66.534 82.340 69.660 C 85.466 72.786 90.534 72.786 93.660 69.660 Z"),
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
        return _export!!
    }

private var _export: ImageVector? = null
