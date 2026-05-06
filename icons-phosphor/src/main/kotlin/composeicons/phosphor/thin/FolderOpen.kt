package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = phosphorThinIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.72 113c-2.237-3.15-5.867-5.015-9.73-5h-19.99v-20c0-6.627-5.373-12-12-12h-70.67L100.53 54.4C98.451 52.845 95.926 52.004 93.33 52h-53.33C33.373 52 28 57.373 28 64v144c0 2.209 1.791 4 4 4h179.09c1.721-.003 3.248-1.106 3.79-2.74l28.49-85.47c1.236-3.651 .621-7.675-1.65-10.79ZM40 60h53.33c.865 0 1.708 .281 2.4 .8l29.87 22.4c.692 .519 1.535 .8 2.4 .8h72c2.209 0 4 1.791 4 4v20h-134.24c-5.165 .002-9.749 3.309-11.38 8.21L36 183.35v-119.35c0-2.209 1.791-4 4-4ZM235.78 121.26 208.2 204h-170.65L66 118.74c.539-1.623 2.05-2.724 3.76-2.74h162.24c1.284 .002 2.488 .62 3.239 1.662 .75 1.042 .955 2.38 .551 3.598Z"),
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
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
