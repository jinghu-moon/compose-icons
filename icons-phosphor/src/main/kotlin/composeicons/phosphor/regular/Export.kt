package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Export: ImageVector
    get() {
        if (_export != null) return _export!!
        _export = phosphorRegularIcon(
            name = "Export",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 112v96c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-96c0-8.837 7.163-16 16-16h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24v96h144v-96h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24c8.837 0 16 7.163 16 16ZM93.66 69.66 120 43.31v92.69c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-92.69l26.34 26.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32l-40-40C132.159 16.838 130.123 15.994 128 15.994c-2.123 0-4.159 .844-5.66 2.346l-40 40c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0Z"),
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
        return _export!!
    }

private var _export: ImageVector? = null
