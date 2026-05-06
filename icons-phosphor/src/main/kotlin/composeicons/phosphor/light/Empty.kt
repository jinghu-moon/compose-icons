package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorLightIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M195.51 62.66 212.44 44c1.665-1.545 2.314-3.899 1.678-6.079-.637-2.181-2.451-3.815-4.686-4.221-2.235-.407-4.508 .484-5.872 2.301L186.63 54.58C147.868 24.079 92.123 28.725 58.945 65.222c-33.178 36.497-32.504 92.431 1.545 128.118L43.56 212c-1.865 2.484-1.526 5.981 .782 8.06 2.308 2.079 5.821 2.053 8.098-.06L69.37 201.38c38.762 30.374 94.395 25.684 127.525-10.75C230.025 154.196 229.421 98.369 195.51 62.66ZM46 128C45.972 96.626 63.863 67.992 92.072 54.261c28.209-13.731 61.783-10.147 86.458 9.229L68.59 184.43C54.082 169.226 45.991 149.015 46 128ZM128 210c-18.33 .013-36.13-6.148-50.53-17.49L187.41 71.57c22.601 23.747 28.872 58.68 15.943 88.806C190.424 190.502 160.783 210.022 128 210Z"),
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
        return _empty!!
    }

private var _empty: ImageVector? = null
