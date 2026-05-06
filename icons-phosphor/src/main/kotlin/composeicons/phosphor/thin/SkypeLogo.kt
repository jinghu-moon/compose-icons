package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SkypeLogo: ImageVector
    get() {
        if (_skypeLogo != null) return _skypeLogo!!
        _skypeLogo = phosphorThinIcon(
            name = "SkypeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 152c0 15.44-16.15 28-36 28C108.15 180 92 167.44 92 152c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 11 12.56 20 28 20 15.44 0 28-9 28-20 0-12.58-11.79-16.92-29.78-22.11C111 125.51 93.78 120.54 93.78 104 93.78 88 108.49 76 128 76c14.2 0 26.29 6.46 31.55 16.85 .724 1.282 .685 2.858-.102 4.103-.786 1.245-2.193 1.957-3.661 1.854-1.469-.103-2.762-1.004-3.367-2.347C148.53 88.78 139.17 84 128 84c-15 0-26.22 8.6-26.22 20 0 9.81 10.07 13.43 26.66 18.21C145.03 126.99 164 132.46 164 152ZM228 176c-.033 28.705-23.295 51.967-52 52-10.859 .039-21.451-3.36-30.26-9.71-30.064 5.862-61.074-3.609-82.732-25.268C41.349 171.364 31.878 140.354 37.74 110.29 31.373 101.477 27.963 90.872 28 80 28.033 51.295 51.295 28.033 80 28c10.859-.039 21.451 3.36 30.26 9.71 30.064-5.862 61.074 3.609 82.732 25.268 21.658 21.658 31.129 52.669 25.268 82.732 6.367 8.813 9.777 19.418 9.74 30.29ZM220 176c.03-9.726-3.19-19.184-9.15-26.87-.723-.932-.997-2.136-.75-3.29 6.039-27.928-2.52-57.011-22.724-77.216C167.171 48.42 138.088 39.861 110.16 45.9c-1.154 .247-2.358-.027-3.29-.75C89.353 31.615 64.508 33.201 48.855 48.855 33.201 64.508 31.615 89.353 45.15 106.87c.723 .932 .997 2.136 .75 3.29-6.039 27.928 2.52 57.011 22.724 77.216 20.204 20.204 49.288 28.764 77.216 22.724 1.154-.247 2.358 .027 3.29 .75 13.283 10.243 31.234 12.044 46.286 4.642C210.468 208.09 220.003 192.774 220 176Z"),
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
        return _skypeLogo!!
    }

private var _skypeLogo: ImageVector? = null
