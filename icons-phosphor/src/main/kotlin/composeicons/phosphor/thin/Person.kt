package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Person: ImageVector
    get() {
        if (_person != null) return _person!!
        _person = phosphorThinIcon(
            name = "Person",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 68c15.464 0 28-12.536 28-28C156 24.536 143.464 12 128 12c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM128 20c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C116.954 60 108 51.046 108 40c0-11.046 8.954-20 20-20ZM215.42 136.78 170.17 85.48c-5.315-6.027-12.964-9.48-21-9.48h-42.34c-8.036 0-15.685 3.453-21 9.48L40.58 136.78c-6.114 6.256-6.071 16.262 .096 22.464 6.167 6.203 16.173 6.303 22.464 .226L89 138.7 69.3 213.58c-3.567 8.007-.026 17.394 7.94 21.051 7.967 3.657 17.393 .223 21.14-7.701L128 176l29.58 51c3.747 7.925 13.173 11.359 21.14 7.701 7.967-3.657 11.507-13.044 7.94-21.051L167 138.7l25.9 20.77c6.291 6.078 16.296 5.977 22.464-.226 6.167-6.203 6.21-16.209 .096-22.464ZM209.66 153.65c-3.124 3.122-8.186 3.122-11.31 0-.103-.104-.213-.201-.33-.29L162.51 124.88c-1.345-1.085-3.234-1.183-4.685-.244-1.451 .939-2.134 2.703-1.695 4.374L179 215.94c.061 .23 .141 .454 .24 .67 1.256 2.597 1.017 5.67-.627 8.042-1.644 2.371-4.437 3.674-7.311 3.408-2.873-.265-5.381-2.057-6.562-4.69-.05-.11-.11-.21-.17-.32L131.46 166c-.716-1.234-2.034-1.993-3.46-1.993-1.426 0-2.744 .759-3.46 1.993L91.42 223.05c-.06 .11-.12 .21-.17 .32-1.182 2.632-3.689 4.424-6.562 4.69-2.873 .265-5.667-1.037-7.311-3.408-1.644-2.371-1.883-5.444-.627-8.042 .099-.216 .179-.44 .24-.67L99.87 129c.439-1.671-.244-3.435-1.695-4.374-1.451-.939-3.34-.84-4.685 .244L58 153.36c-.117 .089-.227 .186-.33 .29-3.145 2.988-8.099 2.925-11.167-.143-3.068-3.068-3.131-8.022-.143-11.167l.17-.18L91.83 90.77c3.797-4.305 9.26-6.77 15-6.77h42.34c5.74-0 11.203 2.465 15 6.77l45.32 51.39 .17 .18c3.122 3.124 3.122 8.186 0 11.31Z"),
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
        return _person!!
    }

private var _person: ImageVector? = null
