package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = phosphorFillIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M74.34 77.66C72.838 76.159 71.994 74.123 71.994 72c0-2.123 .844-4.159 2.346-5.66l48-48c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346l48 48c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L136 43.31v84.69c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-84.69L85.66 77.66C84.159 79.162 82.123 80.006 80 80.006c-2.123 0-4.159-.844-5.66-2.346ZM240 136v64c0 8.837-7.163 16-16 16h-192c-8.837 0-16-7.163-16-16v-64c0-8.837 7.163-16 16-16h68c2.209 0 4 1.791 4 4v3.46c0 13.45 11 24.79 24.46 24.54 13.075-.251 23.542-10.923 23.54-24v-4c0-2.209 1.791-4 4-4h68c8.837 0 16 7.163 16 16ZM200 168c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12Z"),
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
        return _upload!!
    }

private var _upload: ImageVector? = null
