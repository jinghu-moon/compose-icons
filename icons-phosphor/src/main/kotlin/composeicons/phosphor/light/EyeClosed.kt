package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorLightIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.21 165c1.657 2.877 .667 6.553-2.21 8.21-2.877 1.657-6.553 .667-8.21-2.21l-20-35.08c-11.827 8.291-25.032 14.416-39 18.09l6.17 37c.263 1.57-.108 3.181-1.033 4.477-.925 1.296-2.326 2.171-3.897 2.433-.331 .051-.665 .078-1 .08-2.926-.003-5.422-2.115-5.91-5L148 156.44c-13.252 2.082-26.748 2.082-40 0L101.92 193c-.488 2.888-2.991 5.002-5.92 5-.335-.002-.669-.029-1-.08-1.571-.264-2.972-1.142-3.894-2.44-.923-1.298-1.292-2.91-1.026-4.48l6.17-37c-13.968-3.674-27.173-9.799-39-18.09L37.21 171c-1.657 2.877-5.333 3.867-8.21 2.21C26.123 171.553 25.133 167.877 26.79 165L47.64 128.52C40.222 122.261 33.421 115.306 27.33 107.75c-2.082-2.579-1.679-6.358 .9-8.44 2.579-2.082 6.358-1.679 8.44 .9C53.54 121.11 83.07 146 128 146c44.93 0 74.46-24.89 91.33-45.77 2.082-2.579 5.861-2.982 8.44-.9 2.579 2.082 2.982 5.861 .9 8.44-6.091 7.556-12.892 14.511-20.31 20.77Z"),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
