package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorBoldIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 160c0 6.627-5.373 12-12 12h-31.33l17.66 29.89c2.242 3.694 2.325 8.308 .218 12.08-2.107 3.772-6.08 6.12-10.401 6.147-4.321 .027-8.323-2.271-10.477-6.017L140.9 118c-3.179-5.688-1.238-12.874 4.373-16.188 5.611-3.313 12.841-1.543 16.287 3.988L186.48 148h45.52c6.627 0 12 5.373 12 12ZM133.15 148h-35.76L162.33 38.11c2.242-3.694 2.325-8.308 .218-12.08-2.107-3.772-6.08-6.12-10.401-6.147-4.321-.027-8.323 2.271-10.477 6.017L128 49 114.33 25.9c-2.154-3.746-6.156-6.044-10.477-6.017-4.321 .027-8.294 2.375-10.401 6.147-2.107 3.772-2.024 8.386 .218 12.08l20.39 34.51L69.52 148h-45.52c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h109.15c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM58.83 189.67c-5.703-3.369-13.056-1.48-16.43 4.22l-4.73 8c-2.242 3.694-2.325 8.308-.218 12.08 2.107 3.772 6.08 6.12 10.401 6.147 4.321 .027 8.323-2.271 10.477-6.017l4.73-8c3.367-5.705 1.473-13.06-4.23-16.43Z"),
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
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
