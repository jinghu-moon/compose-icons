package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileTxt: ImageVector
    get() {
        if (_fileTxt != null) return _fileTxt!!
        _fileTxt = phosphorRegularIcon(
            name = "FileTxt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 120c4.418 0 8-3.582 8-8v-72h88v48c0 4.418 3.582 8 8 8h48v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24c.002-2.122-.84-4.158-2.34-5.66l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v72c0 4.418 3.582 8 8 8ZM160 51.31 188.69 80h-28.69ZM154.51 156.65 137.83 180l16.68 23.35c2.332 3.588 1.427 8.376-2.053 10.866-3.48 2.49-8.304 1.8-10.947-1.566L128 193.76l-13.49 18.89c-1.604 2.468-4.434 3.856-7.367 3.613-2.933-.243-5.497-2.076-6.673-4.774-1.177-2.698-.777-5.824 1.04-8.139L118.17 180 101.49 156.65c-1.818-2.315-2.217-5.441-1.04-8.139 1.177-2.698 3.74-4.532 6.673-4.774 2.933-.243 5.763 1.145 7.367 3.613L128 166.24l13.49-18.89c2.643-3.366 7.466-4.056 10.947-1.566 3.48 2.49 4.385 7.278 2.053 10.866ZM92 152c0 4.418-3.582 8-8 8h-12v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48h-12c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM220 152c0 4.418-3.582 8-8 8h-12v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48h-12c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8Z"),
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
        return _fileTxt!!
    }

private var _fileTxt: ImageVector? = null
