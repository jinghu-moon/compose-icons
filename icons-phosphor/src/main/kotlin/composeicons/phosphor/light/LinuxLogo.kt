package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) return _linuxLogo!!
        _linuxLogo = phosphorLightIcon(
            name = "LinuxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.74 212.69c-2.586 2.06-6.352 1.64-8.42-.94C218 210.05 186 169.17 186 88 186 55.967 160.033 30 128 30 95.967 30 70 55.967 70 88 70 169.17 38.05 210.05 36.69 211.75c-2.068 2.59-5.845 3.013-8.435 .945-2.59-2.068-3.013-5.845-.945-8.435C27.68 203.79 58 164.56 58 88 58 49.34 89.34 18 128 18c38.66 0 70 31.34 70 70 0 76.63 30.38 115.87 30.69 116.26 2.065 2.59 1.639 6.364-.95 8.43ZM100 90c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM166 100c0-5.523-4.477-10-10-10-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10ZM98.69 130.63c-2.966-1.483-6.572-.281-8.055 2.685-1.483 2.966-.281 6.572 2.685 8.055l32 16c.832 .415 1.75 .631 2.68 .63 .933-0 1.854-.216 2.69-.63l32-16c2.966-1.483 4.168-5.089 2.685-8.055-1.483-2.966-5.089-4.168-8.055-2.685L128 145.29ZM128 178c-18.873 .16-36.182 10.521-45.24 27.08-1.613 2.897-.572 6.552 2.325 8.165 2.897 1.613 6.552 .572 8.165-2.325 6.818-12.871 20.19-20.92 34.755-20.92 14.565 0 27.937 8.049 34.755 20.92 1.059 1.901 3.064 3.079 5.24 3.08 1.019 .003 2.022-.259 2.91-.76 1.391-.773 2.418-2.067 2.855-3.597 .437-1.53 .248-3.172-.525-4.563C164.179 188.524 146.872 178.165 128 178Z"),
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
