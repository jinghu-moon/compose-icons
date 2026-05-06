package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilePng: ImageVector
    get() {
        if (_filePng != null) return _filePng!!
        _filePng = phosphorBoldIcon(
            name = "FilePng",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56 140h-16c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h4c17.673 0 32-14.327 32-32C88 154.327 73.673 140 56 140ZM56 180h-4v-16h4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM232 200.87c.001 3.092-1.192 6.066-3.33 8.3C222.289 216.023 213.364 219.941 204 220c-19.85 0-36-17.95-36-40 0-22.05 16.15-40 36-40 6.676 .019 13.193 2.04 18.71 5.8 3.661 2.352 5.762 6.502 5.49 10.845-.272 4.343-2.873 8.199-6.799 10.076-3.926 1.878-8.56 1.483-12.112-1.031C207.737 164.606 205.893 164.017 204 164c-6.5 0-12 7.33-12 16 0 8.67 5.5 16 12 16 .916-.002 1.827-.143 2.7-.42-2.926-3.591-3.524-8.545-1.537-12.728 1.987-4.184 6.205-6.85 10.837-6.852h4c6.627 0 12 5.373 12 12ZM160 152v56c.001 5.218-3.371 9.839-8.34 11.43-1.184 .376-2.418 .568-3.66 .57-3.869 .004-7.503-1.857-9.76-5L120 189.44v18.56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56c-.008-5.218 3.357-9.844 8.325-11.442 4.968-1.598 10.399 .198 13.435 4.442L136 170.55v-18.55c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM48 120c6.627 0 12-5.373 12-12v-64h76v48c0 6.627 5.373 12 12 12h48v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20c.003-3.184-1.26-6.238-3.51-8.49l-56-56C158.238 21.26 155.184 19.997 152 20h-96C44.954 20 36 28.954 36 40v68c0 6.627 5.373 12 12 12ZM160 57l23 23h-23Z"),
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
