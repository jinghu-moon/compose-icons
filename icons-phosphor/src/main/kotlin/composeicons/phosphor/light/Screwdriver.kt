package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) return _screwdriver!!
        _screwdriver = phosphorLightIcon(
            name = "Screwdriver",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.24 51.74c2.34 2.343 2.34 6.137 0 8.48l-56 56c-2.35 2.309-6.122 2.292-8.451-.039-2.328-2.331-2.341-6.104-.029-8.451l56-56c2.345-2.337 6.14-2.332 8.48 .01ZM246 58.41c.034 12.849-5.072 25.178-14.18 34.24l-53.24 53.24c-2.617 2.632-6.178 4.109-9.89 4.1h-16.69c-1.105 0-2 .895-2 2v16.83c-.006 3.05-1.002 6.016-2.84 8.45-.167 .218-.347 .425-.54 .62l-8 8c-2.626 2.626-6.187 4.101-9.9 4.101-3.713 0-7.274-1.475-9.9-4.101L98.7 165.77 20.24 244.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L90.22 157.29 70.1 137.17h0c-2.626-2.626-4.101-6.187-4.101-9.9 0-3.713 1.475-7.274 4.101-9.9l8-8c.19-.198 .397-.379 .62-.54 2.433-1.839 5.4-2.832 8.45-2.83h16.83c1.105 0 2-.895 2-2v-16.7c-.009-3.715 1.467-7.279 4.1-9.9L163.33 24.16C177.182 10.312 198.011 6.171 216.107 13.668c18.095 7.497 29.893 25.155 29.893 44.742ZM234 58.41C233.996 43.68 225.122 30.401 211.513 24.764c-13.609-5.638-29.273-2.526-39.693 7.886L118.58 85.88c-.374 .377-.583 .888-.58 1.42v16.7c0 7.732-6.268 14-14 14h-16.83c-.349-.001-.693 .085-1 .25l-7.61 7.61c-.376 .375-.587 .884-.587 1.415 0 .531 .211 1.04 .587 1.415h0l48.73 48.73c.78 .775 2.04 .775 2.82 0l7.62-7.61c.165-.307 .251-.651 .25-1v-16.81c0-7.732 6.268-14 14-14h16.69c.53-.002 1.037-.214 1.41-.59L223.31 84.18C230.174 77.364 234.024 68.083 234 58.41Z"),
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
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
