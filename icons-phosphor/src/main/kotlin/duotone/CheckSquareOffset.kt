package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) return _checkSquareOffset!!
        _checkSquareOffset = phosphorDuotoneIcon(
            name = "CheckSquareOffset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 48.000 L 216.000 208.000 C 216.000 212.418 212.418 216.000 208.000 216.000 L 64.000 216.000 L 40.000 192.000 L 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 136.000 224.000 C 131.582 224.000 128.000 220.418 128.000 216.000 C 128.000 211.582 131.582 208.000 136.000 208.000 L 208.000 208.000 L 208.000 48.000 L 48.000 48.000 L 48.000 144.000 C 48.000 148.418 44.418 152.000 40.000 152.000 C 35.582 152.000 32.000 148.418 32.000 144.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 125.660 154.340 C 124.159 152.838 122.123 151.994 120.000 151.994 C 117.877 151.994 115.841 152.838 114.340 154.340 L 64.000 204.690 L 45.660 186.340 C 42.534 183.214 37.466 183.214 34.340 186.340 C 31.214 189.466 31.214 194.534 34.340 197.660 L 58.340 221.660 C 59.841 223.162 61.877 224.006 64.000 224.006 C 66.123 224.006 68.159 223.162 69.660 221.660 L 125.660 165.660 C 127.162 164.159 128.006 162.123 128.006 160.000 C 128.006 157.877 127.162 155.841 125.660 154.340 Z"),
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
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
