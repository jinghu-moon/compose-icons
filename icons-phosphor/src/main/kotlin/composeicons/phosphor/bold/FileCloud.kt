package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) return _fileCloud!!
        _fileCloud = phosphorBoldIcon(
            name = "FileCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 79.52l-56-56C158.239 21.266 155.185 20 152 20h-96C44.954 20 36 28.954 36 40v84c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-80h76v48c0 6.627 5.373 12 12 12h48v108h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h20c11.046 0 20-8.954 20-20v-128c-0-3.18-1.263-6.23-3.51-8.48ZM160 57l23 23h-23ZM108 124c-21.67-.004-41.398 12.494-50.65 32.09-21.515 1.446-38.011 19.685-37.296 41.236C20.768 218.877 38.437 235.983 60 236h48c30.928 0 56-25.072 56-56 0-30.928-25.072-56-56-56ZM108 212h-48c-7.546-.002-14.064-5.277-15.641-12.656-1.577-7.379 2.216-14.857 9.101-17.944 2.41 4.786 7.701 7.395 12.965 6.392 5.264-1.003 9.225-5.375 9.705-10.712 .161-1.789 .469-3.562 .92-5.3 .12-.36 .22-.72 .31-1.09 4.787-15.741 20.729-25.287 36.865-22.074 16.136 3.213 27.206 18.138 25.598 34.512C138.214 199.501 124.452 211.988 108 212Z"),
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
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
