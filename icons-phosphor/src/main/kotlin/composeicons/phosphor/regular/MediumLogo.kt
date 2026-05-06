package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) return _mediumLogo!!
        _mediumLogo = phosphorRegularIcon(
            name = "MediumLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 64C36.654 64 8 92.654 8 128c0 35.346 28.654 64 64 64 35.346 0 64-28.654 64-64C135.961 92.67 107.33 64.039 72 64ZM72 176C45.49 176 24 154.51 24 128 24 101.49 45.49 80 72 80c26.51 0 48 21.49 48 48-.028 26.498-21.502 47.972-48 48ZM184 64c-5.68 0-16.4 2.76-24.32 21.25C154.73 96.8 152 112 152 128c0 16 2.73 31.2 7.68 42.75C167.6 189.24 178.32 192 184 192c5.68 0 16.4-2.76 24.32-21.25C213.27 159.2 216 144 216 128c0-16-2.73-31.2-7.68-42.75C200.4 66.76 189.68 64 184 64ZM184 176c-5.64 0-16-18.22-16-48 0-29.78 10.36-48 16-48 5.64 0 16 18.22 16 48 0 29.78-10.36 48-16 48ZM248 72v112c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
