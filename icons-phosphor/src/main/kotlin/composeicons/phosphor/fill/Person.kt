package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Person: ImageVector
    get() {
        if (_person != null) return _person!!
        _person = phosphorFillIcon(
            name = "Person",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 36C100 20.536 112.536 8 128 8c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28C112.536 64 100 51.464 100 36ZM215.42 140.78 170.17 89.48c-5.315-6.027-12.964-9.48-21-9.48h-42.34c-8.036 0-15.685 3.453-21 9.48L40.58 140.78c-6.114 6.256-6.071 16.262 .096 22.464 6.167 6.203 16.173 6.303 22.464 .226L89 142.7 69.3 217.58c-3.567 8.007-.026 17.394 7.94 21.051 7.967 3.657 17.393 .223 21.14-7.701L128 180l29.58 51c3.747 7.925 13.173 11.359 21.14 7.701 7.967-3.657 11.507-13.044 7.94-21.051L167 142.7l25.9 20.77c6.291 6.078 16.296 5.977 22.464-.226 6.167-6.203 6.21-16.209 .096-22.464Z"),
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
