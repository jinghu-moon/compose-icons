package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorDuotoneIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 144c0 44.183-35.817 80-80 80C83.817 224 48 188.183 48 144 48 72 128 16 128 16c0 0 80 56 80 128Z"),
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
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L64.72 70.29C48.32 95 40 119.78 40 144c.002 35.333 21.136 67.238 53.669 81.023 32.533 13.784 70.156 6.774 95.541-17.803l12.87 14.16c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM128 216C88.254 215.956 56.044 183.746 56 144c0-19.93 6.68-40.57 19.86-61.46L178.43 195.36C164.983 208.596 146.868 216.009 128 216ZM90 50.51C86.802 47.461 86.682 42.398 89.73 39.2 100.032 28.284 111.305 18.326 123.41 9.45c2.756-1.93 6.424-1.93 9.18 0C136 11.83 216 68.7 216 144c.005 7.906-1.055 15.777-3.15 23.4-.954 3.472-4.11 5.878-7.71 5.88-.723 .006-1.443-.088-2.14-.28-4.257-1.173-6.759-5.572-5.59-9.83 1.715-6.246 2.586-12.693 2.59-19.17C200 86.76 144.52 39 128 26c-9.453 7.431-18.362 15.528-26.66 24.23-1.464 1.546-3.483 2.445-5.612 2.497C93.6 52.78 91.538 51.982 90 50.51Z"),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
