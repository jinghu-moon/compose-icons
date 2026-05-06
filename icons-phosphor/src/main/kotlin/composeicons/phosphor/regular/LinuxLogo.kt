package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) return _linuxLogo!!
        _linuxLogo = phosphorRegularIcon(
            name = "LinuxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229 214.25c-3.45 2.757-8.48 2.197-11.24-1.25C216.39 211.27 184 169.86 184 88 184 57.072 158.928 32 128 32 97.072 32 72 57.072 72 88 72 169.86 39.63 211.27 38.25 213c-2.761 3.455-7.8 4.016-11.255 1.255C23.54 211.494 22.979 206.455 25.74 203c.15-.2 7.69-9.9 15.13-28.74C47.77 156.8 56 127.64 56 88 56 48.235 88.235 16 128 16c39.764 0 72 32.235 72 72 0 39.64 8.23 68.8 15.13 86.28 7.48 18.94 15.06 28.64 15.14 28.74 2.745 3.453 2.177 8.477-1.27 11.23ZM100 88c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM168 100c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12ZM99.58 128.84c-3.935-1.869-8.642-.246-10.589 3.65-1.947 3.897-.418 8.635 3.439 10.66l32 16c2.248 1.134 4.902 1.134 7.15 0l32-16c3.952-1.977 5.552-6.783 3.575-10.735-1.977-3.952-6.783-5.552-10.735-3.575L128 143.05ZM128 176c-19.604 .156-37.588 10.912-47 28.11-2.148 3.866-.756 8.742 3.11 10.89 3.866 2.148 8.742 .756 10.89-3.11 6.476-12.217 19.172-19.857 33-19.857 13.828 0 26.524 7.639 33 19.857 2.148 3.866 7.024 5.258 10.89 3.11 3.866-2.148 5.258-7.024 3.11-10.89C165.588 186.912 147.604 176.156 128 176Z"),
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
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
