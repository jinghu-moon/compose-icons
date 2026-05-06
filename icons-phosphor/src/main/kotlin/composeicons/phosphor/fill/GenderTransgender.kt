package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorFillIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M127.92 150c.806 10.026-4.726 19.491-13.857 23.71-9.131 4.219-19.924 2.296-27.037-4.816-7.112-7.112-9.035-17.905-4.816-27.037C86.429 132.726 95.894 127.194 105.92 128c11.737 .943 21.057 10.263 22 22ZM216 40v176c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-176C40 31.163 47.163 24 56 24h144c8.837 0 16 7.163 16 16ZM192 72c0-4.418-3.582-8-8-8h-27.73c-4.291-.068-7.903 3.195-8.27 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h8.69L148 96.69 137.66 86.34c-1.531-1.532-3.618-2.377-5.783-2.343-2.165 .034-4.225 .944-5.707 2.523-2.932 3.288-2.751 8.302 .41 11.37L136.69 108 126 118.64c-17.135-11.305-40.046-7.804-53.023 8.103-12.977 15.906-11.805 39.054 2.71 53.57 14.516 14.516 37.663 15.687 53.57 2.71 15.906-12.977 19.408-35.888 8.103-53.023L148 119.31l10.34 10.35c1.572 1.571 3.727 2.418 5.949 2.336 2.221-.082 4.309-1.084 5.761-2.766 2.721-3.292 2.46-8.121-.6-11.1L159.31 108 176 91.31v8.42c-.053 4.281 3.205 7.879 7.47 8.25 2.212 .147 4.386-.631 6.003-2.147 1.617-1.517 2.532-3.636 2.527-5.853Z"),
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
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
