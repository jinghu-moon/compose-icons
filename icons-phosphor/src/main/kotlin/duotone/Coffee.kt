package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = phosphorDuotoneIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 88.000 L 208.000 136.000 C 208.007 170.402 187.967 201.653 156.700 216.000 L 83.300 216.000 C 52.033 201.653 31.993 170.402 32.000 136.000 L 32.000 88.000 Z"),
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
        pathData = parseSvgPathData("M 80.000 56.000 L 80.000 24.000 C 80.000 19.582 83.582 16.000 88.000 16.000 C 92.418 16.000 96.000 19.582 96.000 24.000 L 96.000 56.000 C 96.000 60.418 92.418 64.000 88.000 64.000 C 83.582 64.000 80.000 60.418 80.000 56.000 ZM 120.000 64.000 C 124.418 64.000 128.000 60.418 128.000 56.000 L 128.000 24.000 C 128.000 19.582 124.418 16.000 120.000 16.000 C 115.582 16.000 112.000 19.582 112.000 24.000 L 112.000 56.000 C 112.000 60.418 115.582 64.000 120.000 64.000 ZM 152.000 64.000 C 156.418 64.000 160.000 60.418 160.000 56.000 L 160.000 24.000 C 160.000 19.582 156.418 16.000 152.000 16.000 C 147.582 16.000 144.000 19.582 144.000 24.000 L 144.000 56.000 C 144.000 60.418 147.582 64.000 152.000 64.000 ZM 248.000 120.000 L 248.000 128.000 C 247.993 149.120 231.569 166.595 210.490 167.910 C 205.033 183.346 195.742 197.141 183.490 208.000 L 208.000 208.000 C 212.418 208.000 216.000 211.582 216.000 216.000 C 216.000 220.418 212.418 224.000 208.000 224.000 L 32.000 224.000 C 27.582 224.000 24.000 220.418 24.000 216.000 C 24.000 211.582 27.582 208.000 32.000 208.000 L 56.540 208.000 C 35.894 189.759 24.048 163.550 24.000 136.000 L 24.000 88.000 C 24.000 83.582 27.582 80.000 32.000 80.000 L 208.000 80.000 C 230.091 80.000 248.000 97.909 248.000 120.000 ZM 200.000 96.000 L 40.000 96.000 L 40.000 136.000 C 40.063 166.645 57.569 194.581 85.120 208.000 L 154.880 208.000 C 182.431 194.581 199.937 166.645 200.000 136.000 ZM 232.000 120.000 C 231.997 109.832 225.587 100.769 216.000 97.380 L 216.000 136.000 C 215.994 141.024 215.593 146.039 214.800 151.000 C 224.994 147.988 231.993 138.630 232.000 128.000 Z"),
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
        return _coffee!!
    }

private var _coffee: ImageVector? = null
