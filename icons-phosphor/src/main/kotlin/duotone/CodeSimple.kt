package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorDuotoneIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 128.000 L 168.000 192.000 L 88.000 192.000 L 16.000 128.000 L 88.000 64.000 L 168.000 64.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 93.310 70.000 L 28.000 128.000 L 93.270 186.000 C 96.584 188.933 96.893 193.996 93.960 197.310 C 91.027 200.624 85.964 200.933 82.650 198.000 L 10.650 134.000 C 8.928 132.481 7.942 130.296 7.942 128.000 C 7.942 125.704 8.928 123.519 10.650 122.000 L 82.650 58.000 C 85.964 55.056 91.036 55.356 93.980 58.670 C 96.924 61.984 96.624 67.056 93.310 70.000 ZM 245.310 122.000 L 173.310 58.000 C 169.996 55.067 164.933 55.376 162.000 58.690 C 159.067 62.004 159.376 67.067 162.690 70.000 L 228.000 128.000 L 162.730 186.000 C 159.416 188.933 159.107 193.996 162.040 197.310 C 164.973 200.624 170.036 200.933 173.350 198.000 L 245.350 134.000 C 247.072 132.481 248.059 130.296 248.059 128.000 C 248.059 125.704 247.072 123.519 245.350 122.000 Z"),
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
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
