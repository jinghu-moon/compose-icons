package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = phosphorRegularIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 136v64c0 8.837-7.163 16-16 16h-192c-8.837 0-16-7.163-16-16v-64c0-8.837 7.163-16 16-16h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48v64h192v-64h-48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c8.837 0 16 7.163 16 16ZM85.66 77.66 120 43.31v84.69c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-84.69l34.34 34.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32l-48-48C132.159 16.838 130.123 15.994 128 15.994c-2.123 0-4.159 .844-5.66 2.346l-48 48c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0ZM200 168c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12Z"),
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
