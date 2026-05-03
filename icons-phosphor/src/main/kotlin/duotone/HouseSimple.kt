package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) return _houseSimple!!
        _houseSimple = phosphorDuotoneIcon(
            name = "HouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 120.000 L 216.000 216.000 L 40.000 216.000 L 40.000 120.000 C 39.998 117.878 40.840 115.842 42.340 114.340 L 122.340 34.340 C 123.841 32.838 125.877 31.994 128.000 31.994 C 130.123 31.994 132.159 32.838 133.660 34.340 L 213.660 114.340 C 215.160 115.842 216.002 117.878 216.000 120.000 Z"),
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
        pathData = parseSvgPathData("M 219.310 108.680 L 139.310 28.680 C 133.062 22.437 122.938 22.437 116.690 28.680 L 36.690 108.680 C 33.674 111.673 31.985 115.751 32.000 120.000 L 32.000 216.000 C 32.000 220.418 35.582 224.000 40.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 L 224.000 120.000 C 224.015 115.751 222.326 111.673 219.310 108.680 ZM 208.000 208.000 L 48.000 208.000 L 48.000 120.000 L 128.000 40.000 L 208.000 120.000 Z"),
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
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
