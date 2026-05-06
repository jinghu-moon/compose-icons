package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorThinIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M107.33 149.78c-.742-1.114-1.991-1.784-3.33-1.784-1.339 0-2.588 .67-3.33 1.784L76.42 186.15 63.36 165.84c-.737-1.141-2.002-1.83-3.36-1.83-1.358 0-2.623 .689-3.36 1.83l-36 56c-.789 1.23-.845 2.792-.145 4.075 .7 1.283 2.044 2.082 3.505 2.085h128c1.476 .001 2.832-.811 3.529-2.112 .697-1.301 .62-2.88-.199-4.108ZM31.33 220 60 175.4l13 20.22c.731 1.132 1.983 1.82 3.33 1.83 1.352 .024 2.621-.648 3.36-1.78L104 159.21 144.53 220ZM210.83 85.17l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v88c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-88c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v124c0 2.209-1.791 4-4 4h-8c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h8c6.627 0 12-5.373 12-12v-128c.001-1.061-.42-2.079-1.17-2.83ZM156 41.65 198.34 84h-42.34Z"),
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
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
