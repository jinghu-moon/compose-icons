package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tractor: ImageVector
    get() {
        if (_tractor != null) return _tractor!!
        _tractor = phosphorLightIcon(
            name = "Tractor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 166.12v-32.12c.027-6.199-4.051-11.668-10-13.41h-.15L190 110.24v-38.24c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v35L150 99.42v-45.42h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-120c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v36h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h28c38.642 .044 69.956 31.358 70 70v12c0 3.314 2.686 6 6 6h34.06c.856 14.764 11.157 27.281 25.48 30.962 14.323 3.681 29.383-2.319 37.251-14.841 7.868-12.522 6.739-28.694-2.792-40.002ZM68 90h-6v-36h76v75.34C123.123 104.918 96.597 90.01 68 90ZM150 172v-60.16l74.63 20.21c.836 .277 1.393 1.069 1.37 1.95v23c-8.898-4.02-19.094-4.021-27.993-.002-8.898 4.019-15.64 11.669-18.507 21.002h-29.5ZM212 210c-12.15 0-22-9.85-22-22 0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22ZM68 122c-27.614 0-50 22.386-50 50 0 27.614 22.386 50 50 50 27.614 0 50-22.386 50-50C117.967 144.399 95.601 122.033 68 122ZM68 210C47.013 210 30 192.987 30 172c0-20.987 17.013-38 38-38 20.987 0 38 17.013 38 38 0 20.987-17.013 38-38 38ZM78 172c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _tractor!!
    }

private var _tractor: ImageVector? = null
