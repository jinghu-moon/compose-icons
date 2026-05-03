package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileCode: ImageVector
    get() {
        if (_fileCode != null) return _fileCode!!
        _fileCode = phosphorDuotoneIcon(
            name = "FileCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 88.000 L 152.000 88.000 L 152.000 32.000 Z"),
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
        pathData = parseSvgPathData("M 181.660 146.340 C 183.162 147.841 184.006 149.877 184.006 152.000 C 184.006 154.123 183.162 156.159 181.660 157.660 L 157.660 181.660 C 154.534 184.786 149.466 184.786 146.340 181.660 C 143.214 178.534 143.214 173.466 146.340 170.340 L 164.690 152.000 L 146.340 133.660 C 143.214 130.534 143.214 125.466 146.340 122.340 C 149.466 119.214 154.534 119.214 157.660 122.340 ZM 109.660 122.340 C 108.159 120.838 106.123 119.994 104.000 119.994 C 101.877 119.994 99.841 120.838 98.340 122.340 L 74.340 146.340 C 72.838 147.841 71.994 149.877 71.994 152.000 C 71.994 154.123 72.838 156.159 74.340 157.660 L 98.340 181.660 C 101.466 184.786 106.534 184.786 109.660 181.660 C 112.786 178.534 112.786 173.466 109.660 170.340 L 91.310 152.000 L 109.660 133.660 C 111.162 132.159 112.006 130.123 112.006 128.000 C 112.006 125.877 111.162 123.841 109.660 122.340 ZM 216.000 88.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 152.000 24.000 C 154.122 23.998 156.158 24.840 157.660 26.340 L 213.660 82.340 C 215.160 83.842 216.002 85.878 216.000 88.000 ZM 160.000 80.000 L 188.690 80.000 L 160.000 51.310 ZM 200.000 216.000 L 200.000 96.000 L 152.000 96.000 C 147.582 96.000 144.000 92.418 144.000 88.000 L 144.000 40.000 L 56.000 40.000 L 56.000 216.000 L 200.000 216.000 Z"),
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
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
