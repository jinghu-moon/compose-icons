package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) return _appleLogo!!
        _appleLogo = phosphorThinIcon(
            name = "AppleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.27 169.49C199.86 156.84 196 135.6 196 120c0-19.17 14.25-35.53 22.75-43.57 .798-.755 1.25-1.806 1.25-2.905 0-1.099-.452-2.15-1.25-2.905C207 59.48 186.59 52 168 52c-14.369 .018-28.366 4.567-40 13C101.004 45.288 63.655 48.263 40.12 72 26.746 85.672 19.487 104.182 20 123.3c.782 33.018 14.799 64.338 38.9 86.92 6.675 6.306 15.517 9.807 24.7 9.78h87.7c9.917 .019 19.399-4.072 26.19-11.3 6.7-7.193 12.49-15.183 17.24-23.79 6.08-11.1 5.42-12.62 4.94-13.72-.298-.687-.783-1.275-1.4-1.7ZM191.63 203.26c-5.277 5.598-12.637 8.762-20.33 8.74h-87.7c-7.134 .019-14.003-2.701-19.19-7.6C41.856 183.28 28.736 153.981 28 123.09 27.541 106.16 33.968 89.768 45.81 77.66 56.912 66.319 72.129 59.95 88 60h.84c13.351 .136 26.266 4.769 36.66 13.15 1.461 1.17 3.539 1.17 5 0C141.118 64.588 154.36 59.944 168 60c15.12 0 31.45 5.41 42.11 13.73C200.68 83.42 188 100.16 188 120c0 23.79 8 42.44 23.12 54.17-4.865 10.695-11.449 20.522-19.49 29.09ZM132.13 31C136.235 15.101 150.579 3.994 167 4h1c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-1c-12.771-.004-23.927 8.634-27.12 21-.457 1.769-2.053 3.003-3.88 3-.338 0-.674-.043-1-.13-2.136-.554-3.421-2.733-2.87-4.87Z"),
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
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
