package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorFillIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM112 144c0 17.673-14.327 32-32 32C62.327 176 48 161.673 48 144v-32C48.002 98.734 56.19 86.844 68.583 82.111c12.393-4.733 26.422-1.329 35.267 8.559 2.018 2.112 2.724 5.156 1.843 7.941-.882 2.785-3.211 4.868-6.076 5.434-2.866 .566-5.812-.474-7.686-2.715C87.508 96.382 80.49 94.677 74.29 97.045 68.091 99.414 63.997 105.363 64 112v32c0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16v-8h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8ZM144 168c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM204 96h-28v24h20c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-20v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8h36c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
