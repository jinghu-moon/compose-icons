package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) return _linkBreak!!
        _linkBreak = phosphorBoldIcon(
            name = "LinkBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M195.8 60.2C184.9 49.299 167.239 49.259 156.29 60.11L144.68 72.28c-2.927 3.234-7.379 4.626-11.627 3.633-4.248-.992-7.623-4.212-8.814-8.408-1.191-4.196-.012-8.709 3.081-11.785L139 43.43l.2-.2c20.308-20.308 53.232-20.308 73.54 0 20.308 20.308 20.308 53.232 0 73.54l-.2 .2-12.29 11.71c-4.823 4.365-12.245 4.092-16.735-.615-4.49-4.707-4.412-12.134 .175-16.745L195.86 99.71c10.86-10.941 10.833-28.602-.06-39.51ZM111.32 183.72 99.71 195.89c-10.935 10.935-28.665 10.935-39.6 0-10.935-10.935-10.935-28.665 0-39.6L72.28 144.68c4.587-4.612 4.665-12.039 .175-16.745-4.49-4.707-11.912-4.979-16.735-.615L43.43 139l-.2 .2c-20.308 20.308-20.308 53.232 0 73.54 20.308 20.308 53.232 20.308 73.54 0l.2-.2 11.71-12.29c3.093-3.076 4.273-7.589 3.081-11.785-1.191-4.196-4.566-7.416-8.814-8.408-4.248-.992-8.7 .399-11.627 3.633ZM216 148h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM40 108h24c6.627 0 12-5.373 12-12C76 89.373 70.627 84 64 84h-24C33.373 84 28 89.373 28 96c0 6.627 5.373 12 12 12ZM160 180c-6.627 0-12 5.373-12 12v24c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-24c0-6.627-5.373-12-12-12ZM96 76c6.627 0 12-5.373 12-12v-24C108 33.373 102.627 28 96 28 89.373 28 84 33.373 84 40v24c0 6.627 5.373 12 12 12Z"),
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
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
