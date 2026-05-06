package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorDuotoneIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 152l48 72h-128L60 168l16.36 25.45ZM152 32v56h56Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M110.66 147.56c-1.483-2.229-3.983-3.568-6.66-3.568-2.677 0-5.177 1.339-6.66 3.568L76.49 178.85 66.73 163.67C65.258 161.38 62.722 159.995 60 159.995c-2.722 0-5.258 1.385-6.73 3.675l-36 56c-1.585 2.462-1.698 5.593-.295 8.163 1.403 2.57 4.097 4.168 7.025 4.167h128c2.952 .002 5.665-1.622 7.058-4.224 1.393-2.602 1.24-5.76-.398-8.216ZM38.65 216 60 182.79l9.63 15c1.459 2.272 3.966 3.654 6.665 3.676 2.7 .022 5.229-1.319 6.725-3.566l21-31.47L137.05 216ZM213.65 82.34l-56-56C156.151 24.843 154.119 24.001 152 24h-96C47.163 24 40 31.163 40 40v88c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-88h88v48c0 4.418 3.582 8 8 8h48v120h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8c8.837 0 16-7.163 16-16v-128c.002-2.122-.84-4.158-2.34-5.66ZM160 51.31 188.69 80h-28.69Z"),
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
