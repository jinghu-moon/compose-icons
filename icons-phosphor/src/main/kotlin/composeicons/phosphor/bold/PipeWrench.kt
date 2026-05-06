package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PipeWrench: ImageVector
    get() {
        if (_pipeWrench != null) return _pipeWrench!!
        _pipeWrench = phosphorBoldIcon(
            name = "PipeWrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.11 40.2l-.36-.35L185.92 9.64c-7.828-7.57-20.275-7.486-28 .19L110.36 57.11C97.819 45.244 78.125 45.466 65.855 57.612 53.584 69.758 53.162 89.449 64.9 102.11l-15.06 15c-3.752 3.751-5.861 8.839-5.861 14.145 0 5.306 2.108 10.394 5.861 14.145l17.72 17.72L37.36 193.32c-12.498 12.498-12.498 32.762 0 45.26 12.498 12.498 32.762 12.498 45.26 0h0l91.51-92.32c3.802-3.814 5.905-9 5.833-14.385-.072-5.385-2.312-10.513-6.213-14.225l-13-12.4L172.66 93.45l14.73 13c7.866 7.532 20.313 7.385 28-.33l3.71-3.71c8.253-8.252 12.89-19.444 12.89-31.115 0-11.671-4.637-22.863-12.89-31.115ZM69.65 131.32 81.86 119.13 96.73 134 84.53 146.21ZM65.65 221.68c-3.129 3.12-8.195 3.114-11.315-.015-3.12-3.129-3.114-8.195 .015-11.315l67.86-67.86c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5L82.33 85.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0 .06 .07 .13 .13 .19 .19l60.44 57.72ZM202.14 85.46l-1 1L186.27 73.44c-7.869-7.37-20.155-7.202-27.82 .38l-15 14.88-15.72-15L172.1 29.53l30.19 27.8c7.667 7.834 7.6 20.379-.15 28.13Z"),
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
        return _pipeWrench!!
    }

private var _pipeWrench: ImageVector? = null
