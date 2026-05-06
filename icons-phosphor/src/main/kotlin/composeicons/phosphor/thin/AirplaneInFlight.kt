package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) return _airplaneInFlight!!
        _airplaneInFlight = phosphorThinIcon(
            name = "AirplaneInFlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 216c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4ZM244 136v24c0 2.209-1.791 4-4 4h-178.94C45.139 164.068 31.086 153.611 26.58 138.34L12.52 91.45c-1.09-3.631-.4-7.564 1.861-10.607C16.642 77.8 20.209 76.004 24 76h8c1.061-.001 2.079 .42 2.83 1.17L57.66 100h29.7L76.63 67.79c-1.217-3.656-.604-7.675 1.648-10.802C80.53 53.861 84.146 52.005 88 52h8c1.061-.001 2.079 .42 2.83 1.17L145.66 100h62.34c19.882 0 36 16.118 36 36ZM236 136c0-15.464-12.536-28-28-28h-64c-1.061 .001-2.079-.42-2.83-1.17L94.35 60h-6.35c-1.285-.001-2.493 .616-3.246 1.658-.753 1.042-.959 2.382-.554 3.602l12.5 37.48c.404 1.218 .199 2.557-.551 3.598-.75 1.042-1.955 1.66-3.239 1.662h-36.91c-1.058-.002-2.072-.422-2.82-1.17L30.35 84h-6.35c-1.264 0-2.454 .598-3.209 1.613-.754 1.015-.985 2.326-.621 3.537l14.07 46.9c3.506 11.876 14.437 20.007 26.82 19.95h174.94Z"),
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
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
