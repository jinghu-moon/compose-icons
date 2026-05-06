package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) return _cowboyHat!!
        _cowboyHat = phosphorThinIcon(
            name = "CowboyHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 124c-1.378 .001-2.659 .711-3.39 1.88-5.717 9.233-12.282 17.914-19.61 25.93L174.38 53.81c-.771-4.168-3.683-7.62-7.662-9.081-3.978-1.462-8.433-.716-11.718 1.961L130.5 67.13c-1.438 1.153-3.479 1.174-4.94 .05L100.9 46.64C97.611 44.008 93.182 43.294 89.232 44.758c-3.95 1.464-6.843 4.892-7.622 9.032L63 151.81C55.676 143.794 49.114 135.113 43.4 125.88 42.668 124.708 41.382 123.997 40 124 20.118 124 4 140.118 4 160c0 19.882 16.118 36 36 36h176c19.882 0 36-16.118 36-36 0-19.882-16.118-36-36-36ZM89.48 55.28c.255-1.368 1.202-2.506 2.502-3.004 1.3-.498 2.765-.284 3.868 .564l24.65 20.54c4.409 3.525 10.679 3.5 15.06-.06L160.09 52.89c1.089-.894 2.574-1.134 3.89-.63 1.317 .483 2.285 1.622 2.55 3L181.11 132h-106.22ZM40 188C24.941 188.019 12.564 176.124 11.985 161.076c-.579-15.048 10.848-27.858 25.865-28.996C58.3 164 80.59 180 97.9 188ZM128 188h0c-.27 0-11.78-.21-27.77-7.84C89.021 174.677 78.75 167.454 69.8 158.76L73.37 140h109.26l3.56 18.76c-8.95 8.694-19.221 15.917-30.43 21.4C139.77 187.79 128.26 188 128 188ZM216 188h-57.9c17.31-8 39.6-24 60.05-55.92 15.016 1.137 26.443 13.948 25.865 28.996C243.436 176.124 231.059 188.019 216 188Z"),
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
