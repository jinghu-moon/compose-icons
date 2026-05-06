package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorDuotoneIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 122.22v93.78c0 4.418-3.582 8-8 8h-96c-4.418 0-8-3.582-8-8v-93.78c-.001-1.451 .393-2.875 1.14-4.12L69.67 83.88C71.117 81.472 73.721 79.999 76.53 80h54.94c2.809-.001 5.413 1.472 6.86 3.88l20.53 34.22c.747 1.245 1.141 2.669 1.14 4.12Z"),
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
                pathData = parseSvgPathData("M224 160c-8.837 0-16-7.163-16-16v-80C208 33.072 182.928 8 152 8 121.072 8 96 33.072 96 64v8h-19.47c-5.616 .018-10.816 2.963-13.72 7.77L42.28 114c-1.487 2.484-2.275 5.325-2.28 8.22v93.78c0 8.837 7.163 16 16 16h96c8.837 0 16-7.163 16-16v-93.78c-.002-2.902-.789-5.75-2.28-8.24L145.19 79.77C142.286 74.963 137.086 72.018 131.47 72h-19.47v-8c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40v80c0 17.673 14.327 32 32 32 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM131.47 88 152 122.22v93.78h-96v-93.78L76.53 88h19.47v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48Z"),
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
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
