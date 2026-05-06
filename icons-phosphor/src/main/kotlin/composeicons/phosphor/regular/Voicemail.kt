package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = phosphorRegularIcon(
            name = "Voicemail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 72c-22.744 .021-43.217 13.797-51.804 34.858-8.587 21.061-3.582 45.224 12.664 61.142h-65.72c19.125-18.738 22.31-48.393 7.6-70.765C88.03 74.862 59.542 66.033 34.758 76.164 9.974 86.295-4.171 112.553 1.004 138.823 6.179 165.093 29.225 184.025 56 184h144c30.928 0 56-25.072 56-56C256 97.072 230.928 72 200 72ZM16 128C16 105.909 33.909 88 56 88c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40C33.909 168 16 150.091 16 128ZM200 168c-22.091 0-40-17.909-40-40 0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
