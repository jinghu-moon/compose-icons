package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Farm: ImageVector
    get() {
        if (_farm != null) return _farm!!
        _farm = phosphorDuotoneIcon(
            name = "Farm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.85 216h-199.85v-96c18.905-.003 37.752 2.079 56.2 6.21L80 126.14v-46.14L144 32l64 48v41.11c-13.498 1.265-26.874 3.606-40 7v-32.11h-48v42.61h0 0c40.66 16.5 76.414 43.144 103.85 77.39Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M232 160c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-22.274-.016-44.434 3.174-65.8 9.47q-9-5.78-18.46-10.78C174.755 132.917 203.272 127.945 232 128c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-5.36 0-10.69 .18-16 .49v-32.49c0-2.518-1.186-4.889-3.2-6.4l-64-48c-2.844-2.133-6.756-2.133-9.6 0l-64 48C73.186 75.111 72 77.482 72 80v36.37C56.165 113.466 40.099 112.003 24 112c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 75.343-.151 146.635 34.094 193.61 93 1.752 2.333 4.636 3.526 7.525 3.115 2.889-.412 5.324-2.363 6.355-5.092 1.031-2.729 .495-5.804-1.4-8.023q-7.59-9.5-15.94-18.14c5.92-.57 11.89-.86 17.85-.86 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-10.917-.001-21.816 .885-32.59 2.65q-7.75-6.92-16-13.16C199.347 161.831 215.648 159.989 232 160ZM128 133.24v-29.24h32v17.94c-10.876 3.085-21.542 6.87-31.93 11.33ZM88 84 144 42l56 42v29.93q-12.12 1.45-24 4v-21.93c0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8v31q-11.79-4.15-24-7.18ZM136.83 220.43c-2.447 3.678-7.412 4.676-11.09 2.23C95.602 202.611 60.198 191.941 24 192c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 39.351-.06 77.838 11.542 110.6 33.34 3.678 2.447 4.676 7.412 2.23 11.09ZM186.37 210.29c2.12 1.983 3 4.96 2.298 7.777-.702 2.817-2.875 5.033-5.678 5.79-2.803 .757-5.796-.065-7.82-2.146C134.867 182.044 80.548 159.871 24 160c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 60.74-.141 119.084 23.679 162.37 66.29Z"),
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
        return _farm!!
    }

private var _farm: ImageVector? = null
