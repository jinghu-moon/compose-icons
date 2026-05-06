package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileSvg: ImageVector
    get() {
        if (_fileSvg != null) return _fileSvg!!
        _fileSvg = phosphorDuotoneIcon(
            name = "FileSvg",
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
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v72c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-72h88v48c0 4.418 3.582 8 8 8h48v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24c.002-2.122-.84-4.158-2.34-5.66ZM160 51.31 188.69 80h-28.69ZM87.82 196.31c-.631 6.196-4.003 11.783-9.19 15.23C73.44 215 67 216 61.14 216 56.03 215.968 50.943 215.296 46 214c-4.202-1.231-6.634-5.61-5.457-9.828 1.177-4.217 5.525-6.705 9.757-5.582 4.38 1.2 14.95 2.7 19.55-.36 .88-.59 1.83-1.52 2.14-3.93 .35-2.67-.71-4.1-12.78-7.59-9.35-2.7-25-7.23-23-23.11 .63-6.073 3.928-11.551 9-14.95 11.84-8 30.72-3.31 32.83-2.76 4.275 1.124 6.829 5.5 5.705 9.775-1.124 4.275-5.5 6.829-9.775 5.705-4.48-1.17-15.23-2.56-19.83 .56-1.224 .825-1.97 2.194-2 3.67-.11 .9-.14 1.09 1.12 1.9 2.31 1.49 6.44 2.68 10.45 3.84 9.79 2.83 26.35 7.66 24.11 24.97ZM151.54 154.69l-20 56c-1.136 3.185-4.153 5.312-7.535 5.312-3.382 0-6.399-2.127-7.535-5.312l-20-56c-1.067-2.716-.571-5.797 1.294-8.041 1.866-2.244 4.805-3.294 7.67-2.74 2.865 .554 5.201 2.624 6.096 5.401L124 184.21l12.46-34.9c1.486-4.161 6.064-6.331 10.225-4.845 4.161 1.486 6.331 6.064 4.845 10.225ZM216 184v16.87c-0 2.06-.795 4.041-2.22 5.53-5.63 6.06-13.508 9.533-21.78 9.6-17.64 0-32-16.15-32-36 0-19.85 14.36-36 32-36 5.882 .018 11.623 1.802 16.48 5.12 3.579 2.502 4.489 7.412 2.046 11.032-2.443 3.619-7.337 4.611-10.996 2.228C197.32 160.841 194.693 160.011 192 160c-8.82 0-16 9-16 20 0 11 7.18 20 16 20 2.889-.016 5.696-.967 8-2.71v-5.29c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8c4.418 0 8 3.582 8 8Z"),
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
        return _fileSvg!!
    }

private var _fileSvg: ImageVector? = null
