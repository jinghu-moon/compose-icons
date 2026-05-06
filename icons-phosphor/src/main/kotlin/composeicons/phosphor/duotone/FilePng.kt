package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FilePng: ImageVector
    get() {
        if (_filePng != null) return _filePng!!
        _filePng = phosphorDuotoneIcon(
            name = "FilePng",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 88h-56v-56Z"),
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
                pathData = parseSvgPathData("M60 144h-16c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h8c15.464 0 28-12.536 28-28C88 156.536 75.464 144 60 144ZM60 184h-8v-24h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM224 200.87c-0 2.06-.795 4.041-2.22 5.53-5.63 6.06-13.508 9.533-21.78 9.6-17.64 0-32-16.15-32-36 0-19.85 14.36-36 32-36 5.88 .02 11.62 1.8 16.48 5.11 3.664 2.485 4.62 7.471 2.135 11.135-2.485 3.664-7.471 4.62-11.135 2.135C205.285 160.847 202.677 160.017 200 160c-8.82 0-16 9-16 20 0 11 7.18 20 16 20 2.888-.032 5.691-.985 8-2.72v-5.28c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8c4.418 0 8 3.582 8 8ZM156 152v56c.001 3.479-2.247 6.559-5.56 7.62-.788 .254-1.612 .382-2.44 .38-2.584 0-5.008-1.248-6.51-3.35L116 177v31c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-56c-0-3.478 2.247-6.557 5.559-7.619 3.312-1.061 6.93 .139 8.951 2.969L140 183v-31c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM48 120c4.418 0 8-3.582 8-8v-72h88v48c0 4.418 3.582 8 8 8h48v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24c.002-2.122-.84-4.158-2.34-5.66l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v72c0 4.418 3.582 8 8 8ZM160 51.31 188.69 80h-28.69Z"),
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
