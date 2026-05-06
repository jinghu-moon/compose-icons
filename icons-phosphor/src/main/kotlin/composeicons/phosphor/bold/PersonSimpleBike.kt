package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleBike: ImageVector
    get() {
        if (_personSimpleBike != null) return _personSimpleBike!!
        _personSimpleBike = phosphorBoldIcon(
            name = "PersonSimpleBike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 84c17.673 0 32-14.327 32-32C200 34.327 185.673 20 168 20c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM168 44c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM204 140c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40ZM204 196c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM54 136c-23.196 0-42 18.804-42 42 0 23.196 18.804 42 42 42 23.196 0 42-18.804 42-42C96 154.804 77.196 136 54 136ZM54 196c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM188 128h-36c-3.184 .003-6.238-1.26-8.49-3.51L120 101l-15 15 31.52 31.51c2.239 2.257 3.49 5.311 3.48 8.49v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-43L79.51 124.49c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5l32-32c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529L157 104h31c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _personSimpleBike!!
    }

private var _personSimpleBike: ImageVector? = null
