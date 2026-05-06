package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Broom: ImageVector
    get() {
        if (_broom != null) return _broom!!
        _broom = phosphorDuotoneIcon(
            name = "Broom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192.8 165.12 43.93 105.57C48.733 97.104 54.631 89.307 61.47 82.38c2.262-2.294 5.679-3.007 8.67-1.81L95.52 90.85c3.954 1.578 8.373 1.516 12.28-.173 3.907-1.689 6.981-4.866 8.54-8.827l21-53.1c4.15-10 15.47-15.33 25.63-11.53 5.089 1.893 9.19 5.773 11.361 10.75 2.171 4.977 2.225 10.623 .149 15.64L153.13 96.71c-3.248 8.196 .745 17.475 8.93 20.75L187 127.3c3.027 1.224 5.006 4.165 5 7.43v17.27c-.009 4.386 .258 8.768 .8 13.12Z"),
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
                pathData = parseSvgPathData("M235.5 216.81C212.94 205.81 200 182.23 200 152.01v-17.28c.017-6.561-3.987-12.462-10.09-14.87L165 110c-4.079-1.632-6.079-6.248-4.48-10.34L181.84 46.66c2.924-7.029 2.859-14.945-.178-21.925C178.625 17.754 172.876 12.312 165.74 9.66c-14.303-5.24-30.178 1.851-35.82 16-.004 .04-.004 .08 0 .12L108.9 79c-1.628 4.1-6.267 6.108-10.37 4.49L73.11 73.14C67.115 70.711 60.245 72.158 55.74 76.8 34.68 98.45 24 123.75 24 152c-.055 28.909 11.125 56.709 31.18 77.53 1.519 1.588 3.623 2.481 5.82 2.47h171c3.723-.004 6.952-2.575 7.788-6.204 .836-3.628-.942-7.354-4.288-8.986ZM67.14 88 92.55 98.3c5.924 2.37 12.548 2.283 18.408-.24 5.86-2.524 10.474-7.277 12.822-13.21l21-53c2.56-6.11 9.47-9.27 15.43-7 3.07 1.139 5.542 3.484 6.841 6.49 1.299 3.006 1.313 6.413 .039 9.43L145.69 93.76c-4.878 12.307 1.131 26.241 13.43 31.14L184 134.73v17.27c0 .33 0 .66 0 1L55.77 101.71C59.179 96.837 62.982 92.252 67.14 88ZM115.14 216C103.229 204.575 94.791 190.015 90.8 174c-1.157-4.215-5.483-6.72-9.715-5.627-4.232 1.093-6.803 5.379-5.775 9.627 3.489 13.777 9.735 26.704 18.36 38h-29.23C48.662 198.421 39.955 175.621 40 152c-.098-12.515 2.54-24.901 7.73-36.29l137.8 55.12c3 18 10.56 33.48 21.89 45.16Z"),
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
        return _broom!!
    }

private var _broom: ImageVector? = null
