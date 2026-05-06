package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = phosphorLightIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.1 51.71C226.09 45.27 218.64 42 209 42c-16.33 0-37.41 11.06-56.4 29.59C145.596 78.332 139.358 85.828 134 93.94v-37.94c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v37.94C116.661 85.831 110.443 78.335 103.46 71.59 84.49 53.06 63.4 42 47.07 42c-9.69 0-17.14 3.27-22.15 9.71-5.53 7.11-7.71 17.69-6.66 32.34 .91 12.73 4.12 26.53 6.81 37.13 6.28 24.74 20.77 33 31.78 35.68-12.36 19.648-6.453 45.595 13.195 57.955 19.648 12.36 45.595 6.453 57.955-13.195 12.36 19.65 38.31 25.56 57.96 13.2 19.65-12.36 25.56-38.31 13.2-57.96 11-2.63 25.5-10.94 31.78-35.68 6.61-25.97 11.78-54.53 .16-69.47ZM92 210C76.183 209.774 63.236 197.351 62.357 181.557 61.478 165.763 72.966 151.98 88.66 150c3.314-.362 5.707-3.341 5.345-6.655-.362-3.314-3.341-5.707-6.655-5.345-7.35 .822-14.349 3.583-20.28 8-9 .31-24.12-3.16-30.37-27.76C33.45 105.43 24.81 71.41 34.39 59.09 37.05 55.66 41.2 54 47.07 54c12.88 0 31.72 10.28 48 26.18C111.69 96.39 122 114.59 122 127.67v52.33c0 16.569-13.431 30-30 30ZM219.31 118.23C213.07 142.83 198 146.29 189 146c-5.929-4.421-12.929-7.183-20.28-8-3.314-.376-6.304 2.006-6.68 5.32-.376 3.314 2.006 6.304 5.32 6.68 16.104 1.748 27.938 15.924 26.783 32.081-1.155 16.157-14.886 28.505-31.075 27.945C146.88 209.466 134.035 196.198 134 180v-52.33c0-13.08 10.32-31.28 26.93-47.49C177.23 64.28 196.07 54 209 54c5.87 0 10 1.66 12.68 5.08 9.53 12.32 .89 46.34-2.36 59.15Z"),
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
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
