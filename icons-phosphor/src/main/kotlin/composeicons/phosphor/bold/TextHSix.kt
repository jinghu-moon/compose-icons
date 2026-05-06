package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorBoldIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M217.06 140.33l13.24-22.18c2.326-3.685 2.47-8.342 .379-12.165-2.092-3.823-6.092-6.211-10.449-6.239-4.358-.028-8.388 2.308-10.529 6.104l-32.25 54c-.09 .15-.17 .31-.25 .47-8.661 15.324-6.287 34.509 5.849 47.259 12.136 12.75 31.18 16.069 46.913 8.175 15.733-7.894 24.456-25.145 21.489-42.495-2.967-17.35-16.928-30.722-34.39-32.938ZM212 196c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM156 56v120c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-48h-80v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-120C28 49.373 33.373 44 40 44c6.627 0 12 5.373 12 12v48h80v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
