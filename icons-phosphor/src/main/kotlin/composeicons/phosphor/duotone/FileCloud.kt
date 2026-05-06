package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) return _fileCloud!!
        _fileCloud = phosphorDuotoneIcon(
            name = "FileCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 88h-56v-56ZM108 136c-19.682-.004-36.972 13.064-42.34 32h0-5.66c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28h48c24.301 0 44-19.699 44-44 0-24.301-19.699-44-44-44Z"),
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
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v88c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-88h88v48c0 4.418 3.582 8 8 8h48v120h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c8.837 0 16-7.163 16-16v-128c.002-2.122-.84-4.158-2.34-5.66ZM160 51.31 188.69 80h-28.69ZM108 128c-20.992 0-39.926 12.622-48 32-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36h48c28.719 0 52-23.281 52-52 0-28.719-23.281-52-52-52ZM108 216h-48c-10.317 .017-18.954-7.817-19.941-18.086-.987-10.27 6-19.605 16.131-21.554-.099 4.418 3.402 8.081 7.82 8.18 4.418 .099 8.081-3.402 8.18-7.82 .187-2.055 .542-4.092 1.06-6.09 .113-.327 .203-.661 .27-1 5.336-17.74 23.265-28.534 41.441-24.95 18.175 3.585 30.663 20.378 28.863 38.816C142.024 201.935 126.526 215.997 108 216Z"),
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
