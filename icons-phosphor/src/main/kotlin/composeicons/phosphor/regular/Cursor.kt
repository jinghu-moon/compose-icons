package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorRegularIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 132.69 214.08 115l.33-.13c6.036-2.677 9.808-8.787 9.496-15.383C223.594 92.891 219.262 87.165 213 85.07L52.92 32.8C47.208 30.931 40.93 32.431 36.68 36.68c-4.25 4.25-5.75 10.528-3.88 16.24L85.07 213c2.018 6.328 7.774 10.722 14.41 11h.78c6.352 .022 12.104-3.753 14.61-9.59l.13-.33L132.69 168 184 219.31c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688l12.68-12.68c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM195.31 208 144 156.69c-3.743-3.75-9.099-5.404-14.305-4.417-5.205 .987-9.585 4.487-11.695 9.347 0 .11-.09 .22-.13 .32l-17.65 46L48 48l159.85 52.2-45.95 17.64-.32 .13c-4.86 2.11-8.36 6.49-9.347 11.695-.987 5.205 .667 10.562 4.417 14.305h0L208 195.31Z"),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
