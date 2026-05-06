package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HeadCircuit: ImageVector
    get() {
        if (_headCircuit != null) return _headCircuit!!
        _headCircuit = phosphorBoldIcon(
            name = "HeadCircuit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M203.91 230.51c.396 3.159-.48 6.346-2.434 8.859-1.954 2.513-4.827 4.147-7.986 4.541-.495 .059-.992 .089-1.49 .09-6.045-.009-11.139-4.512-11.89-10.51l-8-64c-.533-4.269 1.261-8.496 4.7-11.08 17.543-13.207 27.662-34.047 27.19-56 0-.81-.07-1.6-.11-2.4h-14.27l-23.1 27.72c.982 2.646 1.483 5.447 1.48 8.27 .029 10.123-6.278 19.182-15.781 22.667-9.503 3.486-20.172 .653-26.695-7.088-6.523-7.741-7.505-18.736-2.459-27.51 5.047-8.775 15.044-13.455 25.015-11.709l26.7-32C177.052 77.608 180.431 76.01 184 76h13.91C187.431 52.91 165.006 37.541 139.69 36.1Q137.85 36 136 36v19.23c9.407 5.431 13.994 16.504 11.182 26.996C144.371 92.719 134.863 100.015 124 100.015c-10.863 0-20.371-7.296-23.182-17.788C98.006 71.734 102.593 60.661 112 55.23v-14.89C85.532 50.358 68.017 75.7 68 104c-.001 1.929-.468 3.829-1.36 5.54L45.51 150.15 69 160.9c4.266 1.955 7.001 6.217 7 10.91v32.19h44c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-48C60.954 228 52 219.046 52 208v-28.49L31.43 170.09c-.13-.052-.257-.112-.38-.18C21.585 165.171 17.452 153.879 21.62 144.15c.11-.277 .237-.548 .38-.81L44 100.97C44.813 76.231 55.56 52.864 73.813 36.146 92.066 19.429 116.285 10.771 141 12.13c47.7 2.51 85.93 41.92 87 89.71 .59 27.197-10.844 53.27-31.25 71.26Z"),
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
        return _headCircuit!!
    }

private var _headCircuit: ImageVector? = null
