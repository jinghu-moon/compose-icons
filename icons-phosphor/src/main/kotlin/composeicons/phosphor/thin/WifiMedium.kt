package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) return _wifiMedium!!
        _wifiMedium = phosphorThinIcon(
            name = "WifiMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 204c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM202.48 125.91C158.829 91.341 97.131 91.341 53.48 125.91c-1.731 1.381-2.016 3.904-.635 5.635 1.381 1.731 3.904 2.016 5.635 .635 40.729-32.229 98.271-32.229 139 0 1.731 1.381 4.254 1.096 5.635-.635 1.381-1.731 1.096-4.254-.635-5.635ZM170.35 161.77c-25.248-18.363-59.452-18.363-84.7 0-1.213 .819-1.882 2.235-1.745 3.692 .138 1.457 1.061 2.723 2.406 3.3 1.345 .577 2.898 .373 4.049-.532 22.44-16.318 52.84-16.318 75.28 0 1.151 .905 2.704 1.109 4.049 .532 1.345-.577 2.268-1.842 2.406-3.3 .138-1.457-.531-2.873-1.745-3.692Z"),
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
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
