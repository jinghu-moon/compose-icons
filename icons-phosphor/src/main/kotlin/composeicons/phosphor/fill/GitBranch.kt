package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) return _gitBranch!!
        _gitBranch = phosphorFillIcon(
            name = "GitBranch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 64C231.992 47.373 219.25 33.522 202.681 32.129 186.112 30.735 171.237 42.264 168.452 58.656 165.667 75.049 175.901 90.843 192 95v17c0 4.418-3.582 8-8 8h-88c-2.726-.001-5.432 .466-8 1.38v-26.38c15.602-4.029 25.775-19.03 23.745-35.016C109.715 43.998 96.114 32.016 80 32.016c-16.114 0-29.715 11.982-31.745 27.968C46.225 75.97 56.398 90.971 72 95v66c-15.602 4.029-25.775 19.03-23.745 35.016 2.03 15.986 15.631 27.968 31.745 27.968 16.114 0 29.715-11.982 31.745-27.968C113.775 180.03 103.602 165.029 88 161v-17c0-4.418 3.582-8 8-8h88c13.255 0 24-10.745 24-24v-17c14.122-3.668 23.986-16.409 24-31ZM64 64C64 55.163 71.163 48 80 48c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C71.163 80 64 72.837 64 64ZM96 192c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
