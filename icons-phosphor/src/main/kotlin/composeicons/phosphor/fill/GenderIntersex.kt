package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorFillIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M147.91 113.72c.955 11.702-5.493 22.757-16.148 27.688-10.656 4.931-23.256 2.69-31.558-5.612C91.902 127.494 89.661 114.894 94.592 104.238 99.523 93.583 110.578 87.135 122.28 88.09c13.667 1.115 24.515 11.963 25.63 25.63ZM216 40v176c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-176C40 31.163 47.163 24 56 24h144c8.837 0 16 7.163 16 16ZM188 56c0-4.418-3.582-8-8-8h-27.73c-4.291-.068-7.903 3.195-8.27 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h8.69L144.92 79.77C130.141 69.567 110.643 69.369 95.661 79.272 80.678 89.175 73.218 107.189 76.812 124.785c3.594 17.596 17.522 31.242 35.188 34.475v16.74h-19.73c-4.291-.068-7.903 3.195-8.27 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h20v15.73c-.053 4.281 3.205 7.879 7.47 8.25 2.212 .147 4.386-.631 6.003-2.147 1.617-1.517 2.532-3.636 2.527-5.853v-15.98h19.73c4.283 .058 7.883-3.202 8.25-7.47 .147-2.212-.631-4.386-2.147-6.003-1.517-1.617-3.636-2.532-5.853-2.527h-19.98v-16.74c14.648-2.717 26.926-12.661 32.627-26.425 5.701-13.764 4.05-29.477-4.387-41.755L172 75.31v8.42c-.063 4.289 3.197 7.898 7.47 8.27 2.212 .147 4.386-.631 6.003-2.147C187.09 88.336 188.005 86.217 188 84Z"),
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
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
