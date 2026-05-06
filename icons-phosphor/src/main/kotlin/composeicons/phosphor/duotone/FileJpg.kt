package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileJpg: ImageVector
    get() {
        if (_fileJpg != null) return _fileJpg!!
        _fileJpg = phosphorDuotoneIcon(
            name = "FileJpg",
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
                pathData = parseSvgPathData("M120 144h-16c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h8c15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28ZM120 184h-8v-24h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM216 184v16.87c-0 2.06-.795 4.041-2.22 5.53-5.63 6.06-13.508 9.533-21.78 9.6-17.64 0-32-16.15-32-36 0-19.85 14.36-36 32-36 5.882 .018 11.623 1.802 16.48 5.12 3.662 2.485 4.615 7.468 2.13 11.13-2.485 3.662-7.468 4.615-11.13 2.13C197.285 160.847 194.677 160.017 192 160c-8.82 0-16 9-16 20 0 11 7.18 20 16 20 2.886-.033 5.688-.982 8-2.71v-5.29c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8c4.418 0 8 3.582 8 8ZM80 152v38c0 14.359-11.641 26-26 26C39.641 216 28 204.359 28 190c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10v-38c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v72c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-72h88v48c0 4.418 3.582 8 8 8h48v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24c.002-2.122-.84-4.158-2.34-5.66ZM160 80v-28.69L188.69 80Z"),
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
        return _fileJpg!!
    }

private var _fileJpg: ImageVector? = null
