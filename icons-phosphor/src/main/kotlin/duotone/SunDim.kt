package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SunDim: ImageVector
    get() {
        if (_sunDim != null) return _sunDim!!
        _sunDim = phosphorDuotoneIcon(
            name = "SunDim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 184.000 128.000 C 184.000 158.928 158.928 184.000 128.000 184.000 C 97.072 184.000 72.000 158.928 72.000 128.000 C 72.000 97.072 97.072 72.000 128.000 72.000 C 158.928 72.000 184.000 97.072 184.000 128.000 Z"),
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
                pathData = parseSvgPathData("M 120.000 40.000 L 120.000 32.000 C 120.000 27.582 123.582 24.000 128.000 24.000 C 132.418 24.000 136.000 27.582 136.000 32.000 L 136.000 40.000 C 136.000 44.418 132.418 48.000 128.000 48.000 C 123.582 48.000 120.000 44.418 120.000 40.000 ZM 192.000 128.000 C 192.000 163.346 163.346 192.000 128.000 192.000 C 92.654 192.000 64.000 163.346 64.000 128.000 C 64.000 92.654 92.654 64.000 128.000 64.000 C 163.330 64.039 191.961 92.670 192.000 128.000 ZM 176.000 128.000 C 176.000 101.490 154.510 80.000 128.000 80.000 C 101.490 80.000 80.000 101.490 80.000 128.000 C 80.000 154.510 101.490 176.000 128.000 176.000 C 154.498 175.972 175.972 154.498 176.000 128.000 ZM 58.340 69.660 C 61.466 72.786 66.534 72.786 69.660 69.660 C 72.786 66.534 72.786 61.466 69.660 58.340 L 61.660 50.340 C 58.534 47.214 53.466 47.214 50.340 50.340 C 47.214 53.466 47.214 58.534 50.340 61.660 ZM 58.340 186.340 L 50.340 194.340 C 47.214 197.466 47.214 202.534 50.340 205.660 C 53.466 208.786 58.534 208.786 61.660 205.660 L 69.660 197.660 C 72.786 194.534 72.786 189.466 69.660 186.340 C 66.534 183.214 61.466 183.214 58.340 186.340 ZM 192.000 72.000 C 194.122 72.002 196.158 71.160 197.660 69.660 L 205.660 61.660 C 208.786 58.534 208.786 53.466 205.660 50.340 C 202.534 47.214 197.466 47.214 194.340 50.340 L 186.340 58.340 C 184.049 60.628 183.364 64.071 184.603 67.062 C 185.842 70.053 188.762 72.003 192.000 72.000 ZM 197.660 186.340 C 194.534 183.214 189.466 183.214 186.340 186.340 C 183.214 189.466 183.214 194.534 186.340 197.660 L 194.340 205.660 C 197.466 208.786 202.534 208.786 205.660 205.660 C 208.786 202.534 208.786 197.466 205.660 194.340 ZM 40.000 120.000 L 32.000 120.000 C 27.582 120.000 24.000 123.582 24.000 128.000 C 24.000 132.418 27.582 136.000 32.000 136.000 L 40.000 136.000 C 44.418 136.000 48.000 132.418 48.000 128.000 C 48.000 123.582 44.418 120.000 40.000 120.000 ZM 128.000 208.000 C 123.582 208.000 120.000 211.582 120.000 216.000 L 120.000 224.000 C 120.000 228.418 123.582 232.000 128.000 232.000 C 132.418 232.000 136.000 228.418 136.000 224.000 L 136.000 216.000 C 136.000 211.582 132.418 208.000 128.000 208.000 ZM 224.000 120.000 L 216.000 120.000 C 211.582 120.000 208.000 123.582 208.000 128.000 C 208.000 132.418 211.582 136.000 216.000 136.000 L 224.000 136.000 C 228.418 136.000 232.000 132.418 232.000 128.000 C 232.000 123.582 228.418 120.000 224.000 120.000 Z"),
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
        return _sunDim!!
    }

private var _sunDim: ImageVector? = null
