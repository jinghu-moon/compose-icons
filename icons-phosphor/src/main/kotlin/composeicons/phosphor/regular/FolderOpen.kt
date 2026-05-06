package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = phosphorRegularIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245 110.64c-3.012-4.176-7.851-6.648-13-6.64h-16v-16c0-8.837-7.163-16-16-16h-69.33L102.94 51.2C100.166 49.132 96.8 48.01 93.34 48h-53.34C31.163 48 24 55.163 24 64v144h0c0 4.418 3.582 8 8 8h179.1c3.444 0 6.501-2.203 7.59-5.47l28.49-85.47c1.625-4.878 .815-10.24-2.18-14.42ZM93.34 64l29.86 22.4C124.585 87.439 126.269 88 128 88h72v16h-130.23c-6.887-.001-13.002 4.406-15.18 10.94L40 158.7v-94.7ZM205.34 200h-162.24L69.77 120h162.23Z"),
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
