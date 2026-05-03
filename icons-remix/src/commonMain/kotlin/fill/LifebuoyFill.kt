package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LifebuoyFill: ImageVector
    get() {
        if (_lifebuoyFill != null) return _lifebuoyFill!!
        _lifebuoyFill = remixIcon(
            name = "LifebuoyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 7.197 14.682 L 5.022 16.855 C 5.527 17.579 6.140 18.220 6.840 18.755 L 7.145 18.978 L 9.318 16.803 C 8.511 16.351 7.829 15.702 7.338 14.920 L 7.197 14.682 ZM 16.803 14.682 C 16.351 15.489 15.702 16.171 14.920 16.662 L 14.682 16.803 L 16.855 18.978 C 17.579 18.473 18.220 17.860 18.755 17.160 L 18.978 16.855 L 16.803 14.682 ZM 12.000 8.000 C 9.791 8.000 8.000 9.791 8.000 12.000 C 8.000 14.209 9.791 16.000 12.000 16.000 C 14.209 16.000 16.000 14.209 16.000 12.000 C 16.000 9.791 14.209 8.000 12.000 8.000 ZM 7.145 5.022 C 6.421 5.527 5.780 6.140 5.245 6.840 L 5.022 7.145 L 7.197 9.318 C 7.649 8.511 8.298 7.829 9.080 7.338 L 9.318 7.197 L 7.145 5.022 ZM 16.855 5.022 L 14.682 7.197 C 15.489 7.649 16.171 8.298 16.662 9.080 L 16.803 9.318 L 18.978 7.145 C 18.473 6.421 17.860 5.780 17.160 5.245 L 16.855 5.022 Z"),
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
        return _lifebuoyFill!!
    }

private var _lifebuoyFill: ImageVector? = null
