package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = phosphorLightIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.6 63.47c-.87-3.624-3.157-6.747-6.35-8.67C167.772 16.4 88.228 16.4 24.75 54.8 18.161 58.812 16.059 67.398 20.05 74l96 157.27c2.531 4.212 7.086 6.789 12 6.789 4.914 0 9.469-2.577 12-6.789L236 74c1.92-3.155 2.496-6.947 1.6-10.53ZM61.07 118.2c7.515-7.999 19.245-10.418 29.311-6.043 10.067 4.374 16.302 14.599 15.582 25.552-.72 10.952-8.24 20.273-18.793 23.292ZM152.07 188.52c-10.423-8.122-13.096-22.771-6.213-34.051 6.883-11.28 21.132-15.603 33.123-10.049ZM185.27 134.12C179.924 131.39 174.003 129.977 168 130c-16.479 .003-31.079 10.627-36.15 26.307-5.071 15.68 .543 32.841 13.9 42.493l-16 26.24c-.358 .617-1.017 .996-1.73 .996-.713 0-1.372-.38-1.73-.996L93.59 171.49c14.243-5.441 23.854-18.869 24.412-34.105 .559-15.236-8.043-29.331-21.849-35.801C82.348 95.114 66.012 97.522 54.66 107.7L46.05 93.59c50.106-31.453 113.794-31.453 163.9 0ZM225.76 67.77l-9.56 15.58C162.257 49.55 93.743 49.55 39.8 83.35L30.29 67.77h0c-.276-.438-.359-.969-.23-1.47 .133-.523 .472-.97 .94-1.24 59.639-36.063 134.361-36.063 194 0 .46 .274 .792 .72 .92 1.24 .135 .498 .059 1.03-.21 1.47Z"),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
