package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleBike: ImageVector
    get() {
        if (_personSimpleBike != null) return _personSimpleBike!!
        _personSimpleBike = phosphorThinIcon(
            name = "PersonSimpleBike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 76c13.255 0 24-10.745 24-24C188 38.745 177.255 28 164 28c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24ZM164 36c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM200 140c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36 0-19.882-16.118-36-36-36ZM200 204c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM56 140c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C92 156.118 75.882 140 56 140ZM56 204C40.536 204 28 191.464 28 176c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM192 116h-40c-1.061 .001-2.079-.42-2.83-1.17L120 85.66 93.66 112l37.17 37.17c.75 .751 1.171 1.769 1.17 2.83v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-46.34L85.17 114.83c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83l32-32c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173L153.66 108h38.34c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4Z"),
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
        return _personSimpleBike!!
    }

private var _personSimpleBike: ImageVector? = null
