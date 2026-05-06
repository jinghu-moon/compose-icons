package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorRegularIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 48c-4.152-.006-8.253 .92-12 2.71v-6.71C176.005 30.212 165.973 18.473 152.353 16.33c-13.62-2.143-26.773 5.947-31.003 19.07-8.674-4.705-19.185-4.496-27.666 .549C85.203 40.994 80.004 50.132 80 60v64l-3.82-6.13C68.456 104.54 51.414 99.954 38.043 107.608c-13.371 7.654-18.046 24.671-10.463 38.082 16 33.77 28.93 57.72 43.72 72.69C86.24 233.54 103.2 240 128 240c48.578-.055 87.945-39.422 88-88v-76C216 60.536 203.464 48 188 48ZM200 152c-.044 39.746-32.254 71.956-72 72-20.38 0-33.51-4.88-45.33-16.85C69.44 193.74 57.26 171 41.9 138.58c-.09-.198-.19-.392-.3-.58-3.314-5.741-1.346-13.081 4.395-16.395 5.741-3.314 13.081-1.346 16.395 4.395 .041 .08 .088 .157 .14 .23l18.67 30c1.885 3.041 5.559 4.461 8.998 3.478 3.44-.983 5.809-4.13 5.802-7.708v-92c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v60c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-76c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v76c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-44c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _hand!!
    }

private var _hand: ImageVector? = null
