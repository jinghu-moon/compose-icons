package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) return _cloudSun!!
        _cloudSun = phosphorThinIcon(
            name = "CloudSun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 76c-7.517-.005-14.987 1.169-22.14 3.48C138.645 73.468 134.275 68.149 129 63.83L140.56 47.32c1.268-1.811 .826-4.308-.985-5.575-1.811-1.267-4.308-.826-5.575 .985L122.45 59.24C114.44 54.503 105.306 52.003 96 52c-1.71 0-3.4 .09-5.06 .25L87.44 32.4c-.384-2.176-2.459-3.629-4.635-3.245-2.176 .384-3.629 2.459-3.245 4.635l3.5 19.84C72.382 56.399 62.856 62.48 55.85 71L39.32 59.42c-1.817-1.267-4.318-.822-5.585 .995-1.267 1.817-.822 4.318 .995 5.585L51.26 77.54C46.498 85.544 43.989 94.687 44 104c0 1.69 .09 3.37 .25 5l-19.85 3.5c-2.044 .358-3.474 2.219-3.295 4.286 .18 2.067 1.91 3.654 3.985 3.654 .235-.001 .469-.021 .7-.06l19.85-3.5c1.64 6.382 4.477 12.396 8.36 17.72C38.148 147.353 32.057 168.714 38.8 187.909 45.543 207.104 63.655 219.963 84 220h80c39.764 0 72-32.236 72-72C236 108.235 203.764 76 164 76ZM52 104C51.998 84 65.485 66.515 84.829 61.437c19.345-5.078 39.68 3.53 49.501 20.953-18.373 8.289-32.446 23.878-38.82 43C91.743 124.466 87.879 123.999 84 124c-8.195-.005-16.253 2.099-23.4 6.11C55.018 122.549 52.005 113.398 52 104ZM164 212h-80C68.577 211.988 54.535 203.11 47.91 189.183c-6.625-13.927-4.653-30.423 5.068-42.396 9.722-11.973 25.461-17.291 40.452-13.667-.743 3.509-1.221 7.069-1.43 10.65-.127 2.209 1.561 4.103 3.77 4.23 2.209 .127 4.103-1.561 4.23-3.77 .243-4.279 .913-8.524 2-12.67 0-.12 .07-.24 .09-.36 8.672-32.031 40.369-52.138 73.042-46.332 32.673 5.806 55.503 35.602 52.608 68.66C224.845 186.586 197.184 211.961 164 212Z"),
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
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
