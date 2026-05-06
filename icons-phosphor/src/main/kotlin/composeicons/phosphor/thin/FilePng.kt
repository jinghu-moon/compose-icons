package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FilePng: ImageVector
    get() {
        if (_filePng != null) return _filePng!!
        _filePng = phosphorThinIcon(
            name = "FilePng",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60 148h-16c-2.209 0-4 1.791-4 4v56c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h12c13.255 0 24-10.745 24-24C84 158.745 73.255 148 60 148ZM60 188h-12v-32h12c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM220 200.87c.001 1.032-.397 2.024-1.11 2.77-4.88 5.265-11.712 8.289-18.89 8.36-15.44 0-28-14.36-28-32 0-17.64 12.56-32 28-32 5.083 .019 10.043 1.562 14.24 4.43 1.831 1.237 2.312 3.724 1.075 5.555-1.237 1.831-3.724 2.312-5.555 1.075C206.885 157.088 203.486 156.022 200 156c-11 0-20 10.77-20 24 0 13.23 9 24 20 24 4.461-.052 8.742-1.772 12-4.82v-11.18h-4c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h8c2.209 0 4 1.791 4 4ZM152 152v56c0 1.739-1.124 3.279-2.78 3.81-.394 .127-.806 .191-1.22 .19-1.289-0-2.499-.622-3.25-1.67L112 164.48v43.52c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-56c.001-1.737 1.122-3.275 2.776-3.806 1.654-.531 3.461 .065 4.474 1.476L144 195.52v-43.52c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM204 112c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c.001-1.061-.42-2.079-1.17-2.83l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v72c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-72c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52ZM156 84v-42.35L198.34 84Z"),
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
        return _filePng!!
    }

private var _filePng: ImageVector? = null
