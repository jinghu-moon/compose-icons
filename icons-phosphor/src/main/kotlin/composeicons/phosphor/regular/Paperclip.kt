package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorRegularIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209.66 122.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-82.05 82c-21.873 21.87-57.335 21.868-79.205-.005C26.535 193.782 26.537 158.32 48.41 136.45L147.67 35.73c15.616-15.632 40.948-15.646 56.58-.03 15.632 15.616 15.646 40.948 .03 56.58L105 193c-9.389 9.389-24.611 9.389-34 0-9.389-9.389-9.389-24.611 0-34L154.3 74.38c1.986-2.119 4.965-2.995 7.783-2.288 2.817 .707 5.03 2.885 5.782 5.69 .751 2.806-.077 5.798-2.164 7.818L82.39 170.31c-3.137 3.112-3.157 8.178-.045 11.315 3.112 3.137 8.178 3.157 11.315 .045L192.93 81c9.389-9.37 9.405-24.576 .035-33.965C183.595 37.646 168.389 37.63 159 47L59.76 147.68c-15.635 15.61-15.655 40.94-.045 56.575 15.61 15.635 40.94 15.655 56.575 .045l82.06-82c3.135-3.111 8.197-3.093 11.31 .04Z"),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
