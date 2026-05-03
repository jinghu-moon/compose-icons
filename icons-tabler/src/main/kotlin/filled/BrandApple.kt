package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandApple: ImageVector
    get() {
        if (_brandApple != null) return _brandApple!!
        _brandApple = tablerFilledIcon(
            name = "BrandApple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.079 5.999 L 15.318 6.011 C 16.748 6.108 18.752 7.024 19.826 8.597 C 19.985 8.830 20.038 9.119 19.973 9.393 C 19.907 9.667 19.729 9.901 19.482 10.037 C 19.432 10.065 19.110 10.195 18.985 10.254 C 18.730 10.373 18.488 10.517 18.263 10.685 C 17.649 11.146 17.315 11.694 17.321 12.379 C 17.331 13.264 17.660 13.833 18.228 14.225 C 18.436 14.368 18.664 14.478 18.894 14.555 C 19.020 14.598 19.320 14.671 19.338 14.677 C 19.735 14.820 20.000 15.197 20.000 15.619 C 20.000 18.240 16.960 22.000 14.714 22.000 C 13.924 22.000 13.442 21.909 12.731 21.685 L 12.633 21.654 C 12.170 21.508 11.931 21.462 11.500 21.462 C 10.980 21.462 10.637 21.522 9.982 21.699 L 9.785 21.752 C 9.210 21.905 8.821 21.978 8.285 22.000 C 5.536 22.000 3.000 16.907 3.000 12.928 C 3.000 9.058 4.786 6.008 8.286 6.008 C 8.583 6.008 8.884 6.053 9.195 6.136 C 9.598 6.243 9.969 6.396 10.491 6.644 C 11.278 7.018 11.439 7.084 11.500 7.084 L 11.516 7.084 C 11.546 7.081 11.644 7.037 12.572 6.627 C 13.633 6.160 14.436 5.942 15.318 6.011 L 15.078 5.999 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 14.000 1.000 C 14.552 1.000 15.000 1.448 15.000 2.000 C 15.000 3.657 13.657 5.000 12.000 5.000 C 11.448 5.000 11.000 4.552 11.000 4.000 C 11.000 2.343 12.343 1.000 14.000 1.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _brandApple!!
    }

private var _brandApple: ImageVector? = null
