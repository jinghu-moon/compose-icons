package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorThinIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206.83 125.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-82.06 82c-20.31 20.308-53.237 20.305-73.545-.005C30.917 192.515 30.92 159.588 51.23 139.28L150.52 38.55c14.056-14.067 36.853-14.076 50.92-.02 14.067 14.056 14.076 36.853 .02 50.92L102.16 190.14c-7.807 7.815-20.47 7.822-28.285 .015-7.815-7.807-7.822-20.47-.015-28.285L157.15 77.19c.993-1.06 2.483-1.498 3.891-1.144 1.409 .353 2.515 1.442 2.891 2.845 .376 1.403-.039 2.899-1.082 3.909L79.54 167.5c-4.694 4.681-4.706 12.281-.025 16.975 4.681 4.694 12.281 4.706 16.975 .025L195.78 83.81c10.944-10.93 10.955-28.661 .025-39.605C184.875 33.261 167.144 33.25 156.2 44.18L56.91 144.87c-17.193 17.179-17.204 45.042-.025 62.235 17.179 17.193 45.042 17.204 62.235 .025l82-82c.758-.761 1.789-1.186 2.863-1.178 1.074 .008 2.1 .447 2.847 1.218Z"),
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
