package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorFillIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 172c.009 15.329-10.853 28.511-25.901 31.432-15.048 2.922-30.053-5.238-35.781-19.456-5.728-14.218-.569-30.501 12.302-38.826l-9-26.89-51.46 62.81c-1.513 1.847-3.772 2.922-6.16 2.93h-54.34c-6.034 14.928-22.219 23.047-37.793 18.959C20.294 198.872 10.183 183.849 12.259 167.883c2.076-15.967 15.691-27.904 31.792-27.875 16.101 .03 29.672 12.018 31.689 27.992h48.47l55.46-67.69L162.23 48h-26.23c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c3.444-0 6.501 2.203 7.59 5.47l34.21 102.61c.72-.05 1.46-.08 2.2-.08 17.673 0 32 14.327 32 32Z"),
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
        return _scooter!!
    }

private var _scooter: ImageVector? = null
