package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) return _videoCameraSlash!!
        _videoCameraSlash = phosphorRegularIcon(
            name = "VideoCameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251.77 73c-2.599-1.393-5.754-1.243-8.21 .39L208 97.05v-25.05c0-8.837-7.163-16-16-16h-78.94c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h78.94v87.63c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-.63l35.56 23.71c1.321 .858 2.865 1.306 4.44 1.29 4.418 0 8-3.582 8-8v-96c-.021-2.932-1.644-5.618-4.23-7ZM240 161.05 208 139.72v-23.44L240 95ZM53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L51.73 56h-19.73C23.163 56 16 63.163 16 72v112c0 8.837 7.163 16 16 16h150.64l19.44 21.38c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM32 184v-112h34.28L168.1 184Z"),
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
