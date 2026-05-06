package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WifiX: ImageVector
    get() {
        if (_wifiX != null) return _wifiX!!
        _wifiX = phosphorThinIcon(
            name = "WifiX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 204c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM205.66 80 226.83 58.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L200 74.34 178.83 53.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L194.34 80l-21.17 21.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L200 85.66l21.17 21.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66ZM170.35 161.77c-25.25-18.368-59.46-18.368-84.71 0-1.692 1.33-2.028 3.762-.76 5.501 1.268 1.739 3.686 2.163 5.47 .959 22.448-16.307 52.842-16.307 75.29 0 1.151 .905 2.704 1.109 4.049 .532 1.345-.577 2.268-1.842 2.406-3.3 .138-1.457-.531-2.873-1.745-3.692ZM135.81 60.19c2.209 .105 4.085-1.601 4.19-3.81 .105-2.209-1.601-4.085-3.81-4.19-2.71-.13-5.47-.2-8.19-.2C89.154 52.016 51.513 65.477 21.46 90.09c-1.709 1.403-1.958 3.926-.555 5.635 1.403 1.709 3.926 1.958 5.635 .555C55.157 72.836 91.006 60.017 128 60c2.59 0 5.22 .06 7.81 .19ZM135.73 108.26c2.209 .149 4.121-1.521 4.27-3.73 .149-2.209-1.521-4.121-3.73-4.27-2.74-.19-5.52-.28-8.27-.28-27.054-.102-53.331 9.039-74.48 25.91-1.731 1.381-2.016 3.904-.635 5.635 1.381 1.731 3.904 2.016 5.635 .635C78.254 116.432 102.765 107.909 128 108c2.57 0 5.17 .09 7.73 .26Z"),
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
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
