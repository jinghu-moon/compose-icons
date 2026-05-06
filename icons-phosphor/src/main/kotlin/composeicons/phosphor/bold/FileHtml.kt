package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileHtml: ImageVector
    get() {
        if (_fileHtml != null) return _fileHtml!!
        _fileHtml = phosphorBoldIcon(
            name = "FileHtml",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 128c6.627 0 12-5.373 12-12v-72h76v48c0 6.627 5.373 12 12 12h48v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-28c.003-3.184-1.26-6.238-3.51-8.49l-56-56C158.238 21.26 155.184 19.997 152 20h-96C44.954 20 36 28.954 36 40v76c0 6.627 5.373 12 12 12ZM183 80h-23v-23ZM68 160v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-12v12c0 6.627-5.373 12-12 12C13.373 220 8 214.627 8 208v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v12h12v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM128 160c0 6.627-5.373 12-12 12h-4v36c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-36h-4c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12ZM200 160v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-9.36l-.11 .16c-2.238 3.258-5.938 5.204-9.89 5.204-3.952 0-7.652-1.946-9.89-5.204l-.11-.16v9.36c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-48c-.002-5.258 3.419-9.904 8.44-11.464 5.021-1.56 10.472 .331 13.45 4.664L166 170.82l12.11-17.62c2.978-4.333 8.429-6.223 13.45-4.664 5.021 1.56 8.442 6.206 8.44 11.464ZM256 208c0 6.627-5.373 12-12 12h-24c-6.627 0-12-5.373-12-12v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v36h12c6.627 0 12 5.373 12 12Z"),
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
        return _fileHtml!!
    }

private var _fileHtml: ImageVector? = null
