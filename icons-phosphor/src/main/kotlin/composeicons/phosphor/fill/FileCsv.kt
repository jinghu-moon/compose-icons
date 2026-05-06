package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileCsv: ImageVector
    get() {
        if (_fileCsv != null) return _fileCsv!!
        _fileCsv = phosphorFillIcon(
            name = "FileCsv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4h168c2.209 0 4-1.791 4-4v-28c.002-2.122-.84-4.158-2.34-5.66ZM152 88v-44l44 44ZM48 180c0 11 7.18 20 16 20 3.823-.082 7.451-1.705 10.06-4.5 2.873-3.032 7.564-3.423 10.9-.91 1.769 1.397 2.866 3.475 3.022 5.724 .156 2.248-.643 4.458-2.202 6.086C80.15 212.46 72.272 215.933 64 216 46.36 216 32 199.85 32 180c0-19.85 14.36-36 32-36 8.076 .059 15.788 3.372 21.39 9.19 3.066 2.956 3.382 7.758 .73 11.09-1.463 1.738-3.595 2.772-5.865 2.844-2.27 .072-4.464-.823-6.035-2.464C71.601 161.765 67.903 160.079 64 160c-8.82 0-16 9-16 20ZM151.81 196.31c-.631 6.196-4.003 11.783-9.19 15.23C137.43 215 131 216 125.13 216c-5.107-.032-10.19-.704-15.13-2-2.786-.739-4.959-2.92-5.688-5.709-.729-2.789 .098-5.754 2.166-7.762 2.068-2.008 5.056-2.749 7.822-1.939 4.38 1.2 14.95 2.7 19.55-.36 .88-.59 1.83-1.52 2.14-3.93 .35-2.67-.71-4.1-12.78-7.59-9.35-2.7-25-7.23-23-23.11 .632-6.072 3.929-11.55 9-14.95 11.84-8 30.71-3.31 32.83-2.76 4.275 1.124 6.829 5.5 5.705 9.775-1.124 4.275-5.5 6.829-9.775 5.705-4.49-1.17-15.23-2.56-19.83 .56-1.224 .825-1.97 2.194-2 3.67-.12 .9-.14 1.09 1.11 1.9 2.31 1.49 6.45 2.68 10.45 3.84 9.79 2.83 26.35 7.66 24.11 24.97ZM215.42 155l-19.89 55.68c-1.14 3.178-4.153 5.298-7.53 5.298-3.377 0-6.39-2.12-7.53-5.298L160.58 155c-1.548-4.127 .438-8.739 4.5-10.45 2.015-.789 4.263-.727 6.232 .169 1.969 .897 3.491 2.553 4.218 4.591L188 184.21l12.47-34.9c.727-2.038 2.249-3.694 4.218-4.591 1.969-.897 4.217-.958 6.232-.169 4.054 1.719 6.037 6.324 4.5 10.45Z"),
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
        return _fileCsv!!
    }

private var _fileCsv: ImageVector? = null
