package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorThinIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.18 77.21C224.348 74.85 218.534 76.027 215 80.08l-37.81 40.76L138.9 35c-1.964-4.262-6.233-6.989-10.926-6.978-4.693 .011-8.949 2.756-10.894 7.028L78.81 120.84 41 80.08C37.444 76.062 31.653 74.893 26.817 77.217c-4.836 2.324-7.542 7.576-6.627 12.863v.15L42.88 194.13c1.032 5.721 6.016 9.88 11.83 9.87h146.58c5.79-.001 10.753-4.136 11.8-9.83L235.78 90.27v-.15c.982-5.302-1.727-10.601-6.6-12.91ZM227.94 88.66 205.26 192.54v.16c-.339 1.91-2 3.301-3.94 3.3h-146.61c-1.94 .001-3.601-1.39-3.94-3.3v-.16L28.06 88.66c-.308-1.78 .615-3.546 2.253-4.308 1.638-.763 3.583-.333 4.747 1.048 .021 .031 .049 .059 .08 .08l42 45.24c.913 .987 2.262 1.449 3.589 1.23 1.327-.219 2.455-1.091 3.001-2.32L124.45 38.32c.659-1.403 2.07-2.298 3.62-2.298 1.55 0 2.961 .896 3.62 2.298l40.74 91.35c.547 1.229 1.675 2.1 3.001 2.32 1.327 .219 2.675-.243 3.589-1.23l42-45.24c.031-.021 .059-.049 .08-.08 1.164-1.381 3.11-1.811 4.747-1.048 1.638 .763 2.561 2.528 2.253 4.308Z"),
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
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
