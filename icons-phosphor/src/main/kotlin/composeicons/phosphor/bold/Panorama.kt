package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Panorama: ImageVector
    get() {
        if (_panorama != null) return _panorama!!
        _panorama = phosphorBoldIcon(
            name = "Panorama",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244.18 48.15c-4.912-3.804-11.323-5.085-17.32-3.46l-3.49 .94C204.74 50.65 170.08 60 128 60 85.92 60 51.26 50.65 32.63 45.63l-3.49-.94C23.141 43.095 16.74 44.376 11.817 48.157 6.894 51.939 4.006 57.792 4 64v128c-0 11.022 8.918 19.967 19.94 20 1.766-.003 3.524-.235 5.23-.69l3.19-.87C51 205.39 85.7 196 128 196c42.3 0 77 9.4 95.64 14.45l3.19 .87c6.005 1.607 12.416 .33 17.348-3.455 4.931-3.785 7.822-9.648 7.822-15.865v-128c.019-6.216-2.875-12.083-7.82-15.85ZM128 84c44 0 81.14-9.69 100-14.77v107.85L176.77 125.86c-7.81-7.808-20.47-7.808-28.28 0L131.31 143 90.14 101.86c-7.81-7.808-20.47-7.808-28.28 0L28 135.71v-66.48C46.86 74.31 84 84 128 84ZM148.28 160l14.35-14.35 33.46 33.46c-10.09-2-21.52-3.93-33.94-5.25ZM28 186.76v-17.11L76 121.65 126.35 172C83.12 172.24 46.74 181.7 28 186.76ZM184 108c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16Z"),
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
        return _panorama!!
    }

private var _panorama: ImageVector? = null
