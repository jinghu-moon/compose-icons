package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) return _videoCameraSlash!!
        _videoCameraSlash = phosphorFillIcon(
            name = "VideoCameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 80.23v95.45c.049 2.899-1.413 5.615-3.86 7.17-2.655 1.606-5.999 1.532-8.58-.19L209.78 160.14c-1.113-.742-1.781-1.992-1.78-3.33v-57.62c.002-1.334 .67-2.579 1.78-3.32L243.56 73.34c3.018-2.011 7.011-1.74 9.73 .66 1.758 1.59 2.746 3.86 2.71 6.23ZM53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L51.73 56h-19.73C23.163 56 16 63.163 16 72v112c0 8.837 7.163 16 16 16h150.64l19.44 21.38c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM185 155.07c1.107 1.255 2.878 1.689 4.44 1.087 1.562-.602 2.583-2.113 2.56-3.787v-80.37c0-8.837-7.163-16-16-16h-72c-1.59-.016-3.039 .912-3.69 2.363-.651 1.451-.38 3.15 .69 4.327Z"),
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
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
