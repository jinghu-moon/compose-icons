package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitFork: ImageVector
    get() {
        if (_gitFork != null) return _gitFork!!
        _gitFork = phosphorFillIcon(
            name = "GitFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 64C223.992 47.373 211.25 33.522 194.681 32.129 178.112 30.735 163.237 42.264 160.452 58.656 157.667 75.049 167.901 90.843 184 95v17c0 4.418-3.582 8-8 8h-96c-4.418 0-8-3.582-8-8v-17C87.602 90.971 97.775 75.97 95.745 59.984 93.715 43.998 80.114 32.016 64 32.016c-16.114 0-29.715 11.982-31.745 27.968C30.225 75.97 40.398 90.971 56 95v17c0 13.255 10.745 24 24 24h40v25c-15.602 4.029-25.775 19.03-23.745 35.016 2.03 15.986 15.631 27.968 31.745 27.968 16.114 0 29.714-11.982 31.745-27.968C161.775 180.03 151.602 165.029 136 161v-25h40c13.255 0 24-10.745 24-24v-17c14.122-3.668 23.986-16.409 24-31ZM144 192c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
