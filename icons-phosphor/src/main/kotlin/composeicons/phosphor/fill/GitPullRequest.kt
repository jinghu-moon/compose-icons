package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) return _gitPullRequest!!
        _gitPullRequest = phosphorFillIcon(
            name = "GitPullRequest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 64C103.992 47.373 91.25 33.522 74.681 32.129 58.112 30.735 43.237 42.264 40.452 58.656 37.667 75.049 47.901 90.843 64 95v66c-15.602 4.029-25.775 19.03-23.745 35.016 2.03 15.986 15.631 27.968 31.745 27.968 16.114 0 29.715-11.982 31.745-27.968C105.775 180.03 95.602 165.029 80 161v-66C94.122 91.332 103.986 78.591 104 64ZM88 192c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM232 192c-.008 16.627-12.75 30.478-29.319 31.871-16.569 1.393-31.444-10.135-34.229-26.528C165.667 180.951 175.901 165.157 192 161v-50.37c.002-2.122-.84-4.158-2.34-5.66L152 67.31v28.69c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-28.69L201 93.66c4.511 4.504 7.032 10.626 7 17v50.34c14.122 3.668 23.986 16.409 24 31Z"),
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
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
