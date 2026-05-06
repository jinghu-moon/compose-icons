package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) return _flagCheckered!!
        _flagCheckered = phosphorDuotoneIcon(
            name = "FlagCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 56v60c-19.89 17.23-38.23 18.39-56 13.48v-60c17.76 4.91 36.11 3.75 56-13.48ZM104 102.52v-60C86.24 37.61 67.89 38.77 48 56v60C67.89 98.78 86.23 97.61 104 102.52v60c21.62 6 42.38 21 64 27v-60c-21.62-6-42.38-21-64-27Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M227.32 48.75c-2.852-1.295-6.197-.806-8.56 1.25-28 24.22-51.72 12.48-79.21-1.13C111.07 34.76 78.78 18.79 42.76 50 41.019 51.509 40.013 53.696 40 56v168c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-44.23c26.79-21.16 49.87-9.75 76.45 3.41 28.49 14.09 60.77 30.06 96.79-1.13 1.741-1.509 2.747-3.696 2.76-6v-120.05c-.011-3.123-1.839-5.954-4.68-7.25ZM216 71.6v40.65c-14 11.06-27 13.22-40 10.88v-43.79c13.828 2.16 27.976-.578 40-7.74ZM160 75.36v43c-6.66-2.67-13.43-6-20.45-9.48-8.82-4.37-18-8.91-27.55-12.18v-43c6.66 2.66 13.43 6 20.45 9.48 8.82 4.37 18.01 8.91 27.55 12.18ZM96 48.91v43.78c-13.829-2.156-27.977 .585-40 7.75v-40.66C70 48.72 83 46.57 96 48.91ZM86.58 152c-10.765 .019-21.326 2.93-30.58 8.43v-40.65C70 108.72 83 106.56 96 108.9v43.8c-3.119-.459-6.267-.693-9.42-.7ZM112 156.67v-43c6.66 2.66 13.43 6 20.45 9.48 8.82 4.37 18 8.9 27.55 12.17v43c-6.66-2.67-13.43-6-20.45-9.48C130.73 164.47 121.54 159.94 112 156.67ZM176 183.12v-43.8c3.119 .466 6.267 .707 9.42 .72 10.768-.033 21.329-2.959 30.58-8.47v40.68c-14 11.06-27 13.21-40 10.87Z"),
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
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
