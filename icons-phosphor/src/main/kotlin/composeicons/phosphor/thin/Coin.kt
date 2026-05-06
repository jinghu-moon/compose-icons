package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = phosphorThinIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.79 67.42C185.9 57.48 158.27 52 128 52 97.73 52 70.1 57.48 50.21 67.42 31 77 20 90.35 20 104v48c0 13.65 11 27 30.21 36.58C70.1 198.52 97.73 204 128 204c30.27 0 57.9-5.48 77.79-15.42C225 179 236 165.65 236 152v-48C236 90.35 225 77 205.79 67.42ZM128 60c61.77 0 100 22.84 100 44 0 21.16-38.23 44-100 44C66.23 148 28 125.16 28 104 28 82.84 66.23 60 128 60ZM124 156v40c-22-.35-40.94-3.65-56-8.71v-39.64c16.23 5.1 35.44 7.97 56 8.35ZM132 156c20.56-.33 39.77-3.2 56-8.3v39.59c-15.06 5.06-33.95 8.36-56 8.71ZM28 152v-28.08c5.15 6.19 12.67 11.89 22.21 16.66 3.08 1.54 6.36 2.95 9.79 4.28v39.38C39.49 175.67 28 163.59 28 152ZM228 152c0 11.59-11.49 23.67-32 32.24v-39.38c3.43-1.33 6.71-2.74 9.79-4.28 9.54-4.77 17.06-10.47 22.21-16.66Z"),
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
        return _coin!!
    }

private var _coin: ImageVector? = null
