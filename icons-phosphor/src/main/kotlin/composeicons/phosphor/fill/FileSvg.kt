package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileSvg: ImageVector
    get() {
        if (_fileSvg != null) return _fileSvg!!
        _fileSvg = phosphorFillIcon(
            name = "FileSvg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4h168c2.209 0 4-1.791 4-4v-28c.002-2.122-.84-4.158-2.34-5.66ZM152 88v-44l44 44ZM87.82 196.31c-.631 6.196-4.003 11.783-9.19 15.23C73.44 215 67 216 61.14 216 56.03 215.968 50.943 215.296 46 214c-4.202-1.231-6.634-5.61-5.457-9.828 1.177-4.217 5.525-6.705 9.757-5.582 4.38 1.2 14.95 2.7 19.55-.36 .88-.59 1.83-1.52 2.14-3.93 .35-2.67-.71-4.1-12.78-7.59-9.35-2.7-25-7.23-23-23.11 .63-6.073 3.928-11.551 9-14.95 11.84-8 30.72-3.31 32.83-2.76 4.275 1.124 6.829 5.5 5.705 9.775-1.124 4.275-5.5 6.829-9.775 5.705-4.48-1.17-15.23-2.56-19.83 .56-1.224 .825-1.97 2.194-2 3.67-.11 .9-.14 1.09 1.12 1.9 2.31 1.49 6.44 2.68 10.45 3.84 9.79 2.83 26.35 7.66 24.11 24.97ZM151.54 154.69l-19.9 55.72c-.977 2.9-3.479 5.021-6.5 5.51-3.766 .54-7.391-1.647-8.67-5.23L96.59 155c-1.548-4.127 .438-8.739 4.5-10.45 2.015-.789 4.263-.727 6.232 .169 1.969 .897 3.491 2.553 4.218 4.591L124 184.21l12.46-34.9c1.486-4.161 6.064-6.331 10.225-4.845 4.161 1.486 6.331 6.064 4.845 10.225ZM216 184v16.87c-.001 2.08-.811 4.078-2.26 5.57-5.623 6.041-13.487 9.499-21.74 9.56-17.64 0-32-16.15-32-36 0-19.85 14.36-36 32-36 5.722 .017 11.315 1.707 16.09 4.86 3.592 2.244 4.89 6.85 3 10.64-1.064 2.003-2.928 3.461-5.129 4.01-2.201 .549-4.531 .138-6.411-1.13C197.334 160.837 194.7 160.007 192 160c-8.82 0-16 9-16 20 0 11 7.18 20 16 20 2.889-.016 5.696-.967 8-2.71v-5.29c-2.217 .005-4.336-.91-5.853-2.527-1.516-1.617-2.294-3.791-2.147-6.003 .372-4.269 3.975-7.528 8.26-7.47h7.74c4.418 0 8 3.582 8 8Z"),
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
