package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cow: ImageVector
    get() {
        if (_cow != null) return _cow!!
        _cow = phosphorLightIcon(
            name = "Cow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M102 192c0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6ZM176 186h-16c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM100 114c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM156 114c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM242.85 120.85c-2.659 3.26-6.643 5.151-10.85 5.15h-34v35.05c13.455 9.584 19.176 26.763 14.154 42.501C207.133 219.289 192.519 229.979 176 230h-96C63.481 229.979 48.867 219.289 43.846 203.551 38.824 187.813 44.545 170.634 58 161.05v-35.05h-34c-4.214 .007-8.206-1.885-10.87-5.15-2.639-3.206-3.696-7.429-2.88-11.5C15.367 84.152 37.507 66.032 63.22 66h6.89C57.396 55.764 50.002 40.322 50 24c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 23.196 18.804 42 42 42h48c23.196 0 42-18.804 42-42 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6-.002 16.322-7.396 31.764-20.11 42h6.89c25.705 .042 47.835 18.159 52.95 43.35 .816 4.071-.241 8.294-2.88 11.5ZM58 114v-10C57.996 94.334 61.688 85.032 68.32 78h-5.1C43.217 78.008 25.984 92.097 22 111.7c-.112 .551 .036 1.122 .4 1.55 .388 .485 .979 .762 1.6 .75ZM202 192c0-14.359-11.641-26-26-26h-96c-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26h96c14.359 0 26-11.641 26-26ZM186 155.34v-51.34C186 89.641 174.359 78 160 78h-64C81.641 78 70 89.641 70 104v51.34c3.259-.89 6.622-1.341 10-1.34h96c3.378-.001 6.741 .45 10 1.34ZM234 111.7C230.016 92.097 212.783 78.008 192.78 78h-5.1c6.632 7.032 10.324 16.334 10.32 26v10h34c.614 .006 1.196-.271 1.58-.75 .371-.424 .526-.996 .42-1.55Z"),
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
        return _cow!!
    }

private var _cow: ImageVector? = null
