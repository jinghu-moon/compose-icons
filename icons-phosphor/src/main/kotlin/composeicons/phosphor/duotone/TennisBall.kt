package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorDuotoneIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60.12 60.09C78.07 42.115 102.427 32.01 127.83 32h0C127.725 84.869 84.869 127.689 32 127.75 32.02 102.358 42.137 78.016 60.12 60.09ZM32 127.92v-.17h0ZM156.28 156.18c-17.987 17.919-28.101 42.261-28.11 67.65 52.855-.093 95.692-42.895 95.83-95.75h0c-25.407 .015-49.766 10.123-67.72 28.1ZM128.17 224v-.17h0Z"),
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
                pathData = parseSvgPathData("M201.57 54.46C160.955 13.846 95.107 13.847 54.492 54.461c-40.614 40.614-40.614 106.463 0 147.078 40.614 40.614 106.463 40.615 147.078 .001C221.223 182.115 232.283 155.632 232.283 128c0-27.632-11.06-54.115-30.713-73.54ZM65.75 65.77C80.15 51.351 99.125 42.401 119.41 40.46 117.455 60.745 108.466 79.706 94 94.06 79.627 108.5 60.661 117.467 40.38 119.41 42.338 99.123 51.309 80.153 65.75 65.77ZM40.33 135.48c24.565-1.961 47.619-12.641 65-30.11C122.81 87.994 133.497 64.939 135.46 40.37c42.706 3.56 76.598 37.436 80.18 80.14-50.713 4.153-90.975 44.389-95.16 95.1C77.774 212.05 43.882 178.174 40.3 135.47ZM190.25 190.23c-14.403 14.415-33.376 23.364-53.66 25.31 4.119-41.797 37.201-74.857 79-78.95-1.949 20.283-10.91 39.252-25.34 53.64Z"),
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
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
