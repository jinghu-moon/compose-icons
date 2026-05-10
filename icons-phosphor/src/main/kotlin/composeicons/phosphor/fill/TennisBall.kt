package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorFillIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24.81 115.41C30.557 67.948 67.951 30.533 115.41 24.76c1.104-.132 2.213 .202 3.061 .921 .848 .719 1.359 1.759 1.409 2.869 1 24.505-8.292 48.311-25.628 65.658C76.915 111.556 53.115 120.864 28.61 119.88c-1.112-.048-2.155-.557-2.876-1.406-.721-.848-1.056-1.959-.924-3.064ZM227.35 136.11c-1.12 0-2.23-.07-3.35-.07-23.936-.031-46.847 9.708-63.435 26.962-16.589 17.255-25.417 40.532-24.445 64.448 .051 1.111 .561 2.15 1.409 2.869 .848 .719 1.957 1.053 3.061 .921 47.463-5.774 84.857-43.194 90.6-90.66 .132-1.112-.208-2.229-.938-3.079-.73-.85-1.783-1.354-2.902-1.391ZM150.46 150.46C169.922 130.893 196.403 119.925 224 120c1 0 2.06 0 3.09 0 1.16 .042 2.282-.423 3.073-1.273 .791-.85 1.173-2.002 1.048-3.157C225.535 67.924 187.975 30.36 140.33 24.68c-1.154-.126-2.306 .257-3.157 1.047-.85 .791-1.315 1.912-1.273 3.073 .919 28.665-10.071 56.43-30.36 76.7C86.084 125.081 59.603 136.064 32 136c-1 0-2.06 0-3.09 0-1.16-.042-2.282 .423-3.073 1.273-.791 .85-1.173 2.002-1.047 3.157 5.675 47.646 43.235 85.21 90.88 90.89 1.154 .126 2.306-.257 3.157-1.048 .85-.791 1.315-1.912 1.273-3.073-.93-28.678 10.061-56.461 30.36-76.74Z"),
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
