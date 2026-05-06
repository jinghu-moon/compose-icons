package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileSvg: ImageVector
    get() {
        if (_fileSvg != null) return _fileSvg!!
        _fileSvg = phosphorThinIcon(
            name = "FileSvg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.83 85.17l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v72c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-72c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c.001-1.061-.42-2.079-1.17-2.83ZM156 41.65 198.34 84h-42.34ZM83.85 195.8c-.506 5.037-3.229 9.586-7.43 12.41C72 211.12 66.38 212 61.2 212c-4.793-.04-9.563-.675-14.2-1.89-1.424-.341-2.548-1.434-2.929-2.847-.382-1.414 .04-2.923 1.099-3.935 1.059-1.012 2.586-1.364 3.981-.918 4.22 1.17 16.56 3.29 22.83-.88 2.268-1.533 3.709-4.02 3.91-6.75 .83-6.45-4.38-8.69-15.64-11.94C50.57 180.04 38.53 176.56 40.11 164.07c.49-4.914 3.135-9.356 7.22-12.13 4.56-3.07 11-4.36 19.1-3.82 3.53 .233 7.033 .771 10.47 1.61 2.06 .617 3.264 2.751 2.726 4.833-.538 2.082-2.625 3.366-4.726 2.907-4.29-1.13-16.81-3.12-23.06 1.11-2.187 1.467-3.571 3.863-3.75 6.49-.66 5.17 3.89 7 14.42 10.08 9.76 2.85 23.14 6.69 21.34 20.65ZM147.77 153.35l-20 56c-.57 1.589-2.077 2.649-3.765 2.649-1.688 0-3.195-1.06-3.765-2.649l-20-56c-.502-1.35-.24-2.866 .687-3.969 .927-1.103 2.375-1.622 3.791-1.359 1.416 .263 2.582 1.266 3.052 2.628L124 196.11l16.23-45.46c.47-1.362 1.636-2.365 3.052-2.628 1.416-.263 2.864 .257 3.791 1.359 .927 1.103 1.189 2.619 .687 3.969ZM212 184v16.87c.001 1.032-.397 2.024-1.11 2.77-4.88 5.265-11.712 8.289-18.89 8.36-15.44 0-28-14.36-28-32 0-17.64 12.56-32 28-32 5.083 .019 10.043 1.562 14.24 4.43 1.831 1.237 2.312 3.724 1.075 5.555-1.237 1.831-3.724 2.312-5.555 1.075C198.886 157.087 195.486 156.021 192 156c-11 0-20 10.77-20 24 0 13.23 9 24 20 24 4.461-.052 8.742-1.772 12-4.82v-11.18h-4c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h8c2.209 0 4 1.791 4 4Z"),
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
        return _fileSvg!!
    }

private var _fileSvg: ImageVector? = null
