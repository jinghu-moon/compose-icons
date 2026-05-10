package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorFillIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.65 129.11l-28.06-9.35c-.852-.296-1.778-.296-2.63 0l-43.23 15.72c-.873 .329-1.797 .504-2.73 .52-3.6-.002-6.756-2.408-7.71-5.88-1.047-4.106 1.22-8.331 5.22-9.73L168 113.67c1.018-.367 1.692-1.339 1.679-2.421-.014-1.082-.712-2.037-1.739-2.379-3.278-1.094-6.28-2.885-8.8-5.25-1.099-1.082-2.721-1.436-4.17-.91l-24.22 8.8c-2.097 .761-4.417 .612-6.399-.412-1.982-1.023-3.447-2.828-4.041-4.978-1.047-4.106 1.22-8.331 5.22-9.73L146 88.93c1.035-.376 1.869-1.161 2.307-2.172 .437-1.011 .438-2.157 .003-3.168l-3.06-7.16c-.834-1.956-3.052-2.918-5.05-2.19l-25.5 9.27c-2.097 .761-4.417 .612-6.399-.412-1.982-1.023-3.447-2.828-4.041-4.978-1.047-4.106 1.22-8.331 5.22-9.73l24-8.73c1.032-.376 1.865-1.16 2.302-2.168 .437-1.008 .44-2.152 .008-3.162L130.39 41.6c0 0 0-.07 0-.1C126.96 33.807 118.154 30.091 110.25 33L34.53 60.49C28.216 62.803 24.013 68.806 24 75.53v116.47c0 8.837 7.163 16 16 16h200c8.837 0 16-7.163 16-16v-24.94c.001-17.218-11.016-32.505-27.35-37.95ZM240 192h-200v-16h200Z"),
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
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
