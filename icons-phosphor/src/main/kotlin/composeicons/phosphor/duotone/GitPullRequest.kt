package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) return _gitPullRequest!!
        _gitPullRequest = phosphorDuotoneIcon(
            name = "GitPullRequest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 64C96 77.255 85.255 88 72 88 58.745 88 48 77.255 48 64 48 50.745 58.745 40 72 40c13.255 0 24 10.745 24 24ZM200 168c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M104 64C103.992 47.373 91.25 33.522 74.681 32.129 58.112 30.735 43.237 42.264 40.452 58.656 37.667 75.049 47.901 90.843 64 95v66c-15.602 4.029-25.775 19.03-23.745 35.016 2.03 15.986 15.631 27.968 31.745 27.968 16.114 0 29.715-11.982 31.745-27.968C105.775 180.03 95.602 165.029 80 161v-66C94.122 91.332 103.986 78.591 104 64ZM56 64C56 55.163 63.163 48 72 48c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C63.163 80 56 72.837 56 64ZM88 192c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM208 161v-50.37c.032-6.374-2.489-12.496-7-17L163.31 56h28.69c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-28.69L189.66 105c1.5 1.502 2.342 3.538 2.34 5.66v50.34c-15.602 4.029-25.775 19.03-23.745 35.016 2.03 15.986 15.631 27.968 31.745 27.968 16.114 0 29.714-11.982 31.745-27.968C233.775 180.03 223.602 165.029 208 161ZM200 208c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
