package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) return _cowboyHat!!
        _cowboyHat = phosphorLightIcon(
            name = "CowboyHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 122c-2.069-.001-3.993 1.065-5.09 2.82-4.952 7.982-10.533 15.556-16.69 22.65l-17.87-94c-.908-4.83-4.281-8.83-8.888-10.539-4.607-1.71-9.773-.879-13.612 2.189l-.1 .08L129.22 65.59c-.719 .554-1.721 .554-2.44 0L102.25 45.16l-.1-.08C98.313 42.012 93.148 41.18 88.542 42.887c-4.607 1.708-7.981 5.705-8.892 10.533L61.77 147.49C55.621 140.385 50.044 132.804 45.09 124.82 43.993 123.065 42.069 121.999 40 122 19.013 122 2 139.013 2 160c0 20.987 17.013 38 38 38h176c20.987 0 38-17.013 38-38 0-20.987-17.013-38-38-38ZM91.44 55.65c.128-.682 .601-1.249 1.249-1.498 .648-.249 1.379-.143 1.931 .278l24.54 20.43 .09 .08c5.105 4.121 12.395 4.121 17.5 0l.09-.08L161.38 54.43c.553-.422 1.286-.526 1.934-.275 .649 .251 1.12 .821 1.246 1.505L178.69 130h-101.38ZM40 186C26.245 186.017 14.856 175.318 14.016 161.588c-.84-13.73 9.159-25.738 22.814-27.398C54.5 161.44 73.53 177.05 89.62 186ZM128 186c-.34 0-26.71-.41-56-27.91L75 142h106l3 16.05c-8.543 8.165-18.286 14.974-28.89 20.19C139.38 185.81 128.08 186 128 186ZM216 186h-49.62c16.09-8.95 35.12-24.56 52.79-51.81 13.655 1.66 23.654 13.668 22.814 27.398C241.144 175.318 229.755 186.017 216 186Z"),
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
        return _cowboyHat!!
    }

private var _cowboyHat: ImageVector? = null
