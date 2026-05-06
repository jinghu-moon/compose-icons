package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileJpg: ImageVector
    get() {
        if (_fileJpg != null) return _fileJpg!!
        _fileJpg = phosphorThinIcon(
            name = "FileJpg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 148h-16c-2.209 0-4 1.791-4 4v56c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h12c13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24ZM120 188h-12v-32h12c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM212 184v16.87c.001 1.032-.397 2.024-1.11 2.77-4.88 5.265-11.712 8.289-18.89 8.36-15.44 0-28-14.36-28-32 0-17.64 12.56-32 28-32 5.083 .019 10.043 1.562 14.24 4.43 1.831 1.237 2.312 3.724 1.075 5.555-1.237 1.831-3.724 2.312-5.555 1.075C198.885 157.088 195.486 156.022 192 156c-11 0-20 10.77-20 24 0 13.23 9 24 20 24 4.461-.052 8.742-1.772 12-4.82v-11.18h-4c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h8c2.209 0 4 1.791 4 4ZM76 152v38c0 12.15-9.85 22-22 22C41.85 212 32 202.15 32 190c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 7.732 6.268 14 14 14 7.732 0 14-6.268 14-14v-38c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM210.83 85.17l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v72c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-72c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c.001-1.061-.42-2.079-1.17-2.83ZM156 84v-42.35L198.34 84Z"),
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
        return _fileJpg!!
    }

private var _fileJpg: ImageVector? = null
